import java.rmi.*;
public interface SampleInterface1 extends Remote
{
 public double root(int a) throws RemoteException;
}