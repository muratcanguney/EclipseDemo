package Interfaces;

import Entities.Game;
import Entities.Player;

public interface GameSalesService {

	void buyGame(Player player, Game game);

	void sellGame(Player player, Game game);
}
