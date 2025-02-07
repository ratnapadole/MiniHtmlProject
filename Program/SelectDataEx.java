import java.sql.*;


class SelectDataEx{
	public static void main(String args[]) throws Exception{
	try{
		// load  driver  for connect DB software
		System.out.println("1st execute");

		Class.forName("com.mysql.cj.jdbc.Driver");
		//
		System.out.println("Load Driver with ClassPath");

		String url="jdbc:mysql://localhost:3306/emp";      //localhost:portNo/databaseName
		String userName="root";
		String password="root";
		//System.out.println(System.getProperty("java.class.path"));
		//create connection with DB
		Connection con = DriverManager.getConnection(url,userName,password);

		System.out.println("DB connection successfully");

		//to create  query
		String query="select * from student where rollno=3 ";
		
		Statement obj = con.createStatement();
		
		
		//execute query
		ResultSet rs = obj.executeQuery(query);
			
		 while(rs.next()){
			//Display values
			System.out.println("roll no= "+rs.getInt("rollno"));
			System.out.println("student name= "+rs.getString("st_name"));
		}
	
	
		//close connection
		con.close();
		
	}catch(Exception ex){
		System.out.println("Catch block");

	}
	}

}