package nl.quintor.reactivetimesheet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class ReactiveTimesheetApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactiveTimesheetApplication.class, args);
	}
}
