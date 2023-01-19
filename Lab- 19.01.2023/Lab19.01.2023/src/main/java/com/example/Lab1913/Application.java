package com.example.Lab1913;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.example.entity.Teacher;

public class Application {

	public static void main(String[] args) {
		// resource -object of Resource Interface, Represent the info of xml file
		// ClassPathResource - it is the implementation class of Resource
		Resource resource = new ClassPathResource("ApplicationContext.xml");
		// BeanFactory -- its an interface which return the bean
		// XmlBeanfactory --its the implementation class of the beanfactory
		BeanFactory bf = new XmlBeanFactory(resource);
		// getBean -- its a method of BeanFactory--which return the objects of the
		// associated class now that is person

		Teacher e = (Teacher) bf.getBean("T");
		e.display();
	}

}
