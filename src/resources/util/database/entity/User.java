package resources.util.database.entity;

import java.util.GregorianCalendar;

/**
 * Created by Liu Woon Kit on 12/6/2017.
 */
public class User {
    private String userID, password, name;
    private GregorianCalendar birthDate;
    private String email;
    private int handphoneNum;
    private char gender;

    public User() {
    }

    public User(String userID, String password, String name, GregorianCalendar birthDate, String email, int handphoneNum, char gender) {
        this.userID = userID;
        this.password = password;
        this.name = name;
        this.birthDate = birthDate;
        this.email = email;
        this.handphoneNum = handphoneNum;
        this.gender = gender;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GregorianCalendar getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(GregorianCalendar birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getHandphoneNum() {
        return handphoneNum;
    }

    public void setHandphoneNum(int handphoneNum) {
        this.handphoneNum = handphoneNum;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void suicide() {
        userID = null;
        password = null;
        name = null;
        birthDate = null;
        email = null;
        handphoneNum = 0;
        gender = '?';
    }
}
