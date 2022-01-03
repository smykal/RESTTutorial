package com.RESTTutorial;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString

@Entity
public class Employee {
  private @Id @GeneratedValue Long id;
  private String name;
  private String role;

  public Employee(String name, String role) {
    this.name = name;
    this.role = role;
  }
}
