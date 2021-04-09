package in.nareshit.raghu.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import in.nareshit.raghu.model.Department;

public interface DeptRepository 
	extends MongoRepository<Department, String> {

}
