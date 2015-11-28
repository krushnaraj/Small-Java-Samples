import java.rmi.*;
public interface SampleInterface extends Remote
{
 public int add(int a,int b) throws RemoteException;
}