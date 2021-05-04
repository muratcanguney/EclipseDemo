package Concrete;

import Entities.Campaign;
import Entities.Game;
import Entities.MarketingStaff;
import Interfaces.CampaignService;

public class CampaignManager implements CampaignService{

	@Override
	public void add(MarketingStaff marketingStaff, Game game, Campaign campaign) {
		game.setDiscountAmount(campaign.getDiscountAmount());
		System.out.println(game.getGameName() + " Oyununa " + marketingStaff.getUserName() + " Sat�� Personeli Taraf�ndan " + campaign.getCampaignName() + " Kampanyas� Uygulanm��t�r..");	
	}

	@Override
	public void update(MarketingStaff marketingStaff, Game game, Campaign campaign) {
		game.setDiscountAmount(campaign.getDiscountAmount());
		System.out.println(game.getGameName() + " Oyununa " + marketingStaff.getUserName() + " Sat�� Personeli Taraf�ndan Uygulanan " + campaign.getCampaignName() + " Kampanyas� G�ncellenmi�tir..");
	}

	@Override
	public void delete(MarketingStaff marketingStaff, Game game, Campaign campaign) {
		game.setDiscountAmount(0);
		System.out.println(game.getGameName() + " Oyunundaki " + marketingStaff.getUserName() + " Sat�� Personeli Taraf�ndan Uygulanan " + campaign.getCampaignName() + " Kampanyas� Silinmi�tir..");
	}
}
