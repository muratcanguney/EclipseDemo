package Entities;

public class MarketingStaff extends User {

	private int marketingStaffId;
	private int companyId;
	private String companyName;

	public MarketingStaff() {

	}

	public MarketingStaff(int marketingStaffId, int companyId, String companyName) {
		this.marketingStaffId = marketingStaffId;
		this.companyId = companyId;
		this.companyName = companyName;
	}

	public int getMarketingStaffId() {
		return marketingStaffId;
	}

	public void setMarketingStaffId(int marketingStaffId) {
		this.marketingStaffId = marketingStaffId;
	}

	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
}
