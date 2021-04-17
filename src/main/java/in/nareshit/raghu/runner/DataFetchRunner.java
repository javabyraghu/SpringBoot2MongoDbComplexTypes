package in.nareshit.raghu.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.stereotype.Component;

import in.nareshit.raghu.model.Employee;

@Component
@Order(2)
public class DataFetchRunner implements CommandLineRunner {
	@Autowired
	private MongoTemplate mt;

	public void run(String... args) throws Exception {

		Aggregation aggregation = 
				Aggregation.newAggregation(
						Aggregation.match(Criteria.where("_id").is(10)),
						Aggregation.sort(Direction.DESC,"empName"),
						Aggregation.project("empName","addr","dobs"));
		List<Employee> results = mt.aggregate(aggregation, "employee", Employee.class).getMappedResults();
		results.forEach(System.out::println);
	}

}
