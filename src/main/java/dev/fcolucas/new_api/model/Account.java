package dev.fcolucas.new_api.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "tb_account")
@Getter
@Setter
public class Account {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(unique = true)
  private String number;

  private String agency;

  @Column(precision = 13, scale = 2)
  private BigDecimal balance;

  @Column(name = "additional_limit", precision = 13, scale = 2)
  private BigDecimal limit;
}
