package com.zippo.design.patten.demo.mediator.game;

public interface IGameCenter {
	public IGameCenter register(APlayer player);
	public void transfer(APlayer player);
}
