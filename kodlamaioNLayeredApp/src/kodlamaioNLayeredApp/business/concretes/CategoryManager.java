package kodlamaioNLayeredApp.business.concretes;

import java.util.List;
import java.util.Locale.Category;

import kodlamaioNLayeredApp.business.abstracts.CategoryService;
import kodlamaioNLayeredApp.core.Logger;
import kodlamaioNLayeredApp.dataAccess.abstracts.CategoryDao;

public class CategoryManager  implements CategoryService {
	
	private CategoryDao categoryDao ;
	private List<Logger> loggers;
	private List<Category> categories;
	
	
	
	
	public CategoryManager(CategoryDao categoryDao, List<Logger> loggers, List<Category> categories) {
		super();
		this.categoryDao = categoryDao;
		this.loggers = loggers;
		this.categories = categories;
	}




	@Override
	public void add(Category category) throws Exception {
		
		for (Category categoryOrder : categories) {
			if(categoryOrder.getName().equals(category.getName())){
                throw new Exception("Aynı isme sahip kategori mevcuttur.");
            }
			
			
			
		}
		categoryDao.add(category);
		categories.add(category);
		
		for (Logger logger : loggers) {
            logger.log(category.getName());
        }
		
	}

}
