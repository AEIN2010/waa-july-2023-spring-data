package aein615880.waa_assignment3.repos;

import aein615880.waa_assignment3.models.Review;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface ReviewRepo extends ListCrudRepository<Review, List<Review>> {
}
