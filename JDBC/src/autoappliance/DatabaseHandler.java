package autoappliance;


	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.util.List;

	public class DatabaseHandler {

	    public static void saveEmployees(List<Employee> list) {

	        String sql =
	          "INSERT INTO detail (id, name, salary, branch) VALUES (?, ?, ?, ?)";

	        try {
	            
	            Connection con = DriverManager.getConnection(
	                "jdbc:mysql://localhost:3306/jdbcdemo",
	                "root",
	                "dinesh1234"
	            );

	            PreparedStatement ps = con.prepareStatement(sql);

	            for (Employee e : list) {

	                ps.setInt(1, e.id);
	                ps.setString(2, e.name);
	                ps.setInt(3, e.salary);
	                ps.setString(4, e.branch);

	                ps.executeUpdate();
	            }

	            ps.close();
	            con.close();

	            System.out.println("Data inserted successfully");

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}


