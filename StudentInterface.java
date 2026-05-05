package com.RMI_10;

import java.rmi.*;

public interface StudentInterface extends Remote {

String calculateGrade(Student s) throws RemoteException;

}
