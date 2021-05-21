package tr.gov.nvi.tckimlik.WS;

public class KPSPublicLocator extends org.apache.axis.client.Service implements tr.gov.nvi.tckimlik.WS.KPSPublic {

    public KPSPublicLocator() {
    }


    public KPSPublicLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }
    private java.lang.String KPSPublicSoap_address = "https://tckimlik.nvi.gov.tr/Service/KPSPublic.asmx";

    public java.lang.String getKPSPublicSoapAddress() {
        return KPSPublicSoap_address;
    }

    private java.lang.String KPSPublicSoapWSDDServiceName = "KPSPublicSoap";

    public java.lang.String getKPSPublicSoapWSDDServiceName() {
        return KPSPublicSoapWSDDServiceName;
    }

    public void setKPSPublicSoapWSDDServiceName(java.lang.String name) {
        KPSPublicSoapWSDDServiceName = name;
    }

    public tr.gov.nvi.tckimlik.WS.KPSPublicSoap getKPSPublicSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(KPSPublicSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getKPSPublicSoap(endpoint);
    }

    public tr.gov.nvi.tckimlik.WS.KPSPublicSoap getKPSPublicSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            tr.gov.nvi.tckimlik.WS.KPSPublicSoapStub _stub = new tr.gov.nvi.tckimlik.WS.KPSPublicSoapStub(portAddress, this);
            _stub.setPortName(getKPSPublicSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setKPSPublicSoapEndpointAddress(java.lang.String address) {
        KPSPublicSoap_address = address;
    }

    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (tr.gov.nvi.tckimlik.WS.KPSPublicSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                tr.gov.nvi.tckimlik.WS.KPSPublicSoapStub _stub = new tr.gov.nvi.tckimlik.WS.KPSPublicSoapStub(new java.net.URL(KPSPublicSoap_address), this);
                _stub.setPortName(getKPSPublicSoapWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
        
        }
        return ports.iterator();
    }

    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("KPSPublicSoap".equals(portName)) {
            setKPSPublicSoapEndpointAddress(address);
        }
        else 
{ 
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }


}
