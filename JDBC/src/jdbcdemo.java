import java.sql.*;
public class jdbcdemo {
	public static void main(String args[]) throws Exception {
//		readRecords();
//		insertrecords();
//		insertvar();
//		insertusingpst();
//	delete();
		update();
	readRecords();
	
	}
public static void readRecords() throws Exception {
	String url="jdbc:mysql://localhost:3306/jdbcdemo";
    String user="root";
	String pass="dinesh1234";
	String query="select * from employee";
	Connection con=DriverManager.getConnection(url, user, pass);
	Statement st = con.createStatement();
	 ResultSet rs=st.executeQuery(query);
	while(rs.next()) {
	System.out.println("Id is "+ rs.getInt(1));
	System.out.println("Name is "+rs.getString(2));
	System.out.println("Salary is "+rs.getInt(3));
	System.out.println();
	}
	con.close();
}
public static void insertrecords() throws Exception{
	String url="jdbc:mysql://localhost:3306/jdbcdemo";
    String user="root";
	String pass="dinesh1234";
	String query="insert into employee values(5,'ram',8000)";
	Connection con=DriverManager.getConnection(url, user, pass);
	Statement st = con.createStatement();
	 int rows=st.executeUpdate(query);
	
	 
	 System.out.println("number of rows affected"+ rows);
	con.close();
}
public static void insertvar() throws Exception{
	String url="jdbc:mysql://localhost:3306/jdbcdemo";
    String user="root";
	String pass="dinesh1234";
	int id=6;
	String name="thamyan";
	int salary=80000;
	String query="insert into employee values(" + id+",'"+name+"',"+salary+");";
	System.out.println(query);
	Connection con=DriverManager.getConnection(url, user, pass);
	Statement st = con.createStatement();
	 int rows=st.executeUpdate(query);
	
	 
	 System.out.println("number of rows affected"+ rows);
	con.close();
}
public static void insertusingpst() throws Exception{
	String url="jdbc:mysql://localhost:3306/jdbcdemo";
    String user="root";
	String pass="dinesh1234";
	int id=7;
	String name="selvi";
	int salary=80900;
	String query="insert into employee values(?,?,?)";
	System.out.println(query);
	Connection con=DriverManager.getConnection(url, user, pass);
 PreparedStatement pst=con.prepareStatement(query);
	pst.setInt(1, id);
	pst.setString(2,name);
	pst.setInt(3, salary);
	int rows=pst.executeUpdate();
	 
	 System.out.println("number of rows affected"+ rows);
	con.close();
}
public static void delete() throws Exception{
	String url="jdbc:mysql://localhost:3306/jdbcdemo";
    String user="root";
	String pass="dinesh1234";
	int id=6;
	String query="delete from employee where emp_id= " +id;
	System.out.println(query);
	Connection con=DriverManager.getConnection(url, user, pass);
	Statement st = con.createStatement();
	 int rows=st.executeUpdate(query);
	
	 
	 System.out.println("number of rows affected"+ rows);
	con.close();
}
public static void update() throws Exception{
	String url="jdbc:mysql://localhost:3306/jdbcdemo";
    String user="root";
	String pass="dinesh1234";
	int id=1;
	String query="update employee set ename='loosu' where emp_id = " +id;
	System.out.println(query);
	Connection con=DriverManager.getConnection(url, user, pass);
	Statement st = con.createStatement();
	 int rows=st.executeUpdate(query);
	
	 
	 System.out.println("number of rows affected"+ rows);
	con.close();
}
}
