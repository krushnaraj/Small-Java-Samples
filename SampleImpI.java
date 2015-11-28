import java.rmi.*;
import java.rmi.server.*;

public class SampleImpI1 extends UnicastRemoteObject implements SampleInterface1
{
 public SampleImpI1() throws RemoteException
 {
  super();
 }

 public int sqrt(int a)throws RemoteException
 {
  return (Math.sqrt(a));
 }
}