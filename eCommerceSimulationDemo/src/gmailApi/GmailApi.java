package gmailApi;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GmailApi {

	public boolean checkGmailApi(String mail) {
		Pattern pattern = Pattern.compile("^(.+)@gmail(.+)$", Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(mail);
		if (!matcher.matches()) {
			return false;
		}
		return true;
	}
}
