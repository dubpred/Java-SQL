package Model;

public class Location {
	
	
	
	private int locationId;
	private String description;
	private String region;
	private double longitude;
	private double latitude;
	private String country;
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
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Location [locationId=");
		builder.append(locationId);
		builder.append(", description=");
		builder.append(description);
		builder.append(", region=");
		builder.append(region);
		builder.append(", longitude=");
		builder.append(longitude);
		builder.append(", latitude=");
		builder.append(latitude);
		builder.append(", country=");
		builder.append(country);
		builder.append(", getLocationId()=");
		builder.append(getLocationId());
		builder.append(", getDescription()=");
		builder.append(getDescription());
		builder.append(", getRegion()=");
		builder.append(getRegion());
		builder.append(", getLongitude()=");
		builder.append(getLongitude());
		builder.append(", getLatitude()=");
		builder.append(getLatitude());
		builder.append(", getCountry()=");
		builder.append(getCountry());
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
