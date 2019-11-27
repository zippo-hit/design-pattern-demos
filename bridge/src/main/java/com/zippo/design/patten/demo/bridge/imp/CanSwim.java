package com.zippo.design.patten.demo.bridge.imp;

import com.zippo.design.patten.demo.bridge.iface.ISwim;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CanSwim implements ISwim {

	@Override
	public void swimImpements() {
		log.info("我自由自在的游泳！");

	}

}
