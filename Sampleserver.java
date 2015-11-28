import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;
public class Sampleserver
{
  public Sampleserver()
  {
    try 
    {
      SampleInterface server=new SampleImpI();
      Naming.rebind("SAMPLE_SERVER",server);
    }	
    catch(Exception e)	{}
  }

  public static void main(String args[])
 {
   new Sampleserver();
 }
}