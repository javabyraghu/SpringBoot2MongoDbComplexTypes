package in.nareshit.raghu.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import in.nareshit.raghu.model.Employee;

public interface EmployeeRepository 
	extends MongoRepository<Employee, Integer> {

}
