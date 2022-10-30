package kodlamaioNLayeredApp.dataAccess.concretes.hibernate;

import kodlamaioNLayeredApp.dataAccess.abstracts.CourseDao;
import kodlamaioNLayeredApp.entities.Course;

public class HibernateCourseDao implements CourseDao {

	@Override
	public void add(Course course) {
		System.out.println("Hibernate ile kurs eklendi.");
		
	}

}
