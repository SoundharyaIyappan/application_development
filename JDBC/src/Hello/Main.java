package Hello;


	import java.util.List;

	public class Main {

	    public static void main(String[] args) {

	        // 1. Read employee data from SQL
	        List<Employee> employees =
	                EmployeeDBReader.readEmployees();

	        // 2. Write data into CSV file
	        EmployeeCSVWriter.writeToCSV(
	                employees,
	                "new.csv"
	        );

	        System.out.println("Process completed");
	    }
	}

