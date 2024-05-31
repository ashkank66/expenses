package com.ashkansoft.expenses.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ashkansoft.expenses.Models.Record;
import com.ashkansoft.expenses.Models.DTO.CreateRecordDTO;

import com.ashkansoft.expenses.BusinessLogics.RecordService;

@RestController
public class RecordController {
	
	@Autowired
	RecordService recordService; 

	@PostMapping("/createRecord")
	public void createRecord(@RequestBody CreateRecordDTO createRecordDTO) {
//		System.out.println(createRecordDTO.toString());
		recordService.saveRecord(createRecordDTO);
	}
	
}
