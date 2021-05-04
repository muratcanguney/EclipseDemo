package Concrete;

import Entities.Game;
import Entities.Player;
import Interfaces.GameSalesService;

public class GameSalesManager implements GameSalesService{

	@Override
	public void buyGame(Player player, Game game) {
		game.setStockAmount(game.getStockAmount() -1);
		System.out.println(player.getUserName() + " Kullan�c�s� " + game.getGameName() + " Oyununu Sat�n Alm��t�r. \nOyunun G�ncel Miktar�: " + game.getStockAmount() + "\t Oyun Tutar�: " + game.getUnitPrice() + "\t Oyunun �ndirimli Tutar�: " + (game.getUnitPrice() - (game.getUnitPrice() * game.getDiscountAmount() / 100)));
	}

	@Override
	public void sellGame(Player player, Game game) {
		game.setStockAmount(game.getStockAmount() +1);
		System.out.println(player.getUserName() + " Kullan�c�s� " + game.getGameName() + " Oyununu Satm��t�r. \nOyunun G�ncel Miktar�: " + game.getStockAmount());	
	}
}
