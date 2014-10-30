/**
 * ISOAPService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package wenyu.learning.SOAP.Service.ContractFirst;

import javax.jws.WebService;

@WebService
public interface ISOAPService extends java.rmi.Remote {
    public void simpleExecute() throws java.rmi.RemoteException;
    public java.lang.String executeModel(wenyu.learning.SOAP.Service.ContractFirst.Model arg0) throws java.rmi.RemoteException;
}
