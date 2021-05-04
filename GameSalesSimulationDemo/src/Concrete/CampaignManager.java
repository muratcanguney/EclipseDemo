package Concrete;

import Entities.Campaign;
import Entities.Game;
import Entities.MarketingStaff;
import Interfaces.CampaignService;

public class CampaignManager implements CampaignService{

	@Override
	public void add(MarketingStaff marketingStaff, Game game, Campaign campaign) {
		game.setDiscountAmount(campaign.getDiscountAmount());
		System.out.println(game.getGameName() + " Oyununa " + marketingStaff.getUserName() + " Satýþ Personeli Tarafýndan " + campaign.getCampaignName() + " Kampanyasý Uygulanmýþtýr..");	
	}

	@Override
	public void update(MarketingStaff marketingStaff, Game game, Campaign campaign) {
		game.setDiscountAmount(campaign.getDiscountAmount());
		System.out.println(game.getGameName() + " Oyununa " + marketingStaff.getUserName() + " Satýþ Personeli Tarafýndan Uygulanan " + campaign.getCampaignName() + " Kampanyasý Güncellenmiþtir..");
	}

	@Override
	public void delete(MarketingStaff marketingStaff, Game game, Campaign campaign) {
		game.setDiscountAmount(0);
		System.out.println(game.getGameName() + " Oyunundaki " + marketingStaff.getUserName() + " Satýþ Personeli Tarafýndan Uygulanan " + campaign.getCampaignName() + " Kampanyasý Silinmiþtir..");
	}
}
