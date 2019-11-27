package com.zippo.design.patten.demo.decorator.coffe;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MilkDecorator extends CoffeeCostDecorator {

	public MilkDecorator(CoffeeCost cost) {
		super(cost);
	}

	@Override
	public double calculate() {
		log.info("Base cost is {} Decorate milk, add {}",cost.calculate(), 0.5);
		return cost.calculate() + 0.5;
	}
}
