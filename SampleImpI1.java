import java.rmi.*;
import java.rmi.server.*;

import java.util.*;

public class SampleImpI1 extends UnicastRemoteObject implements SampleInterface1
{
 public SampleImpI1() throws RemoteException
 {
  super();
 }

 public double root(int a)throws RemoteException
 {
  
  return (Math.sqrt(a));
 }
}