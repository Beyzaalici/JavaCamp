package kodlamaioNLayeredApp.dataAccess.concretes.jdbc;

import java.util.Locale.Category;

import kodlamaioNLayeredApp.dataAccess.abstracts.CategoryDao;

public class JdbcCategoryDao implements CategoryDao {

	@Override
	public void add(Category category) {
		System.out.println("Jdbc ile kategori eklendi.");
		
	}

}
