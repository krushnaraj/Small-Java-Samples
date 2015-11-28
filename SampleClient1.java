import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;
public class SampleClient1
{
 public static void main(String args[])
 {

    try 
    {
      SampleInterface1 clientobj=(SampleInterface1)Naming.lookup("SAMPLE_SERVER");
       int result=clientobj.sqrt(25);

       System.out.println("Result="+result);
    }	
    catch(Exception e)	{}
  }

  
}