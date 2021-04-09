package in.nareshit.raghu.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

//ctrl+shift+O
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Document
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
	
	@Id
	private Integer empId;
	private String empName;
	private Double empSal;
	
	private Set<String> empPrjs; 
	private List<String> empPrjVer;
	private String[] empGrades;
	
	private Map<String,String> empClient;
	@DBRef
	private Address addr;//HAS-A
	@DBRef
	private List<Department> dobs; //HAS-A
	
	
}
