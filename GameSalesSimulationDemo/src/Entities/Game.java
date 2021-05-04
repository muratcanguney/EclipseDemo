package Entities;

public class Game {

	private int gameId;
	private String gameName;
	private int stockAmount;
	private double unitPrice;
	private int discountAmount = 0;

	public Game() {

	}

	public Game(int gameId, String gameName, int stockAmount, double unitPrice) {
		this.gameId = gameId;
		this.gameName = gameName;
		this.stockAmount = stockAmount;
		this.unitPrice = unitPrice;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getDiscountAmount() {
		return discountAmount;
	}

	public void setDiscountAmount(int discountAmount) {
		this.discountAmount = discountAmount;
	}
}
