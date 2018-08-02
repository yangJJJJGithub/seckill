package com.seckill.backstags.dao;

import java.util.List;

import org.apache.ibatis.session.RowBounds;

import com.seckill.backstags.entity.UsrDomain;



public interface UsrDaoMapper {
	
	void insert(UsrDomain usr);
	
	List<UsrDomain> queryList();
	
	List<UsrDomain> queryprepare(RowBounds row);
	
	UsrDomain findOne(String name);
}
