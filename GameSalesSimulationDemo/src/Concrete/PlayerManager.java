package Concrete;

import Interfaces.BaseUserManager;
import Interfaces.UserCheckService;

public class PlayerManager extends BaseUserManager {

	public PlayerManager(UserCheckService userCheckService) {
		super(userCheckService);
	}
}
