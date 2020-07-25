package com.accp.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.GoodsMapper;
import com.accp.pojo.Goods;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class GoodsBiz {

	@Autowired
	private  GoodsMapper goodsDao;
	
	public PageInfo<Goods> queryAll(Integer p,Integer s){
		PageHelper.startPage(p, s);
		return new PageInfo<Goods>(goodsDao.queryAll());
	}
	
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int del(String id) {
		return goodsDao.deleteByPrimaryKey(id);
	}
	
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int add(Goods id) {
		return goodsDao.insertSelective(id);
	}
	
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int update(Goods pojo) {
		return goodsDao.updateByPrimaryKeySelective(pojo);
	}
}
