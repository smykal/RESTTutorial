package com.RESTTutorial.database;

import com.RESTTutorial.Employee;
import com.RESTTutorial.EmployeeRepository;
import com.RESTTutorial.order.Order;
import com.RESTTutorial.order.OrderRepository;
import com.RESTTutorial.order.Status;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {
  private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

  @Bean
  CommandLineRunner initDatabase(EmployeeRepository employeeRepository, OrderRepository orderRepository) {
    return args -> {
      employeeRepository.save(new Employee("Bruce", "Wayne", "Batman"));
      employeeRepository.save(new Employee("Clark", "Kent", "Spiderman"));

      employeeRepository.findAll().forEach(employee -> {log.info("Preloaded " + employee);});

      orderRepository.save(new Order("Batmobile", Status.COMPLETED));
      orderRepository.save(new Order("New Glasses", Status.IN_PROGRESS));

      orderRepository.findAll().forEach(order -> {log.info("Preloaded" + order.toString());});

    };
  }
}
