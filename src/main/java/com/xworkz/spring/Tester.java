package com.xworkz.spring;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.spring.entity.ValantineEntity;
import com.xworkz.spring.service.ValantineService;

public class Tester {
	public static void main(String[] args) {
		try {
			ApplicationContext container=new ClassPathXmlApplicationContext("spring.xml");
			
			ValantineService con=container.getBean(ValantineService.class);
			ValantineEntity service=new ValantineEntity();
			service.setName("rr");
			service.setStatus("comit");
			service.setGift("rose");
			con.ValidateAndSave(service);
		} catch (BeansException e) {
			e.printStackTrace();
		}				
	
		
		
		
		
	}

}
