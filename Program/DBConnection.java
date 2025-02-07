
import java.sql.*;


class DBConnection{

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
		//String query="create table Student4 (sid int (11),st_name varchar (33)  );  ";//any query 
		//query for delete student3 table using drop cammand

		//String query="drop table student3";
		//String query="delete from student where rollno=6  ";
		//String query="update student set st_father_name='Sunil' where rollno = 2 ";
		
		
		String query =" alter  table student2  add(address varchar (23) ); ";
		//to execute query

		Statement obj = con.createStatement();
		obj.executeUpdate(query);  //execeuteQuery(query)    //  select

		//close connection
		con.close();
		//System.out.println("table is created successfully");
	//System.out.println("table is deleted successfully");
	//System.out.println("record is deleted successfully");
	//System.out.println("record is updated successfully");
	System.out.println(" new column is created successfully");
	}catch(Exception ex){
		System.out.println("Catch block execute");
	}

}

}