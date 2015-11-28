import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;
public class SampleClient
{
 public static void main(String args[])
 {

    try 
    {
      SampleInterface clientobj=(SampleInterface)Naming.lookup("SAMPLE_SERVER");
       int result=clientobj.add(20,30);

      System.out.println("Result="+result);
    }	
    catch(Exception e)	{}
  }

  
}