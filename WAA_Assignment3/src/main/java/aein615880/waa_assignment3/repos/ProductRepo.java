package aein615880.waa_assignment3.repos;

import aein615880.waa_assignment3.models.Product;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface ProductRepo extends ListCrudRepository<Product, List<Product>> {
    public List<Product> getProductsByPriceGreaterThan(double minPrice);
    public List<Product> getProductsByPriceLessThanAndCategoryIs(double maxPrice, String catId);
    public List<Product> getProductsByNameIsLike(String keyword);

}
