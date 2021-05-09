package core;

import gmailApi.GmailApi;

public class GmailAdapter implements MailService {

	@Override
	public boolean checkMail(String mail) {
		GmailApi api = new GmailApi();
		return api.checkGmailApi(mail);
	}
}
