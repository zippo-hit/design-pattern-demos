package com.zippo.design.patten.demo.decorator.coffe;

import lombok.Data;

@Data
public abstract class CoffeeCostDecorator implements CoffeeCost{

	protected CoffeeCost cost;
	
	public CoffeeCostDecorator(CoffeeCost cost) {
		this.cost = cost;
	}
	
	public double calculate() {
		return this.calculate();
	}
}
