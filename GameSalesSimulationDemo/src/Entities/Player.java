package Entities;

public class Player extends User {

	private int playerId;

	public Player() {

	}

	public Player(int playerId) {
		this.playerId = playerId;
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
}
