package com.zippo.design.patten.demo.mediator.game;

import java.util.ArrayList;
import java.util.List;

public class GameCenter implements IGameCenter {

	private List<APlayer> players;
	
	public GameCenter() {
		players = new ArrayList<>();
	}
	@Override
	public IGameCenter register(APlayer player) {
		players.add(player);
		return this;
	}

	@Override
	public void transfer(APlayer player) {
		for(APlayer p : players) {
			if(!p.getName().equalsIgnoreCase(player.getName()))
				p.receiveMessage(player);
		}
	}

}
