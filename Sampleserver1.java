import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;
public class Sampleserver1
{
  public Sampleserver1()
  {
    try 
    {
      SampleInterface1 server=new SampleImpI1();
      Naming.rebind("SAMPLE_SERVER",server);
    }	
    catch(Exception e)	{}
  }

  public static void main(String args[])
 {
   new Sampleserver1();
 }
}