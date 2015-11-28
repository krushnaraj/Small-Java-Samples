import java.sql.*;

class Mymetadata

{
 public static void main(String args[])
 {
   try
   {  
    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

    Connection con=DriverManager.getConnection("jdbc:odbc:DSN");

    Statement stm=con.createStatement();
   // String str="create table emp(ename text,esal number)";
    //String str="insert into emp values('akshay pardeshi',5000)";
  // String str1="insert into emp values('krushnaraj kamtekar',5000)";
   // stm.executeUpdate(str);
// stm.executeUpdate(str1);
   // System.out.println("Table created");
// System.out.println("record inserted");
  String str="select * from emp";

 ResultSet rs=stm.executeQuery(str);
  ResultSetMetaData data=rs.getMetaData();

 System.out.println("Table name="+data.getTableName(1));
  for(int i=1;i<=data.getColumnCount();i++)
  {
   System.out.println("Column Name=" + data.getColumnName(i));
  }
 
    con.close();
   }

   catch(Exception e)
   {
    System.out.println(e.toString());
   }
  
  }
}