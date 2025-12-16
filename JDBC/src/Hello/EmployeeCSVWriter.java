package Hello;
	import java.io.FileWriter;
	import java.util.List;

	public class EmployeeCSVWriter {

	    public static void writeToCSV(
	            List<Employee> employees,
	            String fileName) {

	        try {
	            FileWriter fw = new FileWriter("files/new.csv");

	            // Header
	            fw.write("id,name,salary,branch\n");

	            for (Employee e : employees) {
	                fw.write(
	                    e.getId() + "," +
	                    e.getName() + "," +
	                    e.getSalary() + "," +
	                    e.getBranch() + "\n"
	                );
	            }

	            fw.close();
	            System.out.println("CSV file written successfully");

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}


