package com.zippo.design.patten.demo.bridge.imp;

import com.zippo.design.patten.demo.bridge.iface.IFly;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CannotFly implements IFly {

	@Override
	public void flyImplements() {
		log.info("我飞不起来！");

	}

}
