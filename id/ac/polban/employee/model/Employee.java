package id.ac.polban.employee.model;

public class Employee { 
    private static int count = 0; //penggunaan static field 
    private int id; 
    private String name;
    private Department department; 
    private EmploymentType type; 
    private double salary;

    public Employee(String name, Department department, EmploymentType type, double salary) {
    this.id = generateId(); 
    this.name = name;
    this.department = department; 
    this.type = type;
    this.salary = salary;
    }

    //penggunaan static method
    private static int generateId(){
        return ++count;
    }
    public static int getTotalEmployee(){
        return count;
    }
    
    public int getId() { 
        return id;
    }
    public void setId(int id) { 
        this.id = id;
    }
    public String getName() { 
        return name;
    }
    public void setName(String name) { 
        this.name = name;
    }
    public Department getDepartment() { 
        return department;
    }
    public void setDepartment(Department department) { 
        this.department = department;
    }
    public EmploymentType getType() { 
        return type;
    }
    public void setType(EmploymentType type) { 
        this.type = type;
    }
    public double getSalary() { 
        return salary;
    }
    public void setSalary(double salary) { 
        this.salary = salary;
    }
    }
    
