package kodlamaioNLayeredApp.dataAccess.concretes.jdbc;

import kodlamaioNLayeredApp.dataAccess.abstracts.InstructorDao;
import kodlamaioNLayeredApp.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao {

	@Override
	public void add(Instructor instructor) {
		System.out.println("Jdbc ile egitmen eklendi.");
	}

}
