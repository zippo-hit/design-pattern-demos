package com.zippo.design.patten.demo.mediator.game;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Player extends APlayer {

	@Override
	public void attacked() {
		log.info("【{}】：我被攻击了！", this.getName());
		this.getGameCenter().transfer(this);
	}

	@Override
	public void receiveMessage(APlayer player) {
		log.info("【总部】：{}，{}被敌人攻击了，快去救他！",this.getName() , player.getName());
	}

}
