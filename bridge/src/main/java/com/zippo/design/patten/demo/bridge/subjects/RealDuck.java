package com.zippo.design.patten.demo.bridge.subjects;

import com.zippo.design.patten.demo.bridge.imp.CanFly;
import com.zippo.design.patten.demo.bridge.imp.CanSwim;

public class RealDuck extends Duck {

	public RealDuck(String name) {
		super(new CanFly(), new CanSwim(), name);
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
