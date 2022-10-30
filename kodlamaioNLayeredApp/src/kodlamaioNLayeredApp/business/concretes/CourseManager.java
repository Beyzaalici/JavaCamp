package kodlamaioNLayeredApp.business.concretes;

import java.util.List;
import java.util.Locale.Category;

import kodlamaioNLayeredApp.business.abstracts.CourseService;
import kodlamaioNLayeredApp.core.Logger;
import kodlamaioNLayeredApp.dataAccess.abstracts.CourseDao;
import kodlamaioNLayeredApp.entities.Course;

public class CourseManager implements CourseService {
	
	private CourseDao courseDao;
	private List<Logger> loggers;
	private List<Course> courses;
	
	
	
	
	public CourseManager(CourseDao courseDao, List<Logger> loggers, List<Course> courses) {
		super();
		this.courseDao = courseDao;
		this.loggers = loggers;
		this.courses = courses;
	}




	@Override
	public void add(Course course) throws Exception {
		
		for (Course courseOrder : courses) {
			if(courseOrder.getName().equals(course.getName())){
                throw new Exception("Aynı isme sahip kategori mevcuttur.");
            }
		}
		
		if(course.getUnitPrice()<0){
            throw new Exception("Kurs fiyatı 0'dan büyük olmalıdır.");
        }
		
		courseDao.add(course);
		courses.add(course);
		
		
		for (Logger logger : loggers) {
			logger.log(course.getName());
		}
	}
	
}
