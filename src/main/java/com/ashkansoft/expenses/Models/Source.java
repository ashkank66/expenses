package com.ashkansoft.expenses.Models;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@ToString
public class Source {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
	
	@Getter
	@Setter
	private String name;
	
	@Getter
	@Setter
	@ManyToOne
	private Currency currency;
	
	@Getter
	@Setter
	private BigDecimal balance;
}
