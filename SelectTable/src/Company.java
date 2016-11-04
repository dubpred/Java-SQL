

public class Company {

	
	private int companyId;
	private int locationId;
	private String description;
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	public int getLocationId() {
		return locationId;
	}
	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Company [companyId=");
		builder.append(companyId);
		builder.append(", locationId=");
		builder.append(locationId);
		builder.append(", description=");
		builder.append(description);
		builder.append(", getCompanyId()=");
		builder.append(getCompanyId());
		builder.append(", getLocationId()=");
		builder.append(getLocationId());
		builder.append(", getDescription()=");
		builder.append(getDescription());
		builder.append(", getClass()=");
		builder.append(getClass());
		builder.append(", hashCode()=");
		builder.append(hashCode());
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
}
