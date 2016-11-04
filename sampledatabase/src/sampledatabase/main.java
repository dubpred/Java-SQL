package sampledatabase;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class main {

	void displayRows(ResultSet rs, String tableName) throws SQLException{
		int rows = 0;
		while(rs.next()){
			rows++;
		}
		if(tableName == "Address"){
			while(rs.next()){
				Address address = new Address();
				address.setAddressId(rs.getInt("AddressId"));
				address.setAddress1(rs.getString("Address1"));
				address.setAddress2(rs.getString("Address2"));
				address.setCity(rs.getString("City"));
				address.setState(rs.getString("State"));
				address.setPostalCode(rs.getInt("PostCode"));
			}
		}
		else if(tableName == "Company"){
			company Company = new company();
			Company.setCompanyId(rs.getInt("CompanyId"));
			Company.setLocationId(rs.getInt("LocationId"));
			Company.setDescription(rs.getString("Description"));
		}
		else if(tableName == "User"){
			User user = new User();
			user.setFirstName(rs.getString("FirstName"));
			user.setLastName(rs.getString("LastName"));
			user.setEmail(rs.getString("Email"));
		}
		else if(tableName == "Location"){
			Location location = new Location();
			location.setLocationId(rs.getInt("LocationId"));
			location.setDescription(rs.getString("Description"));
			location.setRegion(rs.getString("Region"));
			location.setLatitude(rs.getInt("Latitude"));
			location.setLongitude(rs.getInt("Longitude"));
			location.setCountry(rs.getString("Country"));
			
		}
		else if(tableName == "Machine"){
			
		}
	}
}
