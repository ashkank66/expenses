package com.ashkansoft.expenses.BusinessLogics;
import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashkansoft.expenses.Models.*;
import com.ashkansoft.expenses.Models.Record;
import com.ashkansoft.expenses.Models.Assembler.RecordAssembler;
import com.ashkansoft.expenses.Models.DTO.CreateRecordDTO;

import jakarta.transaction.Transactional;

import com.ashkansoft.expenses.DAO.*;

@Service
public class RecordService {

	private final RecordDAO recordDao;
    private final RecordAssembler recordAssembler;

    @Autowired
    public RecordService(RecordDAO recordDao, RecordAssembler recordAssembler) {
        this.recordDao = recordDao;
        this.recordAssembler = recordAssembler;
    }

    @Transactional
    public void saveRecord(CreateRecordDTO createRecordDTO) {
        Record record = recordAssembler.toEntity(createRecordDTO);
        recordDao.save(record);
    }
}
