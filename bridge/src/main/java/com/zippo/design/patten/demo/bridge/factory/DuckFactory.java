package com.zippo.design.patten.demo.bridge.factory;

import com.zippo.design.patten.demo.bridge.subjects.Duck;
import com.zippo.design.patten.demo.bridge.subjects.RealDuck;
import com.zippo.design.patten.demo.bridge.subjects.RobotDuck;
import com.zippo.design.patten.demo.bridge.subjects.WoodDuck;

public class DuckFactory {
	public Duck genDuck(String name) {
		if("real".equalsIgnoreCase(name))
			return new RealDuck(name);
		else if("robot".equalsIgnoreCase(name)) {
			return new RobotDuck(name);
		}
		else if("wood".equalsIgnoreCase(name)) {
			return new WoodDuck(name);
		}
		else
			return new RealDuck(name);
	}
}
