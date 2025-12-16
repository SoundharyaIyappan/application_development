package autoappliance;

		   import java.util.List;

		   public class Main {

		       public static void main(String[] args) {

		          
		           String filePath = "files/durka.csv";   

		     
		           List<Employee> employees = CSVREADER.readCSV(filePath);

		           
		           DatabaseHandler.saveEmployees(employees);

		           System.out.println("Process completed");
		       }
		   

	}


