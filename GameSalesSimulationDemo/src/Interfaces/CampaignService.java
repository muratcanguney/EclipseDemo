package Interfaces;

import Entities.Campaign;
import Entities.Game;
import Entities.MarketingStaff;

public interface CampaignService {

	void add(MarketingStaff marketingStaff, Game game, Campaign campaign);

	void update(MarketingStaff marketingStaff, Game game, Campaign campaign);

	void delete(MarketingStaff marketingStaff, Game game, Campaign campaign);
}
