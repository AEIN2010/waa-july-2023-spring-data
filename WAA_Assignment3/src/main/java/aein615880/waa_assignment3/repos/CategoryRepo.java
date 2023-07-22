package aein615880.waa_assignment3.repos;

import aein615880.waa_assignment3.models.Category;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface CategoryRepo extends ListCrudRepository<Category, List<Category>> {
}
