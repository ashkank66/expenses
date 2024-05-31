package com.ashkansoft.expenses.Models.Assembler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashkansoft.expenses.DAO.CurrencyDAO;
import com.ashkansoft.expenses.DAO.SourceDAO;
import com.ashkansoft.expenses.Models.Currency;
import com.ashkansoft.expenses.Models.Source;
import com.ashkansoft.expenses.Models.DTO.CreateRecordDTO;
import com.ashkansoft.expenses.Models.Record;
import jakarta.persistence.EntityNotFoundException;

@Service
public class RecordAssembler {
	
	private final SourceDAO sourceDao;
    private final CurrencyDAO currencyDao;

    @Autowired
    public RecordAssembler(SourceDAO sourceDao, CurrencyDAO currencyDao) {
        this.sourceDao = sourceDao;
        this.currencyDao = currencyDao;
    }

    public Record toEntity(CreateRecordDTO createRecordDTO) {
        Source source = sourceDao.findById(createRecordDTO.getSource())
                .orElseThrow(() -> new EntityNotFoundException("Source not found"));
        Currency currency = currencyDao.findById(createRecordDTO.getCurrency())
                .orElseThrow(() -> new EntityNotFoundException("Currency not found"));

        return new Record(createRecordDTO.getAmount(), source, currency, createRecordDTO.getGoods());
    }

}
