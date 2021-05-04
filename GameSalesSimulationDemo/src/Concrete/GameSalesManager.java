package Concrete;

import Entities.Game;
import Entities.Player;
import Interfaces.GameSalesService;

public class GameSalesManager implements GameSalesService{

	@Override
	public void buyGame(Player player, Game game) {
		game.setStockAmount(game.getStockAmount() -1);
		System.out.println(player.getUserName() + " Kullanýcýsý " + game.getGameName() + " Oyununu Satýn Almýþtýr. \nOyunun Güncel Miktarý: " + game.getStockAmount() + "\t Oyun Tutarý: " + game.getUnitPrice() + "\t Oyunun Ýndirimli Tutarý: " + (game.getUnitPrice() - (game.getUnitPrice() * game.getDiscountAmount() / 100)));
	}

	@Override
	public void sellGame(Player player, Game game) {
		game.setStockAmount(game.getStockAmount() +1);
		System.out.println(player.getUserName() + " Kullanýcýsý " + game.getGameName() + " Oyununu Satmýþtýr. \nOyunun Güncel Miktarý: " + game.getStockAmount());	
	}
}
