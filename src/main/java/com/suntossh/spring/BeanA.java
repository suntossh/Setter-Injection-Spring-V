package com.suntossh.spring;

public class BeanA {
	
	private int age;

	private BeanB beanB;

	public BeanB getBeanB() {
		return beanB;
	}

	public void setBeanB(BeanB beanB) {
		System.out.println("Setting beanB through setBeanB method, setterInjection");
		this.beanB = beanB;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		System.out.println("Setting the age through setAge method, setterInjection");
		this.age = age;
	}
}
