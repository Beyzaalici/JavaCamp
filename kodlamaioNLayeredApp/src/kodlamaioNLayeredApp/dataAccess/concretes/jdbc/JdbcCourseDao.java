package kodlamaioNLayeredApp.dataAccess.concretes.jdbc;

import kodlamaioNLayeredApp.dataAccess.abstracts.CourseDao;
import kodlamaioNLayeredApp.entities.Course;

public class JdbcCourseDao  implements CourseDao {

	@Override
	public void add(Course course) {
		System.out.println("Jdbc ile kurs eklendi.");
		
	}

}
