package com.accp.action;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.GoodsBiz;
import com.accp.pojo.Goods;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("api/good")
public class GoodsAction {

	@Autowired
	public GoodsBiz goodsBiz;

	@GetMapping("{p}/{s}")
	public PageInfo<Goods> queryAll(@PathVariable Integer p,@PathVariable Integer s){
		System.out.println(1);
		System.out.println(2);
		System.out.println(4);
		System.out.println(5);
		return goodsBiz.queryAll(p, s);
	}
	
	@DeleteMapping("{id}")
	public Map<String, Object> del(@PathVariable String id) {
		Map<String, Object> msg = new HashMap<>();
		int count = goodsBiz.del(id);
		if(count>0) {
			msg.put("code", 200);
		}else {
			msg.put("code", 300);
		}
		return msg;
	}
	
	@PostMapping("add")
	public Map<String, Object> add(@RequestBody Goods pojo){
		Map<String, Object> msg = new HashMap<>();
		int count = goodsBiz.add(pojo);
		if(count>0) {
			msg.put("code", 200);
		}else {
			msg.put("code", 300);
		}
		return msg;
	}
	
	@PutMapping("update")
	public Map<String, Object> update(@RequestBody Goods pojo){
		Map<String, Object> msg = new HashMap<>();
		int count = goodsBiz.update(pojo);
		if(count>0) {
			msg.put("code", 200);
		}else {
			msg.put("code", 300);
		}
		return msg;
	}
}
