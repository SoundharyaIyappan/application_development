package Hello;

public class Employee {

	    private int id;
	    private String name;
	    private int salary;
	    private String branch;

	    public Employee(int id, String name, int salary, String branch) {
	        this.id = id;
	        this.name = name;
	        this.salary = salary;
	        this.branch = branch;
	    }

	    public int getId() {
	        return id;
	    }

	    public String getName() {
	        return name;
	    }

	    public int getSalary() {
	        return salary;
	    }

	    public String getBranch() {
	        return branch;
	    }
	}

