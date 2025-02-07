

import java.sql.*;

class InsertDataEx{

	public static void main(String args[]){
		
		try{
		// load  driver  for connect DB software
		System.out.println("1st execute");

		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Load Driver with ClassPath");

		String url="jdbc:mysql://localhost:3306/emp";      //localhost:portNo/databaseName
		String userName="root";
		String password="root";
		//System.out.println(System.getProperty("java.class.path"));
		//create connection with DB
		Connection con = DriverManager.getConnection(url,userName,password);
		System.out.println("DB connection successfully");
		//create query
		 
		// String query="insert into student values(?,?,?,?)";
		 String query="insert into student (rollno) values(?)";
		
		PreparedStatement obj = con.prepareStatement(query);  
		
		obj.setInt(1,8);//1 specifies the first parameter in the query  
		//obj.setString(2,"Suresh");  
		//obj.setString(3,"Mumbai");  
		//obj.setString(4,"anis"); 
		
		//execute query
		obj.executeUpdate();
		
		System.out.println("data is inserted successfully");
		//close connection
		con.close();
	}catch(Exception ex){
		System.out.println("Catch block");

	}
	}
}