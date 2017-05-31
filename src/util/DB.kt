package util
import java.sql.*;
/**
 * Created by hhf on 5/22/17.
 */
//this is database file
class DB(){
    private val DRIVER: String="com.mysql.jdbc.Driver";
    private val URL="jdbc:mysql://localhost:3306/organizer?useSSL=false";

    var user_name="user";
    var passwd="passwd123";


    init {
        try{
            Class.forName(DRIVER);
        }catch (e: ClassNotFoundException){
            println("Driver not found ${e.message}");
        }
    }
    companion object database{

    }

    fun update(query:String){
        val conn:Connection?
        val statement:Statement?
        try {
            conn=DriverManager.getConnection(URL,user_name,passwd)
            statement=conn.createStatement();
            statement.executeUpdate(query)
            if(conn!=null) conn.close()
            if(statement!=null) statement.close();
        }catch (e: SQLException){ println(e.message)}
        /*finally {
            try {
                if(conn!=null) conn.close()
                if(statement!=null) statement.close();
            }catch(e: SQLException){ println(e.message)}

        }*/
    }
    fun updatePrepare():Connection?{
        return null
    }

    /*fun retrive(query:String){
        val conn:Connection?;
        val statement:Statement?;
        var rs: ResultSet?=null
        try {
            statement.=conn.createStatement()
            statement.executeUpdate(query)
        }catch (e: SQLException){ println(e.message)}


    }*/




}