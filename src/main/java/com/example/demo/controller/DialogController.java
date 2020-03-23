package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.db.DBManager;
import com.example.demo.vo.ChatVo;
import com.example.demo.vo.DialogVo;
import com.google.gson.Gson;

@RestController
public class DialogController {
	
	@RequestMapping(value = "dialogList", produces = "application/json;charset=UTF-8")
	public String dialogList() {
		return (new Gson()).toJson( DBManager.listDialog());
	}
	
	@RequestMapping("/insertDialog")
	public String dialogInsert(DialogVo d) {
		String str = "ok";
		
		DBManager.insertDialog(d);
		
		return str;
	}

}
