package com.zippo.design.patten.demo.decorator;

import com.zippo.design.patten.demo.decorator.coffe.CoffeeCost;
import com.zippo.design.patten.demo.decorator.coffe.CoffeeCostDecorator;
import com.zippo.design.patten.demo.decorator.coffe.Latte;
import com.zippo.design.patten.demo.decorator.coffe.MilkDecorator;
import com.zippo.design.patten.demo.decorator.coffe.SugarDecorator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CoffeTest {

	public static void main(String[] args) {
		CoffeeCost cost = new Latte();
		CoffeeCostDecorator decorator = new MilkDecorator(cost);
		decorator = new MilkDecorator(decorator);
		decorator = new SugarDecorator(decorator);
		decorator = new SugarDecorator(decorator);
		decorator = new MilkDecorator(decorator);
		log.info("Cost is {}",  decorator.calculate());
	}

}
