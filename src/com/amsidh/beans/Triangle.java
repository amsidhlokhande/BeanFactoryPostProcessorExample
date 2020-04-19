/**
 * 
 */
package com.amsidh.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author VIRU
 * 
 */
public class Triangle implements DisposableBean, InitializingBean {

	private Point pointA;
	private Point pointB;
	private Point pointC;

	public Triangle() {

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.springframework.beans.factory.InitializingBean#afterPropertiesSet()
	 */
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Triangle is getting initilizing");

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.beans.factory.DisposableBean#destroy()
	 */
	@Override
	public void destroy() throws Exception {
		System.out.println("Triangle is removed/disposible");

	}

	/**
	 * @return the pointA
	 */
	public Point getPointA() {
		return pointA;
	}

	/**
	 * @param pointA
	 *            the pointA to set
	 */
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	/**
	 * @return the pointB
	 */
	public Point getPointB() {
		return pointB;
	}

	/**
	 * @param pointB
	 *            the pointB to set
	 */
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	/**
	 * @return the pointC
	 */
	public Point getPointC() {
		return pointC;
	}

	/**
	 * @param pointC
	 *            the pointC to set
	 */
	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public void drawTriangle()
	{
		System.out.println("Triangle Drawn With Below details:");
		System.out.println("PointA("+pointA.getPointX()+","+pointA.getPointY()+")");
		System.out.println("PointB("+pointB.getPointX()+","+pointB.getPointY()+")");
		System.out.println("PointC("+pointC.getPointX()+","+pointC.getPointY()+")");
	}
}
