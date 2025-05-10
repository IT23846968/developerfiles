package site;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class userdao {
	
	//Connect DB
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;




//Insert data function
	public static boolean insertdata (String customerName , String email , String dob ,String age ,String gender ,String phoneNo ,String country , String currentPassword ) {
		
		boolean isSuccess = false;
		try {
			//DB Connection call
			con=DB_Connection.getConnection();
			stmt=con.createStatement();
			
			//SQL Query
			String sql = "insert into customerdetails ( customerName ,  email ,  dob , age , gender ,phoneNo,country ,currentPassword )  "+ "values('" + customerName + "','" + email + "','" + dob + "','" + age + "','" + gender +"','" + phoneNo +"','"+country+"','"+ currentPassword +"')";
			
			int rs = stmt.executeUpdate(sql);
			if(rs>0) {
				isSuccess = true ;
			}
			else {
				isSuccess = false;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isSuccess;
	
		
	}		
	
}