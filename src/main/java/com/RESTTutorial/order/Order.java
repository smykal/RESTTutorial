package com.RESTTutorial.order;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Entity
@Table(name="CUSTOMER_ORDER")
public class Order {
  private @Id @GeneratedValue Long id;
  private String description;
  private Status status;

  public Order(String description, Status status) {
    this.description = description;
    this.status = status;
  }
}
