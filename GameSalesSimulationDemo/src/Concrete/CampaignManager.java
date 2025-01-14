package Concrete;

import Entities.Campaign;
import Entities.Game;
import Entities.MarketingStaff;
import Interfaces.CampaignService;

public class CampaignManager implements CampaignService{

	@Override
	public void add(MarketingStaff marketingStaff, Game game, Campaign campaign) {
		game.setDiscountAmount(campaign.getDiscountAmount());
		System.out.println(game.getGameName() + " Oyununa " + marketingStaff.getUserName() + " Satış Personeli Tarafından " + campaign.getCampaignName() + " Kampanyası Uygulanmıştır..");	
	}

	@Override
	public void update(MarketingStaff marketingStaff, Game game, Campaign campaign) {
		game.setDiscountAmount(campaign.getDiscountAmount());
		System.out.println(game.getGameName() + " Oyununa " + marketingStaff.getUserName() + " Satış Personeli Tarafından Uygulanan " + campaign.getCampaignName() + " Kampanyası Güncellenmiştir..");
	}

	@Override
	public void delete(MarketingStaff marketingStaff, Game game, Campaign campaign) {
		game.setDiscountAmount(0);
		System.out.println(game.getGameName() + " Oyunundaki " + marketingStaff.getUserName() + " Satış Personeli Tarafından Uygulanan " + campaign.getCampaignName() + " Kampanyası Silinmiştir..");
	}
}
