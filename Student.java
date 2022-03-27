package MohammadAboHasan_201913064;

public class Student extends User{
    private int level;
    private String college, university;

    public Student(int ID, int age, int phone, String name, String gender, String address, String email, String password, int level, String college, String university) {
        super(ID, age, phone, name, gender, address, email, password);
        this.level = level;
        this.college = college;
        this.university = university;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public int getLevel() {
        return level;
    }

    public String getCollege() {
        return college;
    }

    public String getUniversity() {
        return university;
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
                + ", level= " + level 
                + ", college= " + college
                + ", university= " + university
                + "\n");
    }
    
}