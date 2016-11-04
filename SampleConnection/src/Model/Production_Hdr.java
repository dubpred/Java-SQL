package Model;

import java.sql.Timestamp;

public class Production_Hdr {
private int ProductionId;
private int MachineId;
private Timestamp ProductionDateTime;
public int getProductionId() {
	return ProductionId;
}
public void setProductionId(int productionId) {
	ProductionId = productionId;
}
public int getMachineId() {
	return MachineId;
}
public void setMachineId(int machineId) {
	MachineId = machineId;
}
public Timestamp getProductionDateTime() {
	return ProductionDateTime;
}
public void setProductionDateTime(Timestamp productionDateTime) {
	ProductionDateTime = productionDateTime;
}
@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Production_Hdr [ProductionId=");
	builder.append(ProductionId);
	builder.append(", MachineId=");
	builder.append(MachineId);
	builder.append(", ProductionDateTime=");
	builder.append(ProductionDateTime);
	builder.append("]");
	return builder.toString();
}

}
