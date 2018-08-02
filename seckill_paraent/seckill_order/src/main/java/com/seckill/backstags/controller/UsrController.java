package com.seckill.backstags.controller;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.seckill.backstags.dao.UsrDaoMapper;
import com.seckill.backstags.entity.UsrDomain;



@RestController
public class UsrController {
	
	@Autowired
	private UsrDaoMapper usrMapper;
	
	@RequestMapping("/show")
	public List<UsrDomain> show(){
		RowBounds row = new RowBounds(0,10);
		return usrMapper.queryprepare(row);
	}
	
	@RequestMapping("/valocity")
	public ModelAndView showsValocity(){
		return new ModelAndView();
	}
	
	@RequestMapping("/demo")
	public ModelAndView showsSocket(){
		
		return new ModelAndView("demo");
	}
	
	@RequestMapping("/index")
	public ModelAndView index(){
		
		return new ModelAndView("index");
	}
	
}
