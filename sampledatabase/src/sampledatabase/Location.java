package sampledatabase;

public class Location {
private int LocationId;
private String Description;
private String Region;
private int Longitude;
private int Latitude;
private String Country;
@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Location [LocationId=");
	builder.append(LocationId);
	builder.append(", Description=");
	builder.append(Description);
	builder.append(", Region=");
	builder.append(Region);
	builder.append(", Longitude=");
	builder.append(Longitude);
	builder.append(", Latitude=");
	builder.append(Latitude);
	builder.append(", Country=");
	builder.append(Country);
	builder.append("]");
	return builder.toString();
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
public String getRegion() {
	return Region;
}
public void setRegion(String region) {
	Region = region;
}
public int getLongitude() {
	return Longitude;
}
public void setLongitude(int longitude) {
	Longitude = longitude;
}
public int getLatitude() {
	return Latitude;
}
public void setLatitude(int latitude) {
	Latitude = latitude;
}
public String getCountry() {
	return Country;
}
public void setCountry(String country) {
	Country = country;
}


}
