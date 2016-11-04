package sampledatabase;

public class Phone {
	
	
	private int userId;
	private String phoneNo;
	private String type;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Phone [userId=");
		builder.append(userId);
		builder.append(", phoneNo=");
		builder.append(phoneNo);
		builder.append(", type=");
		builder.append(type);
		builder.append(", getUserId()=");
		builder.append(getUserId());
		builder.append(", getPhoneNo()=");
		builder.append(getPhoneNo());
		builder.append(", getType()=");
		builder.append(getType());
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
