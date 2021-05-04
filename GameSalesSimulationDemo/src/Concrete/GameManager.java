package Concrete;

import Entities.Game;
import Interfaces.GameService;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println(game.getGameName() + " -- " + " Oyunu Sisteme Eklenmi�tir.. Oyunun G�ncel De�eri: " + game.getUnitPrice() + " Oyunun G�ncel Miktar�: " + game.getStockAmount());
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getGameName() + " -- " + " Oyunu G�ncellenmi�tir.. Oyunun G�ncel De�eri: " + game.getUnitPrice() + " Oyunun G�ncel Miktar�: " + game.getStockAmount());
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getGameName() + " -- " + " Oyunu Sistemden Silinmi�tir..");
	}
}
