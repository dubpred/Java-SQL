package Model;

public class Machine1 {
	
	private int MachineId;
	private int CompanyId;
	private String Description;
	public int getMachineId() {
		return MachineId;
	}
	public void setMachineId(int machineId) {
		MachineId = machineId;
	}
	public int getCompanyId() {
		return CompanyId;
	}
	public void setCompanyId(int companyId) {
		CompanyId = companyId;
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
		builder.append("Machine1 [MachineId=");
		builder.append(MachineId);
		builder.append(", CompanyId=");
		builder.append(CompanyId);
		builder.append(", Description=");
		builder.append(Description);
		builder.append("]");
		return builder.toString();
	}
	
	

}
