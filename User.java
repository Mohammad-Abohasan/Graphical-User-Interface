package MohammadAboHasan_201913064;

import java.util.HashMap;

public abstract class User {
    private int ID, age, phone;
    private String name, gender, address, email, password;
    private static HashMap<Integer, Integer> map = new HashMap<>();

    public User(int ID, int age, int phone, String name, String gender, String address, String email, String password) {
        if(!map.containsKey(ID))
            map.put(ID, 0);
        else
            for (int i = ID+1; true; i++) 
                if(!map.containsKey(i)){
                    ID = i;
                    map.put(ID, 0);
                    break;
                }
        this.ID = ID;
        this.age = age;
        this.phone = phone;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.email = email;
        this.password = password;
    }

    
    public void setID(int ID) {
        this.ID = ID;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getID() {
        return ID;
    }

    public int getAge() {
        return age;
    }

    public int getPhone() {
        return phone;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "User{" + "ID= " + ID + ", age= " + age + ", phone= " + phone + ", name= " + name + ", gender= " + gender + ", address= " + address + ", email= " + email + ", password= " + password + '}';
    }

    public abstract String printInfo();
}
