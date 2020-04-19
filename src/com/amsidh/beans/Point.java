package com.amsidh.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Point implements InitializingBean, DisposableBean {

	private Integer pointX;
	private Integer pointY;
	
	private String pointName;

	Point(Integer pointX, Integer pointY) {
		this.pointX = pointX;
		this.pointY = pointY;
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Point " +pointName +" object is removed/disposable.");

	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Point " +pointName +"  is getting initilizing");

	}

	public Integer getPointX() {
		return pointX;
	}

	public Integer getPointY() {
		return pointY;
	}

	/**
	 * @return the pointName
	 */
	public String getPointName() {
		return pointName;
	}

	/**
	 * @param pointName the pointName to set
	 */
	public void setPointName(String pointName) {
		this.pointName = pointName;
	}

	
}
