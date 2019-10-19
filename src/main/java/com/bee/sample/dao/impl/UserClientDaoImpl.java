package com.bee.sample.dao.impl;

import org.springframework.stereotype.Repository;

import com.bee.sample.dao.UserClientDao;

@Repository("userClientDao")
public class UserClientDaoImpl implements UserClientDao {

	public UserClientDaoImpl() {
		System.out.println("正在调用构造方法:"+this.getClass().getName());
	}
	@Override
	public void saveCustom() {
		System.out.println("正在调用:"+this.getClass().getName());
		
	}

}
