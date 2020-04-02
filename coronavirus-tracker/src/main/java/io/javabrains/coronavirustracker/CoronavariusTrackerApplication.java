package io.javabrains.coronavirustracker;

		import org.springframework.boot.SpringApplication;
		import org.springframework.boot.autoconfigure.SpringBootApplication;
		import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CoronavariusTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoronavariusTrackerApplication.class, args);
	}

}
