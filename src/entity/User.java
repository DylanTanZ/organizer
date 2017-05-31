package entity;

//import database.SqlStoreData;

//import java.sql.Date;
import java.util.GregorianCalendar;

/**
 * Created by hehef on 12/16/2016.
 * Updated by Woon Kit on 311/5/2017
 */
public class User {
    private String adminNo, password, school, name, email;
    char gender;
    private GregorianCalendar dob;

    public User() {

    }

    public User(String adminNo, String password, String school, String name, String email, char gender, GregorianCalendar dob) {
        this.adminNo = adminNo;
        this.password = password;
        this.school = school;
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.dob = dob;
    }

    public String getAdminNo() {
        return adminNo;
    }

    public void setAdminNo(String adminNo) {
        this.adminNo = adminNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public GregorianCalendar getDob() {
        return dob;
    }

    public void setDob(GregorianCalendar dob) {
        this.dob = dob;
    }

    // Waiting for updated database
    /*public void storeData(){
        SqlStoreData update=new SqlStoreData();
        update.openConnection();

        update.insertData("user","\""+name+"\",\""+gender+"\",\""+birthDate.toString()+"\",\""+adminNo+"\",\""+email+"\",\""+password+"\",\""+school+"\" ");
        update.closeConnection();

    }*/
}
