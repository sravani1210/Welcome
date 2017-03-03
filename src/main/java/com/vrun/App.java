package com.vrun;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
public static void main(String[] args) {
	ApplicationContext ap=new ClassPathXmlApplicationContext("spring.xml");
	System.out.println("connected");
	Dao dao=(Dao)ap.getBean("dao");
	//dao.create();
	//Pojo pojo=new Pojo("anshu",1);
	//dao.insert(pojo);
	//dao.update(pojo);
	//dao.delete(19);
	Pojo pojo =new Pojo();
	System.out.println(dao.retrive(pojo));
  // System.out.println(dao.getdatabyid(1));
}
}
