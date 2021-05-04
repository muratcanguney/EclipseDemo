package Adapters;

import Entities.User;
import Interfaces.UserCheckService;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServicesAdapter implements UserCheckService {

	@Override
	public boolean checkIfRealPerson(User user) {

		KPSPublicSoap soapClient = new KPSPublicSoapProxy();

		boolean result = false;

		try {
			result = soapClient.TCKimlikNoDogrula(Long.parseLong(user.getNationalityId()),
					user.getFirstName().toUpperCase(), user.getLastName().toUpperCase(),
					user.getDateOfBirth().getYear());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}
