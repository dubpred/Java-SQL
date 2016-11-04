import java.security.Timestamp;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;

import com.ut.SqlDbConn;

import Model.Address;
import Model.Phone;
import Model.User;
import Model.Company;
import Model.Location;
import Model.Machine1;
import Model.Product;
import Model.Order_Dtl;
import Model.Order_Hdr;
import Model.Production_Dtl;
import Model.Production_Hdr;

public class homework3 {
	
	//scanner method for user
	public static User getUserInfo() {
		
		User u = new User();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter first name");
		u.setFirstName(scanner.nextLine());
		System.out.println("enter last name");
		u.setLastName(scanner.nextLine());
		System.out.println("enter email");
		u.setEmail(scanner.nextLine());
	
		return u;
	}
	
	//scanner for address
	public static Address getAddressInfo() {
		Address a = new Address();
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter address1");
		a.setAddress1(scanner.nextLine());
		System.out.println("enter address2");
		a.setAddress2(scanner.nextLine());
		System.out.println("enter city");
		a.setCity(scanner.nextLine());
		System.out.println("enter State");
		a.setState(scanner.nextLine());
		System.out.println("enter post code");
		a.setPostalCode(scanner.nextLine());
		return a;
	}
	
	//scanner for phone
	public static Phone getPhoneInfo() {

		Phone p = new Phone();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter phone number");
		p.setPhoneNo(scanner.nextLine());
		System.out.println("enter phone type");
		p.setType(scanner.nextLine());
		return p;
	}
	
	//Scanner for product
	public static Product getProductInfo() {

		Product p = new Product();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter product description");
		p.setProductDesc(scanner.nextLine());
		return p;
	}
	
	//Scanner for order header 
	public static Order_Hdr getOrderHdrInfo() {

		Order_Hdr p = new Order_Hdr();
			
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter order qty");
		int qty = scanner.nextInt();
		p.setOrderQty(qty);
		java.util.Date date = new java.util.Date();
		java.sql.Timestamp timestamp = new java.sql.Timestamp(date.getTime());
		p.setOrderDateTime(timestamp);
		
		System.out.println("enter delivery date year"); 
		int yy = scanner.nextInt();
		System.out.println("enter delivery date month");
		int mmm = scanner.nextInt();
		System.out.println("Type delivery date day : ");
		int dd = scanner.nextInt();
	  
	    Date data1 = new Date(yy,mmm,dd);
		p.setDeliveryDate(data1);
		return p;
		}
	
	//Scanner for location
	public static Location getLocationInfo() {
		Location a = new Location();
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter Description of location");
		a.setDescription(scanner.nextLine());
		System.out.println("enter Region");
		a.setRegion(scanner.nextLine());
		System.out.println("enter Longitude");
		a.setLongitude(Double.parseDouble(scanner.nextLine()));
		System.out.println("enter Latitude");
		a.setLatitude(Double.parseDouble(scanner.nextLine()));
		System.out.println("enter Country");
		a.setCountry(scanner.nextLine());
		return a;
	}
	
	//Scanner for company 
	public static Company getCompanyInfo() {

		Company c = new Company();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter company description");
		c.setDescription(scanner.nextLine());
		return c;
	}
	
	//scanner for machine 
	public static Machine1 getMachineInfo() {
		Machine1 a = new Machine1();
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter machine description");
		a.setDescription(scanner.nextLine());
		
		return a;
	}
	
	//Scanner for order detail 
	public static Order_Dtl getOrderDtlInfo() {

		Order_Dtl p = new Order_Dtl();
			
		Scanner scanner = new Scanner(System.in);
		p.setSalesCost(Integer.parseInt(scanner.nextLine()));
		return p;
		}
	
	//scanner for order header 
	public static Production_Hdr getProductionhdrInfo(){
		Production_Hdr d = new Production_Hdr();
		Scanner s = new Scanner (System.in);
		java.util.Date date = new java.util.Date();
		java.sql.Timestamp timestamp = new java.sql.Timestamp(date.getTime());
		d.setProductionDateTime(timestamp);
		return d;
	}
	
	//row display method 
	public static void displayRow(ResultSet rs, String tableName) {
		int rows = 0;

		System.out.println(rows + "displayed for" + tableName);
	}
	public static void main(String[] args) {
		
		//create the prepared statement
		PreparedStatement ps = null;
		//create result set 
		ResultSet rs = null;
		
		//establish database connection 
		SqlDbConn sqlDbConn = null;
		Connection conn = null;
		try {
			sqlDbConn = new SqlDbConn();
			sqlDbConn.setServerName("SQL4250");
			sqlDbConn.setDatabaseName("young.bryce");
			conn = sqlDbConn.createConnection();
			if (null == conn) {
				System.out.println("connection not found");
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		//loop for ten products, after this it shows the list that was added 
		for (int x = 1; x <= 10; x++) {

			try {
				//SQL to add users 
				User user = getUserInfo();
				String insertSqluser = "INSERT INTO [USER] (FirstName, LastName, Email, Active) VALUES (?,?,?,?)";
				ps = conn.prepareStatement(insertSqluser);
				ps.setString(1, user.getFirstName());
				ps.setString(2, user.getLastName());
				ps.setString(3, user.getEmail());
				ps.setInt(4, 1);
				int rows = ps.executeUpdate();
				if (rows != 1) {
					System.out.println("rows not added");
				}
				
				String sql2 = "SELECT TOP 1 UserId FROM [User] Order By UserId Desc";
				ps = conn.prepareStatement(sql2);
				rs = ps.executeQuery();
				while(rs.next()){
					user.setUserId(rs.getInt("UserId")); 
				}
				
				System.out.println("LastUserId Added: " + user.getUserId());
				
				//SQL to add address 
				Address address = getAddressInfo();
				address.setUserId(user.getUserId());
				String insertSqladdress = "INSERT INTO Address ( Address1, Address2, City, State, PostCode, UserId) VALUES (?, ?,?,?,?,?)";
				
				ps=conn.prepareStatement (insertSqladdress);
				ps.setString(1, address.getAddress1());
				ps.setString(2, address.getAddress2());
				ps.setString(3, address.getState());
				ps.setString(4, address.getCity());
				ps.setString(5, address.getPostalCode());
				ps.setInt(6, address.getUserId());
				rows = ps.executeUpdate();
				if(rows != 1){
					System.out.println("rows not added");
				}
				
				//SQL to add phone
				Phone phone = getPhoneInfo();
				phone.setUserId(user.getUserId());
				String insertSqlphone = "INSERT INTO Phone (UserId, PhoneNo,Type) VALUES (?,?,?)";
				ps=conn.prepareStatement (insertSqlphone);
				ps.setInt(1, phone.getUserId());
				ps.setString(2, phone.getPhoneNo());
				ps.setString(3, phone.getType());
				rows = ps.executeUpdate();
				if(rows != 1){
					System.out.println("rows not added");
				}
				
				//SQL to add products 
				Product product = getProductInfo();
				String insertSqlprod = "INSERT INTO Product (ProductDesc) VALUES (?)";
				ps=conn.prepareStatement (insertSqlprod);
				ps.setString(1, product.getProductDesc());
				rows = ps.executeUpdate();
				if(rows != 1){
					System.out.println("rows not added");
				}
				
				/*catches and creates strings that were set for the first name and last name above 	
				 *  the if statement detects if the first name is "olive oyl", "fat albert" or "ray rogers" 
				 *  unfortunately it also goes through if you have a combination of the three first names and 3 last names. 
				 *  this what i understood question one part b to be; as you are adding names if one of these three users are inputted and promps you five times to 
				 *  enter ORDER_HDR and ORDER_DTL. The if loop iterates the prompt five times 
				 */
				String firstname = user.getFirstName();
				String lastname = user.getLastName();		
				if ((firstname.equals("Olive") || firstname.equals("fat") || firstname.equals("roy")) && ((lastname.equals("Oyl") || lastname.equals("Albert")|| lastname.equals("Rogers"))))
					{
					for(int i=0;i>5;i++){	
						//OrderHDR SQL
						Order_Hdr hdr = getOrderHdrInfo();
						hdr.setUserId(user.getUserId());
						String insertSqlhdr = "INSERT INTO Order_Hdr (UserId,OrderDateTime,DeliveryDate,DeliveredBy,OrderQty) VALUES (?,?,?,?,?)";
						ps=conn.prepareStatement (insertSqlhdr);
						ps.setInt(1, hdr.getUserId());
						ps.setTimestamp(2, hdr.getOrderDateTime());
						ps.setDate(3, hdr.getDeliveryDate());
						ps.setString(4, hdr.getDeliveredBy());
						ps.setInt(5, hdr.getOrderQty());
						rows = ps.executeUpdate();
						if(rows != 1){
							System.out.println("rows not added");
						}
						//OrderDTL SQL
						Order_Dtl dtl =  getOrderDtlInfo();
						dtl.setOrderNo(hdr.getOrderNo());
						dtl.setProductId(product.getProductId());
						String insertSqldtl = "INSERT INTO Order_Dtl (OrderNo,ProductId,SalesCost) VALUES (?,?,?)";
						ps=conn.prepareStatement (insertSqldtl);
						ps.setInt(1, dtl.getOrderNo());
						ps.setInt(2,dtl.getProductId());
						ps.setLong(3, dtl.getSalesCost());
						rows = ps.executeUpdate();
						if(rows != 1){
							System.out.println("rows not added");
						}
					}
					}
					//this else statement is here to run the orderHDR and OrderDTl once if one of the three names is not input
				else{
					//OrderHDR SQL
					Order_Hdr hdr = getOrderHdrInfo();
					hdr.setUserId(user.getUserId());
					String insertSqlhdr = "INSERT INTO Order_Hdr (UserId,OrderDateTime,DeliveryDate,DeliveredBy,OrderQty) VALUES (?,?,?,?,?)";
					ps=conn.prepareStatement (insertSqlhdr);
					ps.setInt(1, hdr.getUserId());
					ps.setTimestamp(2, hdr.getOrderDateTime());
					ps.setDate(3, hdr.getDeliveryDate());
					ps.setString(4, hdr.getDeliveredBy());
					ps.setInt(5, hdr.getOrderQty());
					rows = ps.executeUpdate();
					if(rows != 1){
						System.out.println("rows not added");
					}
					//OrderDTL SQL
					Order_Dtl dtl =  getOrderDtlInfo();
					dtl.setOrderNo(hdr.getOrderNo());
					dtl.setProductId(product.getProductId());
					String insertSqldtl = "INSERT INTO Order_Dtl (OrderNo,ProductId,SalesCost) VALUES (?,?,?)";
					ps=conn.prepareStatement (insertSqldtl);
					ps.setInt(1, dtl.getOrderNo());
					ps.setInt(2,dtl.getProductId());
					ps.setLong(3, dtl.getSalesCost());
					rows = ps.executeUpdate();
					if(rows != 1){
						System.out.println("rows not added");
					}
				}
				
				
				//Location SQL
				Location loc = getLocationInfo();
				String insertSqlloc = "INSERT INTO Location (Description, Region, Longitude, Latitude, Country) VALUES (?,?,?,?,?)";
				ps=conn.prepareStatement (insertSqlloc);
				ps.setString(1, loc.getDescription());
				ps.setString(2, loc.getRegion());
				ps.setDouble(3, loc.getLongitude());
				ps.setDouble(4, loc.getLatitude());
				ps.setString(5, loc.getCountry());
				rows = ps.executeUpdate();
				if(rows != 1){
					System.out.println("rows not added");
				}
				//Company SQL
				Company company = getCompanyInfo();
				company.setLocationId(loc.getLocationId());
				String insertSqlcompany = "INSERT INTO Company (Description,LocationId) VALUES (?,?)";
				ps=conn.prepareStatement (insertSqlcompany);
				ps.setString(1, company.getDescription());
				ps.setInt(2, company.getLocationId());
				rows = ps.executeUpdate();
				if(rows != 1){
					System.out.println("rows not added");
				}
				
				//machine sql
				Machine1 machine =  getMachineInfo();
				machine.setCompanyId(company.getCompanyId());
				String insertSqlmachine = "INSERT INTO Machine (CompanyId,Description) VALUES (?,?)";
				ps=conn.prepareStatement (insertSqlmachine);
				ps.setInt(1, machine.getCompanyId());
				ps.setString(2,machine.getDescription());
				rows = ps.executeUpdate();
				if(rows != 1){
					System.out.println("rows not added");
				}
				//for loop runs Production HDR fives times everytime a product is entered. This was my idea of what you wanted for 1a
				for(int i=0;i>5;i++){
				//production hdr sql	
				Production_Hdr hdr1 =  new Production_Hdr();
				hdr1.setMachineId(machine.getMachineId());
				hdr1.setProductionId(product.getProductId());
				String insertSqlhdr1 = "INSERT INTO Production_Hdr (ProductionId,MachineId,ProductionDateTime) VALUES (?,?,?)";
				ps=conn.prepareStatement (insertSqlhdr1);
				ps.setInt(1, hdr1.getProductionId());
				ps.setInt(2,hdr1.getMachineId());
				ps.setTimestamp(2,hdr1.getProductionDateTime());
				rows = ps.executeUpdate();
				if(rows != 1){
					System.out.println("rows not added");
				}
				
				//production_dtl sql 
				Production_Dtl dtl1 =  new Production_Dtl();
				dtl1.setProductionId(hdr1.getProductionId());
				dtl1.setProduct(product.getProductId());
				String insertSqldtl1 = "INSERT INTO Production_Dtl (ProductionId,Product) VALUES (?,?)";
				ps=conn.prepareStatement (insertSqldtl1);
				ps.setInt(1, dtl1.getProductionId());
				ps.setInt(2,dtl1.getProduct());
				rows = ps.executeUpdate();
				if(rows != 1){
					System.out.println("rows not added");
				}
				
				}
				
				
				//midtermquestions i didnt know where to put, without a menu system i dont know where to put these queries, however i believe the queries to be correct
				
				String machineselect = "SELECT * from Machine1 left join Production_Hdr "
						+ " on Machine.MachineId = Production.MachineId where ProductionId is not null";
				ps=conn.prepareStatement(machineselect);
				String locationselect="SELECT Logitude,Latitude from Location left join Company   "
						+ " on Location.locationId=Company.locationId left join Machine on Company.companyId = Machine.companyId "
						+ "  left join Production_Hdr on Machine.machineId = Production_Hdr.machineId  "
						+ "  where ProductionId IS NOT NULL and CompanyId IS NOT NULL";
				ps=conn.prepareStatement(locationselect);
				String number2 = "Delete from [User] left join Order_Hdr on [User].userId = Order_Hdr.userId where OrderNo is NULL";
				ps=conn.prepareStatement(number2);
				String number3 = "UPDATE [User] set email = \"rrogers@bex.net\" where userid = (Select userid from [user] where First_Name = \"roy\" and Last_Name=\"Rogers\")" ;
				ps=conn.prepareStatement(number3);
				String number4 ="UPDATE [User] set active=\"0\" where userId=(Select userId from [User] where First_Name=\"Johnny\" and Last_Name=\"Quest\") ";
				ps=conn.prepareStatement(number4);
			
			} catch (Exception e) {
				System.out.println(e.toString());
			}
			
			
		
			
			
			
			
			List<String> list = new ArrayList<>();
			list.add("Address");
			list.add("Company");
			list.add("Location");
			list.add("Machine");
			list.add("Order_Dtl");
			list.add("Order_Hdr");
			list.add("Phone");
			list.add("Product");
			list.add("Production_Dtl");
			list.add("Production_Hdr");
			list.add("System_log");
			list.add("[User]");
			// Perform Select Statements
			for (String tableName : list) {
				String sql = "SELECT * FROM " + tableName;
				try {
					ps = conn.prepareStatement(sql);
					rs = ps.executeQuery();
					displayRow(rs, tableName);

				} catch (SQLException e) {
					System.out.println(e.toString());
				}

			}
			sqlDbConn.close(conn);	
			}
		}

		// D O N O T T Y P E B E L O W T H I S L I N E
	}
