import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.util.Scanner;

public class ScannerRun {

	public static void main(String[] args) throws Exception {
		
		ResultSet rs = null;
		PreparedStatement ps = null;
		
		
		//Establish DB connection
		
		MSSql_Connection msqlConn = new MSSql_Connection();
		msqlConn.setDbName("young.bryce");
		msqlConn.establishDbConnection();
		
		Connection conn = msqlConn.getConn();
		
		//Create scanner to attain input from user
		
		Scanner scanner = new Scanner(System.in);
		
		User user = new User();
		Address address = null;
		Phone phone = null;
		
		for(int j=1; j<10; j++) {
			System.out.println("Enter FirstName:  ");
			user.setFirstName(scanner.nextLine());
		
			
			System.out.println("Enter LastName:  ");
			user.setLastName(scanner.nextLine());
			
			System.out.println("Enter Email:  ");
			user.setEmail(scanner.nextLine());
			
			// Add the row to the user table
			
			//Fetch the userid and store for use later
			
			
			//add the address for the user
			address = new Address();
			
			System.out.println("Enter Address1:  ");
			address.setAddress1(scanner.nextLine());
			
			System.out.println("Enter Address2:  ");
			address.setAddress2(scanner.nextLine());
			
			System.out.println("Enter City:  ");
			address.setCity(scanner.nextLine());
			
			System.out.println("Enter State:  ");
			address.setState(scanner.nextLine());
			
			System.out.println("Enter Postal Code:  ");
			address.setPostalCode(scanner.nextLine());
			
			
			//Add a phone for a user
			phone = new Phone();
			
			System.out.println("Phone Number:  ");
			phone.setPhoneNo(scanner.nextLine());
			
			System.out.println("Type:  ");
			phone.setType(scanner.nextLine());
			
			System.out.println("User: "+user.toString()+ "address: "+ address.toString() + "Phone: "+ phone.toString());
			
		}
		

		try{
			String sql = "Insert into [USER] "+
						 " (FirstName, LastName, Email, Active) " +
						 " Values (?,?,?,?)";
		
			ps = conn.prepareStatement(sql);
			ps.setString(1, user.getFirstName());
			ps.setString(2,user.getLastName());
			ps.setString(3, user.getEmail());
			ps.setInt(4, 1);
			
			boolean innerUser = ps.execute();
			
			//insert the user
			if(!innerUser){
				System.out.println("error no inner user");
			}
		}
		
		catch (Exception e)
		{
			System.out.println("e.toString()");
		}
		
		msqlConn.closeDbConnection(msqlConn.getConn());
		
		
		
		
// End of Program		
	}

}
