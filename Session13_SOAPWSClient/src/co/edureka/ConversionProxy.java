package co.edureka;

public class ConversionProxy implements co.edureka.Conversion {
  private String _endpoint = null;
  private co.edureka.Conversion conversion = null;
  
  public ConversionProxy() {
    _initConversionProxy();
  }
  
  public ConversionProxy(String endpoint) {
    _endpoint = endpoint;
    _initConversionProxy();
  }
  
  private void _initConversionProxy() {
    try {
      conversion = (new co.edureka.ConversionServiceLocator()).getConversion();
      if (conversion != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)conversion)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)conversion)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (conversion != null)
      ((javax.xml.rpc.Stub)conversion)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public co.edureka.Conversion getConversion() {
    if (conversion == null)
      _initConversionProxy();
    return conversion;
  }
  
  public int feetToInches(int feets) throws java.rmi.RemoteException{
    if (conversion == null)
      _initConversionProxy();
    return conversion.feetToInches(feets);
  }
  
  public int mtrsToCms(int mtrs) throws java.rmi.RemoteException{
    if (conversion == null)
      _initConversionProxy();
    return conversion.mtrsToCms(mtrs);
  }
  
  public java.lang.String sayHello(java.lang.String name) throws java.rmi.RemoteException{
    if (conversion == null)
      _initConversionProxy();
    return conversion.sayHello(name);
  }
  
  public java.lang.String registerUser(java.lang.String email, java.lang.String password) throws java.rmi.RemoteException{
    if (conversion == null)
      _initConversionProxy();
    return conversion.registerUser(email, password);
  }
  
  public int dollarsToRupees(int dollars) throws java.rmi.RemoteException{
    if (conversion == null)
      _initConversionProxy();
    return conversion.dollarsToRupees(dollars);
  }
  
  
}