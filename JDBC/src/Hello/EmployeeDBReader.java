package Hello;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.Statement;
	import java.util.ArrayList;
	import java.util.List;

	public class EmployeeDBReader {

	    public static List<Employee> readEmployees() {

	        List<Employee> list = new ArrayList<>();

	        try {
	            Connection con = DriverManager.getConnection(
	                "jdbc:mysql://localhost:3306/jdbcdemo",
	                "root",
	                "dinesh1234"
	            );

	            Statement st = con.createStatement();
	            ResultSet rs = st.executeQuery(
	                "SELECT id, name, salary, branch FROM data"
	            );

	            while (rs.next()) {

	                Employee e = new Employee(
	                    rs.getInt("id"),
	                    rs.getString("name"),
	                    rs.getInt("salary"),
	                    rs.getString("branch")
	                );

	                list.add(e);
	            }

	            rs.close();
	            st.close();
	            con.close();

	        } catch (Exception e) {
	            e.printStackTrace();
	        }

	        return list;
	    }
	}


