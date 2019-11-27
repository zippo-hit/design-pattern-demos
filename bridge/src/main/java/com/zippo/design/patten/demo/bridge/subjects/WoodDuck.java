package com.zippo.design.patten.demo.bridge.subjects;

import com.zippo.design.patten.demo.bridge.imp.CanSwim;
import com.zippo.design.patten.demo.bridge.imp.CannotFly;

public class WoodDuck extends Duck {

	public WoodDuck(String name) {
		super(new CannotFly(), new CanSwim(), name);
	}

	@Override
	public void swim() {
		fly.flyImplements();
	}

	@Override
	public void fly() {
		swim.swimImpements();
	}

}
