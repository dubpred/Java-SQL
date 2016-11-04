package Model;

public class Phone {
	
	private int PhoneId;
	private int UserId;
	private String PhoneNo;
	private String type;
	
	public Phone(){
		
		
		
	}
	
	public Phone(int PhoneId, int UserId, String PhoneNo, String type){
		this.PhoneId = PhoneId;
		this.UserId = UserId;
		this.PhoneNo = PhoneNo;
		this.type = type;
	}
	
	
	public int getPhoneId() {
		return PhoneId;
	}
	public void setPhoneId(int phoneId) {
		PhoneId = phoneId;
	}
	public int getUserId() {
		return UserId;
	}
	public void setUserId(int userId) {
		UserId = userId;
	}
	public String getPhoneNo() {
		return PhoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		PhoneNo = phoneNo;
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
		builder.append("Phone [PhoneId=");
		builder.append(PhoneId);
		builder.append(", UserId=");
		builder.append(UserId);
		builder.append(", PhoneNo=");
		builder.append(PhoneNo);
		builder.append(", type=");
		builder.append(type);
		builder.append("]");
		return builder.toString();
	}

}

