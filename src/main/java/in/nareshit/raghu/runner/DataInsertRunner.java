package in.nareshit.raghu.runner;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.nareshit.raghu.model.Address;
import in.nareshit.raghu.model.Department;
import in.nareshit.raghu.model.Employee;
import in.nareshit.raghu.repo.AddressRepository;
import in.nareshit.raghu.repo.DeptRepository;
import in.nareshit.raghu.repo.EmployeeRepository;

@Component
public class DataInsertRunner implements CommandLineRunner {

	@Autowired
	private EmployeeRepository repo;
	@Autowired
	private AddressRepository arepo;
	@Autowired
	private DeptRepository derepo;
	
	public void run(String... args) throws Exception {
		arepo.deleteAll();
		repo.deleteAll();
		derepo.deleteAll();
		
		Address addr = new Address(109,"8-9/A", "HYD", 500032L);
		arepo.save(addr);
		
		List<Department> dobs = List.of(
				new Department(11,"D1", "DEV-AB"),
				new Department(12,"D2", "QA-RB"),
				new Department(13,"D3", "SUPRT-MN")
			);
		derepo.saveAll(dobs);
		
		repo.save(
				new Employee(
						10, "SAM", 200.0,
						Set.of("HTC","NIT","ORCL"),
						List.of("3.2GA","6.5 RELEASE","0.1 ALPHA"),
						new String[] {"A+","GR-T","UI-NEW"},
						Map.of("C1","TEC-N","C2","US-ARMY","C3","JANSON & JANSON"),
						addr,
						dobs
						
						)
				);
		
	}

}
