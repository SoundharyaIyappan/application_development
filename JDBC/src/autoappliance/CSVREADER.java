package autoappliance;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class CSVREADER {

    public static List<Employee> readCSV(String filePath) {

        List<Employee> list = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;
br.readLine();
            while ((line = br.readLine()) != null) {
            
                String[] data = line.split(",");

                int id = Integer.parseInt(data[0]);
                String name = data[1];
                int salary = Integer.parseInt(data[2]);
                String branch = data[3];

                list.add(new Employee(id, name, salary, branch));
            }
            br.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
}
