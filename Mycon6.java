import java.sql.*;
import java.util.*;

class Mycon6

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
//String strSql="insert into emp values(?,?)";
    String strSql="update emp set esal=? where ename=?";
    PreparedStatement pstm=con.prepareStatement(strSql);
    pstm.setString(2,strName);
    pstm.setString(1,strSal);
    pstm.executeUpdate();
    con.close();
    System.out.println("Record Inserted");
       }
     catch(Exception e)
     {
        System.out.println(e.toString());
     }
  }
}

