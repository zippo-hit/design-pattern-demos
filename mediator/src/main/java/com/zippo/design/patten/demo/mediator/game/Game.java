package com.zippo.design.patten.demo.mediator.game;

public class Game {

	public static void main(String[] args) {
		IGameCenter center = new GameCenter();
		
		APlayer player1 = new Player();
		player1.setGameCenter(center);
		player1.setName("张无忌");
		
		APlayer player2 = new Player();
		player2.setGameCenter(center);
		player2.setName("郭靖");
		
		APlayer player3 = new Player();
		player3.setGameCenter(center);
		player3.setName("令狐冲");
		
		center.register(player1).register(player2).register(player3);
		
		player1.attacked();
		player3.attacked();
		player2.attacked();
		player2.attacked();
		player1.attacked();
		player1.attacked();

	}

}
