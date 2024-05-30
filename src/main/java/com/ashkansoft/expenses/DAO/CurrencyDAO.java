package com.ashkansoft.expenses.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ashkansoft.expenses.Models.Currency;

@Repository
public interface CurrencyDAO extends JpaRepository<Currency, Long>{

}
