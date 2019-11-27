package com.zippo.design.patten.demo.bridge.subjects;

import com.zippo.design.patten.demo.bridge.iface.IFly;
import com.zippo.design.patten.demo.bridge.iface.ISwim;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public abstract class Duck {

	protected IFly fly;
	protected ISwim swim;
	
	private String name;
	
	public Duck(IFly fly, ISwim swim, String name) {
		this.fly = fly;
		this.swim = swim;
		this.name = name;
	}
	
	public Duck(String name) {
		this.name = name;
	}
	
	public abstract void swim(); 
	public abstract void fly();
	
	public void behavior() {
		log.info("Hello, 我是"+ name +"!");
		this.swim();
		this.fly();
	}
}
