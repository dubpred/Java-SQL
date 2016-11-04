package sampledatabase;

public class company {
	private int CompanyId;
	private int LocationId;
	private String Description;
	
	public int getCompanyId() {
		return CompanyId;
	}
	public void setCompanyId(int companyId) {
		CompanyId = companyId;
	}
	public int getLocationId() {
		return LocationId;
	}
	public void setLocationId(int locationId) {
		LocationId = locationId;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("company [CompanyId=");
		builder.append(CompanyId);
		builder.append(", LocationId=");
		builder.append(LocationId);
		builder.append(", Description=");
		builder.append(Description);
		builder.append("]");
		return builder.toString();
	}
	
}
