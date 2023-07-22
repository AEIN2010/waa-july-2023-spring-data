package aein615880.waa_assignment3.repos;

import aein615880.waa_assignment3.models.User;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface UserRepo extends ListCrudRepository<User, List<User>> {

}
