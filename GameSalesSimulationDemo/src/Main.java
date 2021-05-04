import java.sql.Date;

import Adapters.MernisServicesAdapter;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.GameSalesManager;
import Concrete.MarketingStaffManager;
import Concrete.PlayerManager;
import Entities.Campaign;
import Entities.Game;
import Entities.MarketingStaff;
import Entities.Player;
import Interfaces.BaseUserManager;

public class Main {

	public static void main(String[] args) {

		Player player1 = new Player();
		player1.setPlayerId(1);
		player1.setUserName("mrtgny");
		player1.setFirstName("Murat Can");
		player1.setLastName("Güney");
		player1.setNationalityId("99999999999");
		player1.setDateOfBirth(new Date(1992, 8, 31));
		player1.setPassword("mrt1234");

		BaseUserManager playerManager = new PlayerManager(new MernisServicesAdapter());
		playerManager.save(player1);
		playerManager.update(player1);
		playerManager.delete(player1);

		System.out.println("---------------------------------------------");

		MarketingStaff marketingStaff1 = new MarketingStaff();
		marketingStaff1.setMarketingStaffId(1);
		marketingStaff1.setUserName("AhmetCýnar");
		marketingStaff1.setFirstName("Ahmet");
		marketingStaff1.setLastName("Çýnar");
		marketingStaff1.setNationalityId("99999999999");
		marketingStaff1.setDateOfBirth(new Date(1995, 3, 12));
		marketingStaff1.setPassword("sls1234");
		marketingStaff1.setCompanyId(1);
		marketingStaff1.setCompanyName("Rocstar Games");

		BaseUserManager marketingStaffManager = new MarketingStaffManager(new MernisServicesAdapter());
		marketingStaffManager.save(marketingStaff1);
		marketingStaffManager.update(marketingStaff1);
		marketingStaffManager.delete(marketingStaff1);

		System.out.println("---------------------------------------------");

		Game game1 = new Game();
		game1.setGameId(1);
		game1.setGameName("GTA V");
		game1.setStockAmount(30);
		game1.setUnitPrice(79.9);

		Game game2 = new Game();
		game2.setGameId(2);
		game2.setGameName("CS GO");
		game2.setStockAmount(50);
		game2.setUnitPrice(100);

		GameManager gameManager = new GameManager();
		gameManager.add(game1);
		gameManager.add(game2);
		gameManager.update(game1);
		gameManager.delete(game1);
		
		System.out.println("---------------------------------------------");
		
		Campaign campaign1 = new Campaign();
		campaign1.setCampaignId(1);
		campaign1.setCampaignName("%10 Ýndirim Kampanyasý");
		campaign1.setDiscountAmount(10);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(marketingStaff1, game2, campaign1);
		campaignManager.update(marketingStaff1, game2, campaign1);
		campaignManager.delete(marketingStaff1, game2, campaign1);
		campaignManager.add(marketingStaff1, game2, campaign1);
		
		System.out.println("---------------------------------------------");
		
		GameSalesManager gameSalesManager = new GameSalesManager();
		gameSalesManager.buyGame(player1, game2);
		gameSalesManager.sellGame(player1, game2);
	}
}
