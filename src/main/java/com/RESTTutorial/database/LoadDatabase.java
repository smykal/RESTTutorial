package com.RESTTutorial.database;

import com.RESTTutorial.Employee;
import com.RESTTutorial.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {
  private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

  @Bean
  CommandLineRunner initDatabase(EmployeeRepository repository) {
    return args -> {
      log.info("Preloading" + repository.save(new Employee("Batman", "superhero")));
      log.info("Preloading" + repository.save(new Employee("Capitan Jack Sparrow", "sailor")));
    }
  }
}
