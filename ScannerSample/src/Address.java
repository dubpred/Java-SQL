

public class Address {

	private int userId;
	private String address1;
	private String address2;
	private String city;
	private String state;
	private String postalCode;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Address [userId=");
		builder.append(userId);
		builder.append(", address1=");
		builder.append(address1);
		builder.append(", address2=");
		builder.append(address2);
		builder.append(", city=");
		builder.append(city);
		builder.append(", state=");
		builder.append(state);
		builder.append(", postalCode=");
		builder.append(postalCode);
		builder.append(", getUserId()=");
		builder.append(getUserId());
		builder.append(", getAddress1()=");
		builder.append(getAddress1());
		builder.append(", getAddress2()=");
		builder.append(getAddress2());
		builder.append(", getCity()=");
		builder.append(getCity());
		builder.append(", getState()=");
		builder.append(getState());
		builder.append(", getPostalCode()=");
		builder.append(getPostalCode());
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
