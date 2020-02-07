package com.xworkz.spring.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="service")
public class ValantineEntity implements Serializable {
	@Id
	@GenericGenerator(name="auto" , strategy="increment")
	@GeneratedValue(generator="auto")
	@Column(name="T_id")
	private int tid;
	@Column(name="T_name")
	private String name;
	@Column(name="T_status")
	private String status;
	@Column(name="T_gift")
	private String gift;
	
	public ValantineEntity() {
		System.out.println("created \t"+this.getClass().getSimpleName());
		
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getGift() {
		return gift;
	}

	public void setGift(String gift) {
		this.gift = gift;
	}

	@Override
	public String toString() {
		return "ValantineEntity [tid=" + tid + ", name=" + name + ", status=" + status + ", gift=" + gift + "]";
	}
	
	
	

}
