package com.sit;

//import org.springframework.beans.factory.BeanFactory;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;  

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		//   BeanFactory factory=new XmlBeanFactory(resource);  
		// Student student=(Student)factory.getBean("studentbean");  
		//    student.displayInfo();  
		    
		    Resource resource=new ClassPathResource("applicationContext.xml");  
		    BeanFactory factory=new XmlBeanFactory(resource);  
		      
		    Student student=(Student)factory.getBean("studentbean");  
		    student.displayInfo();  
	}

}
