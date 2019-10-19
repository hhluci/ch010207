package com.bee.sample.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bee.sample.service.UserClientService;


/**
 * 
 * 
 * ʹ����������������ļ���
 * @author hhluci
 *
 */
public class Client {

	public static void main(String[] args) {
		
		ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		
		UserClientService userClientService = ac.getBean("userClientService") instanceof UserClientService? 
				(UserClientService)ac.getBean("userClientService"):null;

		userClientService.saveCustom();
	}

}
