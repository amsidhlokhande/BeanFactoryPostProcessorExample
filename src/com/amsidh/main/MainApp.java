/**
 * 
 */
package com.amsidh.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.amsidh.beans.Triangle;

/**
 * @author VIRU
 *
 */
public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractApplicationContext abstractContext= new ClassPathXmlApplicationContext("spring.xml");
		abstractContext.registerShutdownHook();
		Triangle triangle=abstractContext.getBean(Triangle.class);
		triangle.drawTriangle();
		
		
	}

}
