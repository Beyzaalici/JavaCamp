package kodlamaioNLayeredApp.business.concretes;

import java.util.List;

import kodlamaioNLayeredApp.business.abstracts.InstructorService;
import kodlamaioNLayeredApp.core.Logger;
import kodlamaioNLayeredApp.dataAccess.abstracts.InstructorDao;
import kodlamaioNLayeredApp.entities.Instructor;

public class InstructorManager implements InstructorService {
	  
	private InstructorDao instructorDao;
	private List<Logger> loggers;
	
	
	
	
	public InstructorManager(InstructorDao instructorDao, List<Logger> loggers) {
		super();
		this.instructorDao = instructorDao;
		this.loggers = loggers;
	}




	@Override
	public void add(Instructor instructor) throws Exception {
			
		
		instructorDao.add(instructor);
		
		for (Logger logger : loggers) {
			logger.log(instructor.getName()); 
		}
		
		
	}

}
