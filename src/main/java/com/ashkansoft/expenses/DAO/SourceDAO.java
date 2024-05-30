package com.ashkansoft.expenses.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ashkansoft.expenses.Models.Source;

@Repository
public interface SourceDAO extends JpaRepository<Source, Long>{

}
