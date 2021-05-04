package Concrete;

import Entities.Game;
import Interfaces.GameService;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println(game.getGameName() + " -- " + " Oyunu Sisteme Eklenmiþtir.. Oyunun Güncel Deðeri: " + game.getUnitPrice() + " Oyunun Güncel Miktarý: " + game.getStockAmount());
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getGameName() + " -- " + " Oyunu Güncellenmiþtir.. Oyunun Güncel Deðeri: " + game.getUnitPrice() + " Oyunun Güncel Miktarý: " + game.getStockAmount());
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getGameName() + " -- " + " Oyunu Sistemden Silinmiþtir..");
	}
}
