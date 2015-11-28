import java.sql.*;
import java.util.*;

class Mycon5

{
 public static void main(String args[])
 {
   try
   {  
    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");


    Connection con=DriverManager.getConnection("jdbc:odbc:DSN");
    Statement stm=con.createStatement();
    
    
    String strName=args[0];
    
    String strSal=args[1];
    String strSql="insert into emp values('"+strName+"',"+strSal+")";
    stm.executeUpdate(strSql);
    System.out.println("Record Inserted");
    con.close();
   }
     catch(Exception e)
     {
        System.out.println(e.toString());
     }
  }
}

