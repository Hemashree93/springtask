package com.xworkz.spring.dao;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.spring.entity.ValantineEntity;
import com.xworkz.spring.service.ValantineService;

@Component
public class ValantineServiceImpl implements ValantineService{
	
	@Autowired
	private ValantineDAO dao;
	
	public ValantineServiceImpl() {
		System.out.println("Created \t"+this.getClass().getSimpleName());
	}
	
	public boolean ValidateAndSave(ValantineEntity entity) {
		System.out.println("invoked ValidateAndSave"+ entity);
		System.out.println("yet to validate");
		Integer id=dao.save(entity);
		if(Objects.nonNull(id)) {
			System.out.println("entity saved");
			return true;
		}
		
		return false;
	}

}
