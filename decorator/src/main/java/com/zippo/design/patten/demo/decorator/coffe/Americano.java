package com.zippo.design.patten.demo.decorator.coffe;

public class Americano implements CoffeeCost{

	@Override
	public double calculate() {
		return 6.9;
	}

}
