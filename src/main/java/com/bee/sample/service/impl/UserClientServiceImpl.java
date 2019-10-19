package com.bee.sample.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bee.sample.dao.UserClientDao;
import com.bee.sample.service.UserClientService;

@Service("userClientService")
public class UserClientServiceImpl implements UserClientService {

	@Autowired
	private UserClientDao userClientDao;
	
	public UserClientServiceImpl() {
		System.out.println("���ڵ��ù��췽��:"+this.getClass().getName());
	}
	
	@Override
	public void saveCustom() {
		

		System.out.println("���ڵ���:"+this.getClass().getName());
		//UserClientDao userClientDao = new UserClientDaoImpl();
		userClientDao.saveCustom();
	}

}
