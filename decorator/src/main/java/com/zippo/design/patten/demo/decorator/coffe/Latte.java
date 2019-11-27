package com.zippo.design.patten.demo.decorator.coffe;

public class Latte implements CoffeeCost{

	@Override
	public double calculate() {
		return 9.9;
	}

}
