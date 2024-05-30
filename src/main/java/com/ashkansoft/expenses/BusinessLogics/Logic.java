package com.ashkansoft.expenses.BusinessLogics;
import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashkansoft.expenses.Models.*;
import com.ashkansoft.expenses.Models.Record;
import com.ashkansoft.expenses.Models.DTO.CreateRecordDTO;
import com.ashkansoft.expenses.DAO.*;

@Service
public class Logic {

	@Autowired
	RecordDAO recordDao;
	
	@Autowired
	SourceDAO sourceDao;
	
	@Autowired
	CurrencyDAO currencyDao;
	
	
	
	public void saveRecord(CreateRecordDTO createRecordDTO) {
		Source source = sourceDao.findById(createRecordDTO.getSource()).get();
		Currency currency = currencyDao.findById(createRecordDTO.getCurrency()).get();
		Record record = new Record(createRecordDTO.getAmount(), source, currency, createRecordDTO.getGoods());
		recordDao.save(record);
	}
}
