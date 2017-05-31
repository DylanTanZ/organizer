package resources.util.database
import java.lang.Exception
import java.sql.*;
/**
 * Created by hhf on 5/22/17.
 */
//this is database file
class DB(){
    val DRIVER: String="com.mysql.jdbc.Driver";
    val URL="jdbc:mysql://localhost:3306/organizer?useSSL=false";

    var conn: Connection?=null;
    var statement: Statement?=null;
    var rs: ResultSet?=null;

    val user_name="user";
    val passwd="passwd123";


    init {
        try{
            Class.forName(DRIVER);
        }catch (e: ClassNotFoundException){
            println("Driver not found ${e.message}");
        }

    }
    companion object database{
        fun openConnection(){

        }
    }



}