package resources.util.database;

import javafx.scene.control.Alert;
import resources.util.database.entity.User;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Liu Woon Kit on 12/1/2017.
 */
public class UserDA {
    // Hold user object indefinitely
    private static User user;

    private SqlRetrieveData sqlRetrieveData = new SqlRetrieveData();
    private ResultSet rs;

    public boolean checkLogin(String userID, String password) {
        sqlRetrieveData.openConnection();
        userID=userID.toUpperCase();
        String sqlQuery = "SELECT school, name, email, gender FROM user WHERE adminNo='"+userID+"' AND password='"+password+"' ";
        rs = sqlRetrieveData.retriveData(sqlQuery);
        try {
            if(rs.next()) {
                //user = new User(userID, rs.getString("school"), rs.getString("name"), rs.getString("email"), rs.getString("gender"));
                sqlRetrieveData.closeConnection();
                //System.out.println("Login unsuccessful");
                return true;
            }
        }
        catch (NullPointerException e) {
            Alert alert=new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText("Connection Error");
            alert.setContentText("Attempting reconnection");
            alert.show();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        sqlRetrieveData.closeConnection();
        //System.out.println("Login successful");
        return false;
    }

    
    public User getUser() {
        return user;
    }


    
    public void userLogout() {
        user.suicide();
    }
}
