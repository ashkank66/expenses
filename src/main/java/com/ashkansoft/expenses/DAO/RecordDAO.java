package com.ashkansoft.expenses.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ashkansoft.expenses.Models.Record;

@Repository
public interface RecordDAO extends JpaRepository<Record,Long>{

//	Record saveRecord(Record record);
	
}
