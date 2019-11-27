package com.zippo.design.patten.demo.bridge;

import com.zippo.design.patten.demo.bridge.factory.DuckFactory;
import com.zippo.design.patten.demo.bridge.subjects.Duck;

public class Test {

	public static void main(String[] args) {
		DuckFactory factory = new DuckFactory();
		Duck duck = factory.genDuck("real");
		duck	.behavior();
	}

}
