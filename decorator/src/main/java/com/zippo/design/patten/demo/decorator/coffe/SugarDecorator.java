package com.zippo.design.patten.demo.decorator.coffe;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SugarDecorator extends CoffeeCostDecorator {

	public SugarDecorator(CoffeeCost cost) {
		super(cost);
	}

	@Override
	public double calculate() {
		log.info("Base cost is {} Decorate sugar, add {}",cost.calculate(), 0.01);
		return cost.calculate() + 0.01;
	}
}
