package com.bee.sample.dao.impl;

import org.springframework.stereotype.Repository;

import com.bee.sample.dao.UserClientDao;

@Repository("userClientDao")
public class UserClientDaoImpl implements UserClientDao {

	public UserClientDaoImpl() {
		System.out.println("���ڵ��ù��췽��:"+this.getClass().getName());
	}
	@Override
	public void saveCustom() {
		System.out.println("���ڵ���:"+this.getClass().getName());
		
	}

}
