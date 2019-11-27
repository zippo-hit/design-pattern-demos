package com.zippo.design.patten.demo.bridge.subjects;

import com.zippo.design.patten.demo.bridge.imp.CannotFlyWithRocket;
import com.zippo.design.patten.demo.bridge.imp.CannotSwim;

public class RobotDuck extends Duck {

	public RobotDuck(String name) {
		super(new CannotFlyWithRocket(), new CannotSwim(), name);
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
