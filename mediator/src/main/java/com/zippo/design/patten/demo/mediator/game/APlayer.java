package com.zippo.design.patten.demo.mediator.game;

import lombok.Data;

@Data
public abstract class APlayer {
	
	private IGameCenter gameCenter;
	private String name;
	
	public abstract void attacked();
	public abstract void receiveMessage(APlayer player);
}
