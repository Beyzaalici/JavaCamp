package kodlamaioNLayeredApp.dataAccess.concretes.hibernate;

import java.util.Locale.Category;

import kodlamaioNLayeredApp.dataAccess.abstracts.CategoryDao;

public class HibernateCategoryDao implements CategoryDao {

	@Override
	public void add(Category category) {
		System.out.println("Hibernate kategori eklendi.");
		
	}

}
