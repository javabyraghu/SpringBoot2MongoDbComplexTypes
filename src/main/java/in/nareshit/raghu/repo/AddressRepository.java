package in.nareshit.raghu.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import in.nareshit.raghu.model.Address;

public interface AddressRepository 
	extends MongoRepository<Address, String> {

}
