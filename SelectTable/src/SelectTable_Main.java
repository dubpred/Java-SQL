
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class SelectTable_Main {

	static void displayRows(ResultSet rs, String tableName) throws SQLException {
		int rows = 0;
		try{

		while (rs.next()) {
			rows++;

			if (tableName == "Address") {
				Address address = new Address();
				address.setAddressId(rs.getInt("AddressId"));
				address.setUserId(rs.getInt("UserId"));
				address.setAddress1(rs.getString("Address1"));
				address.setAddress2(rs.getString("Address2"));
				address.setCity(rs.getString("City"));
				address.setState(rs.getString("State"));
				address.setPostalCode(rs.getString("PostCode"));
				System.out.println(address.toString());

				} else if (tableName == "Company") {
				Company company = new Company();
				company.setCompanyId(rs.getInt("CompanyId"));
				company.setLocationId(rs.getInt("LocationId"));
				company.setDescription(rs.getString("Description"));
				System.out.println(company.toString());

				} else if (tableName == "Location") {
				Location location = new Location();
				location.setLocationId(rs.getInt("locationId"));
				location.setDescription(rs.getString("description"));
				location.setRegion(rs.getString("region"));
				location.setLongitude(rs.getLong("longitude"));
				location.setLatitude(rs.getLong("latitude"));
				location.setCountry(rs.getString("country"));
				System.out.println(location.toString());
				
				}else if (tableName == "Phone") {
				Phone phone = new Phone();
				phone.setPhoneId(rs.getInt("PhoneId"));
				phone.setUserId(rs.getInt("UserId"));
				phone.setPhoneNo(rs.getString("PhoneNo"));
				phone.setType(rs.getString("Type"));
				System.out.println(phone.toString());
				
				
			}
			}
			
		
		System.out.println("Rows (" + rows + "); displayed for " + tableName);
		
	}
		catch (Exception e) {
		System.out.println(e.toString());}
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		// Result Container
		ResultSet rs = null;

		// Statement Container
		PreparedStatement ps = null;

		// Database Connection
		MSSql_Connection msqlConn = new MSSql_Connection();
		msqlConn.setDbName("young.bryce");
		msqlConn.establishDbConnection();

		Connection conn = msqlConn.getConn();


		List<String> list = new ArrayList<>();
		list.add("Location");
		list.add("Address");
		list.add("Company");
		list.add("Phone");
		
		try {

			for (String tableName : list){
				String sql = "SELECT * FROM " + tableName;
				ps = conn.prepareStatement(sql);
				rs = ps.executeQuery();
				displayRows(rs, tableName);
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		} finally {
			msqlConn.closeDbConnection(conn);
		}

		System.out.println("Done....");
	}

}
