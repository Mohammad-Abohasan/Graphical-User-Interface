package MohammadAboHasan_201913064;

public class Employee extends User{
    private String job, company;
    private double salary;

    public Employee(int ID, int age, int phone, String name, String gender, String address, String email, String password, String job, String company, double salary) {
        super(ID, age, phone, name, gender, address, email, password);
        this.job = job;
        this.company = company;
        this.salary = salary;
    }

    

    public void setJob(String job) {
        this.job = job;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getJob() {
        return job;
    }

    public String getCompany() {
        return company;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return printInfo();
    }
    
    @Override
    public String printInfo() {
        return("ID = " + this.getID()
                + ", age= " + this.getAge() 
                + ", phone= " + this.getPhone()
                + ", name= " + this.getName() 
                + ", gender= " + this.getGender()
                + ", address= " + this.getAddress()
                + ", email= " + this.getEmail()
                + ", password= " + this.getPassword()
                + ", job=" + job
                + ", company= " + company
                + ", salary= " + salary
                + "\n");
    }
    
}