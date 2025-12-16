package file;
import java.io.*;

public class fileread{

    public static void main(String[] args) throws Exception {
        String csvfilepath = "employees.csv";

        fileread outer = new fileread();
        CsvReaderService obj = outer.new CsvReaderService();
        obj.readCsvAndStore(csvfilepath);
    }

    public class CsvReaderService {

        public void readCsvAndStore(String filepath) throws Exception {
            BufferedReader br = new BufferedReader(new FileReader(filepath));
            String line;

            br.readLine(); // skip header

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                int id = Integer.parseInt(data[0]);
                String name = data[1];
                int salary = Integer.parseInt(data[2]);
                String role = data[3];

                System.out.println(id + " " + name + " " + salary + " " + role);
            }
            br.close();
        }
    }
}
