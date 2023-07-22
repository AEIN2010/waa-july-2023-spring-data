package aein615880.waa_assignment3.repos;

import aein615880.waa_assignment3.models.Address;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface AddressRepo extends ListCrudRepository<Address, List<Address>> {
}
