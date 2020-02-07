package com.xworkz.spring.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.sql.ordering.antlr.Factory;
import org.springframework.stereotype.Component;

import com.xworkz.spring.entity.ValantineEntity;
@Component
public class ValantineDAOImpl implements ValantineDAO {

	public ValantineDAOImpl() {
		System.out.println("Created \t"+this.getClass().getSimpleName());
	}
	
	
	
	public Integer save(ValantineEntity entity) {
		try {
			Configuration cfg=new Configuration();
			cfg.configure("mysql.xml");
			cfg.addAnnotatedClass(ValantineEntity.class);
			SessionFactory factory=cfg.buildSessionFactory();
			Session session=factory.openSession();
			session.beginTransaction();
			session.save(entity);
			session.getTransaction().commit();
			session.close();
			factory.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
