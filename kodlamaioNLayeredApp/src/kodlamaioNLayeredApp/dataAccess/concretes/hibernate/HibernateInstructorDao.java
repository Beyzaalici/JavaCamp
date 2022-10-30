package kodlamaioNLayeredApp.dataAccess.concretes.hibernate;

import kodlamaioNLayeredApp.dataAccess.abstracts.InstructorDao;
import kodlamaioNLayeredApp.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao  {

	@Override
	public void add(Instructor instructor) {
		System.out.println("Hibernate ile egitmen eklendi.");
		
	}
	
}
