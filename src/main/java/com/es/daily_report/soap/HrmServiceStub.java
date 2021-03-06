/**
 * HrmServiceStub.java
 *
 * <p>This file was auto-generated from WSDL by the Apache Axis2 version: 1.8.0 Built on : Aug 01,
 * 2021 (07:27:19 HST)
 */
package com.es.daily_report.soap;

/*
 *  HrmServiceStub java implementation
 */

public class HrmServiceStub extends org.apache.axis2.client.Stub {
  protected org.apache.axis2.description.AxisOperation[] _operations;

  // hashmaps to keep the fault mapping
  private java.util.Map<org.apache.axis2.client.FaultMapKey, String> faultExceptionNameMap =
      new java.util.HashMap<org.apache.axis2.client.FaultMapKey, String>();
  private java.util.Map<org.apache.axis2.client.FaultMapKey, String> faultExceptionClassNameMap =
      new java.util.HashMap<org.apache.axis2.client.FaultMapKey, String>();
  private java.util.Map<org.apache.axis2.client.FaultMapKey, String> faultMessageMap =
      new java.util.HashMap<org.apache.axis2.client.FaultMapKey, String>();

  private static int counter = 0;

  private static synchronized String getUniqueSuffix() {
    // reset the counter if it is greater than 99999
    if (counter > 99999) {
      counter = 0;
    }
    counter = counter + 1;
    return Long.toString(System.currentTimeMillis()) + "_" + counter;
  }

  private void populateAxisService() throws org.apache.axis2.AxisFault {

    // creating the Service with a unique name
    _service = new org.apache.axis2.description.AxisService("HrmService" + getUniqueSuffix());
    addAnonymousOperations();

    // creating the operations
    org.apache.axis2.description.AxisOperation __operation;

    _operations = new org.apache.axis2.description.AxisOperation[14];

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("http://localhost/services/HrmService", "synHrmResource"));
    _service.addOperation(__operation);

    _operations[0] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("http://localhost/services/HrmService", "checkUser"));
    _service.addOperation(__operation);

    _operations[1] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName(
            "http://localhost/services/HrmService", "getHrmDepartmentInfo"));
    _service.addOperation(__operation);

    _operations[2] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName(
            "http://localhost/services/HrmService", "getHrmSubcompanyInfoXML"));
    _service.addOperation(__operation);

    _operations[3] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("http://localhost/services/HrmService", "getHrmUserInfoXML"));
    _service.addOperation(__operation);

    _operations[4] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("http://localhost/services/HrmService", "synJobtitle"));
    _service.addOperation(__operation);

    _operations[5] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName(
            "http://localhost/services/HrmService", "getHrmDepartmentInfoXML"));
    _service.addOperation(__operation);

    _operations[6] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName(
            "http://localhost/services/HrmService", "changeUserPassword"));
    _service.addOperation(__operation);

    _operations[7] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName(
            "http://localhost/services/HrmService", "getHrmJobTitleInfoXML"));
    _service.addOperation(__operation);

    _operations[8] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("http://localhost/services/HrmService", "synSubCompany"));
    _service.addOperation(__operation);

    _operations[9] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName(
            "http://localhost/services/HrmService", "getHrmJobTitleInfo"));
    _service.addOperation(__operation);

    _operations[10] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName(
            "http://localhost/services/HrmService", "getHrmSubcompanyInfo"));
    _service.addOperation(__operation);

    _operations[11] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("http://localhost/services/HrmService", "getHrmUserInfo"));
    _service.addOperation(__operation);

    _operations[12] = __operation;

    __operation = new org.apache.axis2.description.OutInAxisOperation();

    __operation.setName(
        new javax.xml.namespace.QName("http://localhost/services/HrmService", "synDepartment"));
    _service.addOperation(__operation);

    _operations[13] = __operation;
  }

  // populates the faults
  private void populateFaults() {}

  /** Constructor that takes in a configContext */
  public HrmServiceStub(
      org.apache.axis2.context.ConfigurationContext configurationContext,
      String targetEndpoint)
      throws org.apache.axis2.AxisFault {
    this(configurationContext, targetEndpoint, false);
  }

  /** Constructor that takes in a configContext and useseperate listner */
  public HrmServiceStub(
      org.apache.axis2.context.ConfigurationContext configurationContext,
      String targetEndpoint,
      boolean useSeparateListener)
      throws org.apache.axis2.AxisFault {
    // To populate AxisService
    populateAxisService();
    populateFaults();

    _serviceClient = new org.apache.axis2.client.ServiceClient(configurationContext, _service);

    _serviceClient
        .getOptions()
        .setTo(new org.apache.axis2.addressing.EndpointReference(targetEndpoint));
    _serviceClient.getOptions().setUseSeparateListener(useSeparateListener);
  }

  /** Default Constructor */
  public HrmServiceStub(org.apache.axis2.context.ConfigurationContext configurationContext)
      throws org.apache.axis2.AxisFault {

    this(configurationContext, "http://192.168.0.4//services/HrmService");
  }

  /** Default Constructor */
  public HrmServiceStub() throws org.apache.axis2.AxisFault {

    this("http://192.168.0.4//services/HrmService");
  }

  /** Constructor taking the target endpoint */
  public HrmServiceStub(String targetEndpoint) throws org.apache.axis2.AxisFault {
    this(null, targetEndpoint);
  }

  /**
   * Auto generated method signature
   *
   * @see com.es.daily_report.soap.HrmService#synHrmResource
   * @param synHrmResource
   */
  public SynHrmResourceResponse synHrmResource(
      SynHrmResource synHrmResource)
      throws java.rmi.RemoteException {

    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[0].getName());
      _operationClient
          .getOptions()
          .setAction("urn:weaver.hrm.webservice.HrmService.SynHrmResource");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              synHrmResource,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "http://localhost/services/HrmService", "synHrmResource")),
              new javax.xml.namespace.QName(
                  "http://localhost/services/HrmService", "SynHrmResource"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              SynHrmResourceResponse.class);
      org.apache.axis2.transport.TransportUtils.detachInputStream(_returnMessageContext);

      return (SynHrmResourceResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "SynHrmResource"))) {
          // make the fault by reflection
          try {
            String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "SynHrmResource"));
            Class exceptionClass = Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(String.class);
            Exception ex = (Exception) constructor.newInstance(f.getMessage());
            // message class
            String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "SynHrmResource"));
            Class messageClass = Class.forName(messageClassName);
            Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new Class[] {messageClass});
            m.invoke(ex, new Object[] {messageObject});

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature
   *
   * @see com.es.daily_report.soap.HrmService#checkUser
   * @param checkUser
   */
  public CheckUserResponse checkUser(
      CheckUser checkUser) throws java.rmi.RemoteException {

    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[1].getName());
      _operationClient.getOptions().setAction("urn:weaver.hrm.webservice.HrmService.checkUser");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              checkUser,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "http://localhost/services/HrmService", "checkUser")),
              new javax.xml.namespace.QName("http://localhost/services/HrmService", "checkUser"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              CheckUserResponse.class);
      org.apache.axis2.transport.TransportUtils.detachInputStream(_returnMessageContext);

      return (CheckUserResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "checkUser"))) {
          // make the fault by reflection
          try {
            String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "checkUser"));
            Class exceptionClass = Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(String.class);
            Exception ex = (Exception) constructor.newInstance(f.getMessage());
            // message class
            String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "checkUser"));
            Class messageClass = Class.forName(messageClassName);
            Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new Class[] {messageClass});
            m.invoke(ex, new Object[] {messageObject});

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature
   *
   * @see com.es.daily_report.soap.HrmService#getHrmDepartmentInfo
   * @param getHrmDepartmentInfo
   */
  public GetHrmDepartmentInfoResponse getHrmDepartmentInfo(
      GetHrmDepartmentInfo getHrmDepartmentInfo)
      throws java.rmi.RemoteException {

    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[2].getName());
      _operationClient
          .getOptions()
          .setAction("urn:weaver.hrm.webservice.HrmService.getHrmDepartmentInfo");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              getHrmDepartmentInfo,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "http://localhost/services/HrmService", "getHrmDepartmentInfo")),
              new javax.xml.namespace.QName(
                  "http://localhost/services/HrmService", "getHrmDepartmentInfo"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              GetHrmDepartmentInfoResponse.class);
      org.apache.axis2.transport.TransportUtils.detachInputStream(_returnMessageContext);

      return (GetHrmDepartmentInfoResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getHrmDepartmentInfo"))) {
          // make the fault by reflection
          try {
            String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "getHrmDepartmentInfo"));
            Class exceptionClass = Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(String.class);
            Exception ex = (Exception) constructor.newInstance(f.getMessage());
            // message class
            String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "getHrmDepartmentInfo"));
            Class messageClass = Class.forName(messageClassName);
            Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new Class[] {messageClass});
            m.invoke(ex, new Object[] {messageObject});

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature
   *
   * @see com.es.daily_report.soap.HrmService#getHrmSubcompanyInfoXML
   * @param getHrmSubcompanyInfoXML
   */
  public GetHrmSubcompanyInfoXMLResponse
      getHrmSubcompanyInfoXML(
          GetHrmSubcompanyInfoXML getHrmSubcompanyInfoXML)
          throws java.rmi.RemoteException {

    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[3].getName());
      _operationClient
          .getOptions()
          .setAction("urn:weaver.hrm.webservice.HrmService.getHrmSubcompanyInfoXML");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              getHrmSubcompanyInfoXML,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "http://localhost/services/HrmService", "getHrmSubcompanyInfoXML")),
              new javax.xml.namespace.QName(
                  "http://localhost/services/HrmService", "getHrmSubcompanyInfoXML"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              GetHrmSubcompanyInfoXMLResponse.class);
      org.apache.axis2.transport.TransportUtils.detachInputStream(_returnMessageContext);

      return (GetHrmSubcompanyInfoXMLResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(
                faultElt.getQName(), "getHrmSubcompanyInfoXML"))) {
          // make the fault by reflection
          try {
            String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "getHrmSubcompanyInfoXML"));
            Class exceptionClass = Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(String.class);
            Exception ex = (Exception) constructor.newInstance(f.getMessage());
            // message class
            String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "getHrmSubcompanyInfoXML"));
            Class messageClass = Class.forName(messageClassName);
            Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new Class[] {messageClass});
            m.invoke(ex, new Object[] {messageObject});

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature
   *
   * @see com.es.daily_report.soap.HrmService#getHrmUserInfoXML
   * @param getHrmUserInfoXML
   */
  public GetHrmUserInfoXMLResponse getHrmUserInfoXML(
      GetHrmUserInfoXML getHrmUserInfoXML)
      throws java.rmi.RemoteException {

    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[4].getName());
      _operationClient
          .getOptions()
          .setAction("urn:weaver.hrm.webservice.HrmService.getHrmUserInfoXML");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              getHrmUserInfoXML,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "http://localhost/services/HrmService", "getHrmUserInfoXML")),
              new javax.xml.namespace.QName(
                  "http://localhost/services/HrmService", "getHrmUserInfoXML"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              GetHrmUserInfoXMLResponse.class);
      org.apache.axis2.transport.TransportUtils.detachInputStream(_returnMessageContext);

      return (GetHrmUserInfoXMLResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getHrmUserInfoXML"))) {
          // make the fault by reflection
          try {
            String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "getHrmUserInfoXML"));
            Class exceptionClass = Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(String.class);
            Exception ex = (Exception) constructor.newInstance(f.getMessage());
            // message class
            String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "getHrmUserInfoXML"));
            Class messageClass = Class.forName(messageClassName);
            Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new Class[] {messageClass});
            m.invoke(ex, new Object[] {messageObject});

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature
   *
   * @see com.es.daily_report.soap.HrmService#synJobtitle
   * @param synJobtitle
   */
  public SynJobtitleResponse synJobtitle(
      SynJobtitle synJobtitle)
      throws java.rmi.RemoteException {

    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[5].getName());
      _operationClient.getOptions().setAction("urn:weaver.hrm.webservice.HrmService.SynJobtitle");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              synJobtitle,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "http://localhost/services/HrmService", "synJobtitle")),
              new javax.xml.namespace.QName("http://localhost/services/HrmService", "SynJobtitle"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              SynJobtitleResponse.class);
      org.apache.axis2.transport.TransportUtils.detachInputStream(_returnMessageContext);

      return (SynJobtitleResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "SynJobtitle"))) {
          // make the fault by reflection
          try {
            String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "SynJobtitle"));
            Class exceptionClass = Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(String.class);
            Exception ex = (Exception) constructor.newInstance(f.getMessage());
            // message class
            String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "SynJobtitle"));
            Class messageClass = Class.forName(messageClassName);
            Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new Class[] {messageClass});
            m.invoke(ex, new Object[] {messageObject});

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature
   *
   * @see com.es.daily_report.soap.HrmService#getHrmDepartmentInfoXML
   * @param getHrmDepartmentInfoXML
   */
  public GetHrmDepartmentInfoXMLResponse
      getHrmDepartmentInfoXML(
          GetHrmDepartmentInfoXML getHrmDepartmentInfoXML)
          throws java.rmi.RemoteException {

    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[6].getName());
      _operationClient
          .getOptions()
          .setAction("urn:weaver.hrm.webservice.HrmService.getHrmDepartmentInfoXML");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              getHrmDepartmentInfoXML,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "http://localhost/services/HrmService", "getHrmDepartmentInfoXML")),
              new javax.xml.namespace.QName(
                  "http://localhost/services/HrmService", "getHrmDepartmentInfoXML"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              GetHrmDepartmentInfoXMLResponse.class);
      org.apache.axis2.transport.TransportUtils.detachInputStream(_returnMessageContext);

      return (GetHrmDepartmentInfoXMLResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(
                faultElt.getQName(), "getHrmDepartmentInfoXML"))) {
          // make the fault by reflection
          try {
            String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "getHrmDepartmentInfoXML"));
            Class exceptionClass = Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(String.class);
            Exception ex = (Exception) constructor.newInstance(f.getMessage());
            // message class
            String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "getHrmDepartmentInfoXML"));
            Class messageClass = Class.forName(messageClassName);
            Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new Class[] {messageClass});
            m.invoke(ex, new Object[] {messageObject});

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature
   *
   * @see com.es.daily_report.soap.HrmService#changeUserPassword
   * @param changeUserPassword
   */
  public ChangeUserPasswordResponse changeUserPassword(
      ChangeUserPassword changeUserPassword)
      throws java.rmi.RemoteException {

    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[7].getName());
      _operationClient
          .getOptions()
          .setAction("urn:weaver.hrm.webservice.HrmService.changeUserPassword");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              changeUserPassword,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "http://localhost/services/HrmService", "changeUserPassword")),
              new javax.xml.namespace.QName(
                  "http://localhost/services/HrmService", "changeUserPassword"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              ChangeUserPasswordResponse.class);
      org.apache.axis2.transport.TransportUtils.detachInputStream(_returnMessageContext);

      return (ChangeUserPasswordResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "changeUserPassword"))) {
          // make the fault by reflection
          try {
            String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "changeUserPassword"));
            Class exceptionClass = Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(String.class);
            Exception ex = (Exception) constructor.newInstance(f.getMessage());
            // message class
            String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "changeUserPassword"));
            Class messageClass = Class.forName(messageClassName);
            Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new Class[] {messageClass});
            m.invoke(ex, new Object[] {messageObject});

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature
   *
   * @see com.es.daily_report.soap.HrmService#getHrmJobTitleInfoXML
   * @param getHrmJobTitleInfoXML
   */
  public GetHrmJobTitleInfoXMLResponse
      getHrmJobTitleInfoXML(
          GetHrmJobTitleInfoXML getHrmJobTitleInfoXML)
          throws java.rmi.RemoteException {

    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[8].getName());
      _operationClient
          .getOptions()
          .setAction("urn:weaver.hrm.webservice.HrmService.getHrmJobTitleInfoXML");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              getHrmJobTitleInfoXML,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "http://localhost/services/HrmService", "getHrmJobTitleInfoXML")),
              new javax.xml.namespace.QName(
                  "http://localhost/services/HrmService", "getHrmJobTitleInfoXML"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              GetHrmJobTitleInfoXMLResponse.class);
      org.apache.axis2.transport.TransportUtils.detachInputStream(_returnMessageContext);

      return (GetHrmJobTitleInfoXMLResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(
                faultElt.getQName(), "getHrmJobTitleInfoXML"))) {
          // make the fault by reflection
          try {
            String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "getHrmJobTitleInfoXML"));
            Class exceptionClass = Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(String.class);
            Exception ex = (Exception) constructor.newInstance(f.getMessage());
            // message class
            String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "getHrmJobTitleInfoXML"));
            Class messageClass = Class.forName(messageClassName);
            Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new Class[] {messageClass});
            m.invoke(ex, new Object[] {messageObject});

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature
   *
   * @see com.es.daily_report.soap.HrmService#synSubCompany
   * @param synSubCompany
   */
  public SynSubCompanyResponse synSubCompany(
      SynSubCompany synSubCompany)
      throws java.rmi.RemoteException {

    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[9].getName());
      _operationClient.getOptions().setAction("urn:weaver.hrm.webservice.HrmService.SynSubCompany");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              synSubCompany,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "http://localhost/services/HrmService", "synSubCompany")),
              new javax.xml.namespace.QName(
                  "http://localhost/services/HrmService", "SynSubCompany"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              SynSubCompanyResponse.class);
      org.apache.axis2.transport.TransportUtils.detachInputStream(_returnMessageContext);

      return (SynSubCompanyResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "SynSubCompany"))) {
          // make the fault by reflection
          try {
            String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "SynSubCompany"));
            Class exceptionClass = Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(String.class);
            Exception ex = (Exception) constructor.newInstance(f.getMessage());
            // message class
            String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "SynSubCompany"));
            Class messageClass = Class.forName(messageClassName);
            Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new Class[] {messageClass});
            m.invoke(ex, new Object[] {messageObject});

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature
   *
   * @see com.es.daily_report.soap.HrmService#getHrmJobTitleInfo
   * @param getHrmJobTitleInfo
   */
  public GetHrmJobTitleInfoResponse getHrmJobTitleInfo(
      GetHrmJobTitleInfo getHrmJobTitleInfo)
      throws java.rmi.RemoteException {

    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[10].getName());
      _operationClient
          .getOptions()
          .setAction("urn:weaver.hrm.webservice.HrmService.getHrmJobTitleInfo");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              getHrmJobTitleInfo,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "http://localhost/services/HrmService", "getHrmJobTitleInfo")),
              new javax.xml.namespace.QName(
                  "http://localhost/services/HrmService", "getHrmJobTitleInfo"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              GetHrmJobTitleInfoResponse.class);
      org.apache.axis2.transport.TransportUtils.detachInputStream(_returnMessageContext);

      return (GetHrmJobTitleInfoResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getHrmJobTitleInfo"))) {
          // make the fault by reflection
          try {
            String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "getHrmJobTitleInfo"));
            Class exceptionClass = Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(String.class);
            Exception ex = (Exception) constructor.newInstance(f.getMessage());
            // message class
            String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "getHrmJobTitleInfo"));
            Class messageClass = Class.forName(messageClassName);
            Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new Class[] {messageClass});
            m.invoke(ex, new Object[] {messageObject});

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature
   *
   * @see com.es.daily_report.soap.HrmService#getHrmSubcompanyInfo
   * @param getHrmSubcompanyInfo
   */
  public GetHrmSubcompanyInfoResponse getHrmSubcompanyInfo(
      GetHrmSubcompanyInfo getHrmSubcompanyInfo)
      throws java.rmi.RemoteException {

    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[11].getName());
      _operationClient
          .getOptions()
          .setAction("urn:weaver.hrm.webservice.HrmService.getHrmSubcompanyInfo");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              getHrmSubcompanyInfo,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "http://localhost/services/HrmService", "getHrmSubcompanyInfo")),
              new javax.xml.namespace.QName(
                  "http://localhost/services/HrmService", "getHrmSubcompanyInfo"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              GetHrmSubcompanyInfoResponse.class);
      org.apache.axis2.transport.TransportUtils.detachInputStream(_returnMessageContext);

      return (GetHrmSubcompanyInfoResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getHrmSubcompanyInfo"))) {
          // make the fault by reflection
          try {
            String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "getHrmSubcompanyInfo"));
            Class exceptionClass = Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(String.class);
            Exception ex = (Exception) constructor.newInstance(f.getMessage());
            // message class
            String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(
                        faultElt.getQName(), "getHrmSubcompanyInfo"));
            Class messageClass = Class.forName(messageClassName);
            Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new Class[] {messageClass});
            m.invoke(ex, new Object[] {messageObject});

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature
   *
   * @see com.es.daily_report.soap.HrmService#getHrmUserInfo
   * @param getHrmUserInfo
   */
  public GetHrmUserInfoResponse getHrmUserInfo(
      GetHrmUserInfo getHrmUserInfo)
      throws java.rmi.RemoteException {

    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[12].getName());
      _operationClient
          .getOptions()
          .setAction("urn:weaver.hrm.webservice.HrmService.getHrmUserInfo");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              getHrmUserInfo,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "http://localhost/services/HrmService", "getHrmUserInfo")),
              new javax.xml.namespace.QName(
                  "http://localhost/services/HrmService", "getHrmUserInfo"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              GetHrmUserInfoResponse.class);
      org.apache.axis2.transport.TransportUtils.detachInputStream(_returnMessageContext);

      return (GetHrmUserInfoResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getHrmUserInfo"))) {
          // make the fault by reflection
          try {
            String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getHrmUserInfo"));
            Class exceptionClass = Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(String.class);
            Exception ex = (Exception) constructor.newInstance(f.getMessage());
            // message class
            String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "getHrmUserInfo"));
            Class messageClass = Class.forName(messageClassName);
            Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new Class[] {messageClass});
            m.invoke(ex, new Object[] {messageObject});

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  /**
   * Auto generated method signature
   *
   * @see com.es.daily_report.soap.HrmService#synDepartment
   * @param synDepartment
   */
  public SynDepartmentResponse synDepartment(
      SynDepartment synDepartment)
      throws java.rmi.RemoteException {

    org.apache.axis2.context.MessageContext _messageContext =
        new org.apache.axis2.context.MessageContext();
    try {
      org.apache.axis2.client.OperationClient _operationClient =
          _serviceClient.createClient(_operations[13].getName());
      _operationClient.getOptions().setAction("urn:weaver.hrm.webservice.HrmService.SynDepartment");
      _operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

      addPropertyToOperationClient(
          _operationClient,
          org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR,
          "&");

      // create SOAP envelope with that payload
      org.apache.axiom.soap.SOAPEnvelope env = null;

      env =
          toEnvelope(
              getFactory(_operationClient.getOptions().getSoapVersionURI()),
              synDepartment,
              optimizeContent(
                  new javax.xml.namespace.QName(
                      "http://localhost/services/HrmService", "synDepartment")),
              new javax.xml.namespace.QName(
                  "http://localhost/services/HrmService", "SynDepartment"));

      // adding SOAP soap_headers
      _serviceClient.addHeadersToEnvelope(env);
      // set the message context with that soap envelope
      _messageContext.setEnvelope(env);

      // add the message contxt to the operation client
      _operationClient.addMessageContext(_messageContext);

      // execute the operation client
      _operationClient.execute(true);

      org.apache.axis2.context.MessageContext _returnMessageContext =
          _operationClient.getMessageContext(
              org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
      org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();
      _returnEnv.buildWithAttachments();

      Object object =
          fromOM(
              _returnEnv.getBody().getFirstElement(),
              SynDepartmentResponse.class);
      org.apache.axis2.transport.TransportUtils.detachInputStream(_returnMessageContext);

      return (SynDepartmentResponse) object;

    } catch (org.apache.axis2.AxisFault f) {

      org.apache.axiom.om.OMElement faultElt = f.getDetail();
      if (faultElt != null) {
        if (faultExceptionNameMap.containsKey(
            new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "SynDepartment"))) {
          // make the fault by reflection
          try {
            String exceptionClassName =
                faultExceptionClassNameMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "SynDepartment"));
            Class exceptionClass = Class.forName(exceptionClassName);
            java.lang.reflect.Constructor constructor =
                exceptionClass.getConstructor(String.class);
            Exception ex = (Exception) constructor.newInstance(f.getMessage());
            // message class
            String messageClassName =
                faultMessageMap.get(
                    new org.apache.axis2.client.FaultMapKey(faultElt.getQName(), "SynDepartment"));
            Class messageClass = Class.forName(messageClassName);
            Object messageObject = fromOM(faultElt, messageClass);
            java.lang.reflect.Method m =
                exceptionClass.getMethod("setFaultMessage", new Class[] {messageClass});
            m.invoke(ex, new Object[] {messageObject});

            throw new java.rmi.RemoteException(ex.getMessage(), ex);
          } catch (ClassCastException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (ClassNotFoundException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (NoSuchMethodException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (java.lang.reflect.InvocationTargetException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (IllegalAccessException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          } catch (InstantiationException e) {
            // we cannot intantiate the class - throw the original Axis fault
            throw f;
          }
        } else {
          throw f;
        }
      } else {
        throw f;
      }
    } finally {
      if (_messageContext.getTransportOut() != null) {
        _messageContext.getTransportOut().getSender().cleanup(_messageContext);
      }
    }
  }

  private javax.xml.namespace.QName[] opNameArray = null;

  private boolean optimizeContent(javax.xml.namespace.QName opName) {

    if (opNameArray == null) {
      return false;
    }
    for (int i = 0; i < opNameArray.length; i++) {
      if (opName.equals(opNameArray[i])) {
        return true;
      }
    }
    return false;
  }
  // http://192.168.0.4//services/HrmService
  public static class ArrayOfUserBean implements org.apache.axis2.databinding.ADBBean {
    /* This type was generated from the piece of schema that had
    name = ArrayOfUserBean
    Namespace URI = http://webservice.hrm.weaver
    Namespace Prefix = ns1
    */

    /** field for UserBean This was an Array! */
    protected UserBean[] localUserBean;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localUserBeanTracker = false;

    public boolean isUserBeanSpecified() {
      return localUserBeanTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return UserBean[]
     */
    public UserBean[] getUserBean() {
      return localUserBean;
    }

    /** validate the array for UserBean */
    protected void validateUserBean(UserBean[] param) {}

    /**
     * Auto generated setter method
     *
     * @param param UserBean
     */
    public void setUserBean(UserBean[] param) {

      validateUserBean(param);

      localUserBeanTracker = true;

      this.localUserBean = param;
    }

    /**
     * Auto generated add method for the array for convenience
     *
     * @param param UserBean
     */
    public void addUserBean(UserBean param) {
      if (localUserBean == null) {
        localUserBean = new UserBean[] {};
      }

      // update the setting tracker
      localUserBeanTracker = true;

      java.util.List list = org.apache.axis2.databinding.utils.ConverterUtil.toList(localUserBean);
      list.add(param);
      this.localUserBean = (UserBean[]) list.toArray(new UserBean[list.size()]);
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
        final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
        throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
          new org.apache.axis2.databinding.ADBDataSource(this, parentQName));
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter,
        boolean serializeType)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      String prefix = null;
      String namespace = null;

      prefix = parentQName.getPrefix();
      namespace = parentQName.getNamespaceURI();
      writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

      if (serializeType) {

        String namespacePrefix =
            registerPrefix(xmlWriter, "http://webservice.hrm.weaver");
        if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              namespacePrefix + ":ArrayOfUserBean",
              xmlWriter);
        } else {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              "ArrayOfUserBean",
              xmlWriter);
        }
      }
      if (localUserBeanTracker) {
        if (localUserBean != null) {
          for (int i = 0; i < localUserBean.length; i++) {
            if (localUserBean[i] != null) {
              localUserBean[i].serialize(
                  new javax.xml.namespace.QName("http://webservice.hrm.weaver", "UserBean"),
                  xmlWriter);
            } else {

              writeStartElement(null, "http://webservice.hrm.weaver", "UserBean", xmlWriter);

              // write the nil attribute
              writeAttribute(
                  "xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);
              xmlWriter.writeEndElement();
            }
          }
        } else {

          writeStartElement(null, "http://webservice.hrm.weaver", "UserBean", xmlWriter);

          // write the nil attribute
          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);
          xmlWriter.writeEndElement();
        }
      }
      xmlWriter.writeEndElement();
    }

    private static String generatePrefix(String namespace) {
      if (namespace.equals("http://webservice.hrm.weaver")) {
        return "ns1";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /** Utility method to write an element start tag. */
    private void writeStartElement(
        String prefix,
        String namespace,
        String localPart,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /** Util method to write an attribute with the ns prefix */
    private void writeAttribute(
        String prefix,
        String namespace,
        String attName,
        String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeAttribute(
        String namespace,
        String attName,
        String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
            registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeQNameAttribute(
        String namespace,
        String attName,
        javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      String attributeNamespace = qname.getNamespaceURI();
      String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }
    /** method to handle Qnames */
    private void writeQName(
        javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
              prefix
                  + ":"
                  + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
        javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to write any
        // namespace data after writing the charactor data
        StringBuffer stringToWrite = new StringBuffer();
        String namespaceURI = null;
        String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                  .append(prefix)
                  .append(":")
                  .append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /** Register a namespace prefix */
    private String registerPrefix(
        javax.xml.stream.XMLStreamWriter xmlWriter, String namespace)
        throws javax.xml.stream.XMLStreamException {
      String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /** Factory class that keeps the parse method */
    public static class Factory {
      private static org.apache.commons.logging.Log log =
          org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an element, the current
       * or next start element starts this object and any intervening reader events are ignorable If
       * this object is not an element, it is a complex type and the reader is at the event just
       * after the outer start element Postcondition: If this object is an element, the reader is
       * positioned at its end element If this object is a complex type, the reader is positioned at
       * the end element of its outer element
       */
      public static ArrayOfUserBean parse(javax.xml.stream.XMLStreamReader reader)
          throws Exception {
        ArrayOfUserBean object = new ArrayOfUserBean();

        int event;
        javax.xml.namespace.QName currentQName = null;
        String nillableValue = null;
        String prefix = "";
        String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          currentQName = reader.getName();

          if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type")
              != null) {
            String fullTypeName =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
            if (fullTypeName != null) {
              String nsPrefix = null;
              if (fullTypeName.indexOf(":") > -1) {
                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
              }
              nsPrefix = nsPrefix == null ? "" : nsPrefix;

              String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

              if (!"ArrayOfUserBean".equals(type)) {
                // find namespace for the prefix
                String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                return (ArrayOfUserBean) ExtensionMapper.getTypeObject(nsUri, type, reader);
              }
            }
          }

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          reader.next();

          java.util.ArrayList list1 = new java.util.ArrayList();

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://webservice.hrm.weaver", "UserBean")
                  .equals(reader.getName())) {

            // Process the array and step past its final element's end.

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              list1.add(null);
              reader.next();
            } else {
              list1.add(UserBean.Factory.parse(reader));
            }
            // loop until we find a start element that is not part of this array
            boolean loopDone1 = false;
            while (!loopDone1) {
              // We should be at the end element, but make sure
              while (!reader.isEndElement()) reader.next();
              // Step out of this element
              reader.next();
              // Step to next element event.
              while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
              if (reader.isEndElement()) {
                // two continuous end elements means we are exiting the xml structure
                loopDone1 = true;
              } else {
                if (new javax.xml.namespace.QName("http://webservice.hrm.weaver", "UserBean")
                    .equals(reader.getName())) {

                  nillableValue =
                      reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                  if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                    list1.add(null);
                    reader.next();
                  } else {
                    list1.add(UserBean.Factory.parse(reader));
                  }
                } else {
                  loopDone1 = true;
                }
              }
            }
            // call the converter utility  to convert and set the array

            object.setUserBean(
                (UserBean[])
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                        UserBean.class, list1));

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement())
            // 2 - A start element we are not expecting indicates a trailing invalid property

            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  public static class SynHrmResource implements org.apache.axis2.databinding.ADBBean {

    public static final javax.xml.namespace.QName MY_QNAME =
        new javax.xml.namespace.QName(
            "http://localhost/services/HrmService", "SynHrmResource", "ns2");

    /** field for In0 */
    protected String localIn0;

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getIn0() {
      return localIn0;
    }

    /**
     * Auto generated setter method
     *
     * @param param In0
     */
    public void setIn0(String param) {

      this.localIn0 = param;
    }

    /** field for In1 */
    protected String localIn1;

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getIn1() {
      return localIn1;
    }

    /**
     * Auto generated setter method
     *
     * @param param In1
     */
    public void setIn1(String param) {

      this.localIn1 = param;
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
        final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
        throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
          new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME));
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter,
        boolean serializeType)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      String prefix = null;
      String namespace = null;

      prefix = parentQName.getPrefix();
      namespace = parentQName.getNamespaceURI();
      writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

      if (serializeType) {

        String namespacePrefix =
            registerPrefix(xmlWriter, "http://localhost/services/HrmService");
        if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              namespacePrefix + ":SynHrmResource",
              xmlWriter);
        } else {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              "SynHrmResource",
              xmlWriter);
        }
      }

      namespace = "http://localhost/services/HrmService";
      writeStartElement(null, namespace, "in0", xmlWriter);

      if (localIn0 == null) {
        // write the nil attribute

        writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

      } else {

        xmlWriter.writeCharacters(localIn0);
      }

      xmlWriter.writeEndElement();

      namespace = "http://localhost/services/HrmService";
      writeStartElement(null, namespace, "in1", xmlWriter);

      if (localIn1 == null) {
        // write the nil attribute

        writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

      } else {

        xmlWriter.writeCharacters(localIn1);
      }

      xmlWriter.writeEndElement();

      xmlWriter.writeEndElement();
    }

    private static String generatePrefix(String namespace) {
      if (namespace.equals("http://localhost/services/HrmService")) {
        return "ns2";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /** Utility method to write an element start tag. */
    private void writeStartElement(
        String prefix,
        String namespace,
        String localPart,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /** Util method to write an attribute with the ns prefix */
    private void writeAttribute(
        String prefix,
        String namespace,
        String attName,
        String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeAttribute(
        String namespace,
        String attName,
        String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
            registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeQNameAttribute(
        String namespace,
        String attName,
        javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      String attributeNamespace = qname.getNamespaceURI();
      String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }
    /** method to handle Qnames */
    private void writeQName(
        javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
              prefix
                  + ":"
                  + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
        javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to write any
        // namespace data after writing the charactor data
        StringBuffer stringToWrite = new StringBuffer();
        String namespaceURI = null;
        String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                  .append(prefix)
                  .append(":")
                  .append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /** Register a namespace prefix */
    private String registerPrefix(
        javax.xml.stream.XMLStreamWriter xmlWriter, String namespace)
        throws javax.xml.stream.XMLStreamException {
      String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /** Factory class that keeps the parse method */
    public static class Factory {
      private static org.apache.commons.logging.Log log =
          org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an element, the current
       * or next start element starts this object and any intervening reader events are ignorable If
       * this object is not an element, it is a complex type and the reader is at the event just
       * after the outer start element Postcondition: If this object is an element, the reader is
       * positioned at its end element If this object is a complex type, the reader is positioned at
       * the end element of its outer element
       */
      public static SynHrmResource parse(javax.xml.stream.XMLStreamReader reader)
          throws Exception {
        SynHrmResource object = new SynHrmResource();

        int event;
        javax.xml.namespace.QName currentQName = null;
        String nillableValue = null;
        String prefix = "";
        String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          currentQName = reader.getName();

          if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type")
              != null) {
            String fullTypeName =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
            if (fullTypeName != null) {
              String nsPrefix = null;
              if (fullTypeName.indexOf(":") > -1) {
                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
              }
              nsPrefix = nsPrefix == null ? "" : nsPrefix;

              String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

              if (!"SynHrmResource".equals(type)) {
                // find namespace for the prefix
                String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                return (SynHrmResource) ExtensionMapper.getTypeObject(nsUri, type, reader);
              }
            }
          }

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          reader.next();

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://localhost/services/HrmService", "in0")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.setIn0(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {
            // 1 - A start element we are not expecting indicates an invalid parameter was passed
            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());
          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://localhost/services/HrmService", "in1")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.setIn1(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {
            // 1 - A start element we are not expecting indicates an invalid parameter was passed
            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());
          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement())
            // 2 - A start element we are not expecting indicates a trailing invalid property

            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  public static class GetHrmSubcompanyInfoXML implements org.apache.axis2.databinding.ADBBean {

    public static final javax.xml.namespace.QName MY_QNAME =
        new javax.xml.namespace.QName(
            "http://localhost/services/HrmService", "getHrmSubcompanyInfoXML", "ns2");

    /** field for In0 */
    protected String localIn0;

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getIn0() {
      return localIn0;
    }

    /**
     * Auto generated setter method
     *
     * @param param In0
     */
    public void setIn0(String param) {

      this.localIn0 = param;
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
        final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
        throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
          new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME));
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter,
        boolean serializeType)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      String prefix = null;
      String namespace = null;

      prefix = parentQName.getPrefix();
      namespace = parentQName.getNamespaceURI();
      writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

      if (serializeType) {

        String namespacePrefix =
            registerPrefix(xmlWriter, "http://localhost/services/HrmService");
        if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              namespacePrefix + ":getHrmSubcompanyInfoXML",
              xmlWriter);
        } else {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              "getHrmSubcompanyInfoXML",
              xmlWriter);
        }
      }

      namespace = "http://localhost/services/HrmService";
      writeStartElement(null, namespace, "in0", xmlWriter);

      if (localIn0 == null) {
        // write the nil attribute

        writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

      } else {

        xmlWriter.writeCharacters(localIn0);
      }

      xmlWriter.writeEndElement();

      xmlWriter.writeEndElement();
    }

    private static String generatePrefix(String namespace) {
      if (namespace.equals("http://localhost/services/HrmService")) {
        return "ns2";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /** Utility method to write an element start tag. */
    private void writeStartElement(
        String prefix,
        String namespace,
        String localPart,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /** Util method to write an attribute with the ns prefix */
    private void writeAttribute(
        String prefix,
        String namespace,
        String attName,
        String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeAttribute(
        String namespace,
        String attName,
        String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
            registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeQNameAttribute(
        String namespace,
        String attName,
        javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      String attributeNamespace = qname.getNamespaceURI();
      String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }
    /** method to handle Qnames */
    private void writeQName(
        javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
              prefix
                  + ":"
                  + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
        javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to write any
        // namespace data after writing the charactor data
        StringBuffer stringToWrite = new StringBuffer();
        String namespaceURI = null;
        String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                  .append(prefix)
                  .append(":")
                  .append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /** Register a namespace prefix */
    private String registerPrefix(
        javax.xml.stream.XMLStreamWriter xmlWriter, String namespace)
        throws javax.xml.stream.XMLStreamException {
      String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /** Factory class that keeps the parse method */
    public static class Factory {
      private static org.apache.commons.logging.Log log =
          org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an element, the current
       * or next start element starts this object and any intervening reader events are ignorable If
       * this object is not an element, it is a complex type and the reader is at the event just
       * after the outer start element Postcondition: If this object is an element, the reader is
       * positioned at its end element If this object is a complex type, the reader is positioned at
       * the end element of its outer element
       */
      public static GetHrmSubcompanyInfoXML parse(javax.xml.stream.XMLStreamReader reader)
          throws Exception {
        GetHrmSubcompanyInfoXML object = new GetHrmSubcompanyInfoXML();

        int event;
        javax.xml.namespace.QName currentQName = null;
        String nillableValue = null;
        String prefix = "";
        String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          currentQName = reader.getName();

          if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type")
              != null) {
            String fullTypeName =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
            if (fullTypeName != null) {
              String nsPrefix = null;
              if (fullTypeName.indexOf(":") > -1) {
                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
              }
              nsPrefix = nsPrefix == null ? "" : nsPrefix;

              String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

              if (!"getHrmSubcompanyInfoXML".equals(type)) {
                // find namespace for the prefix
                String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                return (GetHrmSubcompanyInfoXML) ExtensionMapper.getTypeObject(nsUri, type, reader);
              }
            }
          }

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          reader.next();

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://localhost/services/HrmService", "in0")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.setIn0(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {
            // 1 - A start element we are not expecting indicates an invalid parameter was passed
            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());
          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement())
            // 2 - A start element we are not expecting indicates a trailing invalid property

            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  public static class JobTitleBean implements org.apache.axis2.databinding.ADBBean {
    /* This type was generated from the piece of schema that had
    name = JobTitleBean
    Namespace URI = http://webservice.hrm.weaver
    Namespace Prefix = ns1
    */

    /** field for _code */
    protected String local_code;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean local_codeTracker = false;

    public boolean is_codeSpecified() {
      return local_codeTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String get_code() {
      return local_code;
    }

    /**
     * Auto generated setter method
     *
     * @param param _code
     */
    public void set_code(String param) {
      local_codeTracker = true;

      this.local_code = param;
    }

    /** field for _departmentid */
    protected String local_departmentid;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean local_departmentidTracker = false;

    public boolean is_departmentidSpecified() {
      return local_departmentidTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String get_departmentid() {
      return local_departmentid;
    }

    /**
     * Auto generated setter method
     *
     * @param param _departmentid
     */
    public void set_departmentid(String param) {
      local_departmentidTracker = true;

      this.local_departmentid = param;
    }

    /** field for _fullname */
    protected String local_fullname;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean local_fullnameTracker = false;

    public boolean is_fullnameSpecified() {
      return local_fullnameTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String get_fullname() {
      return local_fullname;
    }

    /**
     * Auto generated setter method
     *
     * @param param _fullname
     */
    public void set_fullname(String param) {
      local_fullnameTracker = true;

      this.local_fullname = param;
    }

    /** field for _jobcompetency */
    protected String local_jobcompetency;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean local_jobcompetencyTracker = false;

    public boolean is_jobcompetencySpecified() {
      return local_jobcompetencyTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String get_jobcompetency() {
      return local_jobcompetency;
    }

    /**
     * Auto generated setter method
     *
     * @param param _jobcompetency
     */
    public void set_jobcompetency(String param) {
      local_jobcompetencyTracker = true;

      this.local_jobcompetency = param;
    }

    /** field for _jobdoc */
    protected String local_jobdoc;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean local_jobdocTracker = false;

    public boolean is_jobdocSpecified() {
      return local_jobdocTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String get_jobdoc() {
      return local_jobdoc;
    }

    /**
     * Auto generated setter method
     *
     * @param param _jobdoc
     */
    public void set_jobdoc(String param) {
      local_jobdocTracker = true;

      this.local_jobdoc = param;
    }

    /** field for _jobresponsibility */
    protected String local_jobresponsibility;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean local_jobresponsibilityTracker = false;

    public boolean is_jobresponsibilitySpecified() {
      return local_jobresponsibilityTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String get_jobresponsibility() {
      return local_jobresponsibility;
    }

    /**
     * Auto generated setter method
     *
     * @param param _jobresponsibility
     */
    public void set_jobresponsibility(String param) {
      local_jobresponsibilityTracker = true;

      this.local_jobresponsibility = param;
    }

    /** field for _jobtitleid */
    protected String local_jobtitleid;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean local_jobtitleidTracker = false;

    public boolean is_jobtitleidSpecified() {
      return local_jobtitleidTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String get_jobtitleid() {
      return local_jobtitleid;
    }

    /**
     * Auto generated setter method
     *
     * @param param _jobtitleid
     */
    public void set_jobtitleid(String param) {
      local_jobtitleidTracker = true;

      this.local_jobtitleid = param;
    }

    /** field for _jobtitleremark */
    protected String local_jobtitleremark;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean local_jobtitleremarkTracker = false;

    public boolean is_jobtitleremarkSpecified() {
      return local_jobtitleremarkTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String get_jobtitleremark() {
      return local_jobtitleremark;
    }

    /**
     * Auto generated setter method
     *
     * @param param _jobtitleremark
     */
    public void set_jobtitleremark(String param) {
      local_jobtitleremarkTracker = true;

      this.local_jobtitleremark = param;
    }

    /** field for _lastChangdate */
    protected String local_lastChangdate;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean local_lastChangdateTracker = false;

    public boolean is_lastChangdateSpecified() {
      return local_lastChangdateTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String get_lastChangdate() {
      return local_lastChangdate;
    }

    /**
     * Auto generated setter method
     *
     * @param param _lastChangdate
     */
    public void set_lastChangdate(String param) {
      local_lastChangdateTracker = true;

      this.local_lastChangdate = param;
    }

    /** field for _shortname */
    protected String local_shortname;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean local_shortnameTracker = false;

    public boolean is_shortnameSpecified() {
      return local_shortnameTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String get_shortname() {
      return local_shortname;
    }

    /**
     * Auto generated setter method
     *
     * @param param _shortname
     */
    public void set_shortname(String param) {
      local_shortnameTracker = true;

      this.local_shortname = param;
    }

    /** field for Action */
    protected String localAction;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localActionTracker = false;

    public boolean isActionSpecified() {
      return localActionTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getAction() {
      return localAction;
    }

    /**
     * Auto generated setter method
     *
     * @param param Action
     */
    public void setAction(String param) {
      localActionTracker = true;

      this.localAction = param;
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
        final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
        throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
          new org.apache.axis2.databinding.ADBDataSource(this, parentQName));
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter,
        boolean serializeType)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      String prefix = null;
      String namespace = null;

      prefix = parentQName.getPrefix();
      namespace = parentQName.getNamespaceURI();
      writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

      if (serializeType) {

        String namespacePrefix =
            registerPrefix(xmlWriter, "http://webservice.hrm.weaver");
        if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              namespacePrefix + ":JobTitleBean",
              xmlWriter);
        } else {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              "JobTitleBean",
              xmlWriter);
        }
      }
      if (local_codeTracker) {
        namespace = "http://webservice.hrm.weaver";
        writeStartElement(null, namespace, "_code", xmlWriter);

        if (local_code == null) {
          // write the nil attribute

          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

        } else {

          xmlWriter.writeCharacters(local_code);
        }

        xmlWriter.writeEndElement();
      }
      if (local_departmentidTracker) {
        namespace = "http://webservice.hrm.weaver";
        writeStartElement(null, namespace, "_departmentid", xmlWriter);

        if (local_departmentid == null) {
          // write the nil attribute

          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

        } else {

          xmlWriter.writeCharacters(local_departmentid);
        }

        xmlWriter.writeEndElement();
      }
      if (local_fullnameTracker) {
        namespace = "http://webservice.hrm.weaver";
        writeStartElement(null, namespace, "_fullname", xmlWriter);

        if (local_fullname == null) {
          // write the nil attribute

          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

        } else {

          xmlWriter.writeCharacters(local_fullname);
        }

        xmlWriter.writeEndElement();
      }
      if (local_jobcompetencyTracker) {
        namespace = "http://webservice.hrm.weaver";
        writeStartElement(null, namespace, "_jobcompetency", xmlWriter);

        if (local_jobcompetency == null) {
          // write the nil attribute

          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

        } else {

          xmlWriter.writeCharacters(local_jobcompetency);
        }

        xmlWriter.writeEndElement();
      }
      if (local_jobdocTracker) {
        namespace = "http://webservice.hrm.weaver";
        writeStartElement(null, namespace, "_jobdoc", xmlWriter);

        if (local_jobdoc == null) {
          // write the nil attribute

          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

        } else {

          xmlWriter.writeCharacters(local_jobdoc);
        }

        xmlWriter.writeEndElement();
      }
      if (local_jobresponsibilityTracker) {
        namespace = "http://webservice.hrm.weaver";
        writeStartElement(null, namespace, "_jobresponsibility", xmlWriter);

        if (local_jobresponsibility == null) {
          // write the nil attribute

          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

        } else {

          xmlWriter.writeCharacters(local_jobresponsibility);
        }

        xmlWriter.writeEndElement();
      }
      if (local_jobtitleidTracker) {
        namespace = "http://webservice.hrm.weaver";
        writeStartElement(null, namespace, "_jobtitleid", xmlWriter);

        if (local_jobtitleid == null) {
          // write the nil attribute

          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

        } else {

          xmlWriter.writeCharacters(local_jobtitleid);
        }

        xmlWriter.writeEndElement();
      }
      if (local_jobtitleremarkTracker) {
        namespace = "http://webservice.hrm.weaver";
        writeStartElement(null, namespace, "_jobtitleremark", xmlWriter);

        if (local_jobtitleremark == null) {
          // write the nil attribute

          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

        } else {

          xmlWriter.writeCharacters(local_jobtitleremark);
        }

        xmlWriter.writeEndElement();
      }
      if (local_lastChangdateTracker) {
        namespace = "http://webservice.hrm.weaver";
        writeStartElement(null, namespace, "_lastChangdate", xmlWriter);

        if (local_lastChangdate == null) {
          // write the nil attribute

          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

        } else {

          xmlWriter.writeCharacters(local_lastChangdate);
        }

        xmlWriter.writeEndElement();
      }
      if (local_shortnameTracker) {
        namespace = "http://webservice.hrm.weaver";
        writeStartElement(null, namespace, "_shortname", xmlWriter);

        if (local_shortname == null) {
          // write the nil attribute

          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

        } else {

          xmlWriter.writeCharacters(local_shortname);
        }

        xmlWriter.writeEndElement();
      }
      if (localActionTracker) {
        namespace = "http://webservice.hrm.weaver";
        writeStartElement(null, namespace, "action", xmlWriter);

        if (localAction == null) {
          // write the nil attribute

          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

        } else {

          xmlWriter.writeCharacters(localAction);
        }

        xmlWriter.writeEndElement();
      }
      xmlWriter.writeEndElement();
    }

    private static String generatePrefix(String namespace) {
      if (namespace.equals("http://webservice.hrm.weaver")) {
        return "ns1";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /** Utility method to write an element start tag. */
    private void writeStartElement(
        String prefix,
        String namespace,
        String localPart,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /** Util method to write an attribute with the ns prefix */
    private void writeAttribute(
        String prefix,
        String namespace,
        String attName,
        String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeAttribute(
        String namespace,
        String attName,
        String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
            registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeQNameAttribute(
        String namespace,
        String attName,
        javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      String attributeNamespace = qname.getNamespaceURI();
      String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }
    /** method to handle Qnames */
    private void writeQName(
        javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
              prefix
                  + ":"
                  + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
        javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to write any
        // namespace data after writing the charactor data
        StringBuffer stringToWrite = new StringBuffer();
        String namespaceURI = null;
        String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                  .append(prefix)
                  .append(":")
                  .append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /** Register a namespace prefix */
    private String registerPrefix(
        javax.xml.stream.XMLStreamWriter xmlWriter, String namespace)
        throws javax.xml.stream.XMLStreamException {
      String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /** Factory class that keeps the parse method */
    public static class Factory {
      private static org.apache.commons.logging.Log log =
          org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an element, the current
       * or next start element starts this object and any intervening reader events are ignorable If
       * this object is not an element, it is a complex type and the reader is at the event just
       * after the outer start element Postcondition: If this object is an element, the reader is
       * positioned at its end element If this object is a complex type, the reader is positioned at
       * the end element of its outer element
       */
      public static JobTitleBean parse(javax.xml.stream.XMLStreamReader reader)
          throws Exception {
        JobTitleBean object = new JobTitleBean();

        int event;
        javax.xml.namespace.QName currentQName = null;
        String nillableValue = null;
        String prefix = "";
        String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          currentQName = reader.getName();

          if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type")
              != null) {
            String fullTypeName =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
            if (fullTypeName != null) {
              String nsPrefix = null;
              if (fullTypeName.indexOf(":") > -1) {
                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
              }
              nsPrefix = nsPrefix == null ? "" : nsPrefix;

              String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

              if (!"JobTitleBean".equals(type)) {
                // find namespace for the prefix
                String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                return (JobTitleBean) ExtensionMapper.getTypeObject(nsUri, type, reader);
              }
            }
          }

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          reader.next();

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://webservice.hrm.weaver", "_code")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.set_code(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://webservice.hrm.weaver", "_departmentid")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.set_departmentid(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://webservice.hrm.weaver", "_fullname")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.set_fullname(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://webservice.hrm.weaver", "_jobcompetency")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.set_jobcompetency(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://webservice.hrm.weaver", "_jobdoc")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.set_jobdoc(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://webservice.hrm.weaver", "_jobresponsibility")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.set_jobresponsibility(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://webservice.hrm.weaver", "_jobtitleid")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.set_jobtitleid(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://webservice.hrm.weaver", "_jobtitleremark")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.set_jobtitleremark(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://webservice.hrm.weaver", "_lastChangdate")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.set_lastChangdate(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://webservice.hrm.weaver", "_shortname")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.set_shortname(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://webservice.hrm.weaver", "action")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.setAction(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement())
            // 2 - A start element we are not expecting indicates a trailing invalid property

            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  public static class GetHrmUserInfo implements org.apache.axis2.databinding.ADBBean {

    public static final javax.xml.namespace.QName MY_QNAME =
        new javax.xml.namespace.QName(
            "http://localhost/services/HrmService", "getHrmUserInfo", "ns2");

    /** field for In0 */
    protected String localIn0;

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getIn0() {
      return localIn0;
    }

    /**
     * Auto generated setter method
     *
     * @param param In0
     */
    public void setIn0(String param) {

      this.localIn0 = param;
    }

    /** field for In1 */
    protected String localIn1;

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getIn1() {
      return localIn1;
    }

    /**
     * Auto generated setter method
     *
     * @param param In1
     */
    public void setIn1(String param) {

      this.localIn1 = param;
    }

    /** field for In2 */
    protected String localIn2;

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getIn2() {
      return localIn2;
    }

    /**
     * Auto generated setter method
     *
     * @param param In2
     */
    public void setIn2(String param) {

      this.localIn2 = param;
    }

    /** field for In3 */
    protected String localIn3;

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getIn3() {
      return localIn3;
    }

    /**
     * Auto generated setter method
     *
     * @param param In3
     */
    public void setIn3(String param) {

      this.localIn3 = param;
    }

    /** field for In4 */
    protected String localIn4;

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getIn4() {
      return localIn4;
    }

    /**
     * Auto generated setter method
     *
     * @param param In4
     */
    public void setIn4(String param) {

      this.localIn4 = param;
    }

    /** field for In5 */
    protected String localIn5;

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getIn5() {
      return localIn5;
    }

    /**
     * Auto generated setter method
     *
     * @param param In5
     */
    public void setIn5(String param) {

      this.localIn5 = param;
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
        final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
        throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
          new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME));
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter,
        boolean serializeType)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      String prefix = null;
      String namespace = null;

      prefix = parentQName.getPrefix();
      namespace = parentQName.getNamespaceURI();
      writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

      if (serializeType) {

        String namespacePrefix =
            registerPrefix(xmlWriter, "http://localhost/services/HrmService");
        if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              namespacePrefix + ":getHrmUserInfo",
              xmlWriter);
        } else {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              "getHrmUserInfo",
              xmlWriter);
        }
      }

      namespace = "http://localhost/services/HrmService";
      writeStartElement(null, namespace, "in0", xmlWriter);

      if (localIn0 == null) {
        // write the nil attribute

        writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

      } else {

        xmlWriter.writeCharacters(localIn0);
      }

      xmlWriter.writeEndElement();

      namespace = "http://localhost/services/HrmService";
      writeStartElement(null, namespace, "in1", xmlWriter);

      if (localIn1 == null) {
        // write the nil attribute

        writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

      } else {

        xmlWriter.writeCharacters(localIn1);
      }

      xmlWriter.writeEndElement();

      namespace = "http://localhost/services/HrmService";
      writeStartElement(null, namespace, "in2", xmlWriter);

      if (localIn2 == null) {
        // write the nil attribute

        writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

      } else {

        xmlWriter.writeCharacters(localIn2);
      }

      xmlWriter.writeEndElement();

      namespace = "http://localhost/services/HrmService";
      writeStartElement(null, namespace, "in3", xmlWriter);

      if (localIn3 == null) {
        // write the nil attribute

        writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

      } else {

        xmlWriter.writeCharacters(localIn3);
      }

      xmlWriter.writeEndElement();

      namespace = "http://localhost/services/HrmService";
      writeStartElement(null, namespace, "in4", xmlWriter);

      if (localIn4 == null) {
        // write the nil attribute

        writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

      } else {

        xmlWriter.writeCharacters(localIn4);
      }

      xmlWriter.writeEndElement();

      namespace = "http://localhost/services/HrmService";
      writeStartElement(null, namespace, "in5", xmlWriter);

      if (localIn5 == null) {
        // write the nil attribute

        writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

      } else {

        xmlWriter.writeCharacters(localIn5);
      }

      xmlWriter.writeEndElement();

      xmlWriter.writeEndElement();
    }

    private static String generatePrefix(String namespace) {
      if (namespace.equals("http://localhost/services/HrmService")) {
        return "ns2";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /** Utility method to write an element start tag. */
    private void writeStartElement(
        String prefix,
        String namespace,
        String localPart,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /** Util method to write an attribute with the ns prefix */
    private void writeAttribute(
        String prefix,
        String namespace,
        String attName,
        String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeAttribute(
        String namespace,
        String attName,
        String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
            registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeQNameAttribute(
        String namespace,
        String attName,
        javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      String attributeNamespace = qname.getNamespaceURI();
      String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }
    /** method to handle Qnames */
    private void writeQName(
        javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
              prefix
                  + ":"
                  + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
        javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to write any
        // namespace data after writing the charactor data
        StringBuffer stringToWrite = new StringBuffer();
        String namespaceURI = null;
        String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                  .append(prefix)
                  .append(":")
                  .append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /** Register a namespace prefix */
    private String registerPrefix(
        javax.xml.stream.XMLStreamWriter xmlWriter, String namespace)
        throws javax.xml.stream.XMLStreamException {
      String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /** Factory class that keeps the parse method */
    public static class Factory {
      private static org.apache.commons.logging.Log log =
          org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an element, the current
       * or next start element starts this object and any intervening reader events are ignorable If
       * this object is not an element, it is a complex type and the reader is at the event just
       * after the outer start element Postcondition: If this object is an element, the reader is
       * positioned at its end element If this object is a complex type, the reader is positioned at
       * the end element of its outer element
       */
      public static GetHrmUserInfo parse(javax.xml.stream.XMLStreamReader reader)
          throws Exception {
        GetHrmUserInfo object = new GetHrmUserInfo();

        int event;
        javax.xml.namespace.QName currentQName = null;
        String nillableValue = null;
        String prefix = "";
        String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          currentQName = reader.getName();

          if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type")
              != null) {
            String fullTypeName =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
            if (fullTypeName != null) {
              String nsPrefix = null;
              if (fullTypeName.indexOf(":") > -1) {
                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
              }
              nsPrefix = nsPrefix == null ? "" : nsPrefix;

              String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

              if (!"getHrmUserInfo".equals(type)) {
                // find namespace for the prefix
                String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                return (GetHrmUserInfo) ExtensionMapper.getTypeObject(nsUri, type, reader);
              }
            }
          }

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          reader.next();

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://localhost/services/HrmService", "in0")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.setIn0(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {
            // 1 - A start element we are not expecting indicates an invalid parameter was passed
            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());
          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://localhost/services/HrmService", "in1")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.setIn1(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {
            // 1 - A start element we are not expecting indicates an invalid parameter was passed
            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());
          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://localhost/services/HrmService", "in2")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.setIn2(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {
            // 1 - A start element we are not expecting indicates an invalid parameter was passed
            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());
          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://localhost/services/HrmService", "in3")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.setIn3(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {
            // 1 - A start element we are not expecting indicates an invalid parameter was passed
            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());
          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://localhost/services/HrmService", "in4")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.setIn4(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {
            // 1 - A start element we are not expecting indicates an invalid parameter was passed
            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());
          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://localhost/services/HrmService", "in5")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.setIn5(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {
            // 1 - A start element we are not expecting indicates an invalid parameter was passed
            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());
          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement())
            // 2 - A start element we are not expecting indicates a trailing invalid property

            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  public static class GetHrmDepartmentInfoXMLResponse
      implements org.apache.axis2.databinding.ADBBean {

    public static final javax.xml.namespace.QName MY_QNAME =
        new javax.xml.namespace.QName(
            "http://localhost/services/HrmService", "getHrmDepartmentInfoXMLResponse", "ns2");

    /** field for Out */
    protected String localOut;

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getOut() {
      return localOut;
    }

    /**
     * Auto generated setter method
     *
     * @param param Out
     */
    public void setOut(String param) {

      this.localOut = param;
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
        final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
        throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
          new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME));
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter,
        boolean serializeType)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      String prefix = null;
      String namespace = null;

      prefix = parentQName.getPrefix();
      namespace = parentQName.getNamespaceURI();
      writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

      if (serializeType) {

        String namespacePrefix =
            registerPrefix(xmlWriter, "http://localhost/services/HrmService");
        if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              namespacePrefix + ":getHrmDepartmentInfoXMLResponse",
              xmlWriter);
        } else {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              "getHrmDepartmentInfoXMLResponse",
              xmlWriter);
        }
      }

      namespace = "http://localhost/services/HrmService";
      writeStartElement(null, namespace, "out", xmlWriter);

      if (localOut == null) {
        // write the nil attribute

        writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

      } else {

        xmlWriter.writeCharacters(localOut);
      }

      xmlWriter.writeEndElement();

      xmlWriter.writeEndElement();
    }

    private static String generatePrefix(String namespace) {
      if (namespace.equals("http://localhost/services/HrmService")) {
        return "ns2";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /** Utility method to write an element start tag. */
    private void writeStartElement(
        String prefix,
        String namespace,
        String localPart,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /** Util method to write an attribute with the ns prefix */
    private void writeAttribute(
        String prefix,
        String namespace,
        String attName,
        String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeAttribute(
        String namespace,
        String attName,
        String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
            registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeQNameAttribute(
        String namespace,
        String attName,
        javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      String attributeNamespace = qname.getNamespaceURI();
      String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }
    /** method to handle Qnames */
    private void writeQName(
        javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
              prefix
                  + ":"
                  + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
        javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to write any
        // namespace data after writing the charactor data
        StringBuffer stringToWrite = new StringBuffer();
        String namespaceURI = null;
        String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                  .append(prefix)
                  .append(":")
                  .append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /** Register a namespace prefix */
    private String registerPrefix(
        javax.xml.stream.XMLStreamWriter xmlWriter, String namespace)
        throws javax.xml.stream.XMLStreamException {
      String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /** Factory class that keeps the parse method */
    public static class Factory {
      private static org.apache.commons.logging.Log log =
          org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an element, the current
       * or next start element starts this object and any intervening reader events are ignorable If
       * this object is not an element, it is a complex type and the reader is at the event just
       * after the outer start element Postcondition: If this object is an element, the reader is
       * positioned at its end element If this object is a complex type, the reader is positioned at
       * the end element of its outer element
       */
      public static GetHrmDepartmentInfoXMLResponse parse(javax.xml.stream.XMLStreamReader reader)
          throws Exception {
        GetHrmDepartmentInfoXMLResponse object = new GetHrmDepartmentInfoXMLResponse();

        int event;
        javax.xml.namespace.QName currentQName = null;
        String nillableValue = null;
        String prefix = "";
        String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          currentQName = reader.getName();

          if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type")
              != null) {
            String fullTypeName =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
            if (fullTypeName != null) {
              String nsPrefix = null;
              if (fullTypeName.indexOf(":") > -1) {
                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
              }
              nsPrefix = nsPrefix == null ? "" : nsPrefix;

              String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

              if (!"getHrmDepartmentInfoXMLResponse".equals(type)) {
                // find namespace for the prefix
                String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                return (GetHrmDepartmentInfoXMLResponse)
                    ExtensionMapper.getTypeObject(nsUri, type, reader);
              }
            }
          }

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          reader.next();

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://localhost/services/HrmService", "out")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.setOut(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {
            // 1 - A start element we are not expecting indicates an invalid parameter was passed
            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());
          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement())
            // 2 - A start element we are not expecting indicates a trailing invalid property

            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  public static class SynDepartmentResponse implements org.apache.axis2.databinding.ADBBean {

    public static final javax.xml.namespace.QName MY_QNAME =
        new javax.xml.namespace.QName(
            "http://localhost/services/HrmService", "SynDepartmentResponse", "ns2");

    /** field for Out */
    protected String localOut;

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getOut() {
      return localOut;
    }

    /**
     * Auto generated setter method
     *
     * @param param Out
     */
    public void setOut(String param) {

      this.localOut = param;
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
        final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
        throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
          new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME));
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter,
        boolean serializeType)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      String prefix = null;
      String namespace = null;

      prefix = parentQName.getPrefix();
      namespace = parentQName.getNamespaceURI();
      writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

      if (serializeType) {

        String namespacePrefix =
            registerPrefix(xmlWriter, "http://localhost/services/HrmService");
        if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              namespacePrefix + ":SynDepartmentResponse",
              xmlWriter);
        } else {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              "SynDepartmentResponse",
              xmlWriter);
        }
      }

      namespace = "http://localhost/services/HrmService";
      writeStartElement(null, namespace, "out", xmlWriter);

      if (localOut == null) {
        // write the nil attribute

        writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

      } else {

        xmlWriter.writeCharacters(localOut);
      }

      xmlWriter.writeEndElement();

      xmlWriter.writeEndElement();
    }

    private static String generatePrefix(String namespace) {
      if (namespace.equals("http://localhost/services/HrmService")) {
        return "ns2";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /** Utility method to write an element start tag. */
    private void writeStartElement(
        String prefix,
        String namespace,
        String localPart,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /** Util method to write an attribute with the ns prefix */
    private void writeAttribute(
        String prefix,
        String namespace,
        String attName,
        String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeAttribute(
        String namespace,
        String attName,
        String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
            registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeQNameAttribute(
        String namespace,
        String attName,
        javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      String attributeNamespace = qname.getNamespaceURI();
      String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }
    /** method to handle Qnames */
    private void writeQName(
        javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
              prefix
                  + ":"
                  + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
        javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to write any
        // namespace data after writing the charactor data
        StringBuffer stringToWrite = new StringBuffer();
        String namespaceURI = null;
        String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                  .append(prefix)
                  .append(":")
                  .append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /** Register a namespace prefix */
    private String registerPrefix(
        javax.xml.stream.XMLStreamWriter xmlWriter, String namespace)
        throws javax.xml.stream.XMLStreamException {
      String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /** Factory class that keeps the parse method */
    public static class Factory {
      private static org.apache.commons.logging.Log log =
          org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an element, the current
       * or next start element starts this object and any intervening reader events are ignorable If
       * this object is not an element, it is a complex type and the reader is at the event just
       * after the outer start element Postcondition: If this object is an element, the reader is
       * positioned at its end element If this object is a complex type, the reader is positioned at
       * the end element of its outer element
       */
      public static SynDepartmentResponse parse(javax.xml.stream.XMLStreamReader reader)
          throws Exception {
        SynDepartmentResponse object = new SynDepartmentResponse();

        int event;
        javax.xml.namespace.QName currentQName = null;
        String nillableValue = null;
        String prefix = "";
        String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          currentQName = reader.getName();

          if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type")
              != null) {
            String fullTypeName =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
            if (fullTypeName != null) {
              String nsPrefix = null;
              if (fullTypeName.indexOf(":") > -1) {
                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
              }
              nsPrefix = nsPrefix == null ? "" : nsPrefix;

              String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

              if (!"SynDepartmentResponse".equals(type)) {
                // find namespace for the prefix
                String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                return (SynDepartmentResponse) ExtensionMapper.getTypeObject(nsUri, type, reader);
              }
            }
          }

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          reader.next();

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://localhost/services/HrmService", "out")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.setOut(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {
            // 1 - A start element we are not expecting indicates an invalid parameter was passed
            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());
          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement())
            // 2 - A start element we are not expecting indicates a trailing invalid property

            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  public static class GetHrmDepartmentInfoXML implements org.apache.axis2.databinding.ADBBean {

    public static final javax.xml.namespace.QName MY_QNAME =
        new javax.xml.namespace.QName(
            "http://localhost/services/HrmService", "getHrmDepartmentInfoXML", "ns2");

    /** field for In0 */
    protected String localIn0;

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getIn0() {
      return localIn0;
    }

    /**
     * Auto generated setter method
     *
     * @param param In0
     */
    public void setIn0(String param) {

      this.localIn0 = param;
    }

    /** field for In1 */
    protected String localIn1;

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getIn1() {
      return localIn1;
    }

    /**
     * Auto generated setter method
     *
     * @param param In1
     */
    public void setIn1(String param) {

      this.localIn1 = param;
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
        final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
        throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
          new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME));
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter,
        boolean serializeType)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      String prefix = null;
      String namespace = null;

      prefix = parentQName.getPrefix();
      namespace = parentQName.getNamespaceURI();
      writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

      if (serializeType) {

        String namespacePrefix =
            registerPrefix(xmlWriter, "http://localhost/services/HrmService");
        if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              namespacePrefix + ":getHrmDepartmentInfoXML",
              xmlWriter);
        } else {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              "getHrmDepartmentInfoXML",
              xmlWriter);
        }
      }

      namespace = "http://localhost/services/HrmService";
      writeStartElement(null, namespace, "in0", xmlWriter);

      if (localIn0 == null) {
        // write the nil attribute

        writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

      } else {

        xmlWriter.writeCharacters(localIn0);
      }

      xmlWriter.writeEndElement();

      namespace = "http://localhost/services/HrmService";
      writeStartElement(null, namespace, "in1", xmlWriter);

      if (localIn1 == null) {
        // write the nil attribute

        writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

      } else {

        xmlWriter.writeCharacters(localIn1);
      }

      xmlWriter.writeEndElement();

      xmlWriter.writeEndElement();
    }

    private static String generatePrefix(String namespace) {
      if (namespace.equals("http://localhost/services/HrmService")) {
        return "ns2";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /** Utility method to write an element start tag. */
    private void writeStartElement(
        String prefix,
        String namespace,
        String localPart,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /** Util method to write an attribute with the ns prefix */
    private void writeAttribute(
        String prefix,
        String namespace,
        String attName,
        String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeAttribute(
        String namespace,
        String attName,
        String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
            registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeQNameAttribute(
        String namespace,
        String attName,
        javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      String attributeNamespace = qname.getNamespaceURI();
      String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }
    /** method to handle Qnames */
    private void writeQName(
        javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
              prefix
                  + ":"
                  + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
        javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to write any
        // namespace data after writing the charactor data
        StringBuffer stringToWrite = new StringBuffer();
        String namespaceURI = null;
        String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                  .append(prefix)
                  .append(":")
                  .append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /** Register a namespace prefix */
    private String registerPrefix(
        javax.xml.stream.XMLStreamWriter xmlWriter, String namespace)
        throws javax.xml.stream.XMLStreamException {
      String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /** Factory class that keeps the parse method */
    public static class Factory {
      private static org.apache.commons.logging.Log log =
          org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an element, the current
       * or next start element starts this object and any intervening reader events are ignorable If
       * this object is not an element, it is a complex type and the reader is at the event just
       * after the outer start element Postcondition: If this object is an element, the reader is
       * positioned at its end element If this object is a complex type, the reader is positioned at
       * the end element of its outer element
       */
      public static GetHrmDepartmentInfoXML parse(javax.xml.stream.XMLStreamReader reader)
          throws Exception {
        GetHrmDepartmentInfoXML object = new GetHrmDepartmentInfoXML();

        int event;
        javax.xml.namespace.QName currentQName = null;
        String nillableValue = null;
        String prefix = "";
        String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          currentQName = reader.getName();

          if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type")
              != null) {
            String fullTypeName =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
            if (fullTypeName != null) {
              String nsPrefix = null;
              if (fullTypeName.indexOf(":") > -1) {
                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
              }
              nsPrefix = nsPrefix == null ? "" : nsPrefix;

              String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

              if (!"getHrmDepartmentInfoXML".equals(type)) {
                // find namespace for the prefix
                String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                return (GetHrmDepartmentInfoXML) ExtensionMapper.getTypeObject(nsUri, type, reader);
              }
            }
          }

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          reader.next();

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://localhost/services/HrmService", "in0")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.setIn0(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {
            // 1 - A start element we are not expecting indicates an invalid parameter was passed
            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());
          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://localhost/services/HrmService", "in1")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.setIn1(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {
            // 1 - A start element we are not expecting indicates an invalid parameter was passed
            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());
          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement())
            // 2 - A start element we are not expecting indicates a trailing invalid property

            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  public static class GetHrmJobTitleInfo implements org.apache.axis2.databinding.ADBBean {

    public static final javax.xml.namespace.QName MY_QNAME =
        new javax.xml.namespace.QName(
            "http://localhost/services/HrmService", "getHrmJobTitleInfo", "ns2");

    /** field for In0 */
    protected String localIn0;

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getIn0() {
      return localIn0;
    }

    /**
     * Auto generated setter method
     *
     * @param param In0
     */
    public void setIn0(String param) {

      this.localIn0 = param;
    }

    /** field for In1 */
    protected String localIn1;

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getIn1() {
      return localIn1;
    }

    /**
     * Auto generated setter method
     *
     * @param param In1
     */
    public void setIn1(String param) {

      this.localIn1 = param;
    }

    /** field for In2 */
    protected String localIn2;

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getIn2() {
      return localIn2;
    }

    /**
     * Auto generated setter method
     *
     * @param param In2
     */
    public void setIn2(String param) {

      this.localIn2 = param;
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
        final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
        throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
          new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME));
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter,
        boolean serializeType)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      String prefix = null;
      String namespace = null;

      prefix = parentQName.getPrefix();
      namespace = parentQName.getNamespaceURI();
      writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

      if (serializeType) {

        String namespacePrefix =
            registerPrefix(xmlWriter, "http://localhost/services/HrmService");
        if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              namespacePrefix + ":getHrmJobTitleInfo",
              xmlWriter);
        } else {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              "getHrmJobTitleInfo",
              xmlWriter);
        }
      }

      namespace = "http://localhost/services/HrmService";
      writeStartElement(null, namespace, "in0", xmlWriter);

      if (localIn0 == null) {
        // write the nil attribute

        writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

      } else {

        xmlWriter.writeCharacters(localIn0);
      }

      xmlWriter.writeEndElement();

      namespace = "http://localhost/services/HrmService";
      writeStartElement(null, namespace, "in1", xmlWriter);

      if (localIn1 == null) {
        // write the nil attribute

        writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

      } else {

        xmlWriter.writeCharacters(localIn1);
      }

      xmlWriter.writeEndElement();

      namespace = "http://localhost/services/HrmService";
      writeStartElement(null, namespace, "in2", xmlWriter);

      if (localIn2 == null) {
        // write the nil attribute

        writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

      } else {

        xmlWriter.writeCharacters(localIn2);
      }

      xmlWriter.writeEndElement();

      xmlWriter.writeEndElement();
    }

    private static String generatePrefix(String namespace) {
      if (namespace.equals("http://localhost/services/HrmService")) {
        return "ns2";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /** Utility method to write an element start tag. */
    private void writeStartElement(
        String prefix,
        String namespace,
        String localPart,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /** Util method to write an attribute with the ns prefix */
    private void writeAttribute(
        String prefix,
        String namespace,
        String attName,
        String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeAttribute(
        String namespace,
        String attName,
        String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
            registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeQNameAttribute(
        String namespace,
        String attName,
        javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      String attributeNamespace = qname.getNamespaceURI();
      String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }
    /** method to handle Qnames */
    private void writeQName(
        javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
              prefix
                  + ":"
                  + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
        javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to write any
        // namespace data after writing the charactor data
        StringBuffer stringToWrite = new StringBuffer();
        String namespaceURI = null;
        String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                  .append(prefix)
                  .append(":")
                  .append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /** Register a namespace prefix */
    private String registerPrefix(
        javax.xml.stream.XMLStreamWriter xmlWriter, String namespace)
        throws javax.xml.stream.XMLStreamException {
      String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /** Factory class that keeps the parse method */
    public static class Factory {
      private static org.apache.commons.logging.Log log =
          org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an element, the current
       * or next start element starts this object and any intervening reader events are ignorable If
       * this object is not an element, it is a complex type and the reader is at the event just
       * after the outer start element Postcondition: If this object is an element, the reader is
       * positioned at its end element If this object is a complex type, the reader is positioned at
       * the end element of its outer element
       */
      public static GetHrmJobTitleInfo parse(javax.xml.stream.XMLStreamReader reader)
          throws Exception {
        GetHrmJobTitleInfo object = new GetHrmJobTitleInfo();

        int event;
        javax.xml.namespace.QName currentQName = null;
        String nillableValue = null;
        String prefix = "";
        String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          currentQName = reader.getName();

          if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type")
              != null) {
            String fullTypeName =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
            if (fullTypeName != null) {
              String nsPrefix = null;
              if (fullTypeName.indexOf(":") > -1) {
                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
              }
              nsPrefix = nsPrefix == null ? "" : nsPrefix;

              String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

              if (!"getHrmJobTitleInfo".equals(type)) {
                // find namespace for the prefix
                String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                return (GetHrmJobTitleInfo) ExtensionMapper.getTypeObject(nsUri, type, reader);
              }
            }
          }

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          reader.next();

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://localhost/services/HrmService", "in0")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.setIn0(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {
            // 1 - A start element we are not expecting indicates an invalid parameter was passed
            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());
          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://localhost/services/HrmService", "in1")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.setIn1(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {
            // 1 - A start element we are not expecting indicates an invalid parameter was passed
            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());
          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://localhost/services/HrmService", "in2")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.setIn2(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {
            // 1 - A start element we are not expecting indicates an invalid parameter was passed
            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());
          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement())
            // 2 - A start element we are not expecting indicates a trailing invalid property

            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  public static class GetHrmJobTitleInfoXMLResponse
      implements org.apache.axis2.databinding.ADBBean {

    public static final javax.xml.namespace.QName MY_QNAME =
        new javax.xml.namespace.QName(
            "http://localhost/services/HrmService", "getHrmJobTitleInfoXMLResponse", "ns2");

    /** field for Out */
    protected String localOut;

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getOut() {
      return localOut;
    }

    /**
     * Auto generated setter method
     *
     * @param param Out
     */
    public void setOut(String param) {

      this.localOut = param;
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
        final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
        throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
          new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME));
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter,
        boolean serializeType)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      String prefix = null;
      String namespace = null;

      prefix = parentQName.getPrefix();
      namespace = parentQName.getNamespaceURI();
      writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

      if (serializeType) {

        String namespacePrefix =
            registerPrefix(xmlWriter, "http://localhost/services/HrmService");
        if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              namespacePrefix + ":getHrmJobTitleInfoXMLResponse",
              xmlWriter);
        } else {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              "getHrmJobTitleInfoXMLResponse",
              xmlWriter);
        }
      }

      namespace = "http://localhost/services/HrmService";
      writeStartElement(null, namespace, "out", xmlWriter);

      if (localOut == null) {
        // write the nil attribute

        writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

      } else {

        xmlWriter.writeCharacters(localOut);
      }

      xmlWriter.writeEndElement();

      xmlWriter.writeEndElement();
    }

    private static String generatePrefix(String namespace) {
      if (namespace.equals("http://localhost/services/HrmService")) {
        return "ns2";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /** Utility method to write an element start tag. */
    private void writeStartElement(
        String prefix,
        String namespace,
        String localPart,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /** Util method to write an attribute with the ns prefix */
    private void writeAttribute(
        String prefix,
        String namespace,
        String attName,
        String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeAttribute(
        String namespace,
        String attName,
        String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
            registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeQNameAttribute(
        String namespace,
        String attName,
        javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      String attributeNamespace = qname.getNamespaceURI();
      String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }
    /** method to handle Qnames */
    private void writeQName(
        javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
              prefix
                  + ":"
                  + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
        javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to write any
        // namespace data after writing the charactor data
        StringBuffer stringToWrite = new StringBuffer();
        String namespaceURI = null;
        String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                  .append(prefix)
                  .append(":")
                  .append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /** Register a namespace prefix */
    private String registerPrefix(
        javax.xml.stream.XMLStreamWriter xmlWriter, String namespace)
        throws javax.xml.stream.XMLStreamException {
      String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /** Factory class that keeps the parse method */
    public static class Factory {
      private static org.apache.commons.logging.Log log =
          org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an element, the current
       * or next start element starts this object and any intervening reader events are ignorable If
       * this object is not an element, it is a complex type and the reader is at the event just
       * after the outer start element Postcondition: If this object is an element, the reader is
       * positioned at its end element If this object is a complex type, the reader is positioned at
       * the end element of its outer element
       */
      public static GetHrmJobTitleInfoXMLResponse parse(javax.xml.stream.XMLStreamReader reader)
          throws Exception {
        GetHrmJobTitleInfoXMLResponse object = new GetHrmJobTitleInfoXMLResponse();

        int event;
        javax.xml.namespace.QName currentQName = null;
        String nillableValue = null;
        String prefix = "";
        String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          currentQName = reader.getName();

          if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type")
              != null) {
            String fullTypeName =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
            if (fullTypeName != null) {
              String nsPrefix = null;
              if (fullTypeName.indexOf(":") > -1) {
                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
              }
              nsPrefix = nsPrefix == null ? "" : nsPrefix;

              String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

              if (!"getHrmJobTitleInfoXMLResponse".equals(type)) {
                // find namespace for the prefix
                String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                return (GetHrmJobTitleInfoXMLResponse)
                    ExtensionMapper.getTypeObject(nsUri, type, reader);
              }
            }
          }

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          reader.next();

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://localhost/services/HrmService", "out")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.setOut(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {
            // 1 - A start element we are not expecting indicates an invalid parameter was passed
            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());
          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement())
            // 2 - A start element we are not expecting indicates a trailing invalid property

            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  public static class SynSubCompany implements org.apache.axis2.databinding.ADBBean {

    public static final javax.xml.namespace.QName MY_QNAME =
        new javax.xml.namespace.QName(
            "http://localhost/services/HrmService", "SynSubCompany", "ns2");

    /** field for In0 */
    protected String localIn0;

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getIn0() {
      return localIn0;
    }

    /**
     * Auto generated setter method
     *
     * @param param In0
     */
    public void setIn0(String param) {

      this.localIn0 = param;
    }

    /** field for In1 */
    protected String localIn1;

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getIn1() {
      return localIn1;
    }

    /**
     * Auto generated setter method
     *
     * @param param In1
     */
    public void setIn1(String param) {

      this.localIn1 = param;
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
        final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
        throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
          new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME));
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter,
        boolean serializeType)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      String prefix = null;
      String namespace = null;

      prefix = parentQName.getPrefix();
      namespace = parentQName.getNamespaceURI();
      writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

      if (serializeType) {

        String namespacePrefix =
            registerPrefix(xmlWriter, "http://localhost/services/HrmService");
        if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              namespacePrefix + ":SynSubCompany",
              xmlWriter);
        } else {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              "SynSubCompany",
              xmlWriter);
        }
      }

      namespace = "http://localhost/services/HrmService";
      writeStartElement(null, namespace, "in0", xmlWriter);

      if (localIn0 == null) {
        // write the nil attribute

        writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

      } else {

        xmlWriter.writeCharacters(localIn0);
      }

      xmlWriter.writeEndElement();

      namespace = "http://localhost/services/HrmService";
      writeStartElement(null, namespace, "in1", xmlWriter);

      if (localIn1 == null) {
        // write the nil attribute

        writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

      } else {

        xmlWriter.writeCharacters(localIn1);
      }

      xmlWriter.writeEndElement();

      xmlWriter.writeEndElement();
    }

    private static String generatePrefix(String namespace) {
      if (namespace.equals("http://localhost/services/HrmService")) {
        return "ns2";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /** Utility method to write an element start tag. */
    private void writeStartElement(
        String prefix,
        String namespace,
        String localPart,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /** Util method to write an attribute with the ns prefix */
    private void writeAttribute(
        String prefix,
        String namespace,
        String attName,
        String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeAttribute(
        String namespace,
        String attName,
        String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
            registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeQNameAttribute(
        String namespace,
        String attName,
        javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      String attributeNamespace = qname.getNamespaceURI();
      String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }
    /** method to handle Qnames */
    private void writeQName(
        javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
              prefix
                  + ":"
                  + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
        javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to write any
        // namespace data after writing the charactor data
        StringBuffer stringToWrite = new StringBuffer();
        String namespaceURI = null;
        String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                  .append(prefix)
                  .append(":")
                  .append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /** Register a namespace prefix */
    private String registerPrefix(
        javax.xml.stream.XMLStreamWriter xmlWriter, String namespace)
        throws javax.xml.stream.XMLStreamException {
      String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /** Factory class that keeps the parse method */
    public static class Factory {
      private static org.apache.commons.logging.Log log =
          org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an element, the current
       * or next start element starts this object and any intervening reader events are ignorable If
       * this object is not an element, it is a complex type and the reader is at the event just
       * after the outer start element Postcondition: If this object is an element, the reader is
       * positioned at its end element If this object is a complex type, the reader is positioned at
       * the end element of its outer element
       */
      public static SynSubCompany parse(javax.xml.stream.XMLStreamReader reader)
          throws Exception {
        SynSubCompany object = new SynSubCompany();

        int event;
        javax.xml.namespace.QName currentQName = null;
        String nillableValue = null;
        String prefix = "";
        String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          currentQName = reader.getName();

          if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type")
              != null) {
            String fullTypeName =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
            if (fullTypeName != null) {
              String nsPrefix = null;
              if (fullTypeName.indexOf(":") > -1) {
                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
              }
              nsPrefix = nsPrefix == null ? "" : nsPrefix;

              String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

              if (!"SynSubCompany".equals(type)) {
                // find namespace for the prefix
                String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                return (SynSubCompany) ExtensionMapper.getTypeObject(nsUri, type, reader);
              }
            }
          }

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          reader.next();

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://localhost/services/HrmService", "in0")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.setIn0(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {
            // 1 - A start element we are not expecting indicates an invalid parameter was passed
            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());
          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://localhost/services/HrmService", "in1")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.setIn1(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {
            // 1 - A start element we are not expecting indicates an invalid parameter was passed
            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());
          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement())
            // 2 - A start element we are not expecting indicates a trailing invalid property

            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  public static class SynHrmResourceResponse implements org.apache.axis2.databinding.ADBBean {

    public static final javax.xml.namespace.QName MY_QNAME =
        new javax.xml.namespace.QName(
            "http://localhost/services/HrmService", "SynHrmResourceResponse", "ns2");

    /** field for Out */
    protected String localOut;

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getOut() {
      return localOut;
    }

    /**
     * Auto generated setter method
     *
     * @param param Out
     */
    public void setOut(String param) {

      this.localOut = param;
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
        final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
        throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
          new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME));
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter,
        boolean serializeType)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      String prefix = null;
      String namespace = null;

      prefix = parentQName.getPrefix();
      namespace = parentQName.getNamespaceURI();
      writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

      if (serializeType) {

        String namespacePrefix =
            registerPrefix(xmlWriter, "http://localhost/services/HrmService");
        if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              namespacePrefix + ":SynHrmResourceResponse",
              xmlWriter);
        } else {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              "SynHrmResourceResponse",
              xmlWriter);
        }
      }

      namespace = "http://localhost/services/HrmService";
      writeStartElement(null, namespace, "out", xmlWriter);

      if (localOut == null) {
        // write the nil attribute

        writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

      } else {

        xmlWriter.writeCharacters(localOut);
      }

      xmlWriter.writeEndElement();

      xmlWriter.writeEndElement();
    }

    private static String generatePrefix(String namespace) {
      if (namespace.equals("http://localhost/services/HrmService")) {
        return "ns2";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /** Utility method to write an element start tag. */
    private void writeStartElement(
        String prefix,
        String namespace,
        String localPart,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /** Util method to write an attribute with the ns prefix */
    private void writeAttribute(
        String prefix,
        String namespace,
        String attName,
        String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeAttribute(
        String namespace,
        String attName,
        String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
            registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeQNameAttribute(
        String namespace,
        String attName,
        javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      String attributeNamespace = qname.getNamespaceURI();
      String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }
    /** method to handle Qnames */
    private void writeQName(
        javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
              prefix
                  + ":"
                  + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
        javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to write any
        // namespace data after writing the charactor data
        StringBuffer stringToWrite = new StringBuffer();
        String namespaceURI = null;
        String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                  .append(prefix)
                  .append(":")
                  .append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /** Register a namespace prefix */
    private String registerPrefix(
        javax.xml.stream.XMLStreamWriter xmlWriter, String namespace)
        throws javax.xml.stream.XMLStreamException {
      String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /** Factory class that keeps the parse method */
    public static class Factory {
      private static org.apache.commons.logging.Log log =
          org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an element, the current
       * or next start element starts this object and any intervening reader events are ignorable If
       * this object is not an element, it is a complex type and the reader is at the event just
       * after the outer start element Postcondition: If this object is an element, the reader is
       * positioned at its end element If this object is a complex type, the reader is positioned at
       * the end element of its outer element
       */
      public static SynHrmResourceResponse parse(javax.xml.stream.XMLStreamReader reader)
          throws Exception {
        SynHrmResourceResponse object = new SynHrmResourceResponse();

        int event;
        javax.xml.namespace.QName currentQName = null;
        String nillableValue = null;
        String prefix = "";
        String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          currentQName = reader.getName();

          if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type")
              != null) {
            String fullTypeName =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
            if (fullTypeName != null) {
              String nsPrefix = null;
              if (fullTypeName.indexOf(":") > -1) {
                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
              }
              nsPrefix = nsPrefix == null ? "" : nsPrefix;

              String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

              if (!"SynHrmResourceResponse".equals(type)) {
                // find namespace for the prefix
                String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                return (SynHrmResourceResponse) ExtensionMapper.getTypeObject(nsUri, type, reader);
              }
            }
          }

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          reader.next();

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://localhost/services/HrmService", "out")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.setOut(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {
            // 1 - A start element we are not expecting indicates an invalid parameter was passed
            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());
          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement())
            // 2 - A start element we are not expecting indicates a trailing invalid property

            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  public static class SynSubCompanyResponse implements org.apache.axis2.databinding.ADBBean {

    public static final javax.xml.namespace.QName MY_QNAME =
        new javax.xml.namespace.QName(
            "http://localhost/services/HrmService", "SynSubCompanyResponse", "ns2");

    /** field for Out */
    protected String localOut;

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getOut() {
      return localOut;
    }

    /**
     * Auto generated setter method
     *
     * @param param Out
     */
    public void setOut(String param) {

      this.localOut = param;
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
        final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
        throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
          new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME));
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter,
        boolean serializeType)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      String prefix = null;
      String namespace = null;

      prefix = parentQName.getPrefix();
      namespace = parentQName.getNamespaceURI();
      writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

      if (serializeType) {

        String namespacePrefix =
            registerPrefix(xmlWriter, "http://localhost/services/HrmService");
        if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              namespacePrefix + ":SynSubCompanyResponse",
              xmlWriter);
        } else {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              "SynSubCompanyResponse",
              xmlWriter);
        }
      }

      namespace = "http://localhost/services/HrmService";
      writeStartElement(null, namespace, "out", xmlWriter);

      if (localOut == null) {
        // write the nil attribute

        writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

      } else {

        xmlWriter.writeCharacters(localOut);
      }

      xmlWriter.writeEndElement();

      xmlWriter.writeEndElement();
    }

    private static String generatePrefix(String namespace) {
      if (namespace.equals("http://localhost/services/HrmService")) {
        return "ns2";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /** Utility method to write an element start tag. */
    private void writeStartElement(
        String prefix,
        String namespace,
        String localPart,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /** Util method to write an attribute with the ns prefix */
    private void writeAttribute(
        String prefix,
        String namespace,
        String attName,
        String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeAttribute(
        String namespace,
        String attName,
        String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
            registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeQNameAttribute(
        String namespace,
        String attName,
        javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      String attributeNamespace = qname.getNamespaceURI();
      String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }
    /** method to handle Qnames */
    private void writeQName(
        javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
              prefix
                  + ":"
                  + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
        javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to write any
        // namespace data after writing the charactor data
        StringBuffer stringToWrite = new StringBuffer();
        String namespaceURI = null;
        String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                  .append(prefix)
                  .append(":")
                  .append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /** Register a namespace prefix */
    private String registerPrefix(
        javax.xml.stream.XMLStreamWriter xmlWriter, String namespace)
        throws javax.xml.stream.XMLStreamException {
      String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /** Factory class that keeps the parse method */
    public static class Factory {
      private static org.apache.commons.logging.Log log =
          org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an element, the current
       * or next start element starts this object and any intervening reader events are ignorable If
       * this object is not an element, it is a complex type and the reader is at the event just
       * after the outer start element Postcondition: If this object is an element, the reader is
       * positioned at its end element If this object is a complex type, the reader is positioned at
       * the end element of its outer element
       */
      public static SynSubCompanyResponse parse(javax.xml.stream.XMLStreamReader reader)
          throws Exception {
        SynSubCompanyResponse object = new SynSubCompanyResponse();

        int event;
        javax.xml.namespace.QName currentQName = null;
        String nillableValue = null;
        String prefix = "";
        String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          currentQName = reader.getName();

          if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type")
              != null) {
            String fullTypeName =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
            if (fullTypeName != null) {
              String nsPrefix = null;
              if (fullTypeName.indexOf(":") > -1) {
                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
              }
              nsPrefix = nsPrefix == null ? "" : nsPrefix;

              String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

              if (!"SynSubCompanyResponse".equals(type)) {
                // find namespace for the prefix
                String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                return (SynSubCompanyResponse) ExtensionMapper.getTypeObject(nsUri, type, reader);
              }
            }
          }

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          reader.next();

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://localhost/services/HrmService", "out")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.setOut(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {
            // 1 - A start element we are not expecting indicates an invalid parameter was passed
            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());
          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement())
            // 2 - A start element we are not expecting indicates a trailing invalid property

            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  public static class SynDepartment implements org.apache.axis2.databinding.ADBBean {

    public static final javax.xml.namespace.QName MY_QNAME =
        new javax.xml.namespace.QName(
            "http://localhost/services/HrmService", "SynDepartment", "ns2");

    /** field for In0 */
    protected String localIn0;

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getIn0() {
      return localIn0;
    }

    /**
     * Auto generated setter method
     *
     * @param param In0
     */
    public void setIn0(String param) {

      this.localIn0 = param;
    }

    /** field for In1 */
    protected String localIn1;

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getIn1() {
      return localIn1;
    }

    /**
     * Auto generated setter method
     *
     * @param param In1
     */
    public void setIn1(String param) {

      this.localIn1 = param;
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
        final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
        throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
          new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME));
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter,
        boolean serializeType)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      String prefix = null;
      String namespace = null;

      prefix = parentQName.getPrefix();
      namespace = parentQName.getNamespaceURI();
      writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

      if (serializeType) {

        String namespacePrefix =
            registerPrefix(xmlWriter, "http://localhost/services/HrmService");
        if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              namespacePrefix + ":SynDepartment",
              xmlWriter);
        } else {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              "SynDepartment",
              xmlWriter);
        }
      }

      namespace = "http://localhost/services/HrmService";
      writeStartElement(null, namespace, "in0", xmlWriter);

      if (localIn0 == null) {
        // write the nil attribute

        writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

      } else {

        xmlWriter.writeCharacters(localIn0);
      }

      xmlWriter.writeEndElement();

      namespace = "http://localhost/services/HrmService";
      writeStartElement(null, namespace, "in1", xmlWriter);

      if (localIn1 == null) {
        // write the nil attribute

        writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

      } else {

        xmlWriter.writeCharacters(localIn1);
      }

      xmlWriter.writeEndElement();

      xmlWriter.writeEndElement();
    }

    private static String generatePrefix(String namespace) {
      if (namespace.equals("http://localhost/services/HrmService")) {
        return "ns2";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /** Utility method to write an element start tag. */
    private void writeStartElement(
        String prefix,
        String namespace,
        String localPart,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /** Util method to write an attribute with the ns prefix */
    private void writeAttribute(
        String prefix,
        String namespace,
        String attName,
        String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeAttribute(
        String namespace,
        String attName,
        String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
            registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeQNameAttribute(
        String namespace,
        String attName,
        javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      String attributeNamespace = qname.getNamespaceURI();
      String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }
    /** method to handle Qnames */
    private void writeQName(
        javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
              prefix
                  + ":"
                  + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
        javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to write any
        // namespace data after writing the charactor data
        StringBuffer stringToWrite = new StringBuffer();
        String namespaceURI = null;
        String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                  .append(prefix)
                  .append(":")
                  .append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /** Register a namespace prefix */
    private String registerPrefix(
        javax.xml.stream.XMLStreamWriter xmlWriter, String namespace)
        throws javax.xml.stream.XMLStreamException {
      String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /** Factory class that keeps the parse method */
    public static class Factory {
      private static org.apache.commons.logging.Log log =
          org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an element, the current
       * or next start element starts this object and any intervening reader events are ignorable If
       * this object is not an element, it is a complex type and the reader is at the event just
       * after the outer start element Postcondition: If this object is an element, the reader is
       * positioned at its end element If this object is a complex type, the reader is positioned at
       * the end element of its outer element
       */
      public static SynDepartment parse(javax.xml.stream.XMLStreamReader reader)
          throws Exception {
        SynDepartment object = new SynDepartment();

        int event;
        javax.xml.namespace.QName currentQName = null;
        String nillableValue = null;
        String prefix = "";
        String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          currentQName = reader.getName();

          if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type")
              != null) {
            String fullTypeName =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
            if (fullTypeName != null) {
              String nsPrefix = null;
              if (fullTypeName.indexOf(":") > -1) {
                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
              }
              nsPrefix = nsPrefix == null ? "" : nsPrefix;

              String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

              if (!"SynDepartment".equals(type)) {
                // find namespace for the prefix
                String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                return (SynDepartment) ExtensionMapper.getTypeObject(nsUri, type, reader);
              }
            }
          }

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          reader.next();

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://localhost/services/HrmService", "in0")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.setIn0(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {
            // 1 - A start element we are not expecting indicates an invalid parameter was passed
            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());
          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://localhost/services/HrmService", "in1")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.setIn1(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {
            // 1 - A start element we are not expecting indicates an invalid parameter was passed
            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());
          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement())
            // 2 - A start element we are not expecting indicates a trailing invalid property

            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  public static class ChangeUserPassword implements org.apache.axis2.databinding.ADBBean {

    public static final javax.xml.namespace.QName MY_QNAME =
        new javax.xml.namespace.QName(
            "http://localhost/services/HrmService", "changeUserPassword", "ns2");

    /** field for In0 */
    protected String localIn0;

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getIn0() {
      return localIn0;
    }

    /**
     * Auto generated setter method
     *
     * @param param In0
     */
    public void setIn0(String param) {

      this.localIn0 = param;
    }

    /** field for In1 */
    protected String localIn1;

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getIn1() {
      return localIn1;
    }

    /**
     * Auto generated setter method
     *
     * @param param In1
     */
    public void setIn1(String param) {

      this.localIn1 = param;
    }

    /** field for In2 */
    protected String localIn2;

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getIn2() {
      return localIn2;
    }

    /**
     * Auto generated setter method
     *
     * @param param In2
     */
    public void setIn2(String param) {

      this.localIn2 = param;
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
        final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
        throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
          new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME));
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter,
        boolean serializeType)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      String prefix = null;
      String namespace = null;

      prefix = parentQName.getPrefix();
      namespace = parentQName.getNamespaceURI();
      writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

      if (serializeType) {

        String namespacePrefix =
            registerPrefix(xmlWriter, "http://localhost/services/HrmService");
        if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              namespacePrefix + ":changeUserPassword",
              xmlWriter);
        } else {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              "changeUserPassword",
              xmlWriter);
        }
      }

      namespace = "http://localhost/services/HrmService";
      writeStartElement(null, namespace, "in0", xmlWriter);

      if (localIn0 == null) {
        // write the nil attribute

        writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

      } else {

        xmlWriter.writeCharacters(localIn0);
      }

      xmlWriter.writeEndElement();

      namespace = "http://localhost/services/HrmService";
      writeStartElement(null, namespace, "in1", xmlWriter);

      if (localIn1 == null) {
        // write the nil attribute

        writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

      } else {

        xmlWriter.writeCharacters(localIn1);
      }

      xmlWriter.writeEndElement();

      namespace = "http://localhost/services/HrmService";
      writeStartElement(null, namespace, "in2", xmlWriter);

      if (localIn2 == null) {
        // write the nil attribute

        writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

      } else {

        xmlWriter.writeCharacters(localIn2);
      }

      xmlWriter.writeEndElement();

      xmlWriter.writeEndElement();
    }

    private static String generatePrefix(String namespace) {
      if (namespace.equals("http://localhost/services/HrmService")) {
        return "ns2";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /** Utility method to write an element start tag. */
    private void writeStartElement(
        String prefix,
        String namespace,
        String localPart,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /** Util method to write an attribute with the ns prefix */
    private void writeAttribute(
        String prefix,
        String namespace,
        String attName,
        String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeAttribute(
        String namespace,
        String attName,
        String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
            registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeQNameAttribute(
        String namespace,
        String attName,
        javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      String attributeNamespace = qname.getNamespaceURI();
      String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }
    /** method to handle Qnames */
    private void writeQName(
        javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
              prefix
                  + ":"
                  + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
        javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to write any
        // namespace data after writing the charactor data
        StringBuffer stringToWrite = new StringBuffer();
        String namespaceURI = null;
        String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                  .append(prefix)
                  .append(":")
                  .append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /** Register a namespace prefix */
    private String registerPrefix(
        javax.xml.stream.XMLStreamWriter xmlWriter, String namespace)
        throws javax.xml.stream.XMLStreamException {
      String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /** Factory class that keeps the parse method */
    public static class Factory {
      private static org.apache.commons.logging.Log log =
          org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an element, the current
       * or next start element starts this object and any intervening reader events are ignorable If
       * this object is not an element, it is a complex type and the reader is at the event just
       * after the outer start element Postcondition: If this object is an element, the reader is
       * positioned at its end element If this object is a complex type, the reader is positioned at
       * the end element of its outer element
       */
      public static ChangeUserPassword parse(javax.xml.stream.XMLStreamReader reader)
          throws Exception {
        ChangeUserPassword object = new ChangeUserPassword();

        int event;
        javax.xml.namespace.QName currentQName = null;
        String nillableValue = null;
        String prefix = "";
        String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          currentQName = reader.getName();

          if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type")
              != null) {
            String fullTypeName =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
            if (fullTypeName != null) {
              String nsPrefix = null;
              if (fullTypeName.indexOf(":") > -1) {
                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
              }
              nsPrefix = nsPrefix == null ? "" : nsPrefix;

              String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

              if (!"changeUserPassword".equals(type)) {
                // find namespace for the prefix
                String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                return (ChangeUserPassword) ExtensionMapper.getTypeObject(nsUri, type, reader);
              }
            }
          }

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          reader.next();

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://localhost/services/HrmService", "in0")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.setIn0(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {
            // 1 - A start element we are not expecting indicates an invalid parameter was passed
            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());
          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://localhost/services/HrmService", "in1")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.setIn1(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {
            // 1 - A start element we are not expecting indicates an invalid parameter was passed
            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());
          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://localhost/services/HrmService", "in2")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.setIn2(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {
            // 1 - A start element we are not expecting indicates an invalid parameter was passed
            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());
          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement())
            // 2 - A start element we are not expecting indicates a trailing invalid property

            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  public static class SubCompanyBean implements org.apache.axis2.databinding.ADBBean {
    /* This type was generated from the piece of schema that had
    name = SubCompanyBean
    Namespace URI = http://webservice.hrm.weaver
    Namespace Prefix = ns1
    */

    /** field for _canceled */
    protected String local_canceled;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean local_canceledTracker = false;

    public boolean is_canceledSpecified() {
      return local_canceledTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String get_canceled() {
      return local_canceled;
    }

    /**
     * Auto generated setter method
     *
     * @param param _canceled
     */
    public void set_canceled(String param) {
      local_canceledTracker = true;

      this.local_canceled = param;
    }

    /** field for _code */
    protected String local_code;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean local_codeTracker = false;

    public boolean is_codeSpecified() {
      return local_codeTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String get_code() {
      return local_code;
    }

    /**
     * Auto generated setter method
     *
     * @param param _code
     */
    public void set_code(String param) {
      local_codeTracker = true;

      this.local_code = param;
    }

    /** field for _fullname */
    protected String local_fullname;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean local_fullnameTracker = false;

    public boolean is_fullnameSpecified() {
      return local_fullnameTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String get_fullname() {
      return local_fullname;
    }

    /**
     * Auto generated setter method
     *
     * @param param _fullname
     */
    public void set_fullname(String param) {
      local_fullnameTracker = true;

      this.local_fullname = param;
    }

    /** field for _shortname */
    protected String local_shortname;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean local_shortnameTracker = false;

    public boolean is_shortnameSpecified() {
      return local_shortnameTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String get_shortname() {
      return local_shortname;
    }

    /**
     * Auto generated setter method
     *
     * @param param _shortname
     */
    public void set_shortname(String param) {
      local_shortnameTracker = true;

      this.local_shortname = param;
    }

    /** field for _showorder */
    protected String local_showorder;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean local_showorderTracker = false;

    public boolean is_showorderSpecified() {
      return local_showorderTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String get_showorder() {
      return local_showorder;
    }

    /**
     * Auto generated setter method
     *
     * @param param _showorder
     */
    public void set_showorder(String param) {
      local_showorderTracker = true;

      this.local_showorder = param;
    }

    /** field for _subcompanyid */
    protected String local_subcompanyid;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean local_subcompanyidTracker = false;

    public boolean is_subcompanyidSpecified() {
      return local_subcompanyidTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String get_subcompanyid() {
      return local_subcompanyid;
    }

    /**
     * Auto generated setter method
     *
     * @param param _subcompanyid
     */
    public void set_subcompanyid(String param) {
      local_subcompanyidTracker = true;

      this.local_subcompanyid = param;
    }

    /** field for _supsubcompanyid */
    protected String local_supsubcompanyid;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean local_supsubcompanyidTracker = false;

    public boolean is_supsubcompanyidSpecified() {
      return local_supsubcompanyidTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String get_supsubcompanyid() {
      return local_supsubcompanyid;
    }

    /**
     * Auto generated setter method
     *
     * @param param _supsubcompanyid
     */
    public void set_supsubcompanyid(String param) {
      local_supsubcompanyidTracker = true;

      this.local_supsubcompanyid = param;
    }

    /** field for _website */
    protected String local_website;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean local_websiteTracker = false;

    public boolean is_websiteSpecified() {
      return local_websiteTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String get_website() {
      return local_website;
    }

    /**
     * Auto generated setter method
     *
     * @param param _website
     */
    public void set_website(String param) {
      local_websiteTracker = true;

      this.local_website = param;
    }

    /** field for Action */
    protected String localAction;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localActionTracker = false;

    public boolean isActionSpecified() {
      return localActionTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getAction() {
      return localAction;
    }

    /**
     * Auto generated setter method
     *
     * @param param Action
     */
    public void setAction(String param) {
      localActionTracker = true;

      this.localAction = param;
    }

    /** field for LastChangdate */
    protected String localLastChangdate;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localLastChangdateTracker = false;

    public boolean isLastChangdateSpecified() {
      return localLastChangdateTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getLastChangdate() {
      return localLastChangdate;
    }

    /**
     * Auto generated setter method
     *
     * @param param LastChangdate
     */
    public void setLastChangdate(String param) {
      localLastChangdateTracker = true;

      this.localLastChangdate = param;
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
        final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
        throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
          new org.apache.axis2.databinding.ADBDataSource(this, parentQName));
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter,
        boolean serializeType)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      String prefix = null;
      String namespace = null;

      prefix = parentQName.getPrefix();
      namespace = parentQName.getNamespaceURI();
      writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

      if (serializeType) {

        String namespacePrefix =
            registerPrefix(xmlWriter, "http://webservice.hrm.weaver");
        if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              namespacePrefix + ":SubCompanyBean",
              xmlWriter);
        } else {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              "SubCompanyBean",
              xmlWriter);
        }
      }
      if (local_canceledTracker) {
        namespace = "http://webservice.hrm.weaver";
        writeStartElement(null, namespace, "_canceled", xmlWriter);

        if (local_canceled == null) {
          // write the nil attribute

          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

        } else {

          xmlWriter.writeCharacters(local_canceled);
        }

        xmlWriter.writeEndElement();
      }
      if (local_codeTracker) {
        namespace = "http://webservice.hrm.weaver";
        writeStartElement(null, namespace, "_code", xmlWriter);

        if (local_code == null) {
          // write the nil attribute

          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

        } else {

          xmlWriter.writeCharacters(local_code);
        }

        xmlWriter.writeEndElement();
      }
      if (local_fullnameTracker) {
        namespace = "http://webservice.hrm.weaver";
        writeStartElement(null, namespace, "_fullname", xmlWriter);

        if (local_fullname == null) {
          // write the nil attribute

          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

        } else {

          xmlWriter.writeCharacters(local_fullname);
        }

        xmlWriter.writeEndElement();
      }
      if (local_shortnameTracker) {
        namespace = "http://webservice.hrm.weaver";
        writeStartElement(null, namespace, "_shortname", xmlWriter);

        if (local_shortname == null) {
          // write the nil attribute

          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

        } else {

          xmlWriter.writeCharacters(local_shortname);
        }

        xmlWriter.writeEndElement();
      }
      if (local_showorderTracker) {
        namespace = "http://webservice.hrm.weaver";
        writeStartElement(null, namespace, "_showorder", xmlWriter);

        if (local_showorder == null) {
          // write the nil attribute

          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

        } else {

          xmlWriter.writeCharacters(local_showorder);
        }

        xmlWriter.writeEndElement();
      }
      if (local_subcompanyidTracker) {
        namespace = "http://webservice.hrm.weaver";
        writeStartElement(null, namespace, "_subcompanyid", xmlWriter);

        if (local_subcompanyid == null) {
          // write the nil attribute

          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

        } else {

          xmlWriter.writeCharacters(local_subcompanyid);
        }

        xmlWriter.writeEndElement();
      }
      if (local_supsubcompanyidTracker) {
        namespace = "http://webservice.hrm.weaver";
        writeStartElement(null, namespace, "_supsubcompanyid", xmlWriter);

        if (local_supsubcompanyid == null) {
          // write the nil attribute

          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

        } else {

          xmlWriter.writeCharacters(local_supsubcompanyid);
        }

        xmlWriter.writeEndElement();
      }
      if (local_websiteTracker) {
        namespace = "http://webservice.hrm.weaver";
        writeStartElement(null, namespace, "_website", xmlWriter);

        if (local_website == null) {
          // write the nil attribute

          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

        } else {

          xmlWriter.writeCharacters(local_website);
        }

        xmlWriter.writeEndElement();
      }
      if (localActionTracker) {
        namespace = "http://webservice.hrm.weaver";
        writeStartElement(null, namespace, "action", xmlWriter);

        if (localAction == null) {
          // write the nil attribute

          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

        } else {

          xmlWriter.writeCharacters(localAction);
        }

        xmlWriter.writeEndElement();
      }
      if (localLastChangdateTracker) {
        namespace = "http://webservice.hrm.weaver";
        writeStartElement(null, namespace, "lastChangdate", xmlWriter);

        if (localLastChangdate == null) {
          // write the nil attribute

          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

        } else {

          xmlWriter.writeCharacters(localLastChangdate);
        }

        xmlWriter.writeEndElement();
      }
      xmlWriter.writeEndElement();
    }

    private static String generatePrefix(String namespace) {
      if (namespace.equals("http://webservice.hrm.weaver")) {
        return "ns1";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /** Utility method to write an element start tag. */
    private void writeStartElement(
        String prefix,
        String namespace,
        String localPart,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /** Util method to write an attribute with the ns prefix */
    private void writeAttribute(
        String prefix,
        String namespace,
        String attName,
        String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeAttribute(
        String namespace,
        String attName,
        String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
            registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeQNameAttribute(
        String namespace,
        String attName,
        javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      String attributeNamespace = qname.getNamespaceURI();
      String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }
    /** method to handle Qnames */
    private void writeQName(
        javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
              prefix
                  + ":"
                  + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
        javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to write any
        // namespace data after writing the charactor data
        StringBuffer stringToWrite = new StringBuffer();
        String namespaceURI = null;
        String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                  .append(prefix)
                  .append(":")
                  .append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /** Register a namespace prefix */
    private String registerPrefix(
        javax.xml.stream.XMLStreamWriter xmlWriter, String namespace)
        throws javax.xml.stream.XMLStreamException {
      String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /** Factory class that keeps the parse method */
    public static class Factory {
      private static org.apache.commons.logging.Log log =
          org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an element, the current
       * or next start element starts this object and any intervening reader events are ignorable If
       * this object is not an element, it is a complex type and the reader is at the event just
       * after the outer start element Postcondition: If this object is an element, the reader is
       * positioned at its end element If this object is a complex type, the reader is positioned at
       * the end element of its outer element
       */
      public static SubCompanyBean parse(javax.xml.stream.XMLStreamReader reader)
          throws Exception {
        SubCompanyBean object = new SubCompanyBean();

        int event;
        javax.xml.namespace.QName currentQName = null;
        String nillableValue = null;
        String prefix = "";
        String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          currentQName = reader.getName();

          if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type")
              != null) {
            String fullTypeName =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
            if (fullTypeName != null) {
              String nsPrefix = null;
              if (fullTypeName.indexOf(":") > -1) {
                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
              }
              nsPrefix = nsPrefix == null ? "" : nsPrefix;

              String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

              if (!"SubCompanyBean".equals(type)) {
                // find namespace for the prefix
                String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                return (SubCompanyBean) ExtensionMapper.getTypeObject(nsUri, type, reader);
              }
            }
          }

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          reader.next();

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://webservice.hrm.weaver", "_canceled")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.set_canceled(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://webservice.hrm.weaver", "_code")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.set_code(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://webservice.hrm.weaver", "_fullname")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.set_fullname(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://webservice.hrm.weaver", "_shortname")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.set_shortname(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://webservice.hrm.weaver", "_showorder")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.set_showorder(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://webservice.hrm.weaver", "_subcompanyid")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.set_subcompanyid(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://webservice.hrm.weaver", "_supsubcompanyid")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.set_supsubcompanyid(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://webservice.hrm.weaver", "_website")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.set_website(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://webservice.hrm.weaver", "action")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.setAction(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://webservice.hrm.weaver", "lastChangdate")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.setLastChangdate(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement())
            // 2 - A start element we are not expecting indicates a trailing invalid property

            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  public static class GetHrmDepartmentInfo implements org.apache.axis2.databinding.ADBBean {

    public static final javax.xml.namespace.QName MY_QNAME =
        new javax.xml.namespace.QName(
            "http://localhost/services/HrmService", "getHrmDepartmentInfo", "ns2");

    /** field for In0 */
    protected String localIn0;

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getIn0() {
      return localIn0;
    }

    /**
     * Auto generated setter method
     *
     * @param param In0
     */
    public void setIn0(String param) {

      this.localIn0 = param;
    }

    /** field for In1 */
    protected String localIn1;

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getIn1() {
      return localIn1;
    }

    /**
     * Auto generated setter method
     *
     * @param param In1
     */
    public void setIn1(String param) {

      this.localIn1 = param;
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
        final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
        throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
          new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME));
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter,
        boolean serializeType)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      String prefix = null;
      String namespace = null;

      prefix = parentQName.getPrefix();
      namespace = parentQName.getNamespaceURI();
      writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

      if (serializeType) {

        String namespacePrefix =
            registerPrefix(xmlWriter, "http://localhost/services/HrmService");
        if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              namespacePrefix + ":getHrmDepartmentInfo",
              xmlWriter);
        } else {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              "getHrmDepartmentInfo",
              xmlWriter);
        }
      }

      namespace = "http://localhost/services/HrmService";
      writeStartElement(null, namespace, "in0", xmlWriter);

      if (localIn0 == null) {
        // write the nil attribute

        writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

      } else {

        xmlWriter.writeCharacters(localIn0);
      }

      xmlWriter.writeEndElement();

      namespace = "http://localhost/services/HrmService";
      writeStartElement(null, namespace, "in1", xmlWriter);

      if (localIn1 == null) {
        // write the nil attribute

        writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

      } else {

        xmlWriter.writeCharacters(localIn1);
      }

      xmlWriter.writeEndElement();

      xmlWriter.writeEndElement();
    }

    private static String generatePrefix(String namespace) {
      if (namespace.equals("http://localhost/services/HrmService")) {
        return "ns2";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /** Utility method to write an element start tag. */
    private void writeStartElement(
        String prefix,
        String namespace,
        String localPart,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /** Util method to write an attribute with the ns prefix */
    private void writeAttribute(
        String prefix,
        String namespace,
        String attName,
        String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeAttribute(
        String namespace,
        String attName,
        String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
            registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeQNameAttribute(
        String namespace,
        String attName,
        javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      String attributeNamespace = qname.getNamespaceURI();
      String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }
    /** method to handle Qnames */
    private void writeQName(
        javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
              prefix
                  + ":"
                  + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
        javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to write any
        // namespace data after writing the charactor data
        StringBuffer stringToWrite = new StringBuffer();
        String namespaceURI = null;
        String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                  .append(prefix)
                  .append(":")
                  .append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /** Register a namespace prefix */
    private String registerPrefix(
        javax.xml.stream.XMLStreamWriter xmlWriter, String namespace)
        throws javax.xml.stream.XMLStreamException {
      String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /** Factory class that keeps the parse method */
    public static class Factory {
      private static org.apache.commons.logging.Log log =
          org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an element, the current
       * or next start element starts this object and any intervening reader events are ignorable If
       * this object is not an element, it is a complex type and the reader is at the event just
       * after the outer start element Postcondition: If this object is an element, the reader is
       * positioned at its end element If this object is a complex type, the reader is positioned at
       * the end element of its outer element
       */
      public static GetHrmDepartmentInfo parse(javax.xml.stream.XMLStreamReader reader)
          throws Exception {
        GetHrmDepartmentInfo object = new GetHrmDepartmentInfo();

        int event;
        javax.xml.namespace.QName currentQName = null;
        String nillableValue = null;
        String prefix = "";
        String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          currentQName = reader.getName();

          if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type")
              != null) {
            String fullTypeName =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
            if (fullTypeName != null) {
              String nsPrefix = null;
              if (fullTypeName.indexOf(":") > -1) {
                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
              }
              nsPrefix = nsPrefix == null ? "" : nsPrefix;

              String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

              if (!"getHrmDepartmentInfo".equals(type)) {
                // find namespace for the prefix
                String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                return (GetHrmDepartmentInfo) ExtensionMapper.getTypeObject(nsUri, type, reader);
              }
            }
          }

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          reader.next();

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://localhost/services/HrmService", "in0")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.setIn0(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {
            // 1 - A start element we are not expecting indicates an invalid parameter was passed
            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());
          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://localhost/services/HrmService", "in1")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.setIn1(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {
            // 1 - A start element we are not expecting indicates an invalid parameter was passed
            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());
          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement())
            // 2 - A start element we are not expecting indicates a trailing invalid property

            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  public static class GetHrmUserInfoXMLResponse implements org.apache.axis2.databinding.ADBBean {

    public static final javax.xml.namespace.QName MY_QNAME =
        new javax.xml.namespace.QName(
            "http://localhost/services/HrmService", "getHrmUserInfoXMLResponse", "ns2");

    /** field for Out */
    protected String localOut;

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getOut() {
      return localOut;
    }

    /**
     * Auto generated setter method
     *
     * @param param Out
     */
    public void setOut(String param) {

      this.localOut = param;
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
        final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
        throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
          new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME));
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter,
        boolean serializeType)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      String prefix = null;
      String namespace = null;

      prefix = parentQName.getPrefix();
      namespace = parentQName.getNamespaceURI();
      writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

      if (serializeType) {

        String namespacePrefix =
            registerPrefix(xmlWriter, "http://localhost/services/HrmService");
        if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              namespacePrefix + ":getHrmUserInfoXMLResponse",
              xmlWriter);
        } else {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              "getHrmUserInfoXMLResponse",
              xmlWriter);
        }
      }

      namespace = "http://localhost/services/HrmService";
      writeStartElement(null, namespace, "out", xmlWriter);

      if (localOut == null) {
        // write the nil attribute

        writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

      } else {

        xmlWriter.writeCharacters(localOut);
      }

      xmlWriter.writeEndElement();

      xmlWriter.writeEndElement();
    }

    private static String generatePrefix(String namespace) {
      if (namespace.equals("http://localhost/services/HrmService")) {
        return "ns2";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /** Utility method to write an element start tag. */
    private void writeStartElement(
        String prefix,
        String namespace,
        String localPart,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /** Util method to write an attribute with the ns prefix */
    private void writeAttribute(
        String prefix,
        String namespace,
        String attName,
        String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeAttribute(
        String namespace,
        String attName,
        String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
            registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeQNameAttribute(
        String namespace,
        String attName,
        javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      String attributeNamespace = qname.getNamespaceURI();
      String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }
    /** method to handle Qnames */
    private void writeQName(
        javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
              prefix
                  + ":"
                  + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
        javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to write any
        // namespace data after writing the charactor data
        StringBuffer stringToWrite = new StringBuffer();
        String namespaceURI = null;
        String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                  .append(prefix)
                  .append(":")
                  .append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /** Register a namespace prefix */
    private String registerPrefix(
        javax.xml.stream.XMLStreamWriter xmlWriter, String namespace)
        throws javax.xml.stream.XMLStreamException {
      String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /** Factory class that keeps the parse method */
    public static class Factory {
      private static org.apache.commons.logging.Log log =
          org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an element, the current
       * or next start element starts this object and any intervening reader events are ignorable If
       * this object is not an element, it is a complex type and the reader is at the event just
       * after the outer start element Postcondition: If this object is an element, the reader is
       * positioned at its end element If this object is a complex type, the reader is positioned at
       * the end element of its outer element
       */
      public static GetHrmUserInfoXMLResponse parse(javax.xml.stream.XMLStreamReader reader)
          throws Exception {
        GetHrmUserInfoXMLResponse object = new GetHrmUserInfoXMLResponse();

        int event;
        javax.xml.namespace.QName currentQName = null;
        String nillableValue = null;
        String prefix = "";
        String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          currentQName = reader.getName();

          if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type")
              != null) {
            String fullTypeName =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
            if (fullTypeName != null) {
              String nsPrefix = null;
              if (fullTypeName.indexOf(":") > -1) {
                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
              }
              nsPrefix = nsPrefix == null ? "" : nsPrefix;

              String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

              if (!"getHrmUserInfoXMLResponse".equals(type)) {
                // find namespace for the prefix
                String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                return (GetHrmUserInfoXMLResponse)
                    ExtensionMapper.getTypeObject(nsUri, type, reader);
              }
            }
          }

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          reader.next();

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://localhost/services/HrmService", "out")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.setOut(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {
            // 1 - A start element we are not expecting indicates an invalid parameter was passed
            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());
          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement())
            // 2 - A start element we are not expecting indicates a trailing invalid property

            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  public static class ExtensionMapper {

    public static Object getTypeObject(
        String namespaceURI,
        String typeName,
        javax.xml.stream.XMLStreamReader reader)
        throws Exception {

      if ("http://webservice.hrm.weaver".equals(namespaceURI)
          && "SubCompanyBean".equals(typeName)) {

        return SubCompanyBean.Factory.parse(reader);
      }

      if ("http://webservice.hrm.weaver".equals(namespaceURI)
          && "ArrayOfUserBean".equals(typeName)) {

        return ArrayOfUserBean.Factory.parse(reader);
      }

      if ("http://webservice.hrm.weaver".equals(namespaceURI)
          && "ArrayOfJobTitleBean".equals(typeName)) {

        return ArrayOfJobTitleBean.Factory.parse(reader);
      }

      if ("http://webservice.hrm.weaver".equals(namespaceURI) && "JobTitleBean".equals(typeName)) {

        return JobTitleBean.Factory.parse(reader);
      }

      if ("http://webservice.hrm.weaver".equals(namespaceURI) && "UserBean".equals(typeName)) {

        return UserBean.Factory.parse(reader);
      }

      if ("http://webservice.hrm.weaver".equals(namespaceURI)
          && "ArrayOfDepartmentBean".equals(typeName)) {

        return ArrayOfDepartmentBean.Factory.parse(reader);
      }

      if ("http://webservice.hrm.weaver".equals(namespaceURI)
          && "ArrayOfSubCompanyBean".equals(typeName)) {

        return ArrayOfSubCompanyBean.Factory.parse(reader);
      }

      if ("http://webservice.hrm.weaver".equals(namespaceURI)
          && "DepartmentBean".equals(typeName)) {

        return DepartmentBean.Factory.parse(reader);
      }

      throw new org.apache.axis2.databinding.ADBException(
          "Unsupported type " + namespaceURI + " " + typeName);
    }
  }

  public static class UserBean implements org.apache.axis2.databinding.ADBBean {
    /* This type was generated from the piece of schema that had
    name = UserBean
    Namespace URI = http://webservice.hrm.weaver
    Namespace Prefix = ns1
    */

    /** field for Accounttype */
    protected int localAccounttype;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localAccounttypeTracker = false;

    public boolean isAccounttypeSpecified() {
      return localAccounttypeTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return int
     */
    public int getAccounttype() {
      return localAccounttype;
    }

    /**
     * Auto generated setter method
     *
     * @param param Accounttype
     */
    public void setAccounttype(int param) {

      // setting primitive attribute tracker to true
      localAccounttypeTracker = param != Integer.MIN_VALUE;

      this.localAccounttype = param;
    }

    /** field for Assistantid */
    protected String localAssistantid;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localAssistantidTracker = false;

    public boolean isAssistantidSpecified() {
      return localAssistantidTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getAssistantid() {
      return localAssistantid;
    }

    /**
     * Auto generated setter method
     *
     * @param param Assistantid
     */
    public void setAssistantid(String param) {
      localAssistantidTracker = true;

      this.localAssistantid = param;
    }

    /** field for Bememberdate */
    protected String localBememberdate;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localBememberdateTracker = false;

    public boolean isBememberdateSpecified() {
      return localBememberdateTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getBememberdate() {
      return localBememberdate;
    }

    /**
     * Auto generated setter method
     *
     * @param param Bememberdate
     */
    public void setBememberdate(String param) {
      localBememberdateTracker = true;

      this.localBememberdate = param;
    }

    /** field for Bepartydate */
    protected String localBepartydate;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localBepartydateTracker = false;

    public boolean isBepartydateSpecified() {
      return localBepartydateTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getBepartydate() {
      return localBepartydate;
    }

    /**
     * Auto generated setter method
     *
     * @param param Bepartydate
     */
    public void setBepartydate(String param) {
      localBepartydateTracker = true;

      this.localBepartydate = param;
    }

    /** field for Birthday */
    protected String localBirthday;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localBirthdayTracker = false;

    public boolean isBirthdaySpecified() {
      return localBirthdayTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getBirthday() {
      return localBirthday;
    }

    /**
     * Auto generated setter method
     *
     * @param param Birthday
     */
    public void setBirthday(String param) {
      localBirthdayTracker = true;

      this.localBirthday = param;
    }

    /** field for Certificatenum */
    protected String localCertificatenum;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localCertificatenumTracker = false;

    public boolean isCertificatenumSpecified() {
      return localCertificatenumTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getCertificatenum() {
      return localCertificatenum;
    }

    /**
     * Auto generated setter method
     *
     * @param param Certificatenum
     */
    public void setCertificatenum(String param) {
      localCertificatenumTracker = true;

      this.localCertificatenum = param;
    }

    /** field for Createdate */
    protected String localCreatedate;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localCreatedateTracker = false;

    public boolean isCreatedateSpecified() {
      return localCreatedateTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getCreatedate() {
      return localCreatedate;
    }

    /**
     * Auto generated setter method
     *
     * @param param Createdate
     */
    public void setCreatedate(String param) {
      localCreatedateTracker = true;

      this.localCreatedate = param;
    }

    /** field for Degree */
    protected String localDegree;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localDegreeTracker = false;

    public boolean isDegreeSpecified() {
      return localDegreeTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getDegree() {
      return localDegree;
    }

    /**
     * Auto generated setter method
     *
     * @param param Degree
     */
    public void setDegree(String param) {
      localDegreeTracker = true;

      this.localDegree = param;
    }

    /** field for Departmentcode */
    protected String localDepartmentcode;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localDepartmentcodeTracker = false;

    public boolean isDepartmentcodeSpecified() {
      return localDepartmentcodeTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getDepartmentcode() {
      return localDepartmentcode;
    }

    /**
     * Auto generated setter method
     *
     * @param param Departmentcode
     */
    public void setDepartmentcode(String param) {
      localDepartmentcodeTracker = true;

      this.localDepartmentcode = param;
    }

    /** field for Departmentid */
    protected String localDepartmentid;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localDepartmentidTracker = false;

    public boolean isDepartmentidSpecified() {
      return localDepartmentidTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getDepartmentid() {
      return localDepartmentid;
    }

    /**
     * Auto generated setter method
     *
     * @param param Departmentid
     */
    public void setDepartmentid(String param) {
      localDepartmentidTracker = true;

      this.localDepartmentid = param;
    }

    /** field for Departmentname */
    protected String localDepartmentname;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localDepartmentnameTracker = false;

    public boolean isDepartmentnameSpecified() {
      return localDepartmentnameTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getDepartmentname() {
      return localDepartmentname;
    }

    /**
     * Auto generated setter method
     *
     * @param param Departmentname
     */
    public void setDepartmentname(String param) {
      localDepartmentnameTracker = true;

      this.localDepartmentname = param;
    }

    /** field for Dsporder */
    protected float localDsporder;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localDsporderTracker = false;

    public boolean isDsporderSpecified() {
      return localDsporderTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return float
     */
    public float getDsporder() {
      return localDsporder;
    }

    /**
     * Auto generated setter method
     *
     * @param param Dsporder
     */
    public void setDsporder(float param) {

      // setting primitive attribute tracker to true
      localDsporderTracker = !Float.isNaN(param);

      this.localDsporder = param;
    }

    /** field for Educationlevel */
    protected String localEducationlevel;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localEducationlevelTracker = false;

    public boolean isEducationlevelSpecified() {
      return localEducationlevelTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getEducationlevel() {
      return localEducationlevel;
    }

    /**
     * Auto generated setter method
     *
     * @param param Educationlevel
     */
    public void setEducationlevel(String param) {
      localEducationlevelTracker = true;

      this.localEducationlevel = param;
    }

    /** field for Email */
    protected String localEmail;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localEmailTracker = false;

    public boolean isEmailSpecified() {
      return localEmailTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getEmail() {
      return localEmail;
    }

    /**
     * Auto generated setter method
     *
     * @param param Email
     */
    public void setEmail(String param) {
      localEmailTracker = true;

      this.localEmail = param;
    }

    /** field for Enddate */
    protected String localEnddate;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localEnddateTracker = false;

    public boolean isEnddateSpecified() {
      return localEnddateTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getEnddate() {
      return localEnddate;
    }

    /**
     * Auto generated setter method
     *
     * @param param Enddate
     */
    public void setEnddate(String param) {
      localEnddateTracker = true;

      this.localEnddate = param;
    }

    /** field for Fax */
    protected String localFax;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localFaxTracker = false;

    public boolean isFaxSpecified() {
      return localFaxTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getFax() {
      return localFax;
    }

    /**
     * Auto generated setter method
     *
     * @param param Fax
     */
    public void setFax(String param) {
      localFaxTracker = true;

      this.localFax = param;
    }

    /** field for Folk */
    protected String localFolk;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localFolkTracker = false;

    public boolean isFolkSpecified() {
      return localFolkTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getFolk() {
      return localFolk;
    }

    /**
     * Auto generated setter method
     *
     * @param param Folk
     */
    public void setFolk(String param) {
      localFolkTracker = true;

      this.localFolk = param;
    }

    /** field for Healthinfo */
    protected String localHealthinfo;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localHealthinfoTracker = false;

    public boolean isHealthinfoSpecified() {
      return localHealthinfoTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getHealthinfo() {
      return localHealthinfo;
    }

    /**
     * Auto generated setter method
     *
     * @param param Healthinfo
     */
    public void setHealthinfo(String param) {
      localHealthinfoTracker = true;

      this.localHealthinfo = param;
    }

    /** field for Height */
    protected String localHeight;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localHeightTracker = false;

    public boolean isHeightSpecified() {
      return localHeightTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getHeight() {
      return localHeight;
    }

    /**
     * Auto generated setter method
     *
     * @param param Height
     */
    public void setHeight(String param) {
      localHeightTracker = true;

      this.localHeight = param;
    }

    /** field for Homeaddress */
    protected String localHomeaddress;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localHomeaddressTracker = false;

    public boolean isHomeaddressSpecified() {
      return localHomeaddressTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getHomeaddress() {
      return localHomeaddress;
    }

    /**
     * Auto generated setter method
     *
     * @param param Homeaddress
     */
    public void setHomeaddress(String param) {
      localHomeaddressTracker = true;

      this.localHomeaddress = param;
    }

    /** field for Islabouunion */
    protected String localIslabouunion;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localIslabouunionTracker = false;

    public boolean isIslabouunionSpecified() {
      return localIslabouunionTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getIslabouunion() {
      return localIslabouunion;
    }

    /**
     * Auto generated setter method
     *
     * @param param Islabouunion
     */
    public void setIslabouunion(String param) {
      localIslabouunionTracker = true;

      this.localIslabouunion = param;
    }

    /** field for Jobactivitydesc */
    protected String localJobactivitydesc;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localJobactivitydescTracker = false;

    public boolean isJobactivitydescSpecified() {
      return localJobactivitydescTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getJobactivitydesc() {
      return localJobactivitydesc;
    }

    /**
     * Auto generated setter method
     *
     * @param param Jobactivitydesc
     */
    public void setJobactivitydesc(String param) {
      localJobactivitydescTracker = true;

      this.localJobactivitydesc = param;
    }

    /** field for Jobactivityid */
    protected String localJobactivityid;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localJobactivityidTracker = false;

    public boolean isJobactivityidSpecified() {
      return localJobactivityidTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getJobactivityid() {
      return localJobactivityid;
    }

    /**
     * Auto generated setter method
     *
     * @param param Jobactivityid
     */
    public void setJobactivityid(String param) {
      localJobactivityidTracker = true;

      this.localJobactivityid = param;
    }

    /** field for Jobcall */
    protected String localJobcall;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localJobcallTracker = false;

    public boolean isJobcallSpecified() {
      return localJobcallTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getJobcall() {
      return localJobcall;
    }

    /**
     * Auto generated setter method
     *
     * @param param Jobcall
     */
    public void setJobcall(String param) {
      localJobcallTracker = true;

      this.localJobcall = param;
    }

    /** field for Jobgroupid */
    protected String localJobgroupid;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localJobgroupidTracker = false;

    public boolean isJobgroupidSpecified() {
      return localJobgroupidTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getJobgroupid() {
      return localJobgroupid;
    }

    /**
     * Auto generated setter method
     *
     * @param param Jobgroupid
     */
    public void setJobgroupid(String param) {
      localJobgroupidTracker = true;

      this.localJobgroupid = param;
    }

    /** field for Joblevel */
    protected String localJoblevel;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localJoblevelTracker = false;

    public boolean isJoblevelSpecified() {
      return localJoblevelTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getJoblevel() {
      return localJoblevel;
    }

    /**
     * Auto generated setter method
     *
     * @param param Joblevel
     */
    public void setJoblevel(String param) {
      localJoblevelTracker = true;

      this.localJoblevel = param;
    }

    /** field for Jobtitle */
    protected String localJobtitle;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localJobtitleTracker = false;

    public boolean isJobtitleSpecified() {
      return localJobtitleTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getJobtitle() {
      return localJobtitle;
    }

    /**
     * Auto generated setter method
     *
     * @param param Jobtitle
     */
    public void setJobtitle(String param) {
      localJobtitleTracker = true;

      this.localJobtitle = param;
    }

    /** field for LastChangdate */
    protected String localLastChangdate;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localLastChangdateTracker = false;

    public boolean isLastChangdateSpecified() {
      return localLastChangdateTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getLastChangdate() {
      return localLastChangdate;
    }

    /**
     * Auto generated setter method
     *
     * @param param LastChangdate
     */
    public void setLastChangdate(String param) {
      localLastChangdateTracker = true;

      this.localLastChangdate = param;
    }

    /** field for Lastname */
    protected String localLastname;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localLastnameTracker = false;

    public boolean isLastnameSpecified() {
      return localLastnameTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getLastname() {
      return localLastname;
    }

    /**
     * Auto generated setter method
     *
     * @param param Lastname
     */
    public void setLastname(String param) {
      localLastnameTracker = true;

      this.localLastname = param;
    }

    /** field for Locationid */
    protected String localLocationid;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localLocationidTracker = false;

    public boolean isLocationidSpecified() {
      return localLocationidTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getLocationid() {
      return localLocationid;
    }

    /**
     * Auto generated setter method
     *
     * @param param Locationid
     */
    public void setLocationid(String param) {
      localLocationidTracker = true;

      this.localLocationid = param;
    }

    /** field for Loginid */
    protected String localLoginid;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localLoginidTracker = false;

    public boolean isLoginidSpecified() {
      return localLoginidTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getLoginid() {
      return localLoginid;
    }

    /**
     * Auto generated setter method
     *
     * @param param Loginid
     */
    public void setLoginid(String param) {
      localLoginidTracker = true;

      this.localLoginid = param;
    }

    /** field for Managerid */
    protected String localManagerid;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localManageridTracker = false;

    public boolean isManageridSpecified() {
      return localManageridTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getManagerid() {
      return localManagerid;
    }

    /**
     * Auto generated setter method
     *
     * @param param Managerid
     */
    public void setManagerid(String param) {
      localManageridTracker = true;

      this.localManagerid = param;
    }

    /** field for Maritalstatus */
    protected String localMaritalstatus;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localMaritalstatusTracker = false;

    public boolean isMaritalstatusSpecified() {
      return localMaritalstatusTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getMaritalstatus() {
      return localMaritalstatus;
    }

    /**
     * Auto generated setter method
     *
     * @param param Maritalstatus
     */
    public void setMaritalstatus(String param) {
      localMaritalstatusTracker = true;

      this.localMaritalstatus = param;
    }

    /** field for Mobile */
    protected String localMobile;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localMobileTracker = false;

    public boolean isMobileSpecified() {
      return localMobileTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getMobile() {
      return localMobile;
    }

    /**
     * Auto generated setter method
     *
     * @param param Mobile
     */
    public void setMobile(String param) {
      localMobileTracker = true;

      this.localMobile = param;
    }

    /** field for Mobilecall */
    protected String localMobilecall;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localMobilecallTracker = false;

    public boolean isMobilecallSpecified() {
      return localMobilecallTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getMobilecall() {
      return localMobilecall;
    }

    /**
     * Auto generated setter method
     *
     * @param param Mobilecall
     */
    public void setMobilecall(String param) {
      localMobilecallTracker = true;

      this.localMobilecall = param;
    }

    /** field for Nativeplace */
    protected String localNativeplace;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localNativeplaceTracker = false;

    public boolean isNativeplaceSpecified() {
      return localNativeplaceTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getNativeplace() {
      return localNativeplace;
    }

    /**
     * Auto generated setter method
     *
     * @param param Nativeplace
     */
    public void setNativeplace(String param) {
      localNativeplaceTracker = true;

      this.localNativeplace = param;
    }

    /** field for Password */
    protected String localPassword;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPasswordTracker = false;

    public boolean isPasswordSpecified() {
      return localPasswordTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getPassword() {
      return localPassword;
    }

    /**
     * Auto generated setter method
     *
     * @param param Password
     */
    public void setPassword(String param) {
      localPasswordTracker = true;

      this.localPassword = param;
    }

    /** field for Policy */
    protected String localPolicy;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPolicyTracker = false;

    public boolean isPolicySpecified() {
      return localPolicyTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getPolicy() {
      return localPolicy;
    }

    /**
     * Auto generated setter method
     *
     * @param param Policy
     */
    public void setPolicy(String param) {
      localPolicyTracker = true;

      this.localPolicy = param;
    }

    /** field for Regresidentplace */
    protected String localRegresidentplace;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localRegresidentplaceTracker = false;

    public boolean isRegresidentplaceSpecified() {
      return localRegresidentplaceTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getRegresidentplace() {
      return localRegresidentplace;
    }

    /**
     * Auto generated setter method
     *
     * @param param Regresidentplace
     */
    public void setRegresidentplace(String param) {
      localRegresidentplaceTracker = true;

      this.localRegresidentplace = param;
    }

    /** field for Residentplace */
    protected String localResidentplace;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localResidentplaceTracker = false;

    public boolean isResidentplaceSpecified() {
      return localResidentplaceTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getResidentplace() {
      return localResidentplace;
    }

    /**
     * Auto generated setter method
     *
     * @param param Residentplace
     */
    public void setResidentplace(String param) {
      localResidentplaceTracker = true;

      this.localResidentplace = param;
    }

    /** field for Seclevel */
    protected String localSeclevel;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSeclevelTracker = false;

    public boolean isSeclevelSpecified() {
      return localSeclevelTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getSeclevel() {
      return localSeclevel;
    }

    /**
     * Auto generated setter method
     *
     * @param param Seclevel
     */
    public void setSeclevel(String param) {
      localSeclevelTracker = true;

      this.localSeclevel = param;
    }

    /** field for Sex */
    protected String localSex;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSexTracker = false;

    public boolean isSexSpecified() {
      return localSexTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getSex() {
      return localSex;
    }

    /**
     * Auto generated setter method
     *
     * @param param Sex
     */
    public void setSex(String param) {
      localSexTracker = true;

      this.localSex = param;
    }

    /** field for Startdate */
    protected String localStartdate;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localStartdateTracker = false;

    public boolean isStartdateSpecified() {
      return localStartdateTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getStartdate() {
      return localStartdate;
    }

    /**
     * Auto generated setter method
     *
     * @param param Startdate
     */
    public void setStartdate(String param) {
      localStartdateTracker = true;

      this.localStartdate = param;
    }

    /** field for Status */
    protected String localStatus;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localStatusTracker = false;

    public boolean isStatusSpecified() {
      return localStatusTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getStatus() {
      return localStatus;
    }

    /**
     * Auto generated setter method
     *
     * @param param Status
     */
    public void setStatus(String param) {
      localStatusTracker = true;

      this.localStatus = param;
    }

    /** field for Subcompanycode */
    protected String localSubcompanycode;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSubcompanycodeTracker = false;

    public boolean isSubcompanycodeSpecified() {
      return localSubcompanycodeTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getSubcompanycode() {
      return localSubcompanycode;
    }

    /**
     * Auto generated setter method
     *
     * @param param Subcompanycode
     */
    public void setSubcompanycode(String param) {
      localSubcompanycodeTracker = true;

      this.localSubcompanycode = param;
    }

    /** field for Subcompanyid1 */
    protected String localSubcompanyid1;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSubcompanyid1Tracker = false;

    public boolean isSubcompanyid1Specified() {
      return localSubcompanyid1Tracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getSubcompanyid1() {
      return localSubcompanyid1;
    }

    /**
     * Auto generated setter method
     *
     * @param param Subcompanyid1
     */
    public void setSubcompanyid1(String param) {
      localSubcompanyid1Tracker = true;

      this.localSubcompanyid1 = param;
    }

    /** field for Subcompanyname */
    protected String localSubcompanyname;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSubcompanynameTracker = false;

    public boolean isSubcompanynameSpecified() {
      return localSubcompanynameTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getSubcompanyname() {
      return localSubcompanyname;
    }

    /**
     * Auto generated setter method
     *
     * @param param Subcompanyname
     */
    public void setSubcompanyname(String param) {
      localSubcompanynameTracker = true;

      this.localSubcompanyname = param;
    }

    /** field for Systemlanguage */
    protected String localSystemlanguage;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSystemlanguageTracker = false;

    public boolean isSystemlanguageSpecified() {
      return localSystemlanguageTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getSystemlanguage() {
      return localSystemlanguage;
    }

    /**
     * Auto generated setter method
     *
     * @param param Systemlanguage
     */
    public void setSystemlanguage(String param) {
      localSystemlanguageTracker = true;

      this.localSystemlanguage = param;
    }

    /** field for Telephone */
    protected String localTelephone;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTelephoneTracker = false;

    public boolean isTelephoneSpecified() {
      return localTelephoneTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getTelephone() {
      return localTelephone;
    }

    /**
     * Auto generated setter method
     *
     * @param param Telephone
     */
    public void setTelephone(String param) {
      localTelephoneTracker = true;

      this.localTelephone = param;
    }

    /** field for Tempresidentnumber */
    protected String localTempresidentnumber;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localTempresidentnumberTracker = false;

    public boolean isTempresidentnumberSpecified() {
      return localTempresidentnumberTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getTempresidentnumber() {
      return localTempresidentnumber;
    }

    /**
     * Auto generated setter method
     *
     * @param param Tempresidentnumber
     */
    public void setTempresidentnumber(String param) {
      localTempresidentnumberTracker = true;

      this.localTempresidentnumber = param;
    }

    /** field for Userid */
    protected int localUserid;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localUseridTracker = false;

    public boolean isUseridSpecified() {
      return localUseridTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return int
     */
    public int getUserid() {
      return localUserid;
    }

    /**
     * Auto generated setter method
     *
     * @param param Userid
     */
    public void setUserid(int param) {

      // setting primitive attribute tracker to true
      localUseridTracker = param != Integer.MIN_VALUE;

      this.localUserid = param;
    }

    /** field for Weight */
    protected String localWeight;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localWeightTracker = false;

    public boolean isWeightSpecified() {
      return localWeightTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getWeight() {
      return localWeight;
    }

    /**
     * Auto generated setter method
     *
     * @param param Weight
     */
    public void setWeight(String param) {
      localWeightTracker = true;

      this.localWeight = param;
    }

    /** field for Workcode */
    protected String localWorkcode;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localWorkcodeTracker = false;

    public boolean isWorkcodeSpecified() {
      return localWorkcodeTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getWorkcode() {
      return localWorkcode;
    }

    /**
     * Auto generated setter method
     *
     * @param param Workcode
     */
    public void setWorkcode(String param) {
      localWorkcodeTracker = true;

      this.localWorkcode = param;
    }

    /** field for Workroom */
    protected String localWorkroom;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localWorkroomTracker = false;

    public boolean isWorkroomSpecified() {
      return localWorkroomTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getWorkroom() {
      return localWorkroom;
    }

    /**
     * Auto generated setter method
     *
     * @param param Workroom
     */
    public void setWorkroom(String param) {
      localWorkroomTracker = true;

      this.localWorkroom = param;
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
        final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
        throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
          new org.apache.axis2.databinding.ADBDataSource(this, parentQName));
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter,
        boolean serializeType)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      String prefix = null;
      String namespace = null;

      prefix = parentQName.getPrefix();
      namespace = parentQName.getNamespaceURI();
      writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

      if (serializeType) {

        String namespacePrefix =
            registerPrefix(xmlWriter, "http://webservice.hrm.weaver");
        if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              namespacePrefix + ":UserBean",
              xmlWriter);
        } else {
          writeAttribute(
              "xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "UserBean", xmlWriter);
        }
      }
      if (localAccounttypeTracker) {
        namespace = "http://webservice.hrm.weaver";
        writeStartElement(null, namespace, "accounttype", xmlWriter);

        if (localAccounttype == Integer.MIN_VALUE) {

          throw new org.apache.axis2.databinding.ADBException("accounttype cannot be null!!");

        } else {
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAccounttype));
        }

        xmlWriter.writeEndElement();
      }
      if (localAssistantidTracker) {
        namespace = "http://webservice.hrm.weaver";
        writeStartElement(null, namespace, "assistantid", xmlWriter);

        if (localAssistantid == null) {
          // write the nil attribute

          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

        } else {

          xmlWriter.writeCharacters(localAssistantid);
        }

        xmlWriter.writeEndElement();
      }
      if (localBememberdateTracker) {
        namespace = "http://webservice.hrm.weaver";
        writeStartElement(null, namespace, "bememberdate", xmlWriter);

        if (localBememberdate == null) {
          // write the nil attribute

          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

        } else {

          xmlWriter.writeCharacters(localBememberdate);
        }

        xmlWriter.writeEndElement();
      }
      if (localBepartydateTracker) {
        namespace = "http://webservice.hrm.weaver";
        writeStartElement(null, namespace, "bepartydate", xmlWriter);

        if (localBepartydate == null) {
          // write the nil attribute

          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

        } else {

          xmlWriter.writeCharacters(localBepartydate);
        }

        xmlWriter.writeEndElement();
      }
      if (localBirthdayTracker) {
        namespace = "http://webservice.hrm.weaver";
        writeStartElement(null, namespace, "birthday", xmlWriter);

        if (localBirthday == null) {
          // write the nil attribute

          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

        } else {

          xmlWriter.writeCharacters(localBirthday);
        }

        xmlWriter.writeEndElement();
      }
      if (localCertificatenumTracker) {
        namespace = "http://webservice.hrm.weaver";
        writeStartElement(null, namespace, "certificatenum", xmlWriter);

        if (localCertificatenum == null) {
          // write the nil attribute

          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

        } else {

          xmlWriter.writeCharacters(localCertificatenum);
        }

        xmlWriter.writeEndElement();
      }
      if (localCreatedateTracker) {
        namespace = "http://webservice.hrm.weaver";
        writeStartElement(null, namespace, "createdate", xmlWriter);

        if (localCreatedate == null) {
          // write the nil attribute

          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

        } else {

          xmlWriter.writeCharacters(localCreatedate);
        }

        xmlWriter.writeEndElement();
      }
      if (localDegreeTracker) {
        namespace = "http://webservice.hrm.weaver";
        writeStartElement(null, namespace, "degree", xmlWriter);

        if (localDegree == null) {
          // write the nil attribute

          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

        } else {

          xmlWriter.writeCharacters(localDegree);
        }

        xmlWriter.writeEndElement();
      }
      if (localDepartmentcodeTracker) {
        namespace = "http://webservice.hrm.weaver";
        writeStartElement(null, namespace, "departmentcode", xmlWriter);

        if (localDepartmentcode == null) {
          // write the nil attribute

          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

        } else {

          xmlWriter.writeCharacters(localDepartmentcode);
        }

        xmlWriter.writeEndElement();
      }
      if (localDepartmentidTracker) {
        namespace = "http://webservice.hrm.weaver";
        writeStartElement(null, namespace, "departmentid", xmlWriter);

        if (localDepartmentid == null) {
          // write the nil attribute

          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

        } else {

          xmlWriter.writeCharacters(localDepartmentid);
        }

        xmlWriter.writeEndElement();
      }
      if (localDepartmentnameTracker) {
        namespace = "http://webservice.hrm.weaver";
        writeStartElement(null, namespace, "departmentname", xmlWriter);

        if (localDepartmentname == null) {
          // write the nil attribute

          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

        } else {

          xmlWriter.writeCharacters(localDepartmentname);
        }

        xmlWriter.writeEndElement();
      }
      if (localDsporderTracker) {
        namespace = "http://webservice.hrm.weaver";
        writeStartElement(null, namespace, "dsporder", xmlWriter);

        if (Float.isNaN(localDsporder)) {

          throw new org.apache.axis2.databinding.ADBException("dsporder cannot be null!!");

        } else {
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localDsporder));
        }

        xmlWriter.writeEndElement();
      }
      if (localEducationlevelTracker) {
        namespace = "http://webservice.hrm.weaver";
        writeStartElement(null, namespace, "educationlevel", xmlWriter);

        if (localEducationlevel == null) {
          // write the nil attribute

          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

        } else {

          xmlWriter.writeCharacters(localEducationlevel);
        }

        xmlWriter.writeEndElement();
      }
      if (localEmailTracker) {
        namespace = "http://webservice.hrm.weaver";
        writeStartElement(null, namespace, "email", xmlWriter);

        if (localEmail == null) {
          // write the nil attribute

          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

        } else {

          xmlWriter.writeCharacters(localEmail);
        }

        xmlWriter.writeEndElement();
      }
      if (localEnddateTracker) {
        namespace = "http://webservice.hrm.weaver";
        writeStartElement(null, namespace, "enddate", xmlWriter);

        if (localEnddate == null) {
          // write the nil attribute

          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

        } else {

          xmlWriter.writeCharacters(localEnddate);
        }

        xmlWriter.writeEndElement();
      }
      if (localFaxTracker) {
        namespace = "http://webservice.hrm.weaver";
        writeStartElement(null, namespace, "fax", xmlWriter);

        if (localFax == null) {
          // write the nil attribute

          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

        } else {

          xmlWriter.writeCharacters(localFax);
        }

        xmlWriter.writeEndElement();
      }
      if (localFolkTracker) {
        namespace = "http://webservice.hrm.weaver";
        writeStartElement(null, namespace, "folk", xmlWriter);

        if (localFolk == null) {
          // write the nil attribute

          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

        } else {

          xmlWriter.writeCharacters(localFolk);
        }

        xmlWriter.writeEndElement();
      }
      if (localHealthinfoTracker) {
        namespace = "http://webservice.hrm.weaver";
        writeStartElement(null, namespace, "healthinfo", xmlWriter);

        if (localHealthinfo == null) {
          // write the nil attribute

          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

        } else {

          xmlWriter.writeCharacters(localHealthinfo);
        }

        xmlWriter.writeEndElement();
      }
      if (localHeightTracker) {
        namespace = "http://webservice.hrm.weaver";
        writeStartElement(null, namespace, "height", xmlWriter);

        if (localHeight == null) {
          // write the nil attribute

          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

        } else {

          xmlWriter.writeCharacters(localHeight);
        }

        xmlWriter.writeEndElement();
      }
      if (localHomeaddressTracker) {
        namespace = "http://webservice.hrm.weaver";
        writeStartElement(null, namespace, "homeaddress", xmlWriter);

        if (localHomeaddress == null) {
          // write the nil attribute

          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

        } else {

          xmlWriter.writeCharacters(localHomeaddress);
        }

        xmlWriter.writeEndElement();
      }
      if (localIslabouunionTracker) {
        namespace = "http://webservice.hrm.weaver";
        writeStartElement(null, namespace, "islabouunion", xmlWriter);

        if (localIslabouunion == null) {
          // write the nil attribute

          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

        } else {

          xmlWriter.writeCharacters(localIslabouunion);
        }

        xmlWriter.writeEndElement();
      }
      if (localJobactivitydescTracker) {
        namespace = "http://webservice.hrm.weaver";
        writeStartElement(null, namespace, "jobactivitydesc", xmlWriter);

        if (localJobactivitydesc == null) {
          // write the nil attribute

          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

        } else {

          xmlWriter.writeCharacters(localJobactivitydesc);
        }

        xmlWriter.writeEndElement();
      }
      if (localJobactivityidTracker) {
        namespace = "http://webservice.hrm.weaver";
        writeStartElement(null, namespace, "jobactivityid", xmlWriter);

        if (localJobactivityid == null) {
          // write the nil attribute

          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

        } else {

          xmlWriter.writeCharacters(localJobactivityid);
        }

        xmlWriter.writeEndElement();
      }
      if (localJobcallTracker) {
        namespace = "http://webservice.hrm.weaver";
        writeStartElement(null, namespace, "jobcall", xmlWriter);

        if (localJobcall == null) {
          // write the nil attribute

          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

        } else {

          xmlWriter.writeCharacters(localJobcall);
        }

        xmlWriter.writeEndElement();
      }
      if (localJobgroupidTracker) {
        namespace = "http://webservice.hrm.weaver";
        writeStartElement(null, namespace, "jobgroupid", xmlWriter);

        if (localJobgroupid == null) {
          // write the nil attribute

          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

        } else {

          xmlWriter.writeCharacters(localJobgroupid);
        }

        xmlWriter.writeEndElement();
      }
      if (localJoblevelTracker) {
        namespace = "http://webservice.hrm.weaver";
        writeStartElement(null, namespace, "joblevel", xmlWriter);

        if (localJoblevel == null) {
          // write the nil attribute

          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

        } else {

          xmlWriter.writeCharacters(localJoblevel);
        }

        xmlWriter.writeEndElement();
      }
      if (localJobtitleTracker) {
        namespace = "http://webservice.hrm.weaver";
        writeStartElement(null, namespace, "jobtitle", xmlWriter);

        if (localJobtitle == null) {
          // write the nil attribute

          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

        } else {

          xmlWriter.writeCharacters(localJobtitle);
        }

        xmlWriter.writeEndElement();
      }
      if (localLastChangdateTracker) {
        namespace = "http://webservice.hrm.weaver";
        writeStartElement(null, namespace, "lastChangdate", xmlWriter);

        if (localLastChangdate == null) {
          // write the nil attribute

          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

        } else {

          xmlWriter.writeCharacters(localLastChangdate);
        }

        xmlWriter.writeEndElement();
      }
      if (localLastnameTracker) {
        namespace = "http://webservice.hrm.weaver";
        writeStartElement(null, namespace, "lastname", xmlWriter);

        if (localLastname == null) {
          // write the nil attribute

          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

        } else {

          xmlWriter.writeCharacters(localLastname);
        }

        xmlWriter.writeEndElement();
      }
      if (localLocationidTracker) {
        namespace = "http://webservice.hrm.weaver";
        writeStartElement(null, namespace, "locationid", xmlWriter);

        if (localLocationid == null) {
          // write the nil attribute

          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

        } else {

          xmlWriter.writeCharacters(localLocationid);
        }

        xmlWriter.writeEndElement();
      }
      if (localLoginidTracker) {
        namespace = "http://webservice.hrm.weaver";
        writeStartElement(null, namespace, "loginid", xmlWriter);

        if (localLoginid == null) {
          // write the nil attribute

          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

        } else {

          xmlWriter.writeCharacters(localLoginid);
        }

        xmlWriter.writeEndElement();
      }
      if (localManageridTracker) {
        namespace = "http://webservice.hrm.weaver";
        writeStartElement(null, namespace, "managerid", xmlWriter);

        if (localManagerid == null) {
          // write the nil attribute

          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

        } else {

          xmlWriter.writeCharacters(localManagerid);
        }

        xmlWriter.writeEndElement();
      }
      if (localMaritalstatusTracker) {
        namespace = "http://webservice.hrm.weaver";
        writeStartElement(null, namespace, "maritalstatus", xmlWriter);

        if (localMaritalstatus == null) {
          // write the nil attribute

          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

        } else {

          xmlWriter.writeCharacters(localMaritalstatus);
        }

        xmlWriter.writeEndElement();
      }
      if (localMobileTracker) {
        namespace = "http://webservice.hrm.weaver";
        writeStartElement(null, namespace, "mobile", xmlWriter);

        if (localMobile == null) {
          // write the nil attribute

          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

        } else {

          xmlWriter.writeCharacters(localMobile);
        }

        xmlWriter.writeEndElement();
      }
      if (localMobilecallTracker) {
        namespace = "http://webservice.hrm.weaver";
        writeStartElement(null, namespace, "mobilecall", xmlWriter);

        if (localMobilecall == null) {
          // write the nil attribute

          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

        } else {

          xmlWriter.writeCharacters(localMobilecall);
        }

        xmlWriter.writeEndElement();
      }
      if (localNativeplaceTracker) {
        namespace = "http://webservice.hrm.weaver";
        writeStartElement(null, namespace, "nativeplace", xmlWriter);

        if (localNativeplace == null) {
          // write the nil attribute

          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

        } else {

          xmlWriter.writeCharacters(localNativeplace);
        }

        xmlWriter.writeEndElement();
      }
      if (localPasswordTracker) {
        namespace = "http://webservice.hrm.weaver";
        writeStartElement(null, namespace, "password", xmlWriter);

        if (localPassword == null) {
          // write the nil attribute

          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

        } else {

          xmlWriter.writeCharacters(localPassword);
        }

        xmlWriter.writeEndElement();
      }
      if (localPolicyTracker) {
        namespace = "http://webservice.hrm.weaver";
        writeStartElement(null, namespace, "policy", xmlWriter);

        if (localPolicy == null) {
          // write the nil attribute

          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

        } else {

          xmlWriter.writeCharacters(localPolicy);
        }

        xmlWriter.writeEndElement();
      }
      if (localRegresidentplaceTracker) {
        namespace = "http://webservice.hrm.weaver";
        writeStartElement(null, namespace, "regresidentplace", xmlWriter);

        if (localRegresidentplace == null) {
          // write the nil attribute

          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

        } else {

          xmlWriter.writeCharacters(localRegresidentplace);
        }

        xmlWriter.writeEndElement();
      }
      if (localResidentplaceTracker) {
        namespace = "http://webservice.hrm.weaver";
        writeStartElement(null, namespace, "residentplace", xmlWriter);

        if (localResidentplace == null) {
          // write the nil attribute

          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

        } else {

          xmlWriter.writeCharacters(localResidentplace);
        }

        xmlWriter.writeEndElement();
      }
      if (localSeclevelTracker) {
        namespace = "http://webservice.hrm.weaver";
        writeStartElement(null, namespace, "seclevel", xmlWriter);

        if (localSeclevel == null) {
          // write the nil attribute

          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

        } else {

          xmlWriter.writeCharacters(localSeclevel);
        }

        xmlWriter.writeEndElement();
      }
      if (localSexTracker) {
        namespace = "http://webservice.hrm.weaver";
        writeStartElement(null, namespace, "sex", xmlWriter);

        if (localSex == null) {
          // write the nil attribute

          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

        } else {

          xmlWriter.writeCharacters(localSex);
        }

        xmlWriter.writeEndElement();
      }
      if (localStartdateTracker) {
        namespace = "http://webservice.hrm.weaver";
        writeStartElement(null, namespace, "startdate", xmlWriter);

        if (localStartdate == null) {
          // write the nil attribute

          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

        } else {

          xmlWriter.writeCharacters(localStartdate);
        }

        xmlWriter.writeEndElement();
      }
      if (localStatusTracker) {
        namespace = "http://webservice.hrm.weaver";
        writeStartElement(null, namespace, "status", xmlWriter);

        if (localStatus == null) {
          // write the nil attribute

          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

        } else {

          xmlWriter.writeCharacters(localStatus);
        }

        xmlWriter.writeEndElement();
      }
      if (localSubcompanycodeTracker) {
        namespace = "http://webservice.hrm.weaver";
        writeStartElement(null, namespace, "subcompanycode", xmlWriter);

        if (localSubcompanycode == null) {
          // write the nil attribute

          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

        } else {

          xmlWriter.writeCharacters(localSubcompanycode);
        }

        xmlWriter.writeEndElement();
      }
      if (localSubcompanyid1Tracker) {
        namespace = "http://webservice.hrm.weaver";
        writeStartElement(null, namespace, "subcompanyid1", xmlWriter);

        if (localSubcompanyid1 == null) {
          // write the nil attribute

          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

        } else {

          xmlWriter.writeCharacters(localSubcompanyid1);
        }

        xmlWriter.writeEndElement();
      }
      if (localSubcompanynameTracker) {
        namespace = "http://webservice.hrm.weaver";
        writeStartElement(null, namespace, "subcompanyname", xmlWriter);

        if (localSubcompanyname == null) {
          // write the nil attribute

          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

        } else {

          xmlWriter.writeCharacters(localSubcompanyname);
        }

        xmlWriter.writeEndElement();
      }
      if (localSystemlanguageTracker) {
        namespace = "http://webservice.hrm.weaver";
        writeStartElement(null, namespace, "systemlanguage", xmlWriter);

        if (localSystemlanguage == null) {
          // write the nil attribute

          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

        } else {

          xmlWriter.writeCharacters(localSystemlanguage);
        }

        xmlWriter.writeEndElement();
      }
      if (localTelephoneTracker) {
        namespace = "http://webservice.hrm.weaver";
        writeStartElement(null, namespace, "telephone", xmlWriter);

        if (localTelephone == null) {
          // write the nil attribute

          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

        } else {

          xmlWriter.writeCharacters(localTelephone);
        }

        xmlWriter.writeEndElement();
      }
      if (localTempresidentnumberTracker) {
        namespace = "http://webservice.hrm.weaver";
        writeStartElement(null, namespace, "tempresidentnumber", xmlWriter);

        if (localTempresidentnumber == null) {
          // write the nil attribute

          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

        } else {

          xmlWriter.writeCharacters(localTempresidentnumber);
        }

        xmlWriter.writeEndElement();
      }
      if (localUseridTracker) {
        namespace = "http://webservice.hrm.weaver";
        writeStartElement(null, namespace, "userid", xmlWriter);

        if (localUserid == Integer.MIN_VALUE) {

          throw new org.apache.axis2.databinding.ADBException("userid cannot be null!!");

        } else {
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUserid));
        }

        xmlWriter.writeEndElement();
      }
      if (localWeightTracker) {
        namespace = "http://webservice.hrm.weaver";
        writeStartElement(null, namespace, "weight", xmlWriter);

        if (localWeight == null) {
          // write the nil attribute

          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

        } else {

          xmlWriter.writeCharacters(localWeight);
        }

        xmlWriter.writeEndElement();
      }
      if (localWorkcodeTracker) {
        namespace = "http://webservice.hrm.weaver";
        writeStartElement(null, namespace, "workcode", xmlWriter);

        if (localWorkcode == null) {
          // write the nil attribute

          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

        } else {

          xmlWriter.writeCharacters(localWorkcode);
        }

        xmlWriter.writeEndElement();
      }
      if (localWorkroomTracker) {
        namespace = "http://webservice.hrm.weaver";
        writeStartElement(null, namespace, "workroom", xmlWriter);

        if (localWorkroom == null) {
          // write the nil attribute

          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

        } else {

          xmlWriter.writeCharacters(localWorkroom);
        }

        xmlWriter.writeEndElement();
      }
      xmlWriter.writeEndElement();
    }

    private static String generatePrefix(String namespace) {
      if (namespace.equals("http://webservice.hrm.weaver")) {
        return "ns1";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /** Utility method to write an element start tag. */
    private void writeStartElement(
        String prefix,
        String namespace,
        String localPart,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /** Util method to write an attribute with the ns prefix */
    private void writeAttribute(
        String prefix,
        String namespace,
        String attName,
        String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeAttribute(
        String namespace,
        String attName,
        String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
            registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeQNameAttribute(
        String namespace,
        String attName,
        javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      String attributeNamespace = qname.getNamespaceURI();
      String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }
    /** method to handle Qnames */
    private void writeQName(
        javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
              prefix
                  + ":"
                  + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
        javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to write any
        // namespace data after writing the charactor data
        StringBuffer stringToWrite = new StringBuffer();
        String namespaceURI = null;
        String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                  .append(prefix)
                  .append(":")
                  .append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /** Register a namespace prefix */
    private String registerPrefix(
        javax.xml.stream.XMLStreamWriter xmlWriter, String namespace)
        throws javax.xml.stream.XMLStreamException {
      String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /** Factory class that keeps the parse method */
    public static class Factory {
      private static org.apache.commons.logging.Log log =
          org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an element, the current
       * or next start element starts this object and any intervening reader events are ignorable If
       * this object is not an element, it is a complex type and the reader is at the event just
       * after the outer start element Postcondition: If this object is an element, the reader is
       * positioned at its end element If this object is a complex type, the reader is positioned at
       * the end element of its outer element
       */
      public static UserBean parse(javax.xml.stream.XMLStreamReader reader)
          throws Exception {
        UserBean object = new UserBean();

        int event;
        javax.xml.namespace.QName currentQName = null;
        String nillableValue = null;
        String prefix = "";
        String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          currentQName = reader.getName();

          if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type")
              != null) {
            String fullTypeName =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
            if (fullTypeName != null) {
              String nsPrefix = null;
              if (fullTypeName.indexOf(":") > -1) {
                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
              }
              nsPrefix = nsPrefix == null ? "" : nsPrefix;

              String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

              if (!"UserBean".equals(type)) {
                // find namespace for the prefix
                String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                return (UserBean) ExtensionMapper.getTypeObject(nsUri, type, reader);
              }
            }
          }

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          reader.next();

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://webservice.hrm.weaver", "accounttype")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                  "The element: " + "accounttype" + "  cannot be null");
            }

            String content = reader.getElementText();

            object.setAccounttype(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

            reader.next();

          } // End of if for expected property start element
          else {

            object.setAccounttype(Integer.MIN_VALUE);
          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://webservice.hrm.weaver", "assistantid")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.setAssistantid(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://webservice.hrm.weaver", "bememberdate")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.setBememberdate(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://webservice.hrm.weaver", "bepartydate")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.setBepartydate(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://webservice.hrm.weaver", "birthday")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.setBirthday(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://webservice.hrm.weaver", "certificatenum")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.setCertificatenum(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://webservice.hrm.weaver", "createdate")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.setCreatedate(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://webservice.hrm.weaver", "degree")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.setDegree(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://webservice.hrm.weaver", "departmentcode")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.setDepartmentcode(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://webservice.hrm.weaver", "departmentid")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.setDepartmentid(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://webservice.hrm.weaver", "departmentname")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.setDepartmentname(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://webservice.hrm.weaver", "dsporder")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                  "The element: " + "dsporder" + "  cannot be null");
            }

            String content = reader.getElementText();

            object.setDsporder(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToFloat(content));

            reader.next();

          } // End of if for expected property start element
          else {

            object.setDsporder(Float.NaN);
          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://webservice.hrm.weaver", "educationlevel")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.setEducationlevel(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://webservice.hrm.weaver", "email")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.setEmail(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://webservice.hrm.weaver", "enddate")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.setEnddate(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://webservice.hrm.weaver", "fax")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.setFax(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://webservice.hrm.weaver", "folk")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.setFolk(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://webservice.hrm.weaver", "healthinfo")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.setHealthinfo(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://webservice.hrm.weaver", "height")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.setHeight(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://webservice.hrm.weaver", "homeaddress")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.setHomeaddress(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://webservice.hrm.weaver", "islabouunion")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.setIslabouunion(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://webservice.hrm.weaver", "jobactivitydesc")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.setJobactivitydesc(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://webservice.hrm.weaver", "jobactivityid")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.setJobactivityid(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://webservice.hrm.weaver", "jobcall")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.setJobcall(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://webservice.hrm.weaver", "jobgroupid")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.setJobgroupid(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://webservice.hrm.weaver", "joblevel")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.setJoblevel(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://webservice.hrm.weaver", "jobtitle")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.setJobtitle(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://webservice.hrm.weaver", "lastChangdate")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.setLastChangdate(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://webservice.hrm.weaver", "lastname")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.setLastname(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://webservice.hrm.weaver", "locationid")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.setLocationid(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://webservice.hrm.weaver", "loginid")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.setLoginid(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://webservice.hrm.weaver", "managerid")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.setManagerid(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://webservice.hrm.weaver", "maritalstatus")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.setMaritalstatus(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://webservice.hrm.weaver", "mobile")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.setMobile(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://webservice.hrm.weaver", "mobilecall")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.setMobilecall(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://webservice.hrm.weaver", "nativeplace")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.setNativeplace(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://webservice.hrm.weaver", "password")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.setPassword(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://webservice.hrm.weaver", "policy")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.setPolicy(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://webservice.hrm.weaver", "regresidentplace")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.setRegresidentplace(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://webservice.hrm.weaver", "residentplace")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.setResidentplace(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://webservice.hrm.weaver", "seclevel")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.setSeclevel(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://webservice.hrm.weaver", "sex")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.setSex(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://webservice.hrm.weaver", "startdate")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.setStartdate(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://webservice.hrm.weaver", "status")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.setStatus(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://webservice.hrm.weaver", "subcompanycode")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.setSubcompanycode(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://webservice.hrm.weaver", "subcompanyid1")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.setSubcompanyid1(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://webservice.hrm.weaver", "subcompanyname")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.setSubcompanyname(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://webservice.hrm.weaver", "systemlanguage")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.setSystemlanguage(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://webservice.hrm.weaver", "telephone")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.setTelephone(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://webservice.hrm.weaver", "tempresidentnumber")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.setTempresidentnumber(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://webservice.hrm.weaver", "userid")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                  "The element: " + "userid" + "  cannot be null");
            }

            String content = reader.getElementText();

            object.setUserid(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

            reader.next();

          } // End of if for expected property start element
          else {

            object.setUserid(Integer.MIN_VALUE);
          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://webservice.hrm.weaver", "weight")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.setWeight(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://webservice.hrm.weaver", "workcode")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.setWorkcode(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://webservice.hrm.weaver", "workroom")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.setWorkroom(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement())
            // 2 - A start element we are not expecting indicates a trailing invalid property

            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  public static class ArrayOfDepartmentBean implements org.apache.axis2.databinding.ADBBean {
    /* This type was generated from the piece of schema that had
    name = ArrayOfDepartmentBean
    Namespace URI = http://webservice.hrm.weaver
    Namespace Prefix = ns1
    */

    /** field for DepartmentBean This was an Array! */
    protected DepartmentBean[] localDepartmentBean;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localDepartmentBeanTracker = false;

    public boolean isDepartmentBeanSpecified() {
      return localDepartmentBeanTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return DepartmentBean[]
     */
    public DepartmentBean[] getDepartmentBean() {
      return localDepartmentBean;
    }

    /** validate the array for DepartmentBean */
    protected void validateDepartmentBean(DepartmentBean[] param) {}

    /**
     * Auto generated setter method
     *
     * @param param DepartmentBean
     */
    public void setDepartmentBean(DepartmentBean[] param) {

      validateDepartmentBean(param);

      localDepartmentBeanTracker = true;

      this.localDepartmentBean = param;
    }

    /**
     * Auto generated add method for the array for convenience
     *
     * @param param DepartmentBean
     */
    public void addDepartmentBean(DepartmentBean param) {
      if (localDepartmentBean == null) {
        localDepartmentBean = new DepartmentBean[] {};
      }

      // update the setting tracker
      localDepartmentBeanTracker = true;

      java.util.List list =
          org.apache.axis2.databinding.utils.ConverterUtil.toList(localDepartmentBean);
      list.add(param);
      this.localDepartmentBean = (DepartmentBean[]) list.toArray(new DepartmentBean[list.size()]);
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
        final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
        throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
          new org.apache.axis2.databinding.ADBDataSource(this, parentQName));
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter,
        boolean serializeType)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      String prefix = null;
      String namespace = null;

      prefix = parentQName.getPrefix();
      namespace = parentQName.getNamespaceURI();
      writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

      if (serializeType) {

        String namespacePrefix =
            registerPrefix(xmlWriter, "http://webservice.hrm.weaver");
        if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              namespacePrefix + ":ArrayOfDepartmentBean",
              xmlWriter);
        } else {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              "ArrayOfDepartmentBean",
              xmlWriter);
        }
      }
      if (localDepartmentBeanTracker) {
        if (localDepartmentBean != null) {
          for (int i = 0; i < localDepartmentBean.length; i++) {
            if (localDepartmentBean[i] != null) {
              localDepartmentBean[i].serialize(
                  new javax.xml.namespace.QName("http://webservice.hrm.weaver", "DepartmentBean"),
                  xmlWriter);
            } else {

              writeStartElement(null, "http://webservice.hrm.weaver", "DepartmentBean", xmlWriter);

              // write the nil attribute
              writeAttribute(
                  "xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);
              xmlWriter.writeEndElement();
            }
          }
        } else {

          writeStartElement(null, "http://webservice.hrm.weaver", "DepartmentBean", xmlWriter);

          // write the nil attribute
          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);
          xmlWriter.writeEndElement();
        }
      }
      xmlWriter.writeEndElement();
    }

    private static String generatePrefix(String namespace) {
      if (namespace.equals("http://webservice.hrm.weaver")) {
        return "ns1";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /** Utility method to write an element start tag. */
    private void writeStartElement(
        String prefix,
        String namespace,
        String localPart,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /** Util method to write an attribute with the ns prefix */
    private void writeAttribute(
        String prefix,
        String namespace,
        String attName,
        String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeAttribute(
        String namespace,
        String attName,
        String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
            registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeQNameAttribute(
        String namespace,
        String attName,
        javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      String attributeNamespace = qname.getNamespaceURI();
      String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }
    /** method to handle Qnames */
    private void writeQName(
        javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
              prefix
                  + ":"
                  + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
        javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to write any
        // namespace data after writing the charactor data
        StringBuffer stringToWrite = new StringBuffer();
        String namespaceURI = null;
        String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                  .append(prefix)
                  .append(":")
                  .append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /** Register a namespace prefix */
    private String registerPrefix(
        javax.xml.stream.XMLStreamWriter xmlWriter, String namespace)
        throws javax.xml.stream.XMLStreamException {
      String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /** Factory class that keeps the parse method */
    public static class Factory {
      private static org.apache.commons.logging.Log log =
          org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an element, the current
       * or next start element starts this object and any intervening reader events are ignorable If
       * this object is not an element, it is a complex type and the reader is at the event just
       * after the outer start element Postcondition: If this object is an element, the reader is
       * positioned at its end element If this object is a complex type, the reader is positioned at
       * the end element of its outer element
       */
      public static ArrayOfDepartmentBean parse(javax.xml.stream.XMLStreamReader reader)
          throws Exception {
        ArrayOfDepartmentBean object = new ArrayOfDepartmentBean();

        int event;
        javax.xml.namespace.QName currentQName = null;
        String nillableValue = null;
        String prefix = "";
        String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          currentQName = reader.getName();

          if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type")
              != null) {
            String fullTypeName =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
            if (fullTypeName != null) {
              String nsPrefix = null;
              if (fullTypeName.indexOf(":") > -1) {
                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
              }
              nsPrefix = nsPrefix == null ? "" : nsPrefix;

              String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

              if (!"ArrayOfDepartmentBean".equals(type)) {
                // find namespace for the prefix
                String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                return (ArrayOfDepartmentBean) ExtensionMapper.getTypeObject(nsUri, type, reader);
              }
            }
          }

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          reader.next();

          java.util.ArrayList list1 = new java.util.ArrayList();

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://webservice.hrm.weaver", "DepartmentBean")
                  .equals(reader.getName())) {

            // Process the array and step past its final element's end.

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              list1.add(null);
              reader.next();
            } else {
              list1.add(DepartmentBean.Factory.parse(reader));
            }
            // loop until we find a start element that is not part of this array
            boolean loopDone1 = false;
            while (!loopDone1) {
              // We should be at the end element, but make sure
              while (!reader.isEndElement()) reader.next();
              // Step out of this element
              reader.next();
              // Step to next element event.
              while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
              if (reader.isEndElement()) {
                // two continuous end elements means we are exiting the xml structure
                loopDone1 = true;
              } else {
                if (new javax.xml.namespace.QName("http://webservice.hrm.weaver", "DepartmentBean")
                    .equals(reader.getName())) {

                  nillableValue =
                      reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                  if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                    list1.add(null);
                    reader.next();
                  } else {
                    list1.add(DepartmentBean.Factory.parse(reader));
                  }
                } else {
                  loopDone1 = true;
                }
              }
            }
            // call the converter utility  to convert and set the array

            object.setDepartmentBean(
                (DepartmentBean[])
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                        DepartmentBean.class, list1));

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement())
            // 2 - A start element we are not expecting indicates a trailing invalid property

            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  public static class ArrayOfSubCompanyBean implements org.apache.axis2.databinding.ADBBean {
    /* This type was generated from the piece of schema that had
    name = ArrayOfSubCompanyBean
    Namespace URI = http://webservice.hrm.weaver
    Namespace Prefix = ns1
    */

    /** field for SubCompanyBean This was an Array! */
    protected SubCompanyBean[] localSubCompanyBean;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSubCompanyBeanTracker = false;

    public boolean isSubCompanyBeanSpecified() {
      return localSubCompanyBeanTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return SubCompanyBean[]
     */
    public SubCompanyBean[] getSubCompanyBean() {
      return localSubCompanyBean;
    }

    /** validate the array for SubCompanyBean */
    protected void validateSubCompanyBean(SubCompanyBean[] param) {}

    /**
     * Auto generated setter method
     *
     * @param param SubCompanyBean
     */
    public void setSubCompanyBean(SubCompanyBean[] param) {

      validateSubCompanyBean(param);

      localSubCompanyBeanTracker = true;

      this.localSubCompanyBean = param;
    }

    /**
     * Auto generated add method for the array for convenience
     *
     * @param param SubCompanyBean
     */
    public void addSubCompanyBean(SubCompanyBean param) {
      if (localSubCompanyBean == null) {
        localSubCompanyBean = new SubCompanyBean[] {};
      }

      // update the setting tracker
      localSubCompanyBeanTracker = true;

      java.util.List list =
          org.apache.axis2.databinding.utils.ConverterUtil.toList(localSubCompanyBean);
      list.add(param);
      this.localSubCompanyBean = (SubCompanyBean[]) list.toArray(new SubCompanyBean[list.size()]);
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
        final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
        throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
          new org.apache.axis2.databinding.ADBDataSource(this, parentQName));
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter,
        boolean serializeType)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      String prefix = null;
      String namespace = null;

      prefix = parentQName.getPrefix();
      namespace = parentQName.getNamespaceURI();
      writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

      if (serializeType) {

        String namespacePrefix =
            registerPrefix(xmlWriter, "http://webservice.hrm.weaver");
        if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              namespacePrefix + ":ArrayOfSubCompanyBean",
              xmlWriter);
        } else {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              "ArrayOfSubCompanyBean",
              xmlWriter);
        }
      }
      if (localSubCompanyBeanTracker) {
        if (localSubCompanyBean != null) {
          for (int i = 0; i < localSubCompanyBean.length; i++) {
            if (localSubCompanyBean[i] != null) {
              localSubCompanyBean[i].serialize(
                  new javax.xml.namespace.QName("http://webservice.hrm.weaver", "SubCompanyBean"),
                  xmlWriter);
            } else {

              writeStartElement(null, "http://webservice.hrm.weaver", "SubCompanyBean", xmlWriter);

              // write the nil attribute
              writeAttribute(
                  "xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);
              xmlWriter.writeEndElement();
            }
          }
        } else {

          writeStartElement(null, "http://webservice.hrm.weaver", "SubCompanyBean", xmlWriter);

          // write the nil attribute
          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);
          xmlWriter.writeEndElement();
        }
      }
      xmlWriter.writeEndElement();
    }

    private static String generatePrefix(String namespace) {
      if (namespace.equals("http://webservice.hrm.weaver")) {
        return "ns1";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /** Utility method to write an element start tag. */
    private void writeStartElement(
        String prefix,
        String namespace,
        String localPart,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /** Util method to write an attribute with the ns prefix */
    private void writeAttribute(
        String prefix,
        String namespace,
        String attName,
        String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeAttribute(
        String namespace,
        String attName,
        String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
            registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeQNameAttribute(
        String namespace,
        String attName,
        javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      String attributeNamespace = qname.getNamespaceURI();
      String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }
    /** method to handle Qnames */
    private void writeQName(
        javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
              prefix
                  + ":"
                  + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
        javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to write any
        // namespace data after writing the charactor data
        StringBuffer stringToWrite = new StringBuffer();
        String namespaceURI = null;
        String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                  .append(prefix)
                  .append(":")
                  .append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /** Register a namespace prefix */
    private String registerPrefix(
        javax.xml.stream.XMLStreamWriter xmlWriter, String namespace)
        throws javax.xml.stream.XMLStreamException {
      String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /** Factory class that keeps the parse method */
    public static class Factory {
      private static org.apache.commons.logging.Log log =
          org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an element, the current
       * or next start element starts this object and any intervening reader events are ignorable If
       * this object is not an element, it is a complex type and the reader is at the event just
       * after the outer start element Postcondition: If this object is an element, the reader is
       * positioned at its end element If this object is a complex type, the reader is positioned at
       * the end element of its outer element
       */
      public static ArrayOfSubCompanyBean parse(javax.xml.stream.XMLStreamReader reader)
          throws Exception {
        ArrayOfSubCompanyBean object = new ArrayOfSubCompanyBean();

        int event;
        javax.xml.namespace.QName currentQName = null;
        String nillableValue = null;
        String prefix = "";
        String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          currentQName = reader.getName();

          if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type")
              != null) {
            String fullTypeName =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
            if (fullTypeName != null) {
              String nsPrefix = null;
              if (fullTypeName.indexOf(":") > -1) {
                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
              }
              nsPrefix = nsPrefix == null ? "" : nsPrefix;

              String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

              if (!"ArrayOfSubCompanyBean".equals(type)) {
                // find namespace for the prefix
                String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                return (ArrayOfSubCompanyBean) ExtensionMapper.getTypeObject(nsUri, type, reader);
              }
            }
          }

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          reader.next();

          java.util.ArrayList list1 = new java.util.ArrayList();

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://webservice.hrm.weaver", "SubCompanyBean")
                  .equals(reader.getName())) {

            // Process the array and step past its final element's end.

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              list1.add(null);
              reader.next();
            } else {
              list1.add(SubCompanyBean.Factory.parse(reader));
            }
            // loop until we find a start element that is not part of this array
            boolean loopDone1 = false;
            while (!loopDone1) {
              // We should be at the end element, but make sure
              while (!reader.isEndElement()) reader.next();
              // Step out of this element
              reader.next();
              // Step to next element event.
              while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
              if (reader.isEndElement()) {
                // two continuous end elements means we are exiting the xml structure
                loopDone1 = true;
              } else {
                if (new javax.xml.namespace.QName("http://webservice.hrm.weaver", "SubCompanyBean")
                    .equals(reader.getName())) {

                  nillableValue =
                      reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                  if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                    list1.add(null);
                    reader.next();
                  } else {
                    list1.add(SubCompanyBean.Factory.parse(reader));
                  }
                } else {
                  loopDone1 = true;
                }
              }
            }
            // call the converter utility  to convert and set the array

            object.setSubCompanyBean(
                (SubCompanyBean[])
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                        SubCompanyBean.class, list1));

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement())
            // 2 - A start element we are not expecting indicates a trailing invalid property

            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  public static class CheckUserResponse implements org.apache.axis2.databinding.ADBBean {

    public static final javax.xml.namespace.QName MY_QNAME =
        new javax.xml.namespace.QName(
            "http://localhost/services/HrmService", "checkUserResponse", "ns2");

    /** field for Out */
    protected boolean localOut;

    /**
     * Auto generated getter method
     *
     * @return boolean
     */
    public boolean getOut() {
      return localOut;
    }

    /**
     * Auto generated setter method
     *
     * @param param Out
     */
    public void setOut(boolean param) {

      this.localOut = param;
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
        final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
        throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
          new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME));
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter,
        boolean serializeType)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      String prefix = null;
      String namespace = null;

      prefix = parentQName.getPrefix();
      namespace = parentQName.getNamespaceURI();
      writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

      if (serializeType) {

        String namespacePrefix =
            registerPrefix(xmlWriter, "http://localhost/services/HrmService");
        if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              namespacePrefix + ":checkUserResponse",
              xmlWriter);
        } else {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              "checkUserResponse",
              xmlWriter);
        }
      }

      namespace = "http://localhost/services/HrmService";
      writeStartElement(null, namespace, "out", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("out cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOut));
      }

      xmlWriter.writeEndElement();

      xmlWriter.writeEndElement();
    }

    private static String generatePrefix(String namespace) {
      if (namespace.equals("http://localhost/services/HrmService")) {
        return "ns2";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /** Utility method to write an element start tag. */
    private void writeStartElement(
        String prefix,
        String namespace,
        String localPart,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /** Util method to write an attribute with the ns prefix */
    private void writeAttribute(
        String prefix,
        String namespace,
        String attName,
        String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeAttribute(
        String namespace,
        String attName,
        String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
            registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeQNameAttribute(
        String namespace,
        String attName,
        javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      String attributeNamespace = qname.getNamespaceURI();
      String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }
    /** method to handle Qnames */
    private void writeQName(
        javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
              prefix
                  + ":"
                  + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
        javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to write any
        // namespace data after writing the charactor data
        StringBuffer stringToWrite = new StringBuffer();
        String namespaceURI = null;
        String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                  .append(prefix)
                  .append(":")
                  .append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /** Register a namespace prefix */
    private String registerPrefix(
        javax.xml.stream.XMLStreamWriter xmlWriter, String namespace)
        throws javax.xml.stream.XMLStreamException {
      String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /** Factory class that keeps the parse method */
    public static class Factory {
      private static org.apache.commons.logging.Log log =
          org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an element, the current
       * or next start element starts this object and any intervening reader events are ignorable If
       * this object is not an element, it is a complex type and the reader is at the event just
       * after the outer start element Postcondition: If this object is an element, the reader is
       * positioned at its end element If this object is a complex type, the reader is positioned at
       * the end element of its outer element
       */
      public static CheckUserResponse parse(javax.xml.stream.XMLStreamReader reader)
          throws Exception {
        CheckUserResponse object = new CheckUserResponse();

        int event;
        javax.xml.namespace.QName currentQName = null;
        String nillableValue = null;
        String prefix = "";
        String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          currentQName = reader.getName();

          if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type")
              != null) {
            String fullTypeName =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
            if (fullTypeName != null) {
              String nsPrefix = null;
              if (fullTypeName.indexOf(":") > -1) {
                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
              }
              nsPrefix = nsPrefix == null ? "" : nsPrefix;

              String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

              if (!"checkUserResponse".equals(type)) {
                // find namespace for the prefix
                String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                return (CheckUserResponse) ExtensionMapper.getTypeObject(nsUri, type, reader);
              }
            }
          }

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          reader.next();

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://localhost/services/HrmService", "out")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                  "The element: " + "out" + "  cannot be null");
            }

            String content = reader.getElementText();

            object.setOut(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

            reader.next();

          } // End of if for expected property start element
          else {
            // 1 - A start element we are not expecting indicates an invalid parameter was passed
            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());
          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement())
            // 2 - A start element we are not expecting indicates a trailing invalid property

            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  public static class GetHrmSubcompanyInfoResponse implements org.apache.axis2.databinding.ADBBean {

    public static final javax.xml.namespace.QName MY_QNAME =
        new javax.xml.namespace.QName(
            "http://localhost/services/HrmService", "getHrmSubcompanyInfoResponse", "ns2");

    /** field for Out */
    protected ArrayOfSubCompanyBean localOut;

    /**
     * Auto generated getter method
     *
     * @return ArrayOfSubCompanyBean
     */
    public ArrayOfSubCompanyBean getOut() {
      return localOut;
    }

    /**
     * Auto generated setter method
     *
     * @param param Out
     */
    public void setOut(ArrayOfSubCompanyBean param) {

      this.localOut = param;
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
        final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
        throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
          new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME));
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter,
        boolean serializeType)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      String prefix = null;
      String namespace = null;

      prefix = parentQName.getPrefix();
      namespace = parentQName.getNamespaceURI();
      writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

      if (serializeType) {

        String namespacePrefix =
            registerPrefix(xmlWriter, "http://localhost/services/HrmService");
        if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              namespacePrefix + ":getHrmSubcompanyInfoResponse",
              xmlWriter);
        } else {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              "getHrmSubcompanyInfoResponse",
              xmlWriter);
        }
      }

      if (localOut == null) {

        writeStartElement(null, "http://localhost/services/HrmService", "out", xmlWriter);

        // write the nil attribute
        writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);
        xmlWriter.writeEndElement();
      } else {
        localOut.serialize(
            new javax.xml.namespace.QName("http://localhost/services/HrmService", "out"),
            xmlWriter);
      }

      xmlWriter.writeEndElement();
    }

    private static String generatePrefix(String namespace) {
      if (namespace.equals("http://localhost/services/HrmService")) {
        return "ns2";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /** Utility method to write an element start tag. */
    private void writeStartElement(
        String prefix,
        String namespace,
        String localPart,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /** Util method to write an attribute with the ns prefix */
    private void writeAttribute(
        String prefix,
        String namespace,
        String attName,
        String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeAttribute(
        String namespace,
        String attName,
        String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
            registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeQNameAttribute(
        String namespace,
        String attName,
        javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      String attributeNamespace = qname.getNamespaceURI();
      String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }
    /** method to handle Qnames */
    private void writeQName(
        javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
              prefix
                  + ":"
                  + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
        javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to write any
        // namespace data after writing the charactor data
        StringBuffer stringToWrite = new StringBuffer();
        String namespaceURI = null;
        String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                  .append(prefix)
                  .append(":")
                  .append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /** Register a namespace prefix */
    private String registerPrefix(
        javax.xml.stream.XMLStreamWriter xmlWriter, String namespace)
        throws javax.xml.stream.XMLStreamException {
      String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /** Factory class that keeps the parse method */
    public static class Factory {
      private static org.apache.commons.logging.Log log =
          org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an element, the current
       * or next start element starts this object and any intervening reader events are ignorable If
       * this object is not an element, it is a complex type and the reader is at the event just
       * after the outer start element Postcondition: If this object is an element, the reader is
       * positioned at its end element If this object is a complex type, the reader is positioned at
       * the end element of its outer element
       */
      public static GetHrmSubcompanyInfoResponse parse(javax.xml.stream.XMLStreamReader reader)
          throws Exception {
        GetHrmSubcompanyInfoResponse object = new GetHrmSubcompanyInfoResponse();

        int event;
        javax.xml.namespace.QName currentQName = null;
        String nillableValue = null;
        String prefix = "";
        String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          currentQName = reader.getName();

          if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type")
              != null) {
            String fullTypeName =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
            if (fullTypeName != null) {
              String nsPrefix = null;
              if (fullTypeName.indexOf(":") > -1) {
                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
              }
              nsPrefix = nsPrefix == null ? "" : nsPrefix;

              String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

              if (!"getHrmSubcompanyInfoResponse".equals(type)) {
                // find namespace for the prefix
                String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                return (GetHrmSubcompanyInfoResponse)
                    ExtensionMapper.getTypeObject(nsUri, type, reader);
              }
            }
          }

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          reader.next();

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://localhost/services/HrmService", "out")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              object.setOut(null);
              reader.next();

              reader.next();

            } else {

              object.setOut(ArrayOfSubCompanyBean.Factory.parse(reader));

              reader.next();
            }
          } // End of if for expected property start element
          else {
            // 1 - A start element we are not expecting indicates an invalid parameter was passed
            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());
          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement())
            // 2 - A start element we are not expecting indicates a trailing invalid property

            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  public static class SynJobtitle implements org.apache.axis2.databinding.ADBBean {

    public static final javax.xml.namespace.QName MY_QNAME =
        new javax.xml.namespace.QName("http://localhost/services/HrmService", "SynJobtitle", "ns2");

    /** field for In0 */
    protected String localIn0;

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getIn0() {
      return localIn0;
    }

    /**
     * Auto generated setter method
     *
     * @param param In0
     */
    public void setIn0(String param) {

      this.localIn0 = param;
    }

    /** field for In1 */
    protected String localIn1;

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getIn1() {
      return localIn1;
    }

    /**
     * Auto generated setter method
     *
     * @param param In1
     */
    public void setIn1(String param) {

      this.localIn1 = param;
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
        final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
        throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
          new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME));
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter,
        boolean serializeType)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      String prefix = null;
      String namespace = null;

      prefix = parentQName.getPrefix();
      namespace = parentQName.getNamespaceURI();
      writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

      if (serializeType) {

        String namespacePrefix =
            registerPrefix(xmlWriter, "http://localhost/services/HrmService");
        if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              namespacePrefix + ":SynJobtitle",
              xmlWriter);
        } else {
          writeAttribute(
              "xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "SynJobtitle", xmlWriter);
        }
      }

      namespace = "http://localhost/services/HrmService";
      writeStartElement(null, namespace, "in0", xmlWriter);

      if (localIn0 == null) {
        // write the nil attribute

        writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

      } else {

        xmlWriter.writeCharacters(localIn0);
      }

      xmlWriter.writeEndElement();

      namespace = "http://localhost/services/HrmService";
      writeStartElement(null, namespace, "in1", xmlWriter);

      if (localIn1 == null) {
        // write the nil attribute

        writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

      } else {

        xmlWriter.writeCharacters(localIn1);
      }

      xmlWriter.writeEndElement();

      xmlWriter.writeEndElement();
    }

    private static String generatePrefix(String namespace) {
      if (namespace.equals("http://localhost/services/HrmService")) {
        return "ns2";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /** Utility method to write an element start tag. */
    private void writeStartElement(
        String prefix,
        String namespace,
        String localPart,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /** Util method to write an attribute with the ns prefix */
    private void writeAttribute(
        String prefix,
        String namespace,
        String attName,
        String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeAttribute(
        String namespace,
        String attName,
        String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
            registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeQNameAttribute(
        String namespace,
        String attName,
        javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      String attributeNamespace = qname.getNamespaceURI();
      String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }
    /** method to handle Qnames */
    private void writeQName(
        javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
              prefix
                  + ":"
                  + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
        javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to write any
        // namespace data after writing the charactor data
        StringBuffer stringToWrite = new StringBuffer();
        String namespaceURI = null;
        String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                  .append(prefix)
                  .append(":")
                  .append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /** Register a namespace prefix */
    private String registerPrefix(
        javax.xml.stream.XMLStreamWriter xmlWriter, String namespace)
        throws javax.xml.stream.XMLStreamException {
      String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /** Factory class that keeps the parse method */
    public static class Factory {
      private static org.apache.commons.logging.Log log =
          org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an element, the current
       * or next start element starts this object and any intervening reader events are ignorable If
       * this object is not an element, it is a complex type and the reader is at the event just
       * after the outer start element Postcondition: If this object is an element, the reader is
       * positioned at its end element If this object is a complex type, the reader is positioned at
       * the end element of its outer element
       */
      public static SynJobtitle parse(javax.xml.stream.XMLStreamReader reader)
          throws Exception {
        SynJobtitle object = new SynJobtitle();

        int event;
        javax.xml.namespace.QName currentQName = null;
        String nillableValue = null;
        String prefix = "";
        String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          currentQName = reader.getName();

          if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type")
              != null) {
            String fullTypeName =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
            if (fullTypeName != null) {
              String nsPrefix = null;
              if (fullTypeName.indexOf(":") > -1) {
                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
              }
              nsPrefix = nsPrefix == null ? "" : nsPrefix;

              String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

              if (!"SynJobtitle".equals(type)) {
                // find namespace for the prefix
                String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                return (SynJobtitle) ExtensionMapper.getTypeObject(nsUri, type, reader);
              }
            }
          }

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          reader.next();

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://localhost/services/HrmService", "in0")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.setIn0(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {
            // 1 - A start element we are not expecting indicates an invalid parameter was passed
            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());
          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://localhost/services/HrmService", "in1")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.setIn1(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {
            // 1 - A start element we are not expecting indicates an invalid parameter was passed
            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());
          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement())
            // 2 - A start element we are not expecting indicates a trailing invalid property

            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  public static class DepartmentBean implements org.apache.axis2.databinding.ADBBean {
    /* This type was generated from the piece of schema that had
    name = DepartmentBean
    Namespace URI = http://webservice.hrm.weaver
    Namespace Prefix = ns1
    */

    /** field for _canceled */
    protected String local_canceled;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean local_canceledTracker = false;

    public boolean is_canceledSpecified() {
      return local_canceledTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String get_canceled() {
      return local_canceled;
    }

    /**
     * Auto generated setter method
     *
     * @param param _canceled
     */
    public void set_canceled(String param) {
      local_canceledTracker = true;

      this.local_canceled = param;
    }

    /** field for _code */
    protected String local_code;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean local_codeTracker = false;

    public boolean is_codeSpecified() {
      return local_codeTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String get_code() {
      return local_code;
    }

    /**
     * Auto generated setter method
     *
     * @param param _code
     */
    public void set_code(String param) {
      local_codeTracker = true;

      this.local_code = param;
    }

    /** field for _departmentid */
    protected String local_departmentid;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean local_departmentidTracker = false;

    public boolean is_departmentidSpecified() {
      return local_departmentidTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String get_departmentid() {
      return local_departmentid;
    }

    /**
     * Auto generated setter method
     *
     * @param param _departmentid
     */
    public void set_departmentid(String param) {
      local_departmentidTracker = true;

      this.local_departmentid = param;
    }

    /** field for _fullname */
    protected String local_fullname;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean local_fullnameTracker = false;

    public boolean is_fullnameSpecified() {
      return local_fullnameTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String get_fullname() {
      return local_fullname;
    }

    /**
     * Auto generated setter method
     *
     * @param param _fullname
     */
    public void set_fullname(String param) {
      local_fullnameTracker = true;

      this.local_fullname = param;
    }

    /** field for _shortname */
    protected String local_shortname;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean local_shortnameTracker = false;

    public boolean is_shortnameSpecified() {
      return local_shortnameTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String get_shortname() {
      return local_shortname;
    }

    /**
     * Auto generated setter method
     *
     * @param param _shortname
     */
    public void set_shortname(String param) {
      local_shortnameTracker = true;

      this.local_shortname = param;
    }

    /** field for _showorder */
    protected String local_showorder;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean local_showorderTracker = false;

    public boolean is_showorderSpecified() {
      return local_showorderTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String get_showorder() {
      return local_showorder;
    }

    /**
     * Auto generated setter method
     *
     * @param param _showorder
     */
    public void set_showorder(String param) {
      local_showorderTracker = true;

      this.local_showorder = param;
    }

    /** field for _subcompanyid */
    protected String local_subcompanyid;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean local_subcompanyidTracker = false;

    public boolean is_subcompanyidSpecified() {
      return local_subcompanyidTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String get_subcompanyid() {
      return local_subcompanyid;
    }

    /**
     * Auto generated setter method
     *
     * @param param _subcompanyid
     */
    public void set_subcompanyid(String param) {
      local_subcompanyidTracker = true;

      this.local_subcompanyid = param;
    }

    /** field for _supdepartmentid */
    protected String local_supdepartmentid;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean local_supdepartmentidTracker = false;

    public boolean is_supdepartmentidSpecified() {
      return local_supdepartmentidTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String get_supdepartmentid() {
      return local_supdepartmentid;
    }

    /**
     * Auto generated setter method
     *
     * @param param _supdepartmentid
     */
    public void set_supdepartmentid(String param) {
      local_supdepartmentidTracker = true;

      this.local_supdepartmentid = param;
    }

    /** field for Action */
    protected String localAction;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localActionTracker = false;

    public boolean isActionSpecified() {
      return localActionTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getAction() {
      return localAction;
    }

    /**
     * Auto generated setter method
     *
     * @param param Action
     */
    public void setAction(String param) {
      localActionTracker = true;

      this.localAction = param;
    }

    /** field for LastChangdate */
    protected String localLastChangdate;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localLastChangdateTracker = false;

    public boolean isLastChangdateSpecified() {
      return localLastChangdateTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getLastChangdate() {
      return localLastChangdate;
    }

    /**
     * Auto generated setter method
     *
     * @param param LastChangdate
     */
    public void setLastChangdate(String param) {
      localLastChangdateTracker = true;

      this.localLastChangdate = param;
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
        final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
        throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
          new org.apache.axis2.databinding.ADBDataSource(this, parentQName));
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter,
        boolean serializeType)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      String prefix = null;
      String namespace = null;

      prefix = parentQName.getPrefix();
      namespace = parentQName.getNamespaceURI();
      writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

      if (serializeType) {

        String namespacePrefix =
            registerPrefix(xmlWriter, "http://webservice.hrm.weaver");
        if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              namespacePrefix + ":DepartmentBean",
              xmlWriter);
        } else {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              "DepartmentBean",
              xmlWriter);
        }
      }
      if (local_canceledTracker) {
        namespace = "http://webservice.hrm.weaver";
        writeStartElement(null, namespace, "_canceled", xmlWriter);

        if (local_canceled == null) {
          // write the nil attribute

          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

        } else {

          xmlWriter.writeCharacters(local_canceled);
        }

        xmlWriter.writeEndElement();
      }
      if (local_codeTracker) {
        namespace = "http://webservice.hrm.weaver";
        writeStartElement(null, namespace, "_code", xmlWriter);

        if (local_code == null) {
          // write the nil attribute

          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

        } else {

          xmlWriter.writeCharacters(local_code);
        }

        xmlWriter.writeEndElement();
      }
      if (local_departmentidTracker) {
        namespace = "http://webservice.hrm.weaver";
        writeStartElement(null, namespace, "_departmentid", xmlWriter);

        if (local_departmentid == null) {
          // write the nil attribute

          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

        } else {

          xmlWriter.writeCharacters(local_departmentid);
        }

        xmlWriter.writeEndElement();
      }
      if (local_fullnameTracker) {
        namespace = "http://webservice.hrm.weaver";
        writeStartElement(null, namespace, "_fullname", xmlWriter);

        if (local_fullname == null) {
          // write the nil attribute

          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

        } else {

          xmlWriter.writeCharacters(local_fullname);
        }

        xmlWriter.writeEndElement();
      }
      if (local_shortnameTracker) {
        namespace = "http://webservice.hrm.weaver";
        writeStartElement(null, namespace, "_shortname", xmlWriter);

        if (local_shortname == null) {
          // write the nil attribute

          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

        } else {

          xmlWriter.writeCharacters(local_shortname);
        }

        xmlWriter.writeEndElement();
      }
      if (local_showorderTracker) {
        namespace = "http://webservice.hrm.weaver";
        writeStartElement(null, namespace, "_showorder", xmlWriter);

        if (local_showorder == null) {
          // write the nil attribute

          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

        } else {

          xmlWriter.writeCharacters(local_showorder);
        }

        xmlWriter.writeEndElement();
      }
      if (local_subcompanyidTracker) {
        namespace = "http://webservice.hrm.weaver";
        writeStartElement(null, namespace, "_subcompanyid", xmlWriter);

        if (local_subcompanyid == null) {
          // write the nil attribute

          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

        } else {

          xmlWriter.writeCharacters(local_subcompanyid);
        }

        xmlWriter.writeEndElement();
      }
      if (local_supdepartmentidTracker) {
        namespace = "http://webservice.hrm.weaver";
        writeStartElement(null, namespace, "_supdepartmentid", xmlWriter);

        if (local_supdepartmentid == null) {
          // write the nil attribute

          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

        } else {

          xmlWriter.writeCharacters(local_supdepartmentid);
        }

        xmlWriter.writeEndElement();
      }
      if (localActionTracker) {
        namespace = "http://webservice.hrm.weaver";
        writeStartElement(null, namespace, "action", xmlWriter);

        if (localAction == null) {
          // write the nil attribute

          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

        } else {

          xmlWriter.writeCharacters(localAction);
        }

        xmlWriter.writeEndElement();
      }
      if (localLastChangdateTracker) {
        namespace = "http://webservice.hrm.weaver";
        writeStartElement(null, namespace, "lastChangdate", xmlWriter);

        if (localLastChangdate == null) {
          // write the nil attribute

          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

        } else {

          xmlWriter.writeCharacters(localLastChangdate);
        }

        xmlWriter.writeEndElement();
      }
      xmlWriter.writeEndElement();
    }

    private static String generatePrefix(String namespace) {
      if (namespace.equals("http://webservice.hrm.weaver")) {
        return "ns1";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /** Utility method to write an element start tag. */
    private void writeStartElement(
        String prefix,
        String namespace,
        String localPart,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /** Util method to write an attribute with the ns prefix */
    private void writeAttribute(
        String prefix,
        String namespace,
        String attName,
        String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeAttribute(
        String namespace,
        String attName,
        String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
            registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeQNameAttribute(
        String namespace,
        String attName,
        javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      String attributeNamespace = qname.getNamespaceURI();
      String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }
    /** method to handle Qnames */
    private void writeQName(
        javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
              prefix
                  + ":"
                  + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
        javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to write any
        // namespace data after writing the charactor data
        StringBuffer stringToWrite = new StringBuffer();
        String namespaceURI = null;
        String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                  .append(prefix)
                  .append(":")
                  .append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /** Register a namespace prefix */
    private String registerPrefix(
        javax.xml.stream.XMLStreamWriter xmlWriter, String namespace)
        throws javax.xml.stream.XMLStreamException {
      String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /** Factory class that keeps the parse method */
    public static class Factory {
      private static org.apache.commons.logging.Log log =
          org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an element, the current
       * or next start element starts this object and any intervening reader events are ignorable If
       * this object is not an element, it is a complex type and the reader is at the event just
       * after the outer start element Postcondition: If this object is an element, the reader is
       * positioned at its end element If this object is a complex type, the reader is positioned at
       * the end element of its outer element
       */
      public static DepartmentBean parse(javax.xml.stream.XMLStreamReader reader)
          throws Exception {
        DepartmentBean object = new DepartmentBean();

        int event;
        javax.xml.namespace.QName currentQName = null;
        String nillableValue = null;
        String prefix = "";
        String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          currentQName = reader.getName();

          if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type")
              != null) {
            String fullTypeName =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
            if (fullTypeName != null) {
              String nsPrefix = null;
              if (fullTypeName.indexOf(":") > -1) {
                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
              }
              nsPrefix = nsPrefix == null ? "" : nsPrefix;

              String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

              if (!"DepartmentBean".equals(type)) {
                // find namespace for the prefix
                String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                return (DepartmentBean) ExtensionMapper.getTypeObject(nsUri, type, reader);
              }
            }
          }

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          reader.next();

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://webservice.hrm.weaver", "_canceled")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.set_canceled(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://webservice.hrm.weaver", "_code")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.set_code(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://webservice.hrm.weaver", "_departmentid")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.set_departmentid(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://webservice.hrm.weaver", "_fullname")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.set_fullname(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://webservice.hrm.weaver", "_shortname")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.set_shortname(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://webservice.hrm.weaver", "_showorder")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.set_showorder(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://webservice.hrm.weaver", "_subcompanyid")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.set_subcompanyid(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://webservice.hrm.weaver", "_supdepartmentid")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.set_supdepartmentid(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://webservice.hrm.weaver", "action")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.setAction(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://webservice.hrm.weaver", "lastChangdate")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.setLastChangdate(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement())
            // 2 - A start element we are not expecting indicates a trailing invalid property

            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  public static class GetHrmUserInfoXML implements org.apache.axis2.databinding.ADBBean {

    public static final javax.xml.namespace.QName MY_QNAME =
        new javax.xml.namespace.QName(
            "http://localhost/services/HrmService", "getHrmUserInfoXML", "ns2");

    /** field for In0 */
    protected String localIn0;

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getIn0() {
      return localIn0;
    }

    /**
     * Auto generated setter method
     *
     * @param param In0
     */
    public void setIn0(String param) {

      this.localIn0 = param;
    }

    /** field for In1 */
    protected String localIn1;

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getIn1() {
      return localIn1;
    }

    /**
     * Auto generated setter method
     *
     * @param param In1
     */
    public void setIn1(String param) {

      this.localIn1 = param;
    }

    /** field for In2 */
    protected String localIn2;

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getIn2() {
      return localIn2;
    }

    /**
     * Auto generated setter method
     *
     * @param param In2
     */
    public void setIn2(String param) {

      this.localIn2 = param;
    }

    /** field for In3 */
    protected String localIn3;

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getIn3() {
      return localIn3;
    }

    /**
     * Auto generated setter method
     *
     * @param param In3
     */
    public void setIn3(String param) {

      this.localIn3 = param;
    }

    /** field for In4 */
    protected String localIn4;

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getIn4() {
      return localIn4;
    }

    /**
     * Auto generated setter method
     *
     * @param param In4
     */
    public void setIn4(String param) {

      this.localIn4 = param;
    }

    /** field for In5 */
    protected String localIn5;

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getIn5() {
      return localIn5;
    }

    /**
     * Auto generated setter method
     *
     * @param param In5
     */
    public void setIn5(String param) {

      this.localIn5 = param;
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
        final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
        throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
          new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME));
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter,
        boolean serializeType)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      String prefix = null;
      String namespace = null;

      prefix = parentQName.getPrefix();
      namespace = parentQName.getNamespaceURI();
      writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

      if (serializeType) {

        String namespacePrefix =
            registerPrefix(xmlWriter, "http://localhost/services/HrmService");
        if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              namespacePrefix + ":getHrmUserInfoXML",
              xmlWriter);
        } else {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              "getHrmUserInfoXML",
              xmlWriter);
        }
      }

      namespace = "http://localhost/services/HrmService";
      writeStartElement(null, namespace, "in0", xmlWriter);

      if (localIn0 == null) {
        // write the nil attribute

        writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

      } else {

        xmlWriter.writeCharacters(localIn0);
      }

      xmlWriter.writeEndElement();

      namespace = "http://localhost/services/HrmService";
      writeStartElement(null, namespace, "in1", xmlWriter);

      if (localIn1 == null) {
        // write the nil attribute

        writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

      } else {

        xmlWriter.writeCharacters(localIn1);
      }

      xmlWriter.writeEndElement();

      namespace = "http://localhost/services/HrmService";
      writeStartElement(null, namespace, "in2", xmlWriter);

      if (localIn2 == null) {
        // write the nil attribute

        writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

      } else {

        xmlWriter.writeCharacters(localIn2);
      }

      xmlWriter.writeEndElement();

      namespace = "http://localhost/services/HrmService";
      writeStartElement(null, namespace, "in3", xmlWriter);

      if (localIn3 == null) {
        // write the nil attribute

        writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

      } else {

        xmlWriter.writeCharacters(localIn3);
      }

      xmlWriter.writeEndElement();

      namespace = "http://localhost/services/HrmService";
      writeStartElement(null, namespace, "in4", xmlWriter);

      if (localIn4 == null) {
        // write the nil attribute

        writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

      } else {

        xmlWriter.writeCharacters(localIn4);
      }

      xmlWriter.writeEndElement();

      namespace = "http://localhost/services/HrmService";
      writeStartElement(null, namespace, "in5", xmlWriter);

      if (localIn5 == null) {
        // write the nil attribute

        writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

      } else {

        xmlWriter.writeCharacters(localIn5);
      }

      xmlWriter.writeEndElement();

      xmlWriter.writeEndElement();
    }

    private static String generatePrefix(String namespace) {
      if (namespace.equals("http://localhost/services/HrmService")) {
        return "ns2";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /** Utility method to write an element start tag. */
    private void writeStartElement(
        String prefix,
        String namespace,
        String localPart,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /** Util method to write an attribute with the ns prefix */
    private void writeAttribute(
        String prefix,
        String namespace,
        String attName,
        String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeAttribute(
        String namespace,
        String attName,
        String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
            registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeQNameAttribute(
        String namespace,
        String attName,
        javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      String attributeNamespace = qname.getNamespaceURI();
      String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }
    /** method to handle Qnames */
    private void writeQName(
        javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
              prefix
                  + ":"
                  + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
        javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to write any
        // namespace data after writing the charactor data
        StringBuffer stringToWrite = new StringBuffer();
        String namespaceURI = null;
        String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                  .append(prefix)
                  .append(":")
                  .append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /** Register a namespace prefix */
    private String registerPrefix(
        javax.xml.stream.XMLStreamWriter xmlWriter, String namespace)
        throws javax.xml.stream.XMLStreamException {
      String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /** Factory class that keeps the parse method */
    public static class Factory {
      private static org.apache.commons.logging.Log log =
          org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an element, the current
       * or next start element starts this object and any intervening reader events are ignorable If
       * this object is not an element, it is a complex type and the reader is at the event just
       * after the outer start element Postcondition: If this object is an element, the reader is
       * positioned at its end element If this object is a complex type, the reader is positioned at
       * the end element of its outer element
       */
      public static GetHrmUserInfoXML parse(javax.xml.stream.XMLStreamReader reader)
          throws Exception {
        GetHrmUserInfoXML object = new GetHrmUserInfoXML();

        int event;
        javax.xml.namespace.QName currentQName = null;
        String nillableValue = null;
        String prefix = "";
        String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          currentQName = reader.getName();

          if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type")
              != null) {
            String fullTypeName =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
            if (fullTypeName != null) {
              String nsPrefix = null;
              if (fullTypeName.indexOf(":") > -1) {
                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
              }
              nsPrefix = nsPrefix == null ? "" : nsPrefix;

              String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

              if (!"getHrmUserInfoXML".equals(type)) {
                // find namespace for the prefix
                String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                return (GetHrmUserInfoXML) ExtensionMapper.getTypeObject(nsUri, type, reader);
              }
            }
          }

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          reader.next();

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://localhost/services/HrmService", "in0")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.setIn0(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {
            // 1 - A start element we are not expecting indicates an invalid parameter was passed
            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());
          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://localhost/services/HrmService", "in1")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.setIn1(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {
            // 1 - A start element we are not expecting indicates an invalid parameter was passed
            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());
          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://localhost/services/HrmService", "in2")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.setIn2(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {
            // 1 - A start element we are not expecting indicates an invalid parameter was passed
            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());
          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://localhost/services/HrmService", "in3")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.setIn3(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {
            // 1 - A start element we are not expecting indicates an invalid parameter was passed
            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());
          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://localhost/services/HrmService", "in4")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.setIn4(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {
            // 1 - A start element we are not expecting indicates an invalid parameter was passed
            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());
          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://localhost/services/HrmService", "in5")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.setIn5(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {
            // 1 - A start element we are not expecting indicates an invalid parameter was passed
            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());
          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement())
            // 2 - A start element we are not expecting indicates a trailing invalid property

            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  public static class GetHrmJobTitleInfoXML implements org.apache.axis2.databinding.ADBBean {

    public static final javax.xml.namespace.QName MY_QNAME =
        new javax.xml.namespace.QName(
            "http://localhost/services/HrmService", "getHrmJobTitleInfoXML", "ns2");

    /** field for In0 */
    protected String localIn0;

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getIn0() {
      return localIn0;
    }

    /**
     * Auto generated setter method
     *
     * @param param In0
     */
    public void setIn0(String param) {

      this.localIn0 = param;
    }

    /** field for In1 */
    protected String localIn1;

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getIn1() {
      return localIn1;
    }

    /**
     * Auto generated setter method
     *
     * @param param In1
     */
    public void setIn1(String param) {

      this.localIn1 = param;
    }

    /** field for In2 */
    protected String localIn2;

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getIn2() {
      return localIn2;
    }

    /**
     * Auto generated setter method
     *
     * @param param In2
     */
    public void setIn2(String param) {

      this.localIn2 = param;
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
        final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
        throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
          new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME));
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter,
        boolean serializeType)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      String prefix = null;
      String namespace = null;

      prefix = parentQName.getPrefix();
      namespace = parentQName.getNamespaceURI();
      writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

      if (serializeType) {

        String namespacePrefix =
            registerPrefix(xmlWriter, "http://localhost/services/HrmService");
        if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              namespacePrefix + ":getHrmJobTitleInfoXML",
              xmlWriter);
        } else {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              "getHrmJobTitleInfoXML",
              xmlWriter);
        }
      }

      namespace = "http://localhost/services/HrmService";
      writeStartElement(null, namespace, "in0", xmlWriter);

      if (localIn0 == null) {
        // write the nil attribute

        writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

      } else {

        xmlWriter.writeCharacters(localIn0);
      }

      xmlWriter.writeEndElement();

      namespace = "http://localhost/services/HrmService";
      writeStartElement(null, namespace, "in1", xmlWriter);

      if (localIn1 == null) {
        // write the nil attribute

        writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

      } else {

        xmlWriter.writeCharacters(localIn1);
      }

      xmlWriter.writeEndElement();

      namespace = "http://localhost/services/HrmService";
      writeStartElement(null, namespace, "in2", xmlWriter);

      if (localIn2 == null) {
        // write the nil attribute

        writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

      } else {

        xmlWriter.writeCharacters(localIn2);
      }

      xmlWriter.writeEndElement();

      xmlWriter.writeEndElement();
    }

    private static String generatePrefix(String namespace) {
      if (namespace.equals("http://localhost/services/HrmService")) {
        return "ns2";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /** Utility method to write an element start tag. */
    private void writeStartElement(
        String prefix,
        String namespace,
        String localPart,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /** Util method to write an attribute with the ns prefix */
    private void writeAttribute(
        String prefix,
        String namespace,
        String attName,
        String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeAttribute(
        String namespace,
        String attName,
        String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
            registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeQNameAttribute(
        String namespace,
        String attName,
        javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      String attributeNamespace = qname.getNamespaceURI();
      String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }
    /** method to handle Qnames */
    private void writeQName(
        javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
              prefix
                  + ":"
                  + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
        javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to write any
        // namespace data after writing the charactor data
        StringBuffer stringToWrite = new StringBuffer();
        String namespaceURI = null;
        String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                  .append(prefix)
                  .append(":")
                  .append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /** Register a namespace prefix */
    private String registerPrefix(
        javax.xml.stream.XMLStreamWriter xmlWriter, String namespace)
        throws javax.xml.stream.XMLStreamException {
      String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /** Factory class that keeps the parse method */
    public static class Factory {
      private static org.apache.commons.logging.Log log =
          org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an element, the current
       * or next start element starts this object and any intervening reader events are ignorable If
       * this object is not an element, it is a complex type and the reader is at the event just
       * after the outer start element Postcondition: If this object is an element, the reader is
       * positioned at its end element If this object is a complex type, the reader is positioned at
       * the end element of its outer element
       */
      public static GetHrmJobTitleInfoXML parse(javax.xml.stream.XMLStreamReader reader)
          throws Exception {
        GetHrmJobTitleInfoXML object = new GetHrmJobTitleInfoXML();

        int event;
        javax.xml.namespace.QName currentQName = null;
        String nillableValue = null;
        String prefix = "";
        String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          currentQName = reader.getName();

          if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type")
              != null) {
            String fullTypeName =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
            if (fullTypeName != null) {
              String nsPrefix = null;
              if (fullTypeName.indexOf(":") > -1) {
                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
              }
              nsPrefix = nsPrefix == null ? "" : nsPrefix;

              String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

              if (!"getHrmJobTitleInfoXML".equals(type)) {
                // find namespace for the prefix
                String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                return (GetHrmJobTitleInfoXML) ExtensionMapper.getTypeObject(nsUri, type, reader);
              }
            }
          }

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          reader.next();

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://localhost/services/HrmService", "in0")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.setIn0(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {
            // 1 - A start element we are not expecting indicates an invalid parameter was passed
            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());
          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://localhost/services/HrmService", "in1")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.setIn1(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {
            // 1 - A start element we are not expecting indicates an invalid parameter was passed
            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());
          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://localhost/services/HrmService", "in2")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.setIn2(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {
            // 1 - A start element we are not expecting indicates an invalid parameter was passed
            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());
          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement())
            // 2 - A start element we are not expecting indicates a trailing invalid property

            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  public static class ArrayOfJobTitleBean implements org.apache.axis2.databinding.ADBBean {
    /* This type was generated from the piece of schema that had
    name = ArrayOfJobTitleBean
    Namespace URI = http://webservice.hrm.weaver
    Namespace Prefix = ns1
    */

    /** field for JobTitleBean This was an Array! */
    protected JobTitleBean[] localJobTitleBean;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localJobTitleBeanTracker = false;

    public boolean isJobTitleBeanSpecified() {
      return localJobTitleBeanTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return JobTitleBean[]
     */
    public JobTitleBean[] getJobTitleBean() {
      return localJobTitleBean;
    }

    /** validate the array for JobTitleBean */
    protected void validateJobTitleBean(JobTitleBean[] param) {}

    /**
     * Auto generated setter method
     *
     * @param param JobTitleBean
     */
    public void setJobTitleBean(JobTitleBean[] param) {

      validateJobTitleBean(param);

      localJobTitleBeanTracker = true;

      this.localJobTitleBean = param;
    }

    /**
     * Auto generated add method for the array for convenience
     *
     * @param param JobTitleBean
     */
    public void addJobTitleBean(JobTitleBean param) {
      if (localJobTitleBean == null) {
        localJobTitleBean = new JobTitleBean[] {};
      }

      // update the setting tracker
      localJobTitleBeanTracker = true;

      java.util.List list =
          org.apache.axis2.databinding.utils.ConverterUtil.toList(localJobTitleBean);
      list.add(param);
      this.localJobTitleBean = (JobTitleBean[]) list.toArray(new JobTitleBean[list.size()]);
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
        final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
        throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
          new org.apache.axis2.databinding.ADBDataSource(this, parentQName));
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter,
        boolean serializeType)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      String prefix = null;
      String namespace = null;

      prefix = parentQName.getPrefix();
      namespace = parentQName.getNamespaceURI();
      writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

      if (serializeType) {

        String namespacePrefix =
            registerPrefix(xmlWriter, "http://webservice.hrm.weaver");
        if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              namespacePrefix + ":ArrayOfJobTitleBean",
              xmlWriter);
        } else {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              "ArrayOfJobTitleBean",
              xmlWriter);
        }
      }
      if (localJobTitleBeanTracker) {
        if (localJobTitleBean != null) {
          for (int i = 0; i < localJobTitleBean.length; i++) {
            if (localJobTitleBean[i] != null) {
              localJobTitleBean[i].serialize(
                  new javax.xml.namespace.QName("http://webservice.hrm.weaver", "JobTitleBean"),
                  xmlWriter);
            } else {

              writeStartElement(null, "http://webservice.hrm.weaver", "JobTitleBean", xmlWriter);

              // write the nil attribute
              writeAttribute(
                  "xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);
              xmlWriter.writeEndElement();
            }
          }
        } else {

          writeStartElement(null, "http://webservice.hrm.weaver", "JobTitleBean", xmlWriter);

          // write the nil attribute
          writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);
          xmlWriter.writeEndElement();
        }
      }
      xmlWriter.writeEndElement();
    }

    private static String generatePrefix(String namespace) {
      if (namespace.equals("http://webservice.hrm.weaver")) {
        return "ns1";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /** Utility method to write an element start tag. */
    private void writeStartElement(
        String prefix,
        String namespace,
        String localPart,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /** Util method to write an attribute with the ns prefix */
    private void writeAttribute(
        String prefix,
        String namespace,
        String attName,
        String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeAttribute(
        String namespace,
        String attName,
        String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
            registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeQNameAttribute(
        String namespace,
        String attName,
        javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      String attributeNamespace = qname.getNamespaceURI();
      String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }
    /** method to handle Qnames */
    private void writeQName(
        javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
              prefix
                  + ":"
                  + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
        javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to write any
        // namespace data after writing the charactor data
        StringBuffer stringToWrite = new StringBuffer();
        String namespaceURI = null;
        String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                  .append(prefix)
                  .append(":")
                  .append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /** Register a namespace prefix */
    private String registerPrefix(
        javax.xml.stream.XMLStreamWriter xmlWriter, String namespace)
        throws javax.xml.stream.XMLStreamException {
      String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /** Factory class that keeps the parse method */
    public static class Factory {
      private static org.apache.commons.logging.Log log =
          org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an element, the current
       * or next start element starts this object and any intervening reader events are ignorable If
       * this object is not an element, it is a complex type and the reader is at the event just
       * after the outer start element Postcondition: If this object is an element, the reader is
       * positioned at its end element If this object is a complex type, the reader is positioned at
       * the end element of its outer element
       */
      public static ArrayOfJobTitleBean parse(javax.xml.stream.XMLStreamReader reader)
          throws Exception {
        ArrayOfJobTitleBean object = new ArrayOfJobTitleBean();

        int event;
        javax.xml.namespace.QName currentQName = null;
        String nillableValue = null;
        String prefix = "";
        String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          currentQName = reader.getName();

          if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type")
              != null) {
            String fullTypeName =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
            if (fullTypeName != null) {
              String nsPrefix = null;
              if (fullTypeName.indexOf(":") > -1) {
                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
              }
              nsPrefix = nsPrefix == null ? "" : nsPrefix;

              String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

              if (!"ArrayOfJobTitleBean".equals(type)) {
                // find namespace for the prefix
                String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                return (ArrayOfJobTitleBean) ExtensionMapper.getTypeObject(nsUri, type, reader);
              }
            }
          }

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          reader.next();

          java.util.ArrayList list1 = new java.util.ArrayList();

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://webservice.hrm.weaver", "JobTitleBean")
                  .equals(reader.getName())) {

            // Process the array and step past its final element's end.

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              list1.add(null);
              reader.next();
            } else {
              list1.add(JobTitleBean.Factory.parse(reader));
            }
            // loop until we find a start element that is not part of this array
            boolean loopDone1 = false;
            while (!loopDone1) {
              // We should be at the end element, but make sure
              while (!reader.isEndElement()) reader.next();
              // Step out of this element
              reader.next();
              // Step to next element event.
              while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
              if (reader.isEndElement()) {
                // two continuous end elements means we are exiting the xml structure
                loopDone1 = true;
              } else {
                if (new javax.xml.namespace.QName("http://webservice.hrm.weaver", "JobTitleBean")
                    .equals(reader.getName())) {

                  nillableValue =
                      reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                  if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                    list1.add(null);
                    reader.next();
                  } else {
                    list1.add(JobTitleBean.Factory.parse(reader));
                  }
                } else {
                  loopDone1 = true;
                }
              }
            }
            // call the converter utility  to convert and set the array

            object.setJobTitleBean(
                (JobTitleBean[])
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                        JobTitleBean.class, list1));

          } // End of if for expected property start element
          else {

          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement())
            // 2 - A start element we are not expecting indicates a trailing invalid property

            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  public static class CheckUser implements org.apache.axis2.databinding.ADBBean {

    public static final javax.xml.namespace.QName MY_QNAME =
        new javax.xml.namespace.QName("http://localhost/services/HrmService", "checkUser", "ns2");

    /** field for In0 */
    protected String localIn0;

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getIn0() {
      return localIn0;
    }

    /**
     * Auto generated setter method
     *
     * @param param In0
     */
    public void setIn0(String param) {

      this.localIn0 = param;
    }

    /** field for In1 */
    protected String localIn1;

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getIn1() {
      return localIn1;
    }

    /**
     * Auto generated setter method
     *
     * @param param In1
     */
    public void setIn1(String param) {

      this.localIn1 = param;
    }

    /** field for In2 */
    protected String localIn2;

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getIn2() {
      return localIn2;
    }

    /**
     * Auto generated setter method
     *
     * @param param In2
     */
    public void setIn2(String param) {

      this.localIn2 = param;
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
        final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
        throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
          new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME));
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter,
        boolean serializeType)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      String prefix = null;
      String namespace = null;

      prefix = parentQName.getPrefix();
      namespace = parentQName.getNamespaceURI();
      writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

      if (serializeType) {

        String namespacePrefix =
            registerPrefix(xmlWriter, "http://localhost/services/HrmService");
        if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              namespacePrefix + ":checkUser",
              xmlWriter);
        } else {
          writeAttribute(
              "xsi", "http://www.w3.org/2001/XMLSchema-instance", "type", "checkUser", xmlWriter);
        }
      }

      namespace = "http://localhost/services/HrmService";
      writeStartElement(null, namespace, "in0", xmlWriter);

      if (localIn0 == null) {
        // write the nil attribute

        writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

      } else {

        xmlWriter.writeCharacters(localIn0);
      }

      xmlWriter.writeEndElement();

      namespace = "http://localhost/services/HrmService";
      writeStartElement(null, namespace, "in1", xmlWriter);

      if (localIn1 == null) {
        // write the nil attribute

        writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

      } else {

        xmlWriter.writeCharacters(localIn1);
      }

      xmlWriter.writeEndElement();

      namespace = "http://localhost/services/HrmService";
      writeStartElement(null, namespace, "in2", xmlWriter);

      if (localIn2 == null) {
        // write the nil attribute

        writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

      } else {

        xmlWriter.writeCharacters(localIn2);
      }

      xmlWriter.writeEndElement();

      xmlWriter.writeEndElement();
    }

    private static String generatePrefix(String namespace) {
      if (namespace.equals("http://localhost/services/HrmService")) {
        return "ns2";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /** Utility method to write an element start tag. */
    private void writeStartElement(
        String prefix,
        String namespace,
        String localPart,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /** Util method to write an attribute with the ns prefix */
    private void writeAttribute(
        String prefix,
        String namespace,
        String attName,
        String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeAttribute(
        String namespace,
        String attName,
        String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
            registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeQNameAttribute(
        String namespace,
        String attName,
        javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      String attributeNamespace = qname.getNamespaceURI();
      String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }
    /** method to handle Qnames */
    private void writeQName(
        javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
              prefix
                  + ":"
                  + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
        javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to write any
        // namespace data after writing the charactor data
        StringBuffer stringToWrite = new StringBuffer();
        String namespaceURI = null;
        String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                  .append(prefix)
                  .append(":")
                  .append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /** Register a namespace prefix */
    private String registerPrefix(
        javax.xml.stream.XMLStreamWriter xmlWriter, String namespace)
        throws javax.xml.stream.XMLStreamException {
      String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /** Factory class that keeps the parse method */
    public static class Factory {
      private static org.apache.commons.logging.Log log =
          org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an element, the current
       * or next start element starts this object and any intervening reader events are ignorable If
       * this object is not an element, it is a complex type and the reader is at the event just
       * after the outer start element Postcondition: If this object is an element, the reader is
       * positioned at its end element If this object is a complex type, the reader is positioned at
       * the end element of its outer element
       */
      public static CheckUser parse(javax.xml.stream.XMLStreamReader reader)
          throws Exception {
        CheckUser object = new CheckUser();

        int event;
        javax.xml.namespace.QName currentQName = null;
        String nillableValue = null;
        String prefix = "";
        String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          currentQName = reader.getName();

          if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type")
              != null) {
            String fullTypeName =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
            if (fullTypeName != null) {
              String nsPrefix = null;
              if (fullTypeName.indexOf(":") > -1) {
                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
              }
              nsPrefix = nsPrefix == null ? "" : nsPrefix;

              String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

              if (!"checkUser".equals(type)) {
                // find namespace for the prefix
                String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                return (CheckUser) ExtensionMapper.getTypeObject(nsUri, type, reader);
              }
            }
          }

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          reader.next();

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://localhost/services/HrmService", "in0")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.setIn0(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {
            // 1 - A start element we are not expecting indicates an invalid parameter was passed
            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());
          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://localhost/services/HrmService", "in1")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.setIn1(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {
            // 1 - A start element we are not expecting indicates an invalid parameter was passed
            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());
          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://localhost/services/HrmService", "in2")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.setIn2(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {
            // 1 - A start element we are not expecting indicates an invalid parameter was passed
            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());
          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement())
            // 2 - A start element we are not expecting indicates a trailing invalid property

            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  public static class GetHrmUserInfoResponse implements org.apache.axis2.databinding.ADBBean {

    public static final javax.xml.namespace.QName MY_QNAME =
        new javax.xml.namespace.QName(
            "http://localhost/services/HrmService", "getHrmUserInfoResponse", "ns2");

    /** field for Out */
    protected ArrayOfUserBean localOut;

    /**
     * Auto generated getter method
     *
     * @return ArrayOfUserBean
     */
    public ArrayOfUserBean getOut() {
      return localOut;
    }

    /**
     * Auto generated setter method
     *
     * @param param Out
     */
    public void setOut(ArrayOfUserBean param) {

      this.localOut = param;
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
        final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
        throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
          new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME));
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter,
        boolean serializeType)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      String prefix = null;
      String namespace = null;

      prefix = parentQName.getPrefix();
      namespace = parentQName.getNamespaceURI();
      writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

      if (serializeType) {

        String namespacePrefix =
            registerPrefix(xmlWriter, "http://localhost/services/HrmService");
        if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              namespacePrefix + ":getHrmUserInfoResponse",
              xmlWriter);
        } else {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              "getHrmUserInfoResponse",
              xmlWriter);
        }
      }

      if (localOut == null) {

        writeStartElement(null, "http://localhost/services/HrmService", "out", xmlWriter);

        // write the nil attribute
        writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);
        xmlWriter.writeEndElement();
      } else {
        localOut.serialize(
            new javax.xml.namespace.QName("http://localhost/services/HrmService", "out"),
            xmlWriter);
      }

      xmlWriter.writeEndElement();
    }

    private static String generatePrefix(String namespace) {
      if (namespace.equals("http://localhost/services/HrmService")) {
        return "ns2";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /** Utility method to write an element start tag. */
    private void writeStartElement(
        String prefix,
        String namespace,
        String localPart,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /** Util method to write an attribute with the ns prefix */
    private void writeAttribute(
        String prefix,
        String namespace,
        String attName,
        String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeAttribute(
        String namespace,
        String attName,
        String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
            registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeQNameAttribute(
        String namespace,
        String attName,
        javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      String attributeNamespace = qname.getNamespaceURI();
      String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }
    /** method to handle Qnames */
    private void writeQName(
        javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
              prefix
                  + ":"
                  + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
        javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to write any
        // namespace data after writing the charactor data
        StringBuffer stringToWrite = new StringBuffer();
        String namespaceURI = null;
        String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                  .append(prefix)
                  .append(":")
                  .append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /** Register a namespace prefix */
    private String registerPrefix(
        javax.xml.stream.XMLStreamWriter xmlWriter, String namespace)
        throws javax.xml.stream.XMLStreamException {
      String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /** Factory class that keeps the parse method */
    public static class Factory {
      private static org.apache.commons.logging.Log log =
          org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an element, the current
       * or next start element starts this object and any intervening reader events are ignorable If
       * this object is not an element, it is a complex type and the reader is at the event just
       * after the outer start element Postcondition: If this object is an element, the reader is
       * positioned at its end element If this object is a complex type, the reader is positioned at
       * the end element of its outer element
       */
      public static GetHrmUserInfoResponse parse(javax.xml.stream.XMLStreamReader reader)
          throws Exception {
        GetHrmUserInfoResponse object = new GetHrmUserInfoResponse();

        int event;
        javax.xml.namespace.QName currentQName = null;
        String nillableValue = null;
        String prefix = "";
        String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          currentQName = reader.getName();

          if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type")
              != null) {
            String fullTypeName =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
            if (fullTypeName != null) {
              String nsPrefix = null;
              if (fullTypeName.indexOf(":") > -1) {
                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
              }
              nsPrefix = nsPrefix == null ? "" : nsPrefix;

              String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

              if (!"getHrmUserInfoResponse".equals(type)) {
                // find namespace for the prefix
                String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                return (GetHrmUserInfoResponse) ExtensionMapper.getTypeObject(nsUri, type, reader);
              }
            }
          }

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          reader.next();

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://localhost/services/HrmService", "out")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              object.setOut(null);
              reader.next();

              reader.next();

            } else {

              object.setOut(ArrayOfUserBean.Factory.parse(reader));

              reader.next();
            }
          } // End of if for expected property start element
          else {
            // 1 - A start element we are not expecting indicates an invalid parameter was passed
            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());
          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement())
            // 2 - A start element we are not expecting indicates a trailing invalid property

            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  public static class GetHrmDepartmentInfoResponse implements org.apache.axis2.databinding.ADBBean {

    public static final javax.xml.namespace.QName MY_QNAME =
        new javax.xml.namespace.QName(
            "http://localhost/services/HrmService", "getHrmDepartmentInfoResponse", "ns2");

    /** field for Out */
    protected ArrayOfDepartmentBean localOut;

    /**
     * Auto generated getter method
     *
     * @return ArrayOfDepartmentBean
     */
    public ArrayOfDepartmentBean getOut() {
      return localOut;
    }

    /**
     * Auto generated setter method
     *
     * @param param Out
     */
    public void setOut(ArrayOfDepartmentBean param) {

      this.localOut = param;
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
        final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
        throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
          new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME));
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter,
        boolean serializeType)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      String prefix = null;
      String namespace = null;

      prefix = parentQName.getPrefix();
      namespace = parentQName.getNamespaceURI();
      writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

      if (serializeType) {

        String namespacePrefix =
            registerPrefix(xmlWriter, "http://localhost/services/HrmService");
        if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              namespacePrefix + ":getHrmDepartmentInfoResponse",
              xmlWriter);
        } else {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              "getHrmDepartmentInfoResponse",
              xmlWriter);
        }
      }

      if (localOut == null) {

        writeStartElement(null, "http://localhost/services/HrmService", "out", xmlWriter);

        // write the nil attribute
        writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);
        xmlWriter.writeEndElement();
      } else {
        localOut.serialize(
            new javax.xml.namespace.QName("http://localhost/services/HrmService", "out"),
            xmlWriter);
      }

      xmlWriter.writeEndElement();
    }

    private static String generatePrefix(String namespace) {
      if (namespace.equals("http://localhost/services/HrmService")) {
        return "ns2";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /** Utility method to write an element start tag. */
    private void writeStartElement(
        String prefix,
        String namespace,
        String localPart,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /** Util method to write an attribute with the ns prefix */
    private void writeAttribute(
        String prefix,
        String namespace,
        String attName,
        String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeAttribute(
        String namespace,
        String attName,
        String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
            registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeQNameAttribute(
        String namespace,
        String attName,
        javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      String attributeNamespace = qname.getNamespaceURI();
      String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }
    /** method to handle Qnames */
    private void writeQName(
        javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
              prefix
                  + ":"
                  + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
        javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to write any
        // namespace data after writing the charactor data
        StringBuffer stringToWrite = new StringBuffer();
        String namespaceURI = null;
        String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                  .append(prefix)
                  .append(":")
                  .append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /** Register a namespace prefix */
    private String registerPrefix(
        javax.xml.stream.XMLStreamWriter xmlWriter, String namespace)
        throws javax.xml.stream.XMLStreamException {
      String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /** Factory class that keeps the parse method */
    public static class Factory {
      private static org.apache.commons.logging.Log log =
          org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an element, the current
       * or next start element starts this object and any intervening reader events are ignorable If
       * this object is not an element, it is a complex type and the reader is at the event just
       * after the outer start element Postcondition: If this object is an element, the reader is
       * positioned at its end element If this object is a complex type, the reader is positioned at
       * the end element of its outer element
       */
      public static GetHrmDepartmentInfoResponse parse(javax.xml.stream.XMLStreamReader reader)
          throws Exception {
        GetHrmDepartmentInfoResponse object = new GetHrmDepartmentInfoResponse();

        int event;
        javax.xml.namespace.QName currentQName = null;
        String nillableValue = null;
        String prefix = "";
        String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          currentQName = reader.getName();

          if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type")
              != null) {
            String fullTypeName =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
            if (fullTypeName != null) {
              String nsPrefix = null;
              if (fullTypeName.indexOf(":") > -1) {
                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
              }
              nsPrefix = nsPrefix == null ? "" : nsPrefix;

              String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

              if (!"getHrmDepartmentInfoResponse".equals(type)) {
                // find namespace for the prefix
                String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                return (GetHrmDepartmentInfoResponse)
                    ExtensionMapper.getTypeObject(nsUri, type, reader);
              }
            }
          }

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          reader.next();

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://localhost/services/HrmService", "out")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              object.setOut(null);
              reader.next();

              reader.next();

            } else {

              object.setOut(ArrayOfDepartmentBean.Factory.parse(reader));

              reader.next();
            }
          } // End of if for expected property start element
          else {
            // 1 - A start element we are not expecting indicates an invalid parameter was passed
            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());
          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement())
            // 2 - A start element we are not expecting indicates a trailing invalid property

            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  public static class SynJobtitleResponse implements org.apache.axis2.databinding.ADBBean {

    public static final javax.xml.namespace.QName MY_QNAME =
        new javax.xml.namespace.QName(
            "http://localhost/services/HrmService", "SynJobtitleResponse", "ns2");

    /** field for Out */
    protected String localOut;

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getOut() {
      return localOut;
    }

    /**
     * Auto generated setter method
     *
     * @param param Out
     */
    public void setOut(String param) {

      this.localOut = param;
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
        final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
        throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
          new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME));
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter,
        boolean serializeType)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      String prefix = null;
      String namespace = null;

      prefix = parentQName.getPrefix();
      namespace = parentQName.getNamespaceURI();
      writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

      if (serializeType) {

        String namespacePrefix =
            registerPrefix(xmlWriter, "http://localhost/services/HrmService");
        if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              namespacePrefix + ":SynJobtitleResponse",
              xmlWriter);
        } else {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              "SynJobtitleResponse",
              xmlWriter);
        }
      }

      namespace = "http://localhost/services/HrmService";
      writeStartElement(null, namespace, "out", xmlWriter);

      if (localOut == null) {
        // write the nil attribute

        writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

      } else {

        xmlWriter.writeCharacters(localOut);
      }

      xmlWriter.writeEndElement();

      xmlWriter.writeEndElement();
    }

    private static String generatePrefix(String namespace) {
      if (namespace.equals("http://localhost/services/HrmService")) {
        return "ns2";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /** Utility method to write an element start tag. */
    private void writeStartElement(
        String prefix,
        String namespace,
        String localPart,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /** Util method to write an attribute with the ns prefix */
    private void writeAttribute(
        String prefix,
        String namespace,
        String attName,
        String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeAttribute(
        String namespace,
        String attName,
        String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
            registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeQNameAttribute(
        String namespace,
        String attName,
        javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      String attributeNamespace = qname.getNamespaceURI();
      String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }
    /** method to handle Qnames */
    private void writeQName(
        javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
              prefix
                  + ":"
                  + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
        javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to write any
        // namespace data after writing the charactor data
        StringBuffer stringToWrite = new StringBuffer();
        String namespaceURI = null;
        String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                  .append(prefix)
                  .append(":")
                  .append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /** Register a namespace prefix */
    private String registerPrefix(
        javax.xml.stream.XMLStreamWriter xmlWriter, String namespace)
        throws javax.xml.stream.XMLStreamException {
      String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /** Factory class that keeps the parse method */
    public static class Factory {
      private static org.apache.commons.logging.Log log =
          org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an element, the current
       * or next start element starts this object and any intervening reader events are ignorable If
       * this object is not an element, it is a complex type and the reader is at the event just
       * after the outer start element Postcondition: If this object is an element, the reader is
       * positioned at its end element If this object is a complex type, the reader is positioned at
       * the end element of its outer element
       */
      public static SynJobtitleResponse parse(javax.xml.stream.XMLStreamReader reader)
          throws Exception {
        SynJobtitleResponse object = new SynJobtitleResponse();

        int event;
        javax.xml.namespace.QName currentQName = null;
        String nillableValue = null;
        String prefix = "";
        String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          currentQName = reader.getName();

          if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type")
              != null) {
            String fullTypeName =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
            if (fullTypeName != null) {
              String nsPrefix = null;
              if (fullTypeName.indexOf(":") > -1) {
                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
              }
              nsPrefix = nsPrefix == null ? "" : nsPrefix;

              String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

              if (!"SynJobtitleResponse".equals(type)) {
                // find namespace for the prefix
                String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                return (SynJobtitleResponse) ExtensionMapper.getTypeObject(nsUri, type, reader);
              }
            }
          }

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          reader.next();

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://localhost/services/HrmService", "out")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.setOut(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {
            // 1 - A start element we are not expecting indicates an invalid parameter was passed
            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());
          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement())
            // 2 - A start element we are not expecting indicates a trailing invalid property

            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  public static class GetHrmJobTitleInfoResponse implements org.apache.axis2.databinding.ADBBean {

    public static final javax.xml.namespace.QName MY_QNAME =
        new javax.xml.namespace.QName(
            "http://localhost/services/HrmService", "getHrmJobTitleInfoResponse", "ns2");

    /** field for Out */
    protected ArrayOfJobTitleBean localOut;

    /**
     * Auto generated getter method
     *
     * @return ArrayOfJobTitleBean
     */
    public ArrayOfJobTitleBean getOut() {
      return localOut;
    }

    /**
     * Auto generated setter method
     *
     * @param param Out
     */
    public void setOut(ArrayOfJobTitleBean param) {

      this.localOut = param;
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
        final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
        throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
          new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME));
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter,
        boolean serializeType)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      String prefix = null;
      String namespace = null;

      prefix = parentQName.getPrefix();
      namespace = parentQName.getNamespaceURI();
      writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

      if (serializeType) {

        String namespacePrefix =
            registerPrefix(xmlWriter, "http://localhost/services/HrmService");
        if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              namespacePrefix + ":getHrmJobTitleInfoResponse",
              xmlWriter);
        } else {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              "getHrmJobTitleInfoResponse",
              xmlWriter);
        }
      }

      if (localOut == null) {

        writeStartElement(null, "http://localhost/services/HrmService", "out", xmlWriter);

        // write the nil attribute
        writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);
        xmlWriter.writeEndElement();
      } else {
        localOut.serialize(
            new javax.xml.namespace.QName("http://localhost/services/HrmService", "out"),
            xmlWriter);
      }

      xmlWriter.writeEndElement();
    }

    private static String generatePrefix(String namespace) {
      if (namespace.equals("http://localhost/services/HrmService")) {
        return "ns2";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /** Utility method to write an element start tag. */
    private void writeStartElement(
        String prefix,
        String namespace,
        String localPart,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /** Util method to write an attribute with the ns prefix */
    private void writeAttribute(
        String prefix,
        String namespace,
        String attName,
        String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeAttribute(
        String namespace,
        String attName,
        String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
            registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeQNameAttribute(
        String namespace,
        String attName,
        javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      String attributeNamespace = qname.getNamespaceURI();
      String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }
    /** method to handle Qnames */
    private void writeQName(
        javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
              prefix
                  + ":"
                  + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
        javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to write any
        // namespace data after writing the charactor data
        StringBuffer stringToWrite = new StringBuffer();
        String namespaceURI = null;
        String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                  .append(prefix)
                  .append(":")
                  .append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /** Register a namespace prefix */
    private String registerPrefix(
        javax.xml.stream.XMLStreamWriter xmlWriter, String namespace)
        throws javax.xml.stream.XMLStreamException {
      String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /** Factory class that keeps the parse method */
    public static class Factory {
      private static org.apache.commons.logging.Log log =
          org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an element, the current
       * or next start element starts this object and any intervening reader events are ignorable If
       * this object is not an element, it is a complex type and the reader is at the event just
       * after the outer start element Postcondition: If this object is an element, the reader is
       * positioned at its end element If this object is a complex type, the reader is positioned at
       * the end element of its outer element
       */
      public static GetHrmJobTitleInfoResponse parse(javax.xml.stream.XMLStreamReader reader)
          throws Exception {
        GetHrmJobTitleInfoResponse object = new GetHrmJobTitleInfoResponse();

        int event;
        javax.xml.namespace.QName currentQName = null;
        String nillableValue = null;
        String prefix = "";
        String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          currentQName = reader.getName();

          if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type")
              != null) {
            String fullTypeName =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
            if (fullTypeName != null) {
              String nsPrefix = null;
              if (fullTypeName.indexOf(":") > -1) {
                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
              }
              nsPrefix = nsPrefix == null ? "" : nsPrefix;

              String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

              if (!"getHrmJobTitleInfoResponse".equals(type)) {
                // find namespace for the prefix
                String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                return (GetHrmJobTitleInfoResponse)
                    ExtensionMapper.getTypeObject(nsUri, type, reader);
              }
            }
          }

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          reader.next();

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://localhost/services/HrmService", "out")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              object.setOut(null);
              reader.next();

              reader.next();

            } else {

              object.setOut(ArrayOfJobTitleBean.Factory.parse(reader));

              reader.next();
            }
          } // End of if for expected property start element
          else {
            // 1 - A start element we are not expecting indicates an invalid parameter was passed
            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());
          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement())
            // 2 - A start element we are not expecting indicates a trailing invalid property

            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  public static class GetHrmSubcompanyInfo implements org.apache.axis2.databinding.ADBBean {

    public static final javax.xml.namespace.QName MY_QNAME =
        new javax.xml.namespace.QName(
            "http://localhost/services/HrmService", "getHrmSubcompanyInfo", "ns2");

    /** field for In0 */
    protected String localIn0;

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getIn0() {
      return localIn0;
    }

    /**
     * Auto generated setter method
     *
     * @param param In0
     */
    public void setIn0(String param) {

      this.localIn0 = param;
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
        final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
        throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
          new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME));
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter,
        boolean serializeType)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      String prefix = null;
      String namespace = null;

      prefix = parentQName.getPrefix();
      namespace = parentQName.getNamespaceURI();
      writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

      if (serializeType) {

        String namespacePrefix =
            registerPrefix(xmlWriter, "http://localhost/services/HrmService");
        if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              namespacePrefix + ":getHrmSubcompanyInfo",
              xmlWriter);
        } else {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              "getHrmSubcompanyInfo",
              xmlWriter);
        }
      }

      namespace = "http://localhost/services/HrmService";
      writeStartElement(null, namespace, "in0", xmlWriter);

      if (localIn0 == null) {
        // write the nil attribute

        writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

      } else {

        xmlWriter.writeCharacters(localIn0);
      }

      xmlWriter.writeEndElement();

      xmlWriter.writeEndElement();
    }

    private static String generatePrefix(String namespace) {
      if (namespace.equals("http://localhost/services/HrmService")) {
        return "ns2";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /** Utility method to write an element start tag. */
    private void writeStartElement(
        String prefix,
        String namespace,
        String localPart,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /** Util method to write an attribute with the ns prefix */
    private void writeAttribute(
        String prefix,
        String namespace,
        String attName,
        String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeAttribute(
        String namespace,
        String attName,
        String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
            registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeQNameAttribute(
        String namespace,
        String attName,
        javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      String attributeNamespace = qname.getNamespaceURI();
      String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }
    /** method to handle Qnames */
    private void writeQName(
        javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
              prefix
                  + ":"
                  + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
        javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to write any
        // namespace data after writing the charactor data
        StringBuffer stringToWrite = new StringBuffer();
        String namespaceURI = null;
        String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                  .append(prefix)
                  .append(":")
                  .append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /** Register a namespace prefix */
    private String registerPrefix(
        javax.xml.stream.XMLStreamWriter xmlWriter, String namespace)
        throws javax.xml.stream.XMLStreamException {
      String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /** Factory class that keeps the parse method */
    public static class Factory {
      private static org.apache.commons.logging.Log log =
          org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an element, the current
       * or next start element starts this object and any intervening reader events are ignorable If
       * this object is not an element, it is a complex type and the reader is at the event just
       * after the outer start element Postcondition: If this object is an element, the reader is
       * positioned at its end element If this object is a complex type, the reader is positioned at
       * the end element of its outer element
       */
      public static GetHrmSubcompanyInfo parse(javax.xml.stream.XMLStreamReader reader)
          throws Exception {
        GetHrmSubcompanyInfo object = new GetHrmSubcompanyInfo();

        int event;
        javax.xml.namespace.QName currentQName = null;
        String nillableValue = null;
        String prefix = "";
        String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          currentQName = reader.getName();

          if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type")
              != null) {
            String fullTypeName =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
            if (fullTypeName != null) {
              String nsPrefix = null;
              if (fullTypeName.indexOf(":") > -1) {
                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
              }
              nsPrefix = nsPrefix == null ? "" : nsPrefix;

              String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

              if (!"getHrmSubcompanyInfo".equals(type)) {
                // find namespace for the prefix
                String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                return (GetHrmSubcompanyInfo) ExtensionMapper.getTypeObject(nsUri, type, reader);
              }
            }
          }

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          reader.next();

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://localhost/services/HrmService", "in0")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.setIn0(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {
            // 1 - A start element we are not expecting indicates an invalid parameter was passed
            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());
          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement())
            // 2 - A start element we are not expecting indicates a trailing invalid property

            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  public static class GetHrmSubcompanyInfoXMLResponse
      implements org.apache.axis2.databinding.ADBBean {

    public static final javax.xml.namespace.QName MY_QNAME =
        new javax.xml.namespace.QName(
            "http://localhost/services/HrmService", "getHrmSubcompanyInfoXMLResponse", "ns2");

    /** field for Out */
    protected String localOut;

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public String getOut() {
      return localOut;
    }

    /**
     * Auto generated setter method
     *
     * @param param Out
     */
    public void setOut(String param) {

      this.localOut = param;
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
        final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
        throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
          new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME));
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter,
        boolean serializeType)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      String prefix = null;
      String namespace = null;

      prefix = parentQName.getPrefix();
      namespace = parentQName.getNamespaceURI();
      writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

      if (serializeType) {

        String namespacePrefix =
            registerPrefix(xmlWriter, "http://localhost/services/HrmService");
        if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              namespacePrefix + ":getHrmSubcompanyInfoXMLResponse",
              xmlWriter);
        } else {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              "getHrmSubcompanyInfoXMLResponse",
              xmlWriter);
        }
      }

      namespace = "http://localhost/services/HrmService";
      writeStartElement(null, namespace, "out", xmlWriter);

      if (localOut == null) {
        // write the nil attribute

        writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "nil", "1", xmlWriter);

      } else {

        xmlWriter.writeCharacters(localOut);
      }

      xmlWriter.writeEndElement();

      xmlWriter.writeEndElement();
    }

    private static String generatePrefix(String namespace) {
      if (namespace.equals("http://localhost/services/HrmService")) {
        return "ns2";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /** Utility method to write an element start tag. */
    private void writeStartElement(
        String prefix,
        String namespace,
        String localPart,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /** Util method to write an attribute with the ns prefix */
    private void writeAttribute(
        String prefix,
        String namespace,
        String attName,
        String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeAttribute(
        String namespace,
        String attName,
        String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
            registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeQNameAttribute(
        String namespace,
        String attName,
        javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      String attributeNamespace = qname.getNamespaceURI();
      String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }
    /** method to handle Qnames */
    private void writeQName(
        javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
              prefix
                  + ":"
                  + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
        javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to write any
        // namespace data after writing the charactor data
        StringBuffer stringToWrite = new StringBuffer();
        String namespaceURI = null;
        String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                  .append(prefix)
                  .append(":")
                  .append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /** Register a namespace prefix */
    private String registerPrefix(
        javax.xml.stream.XMLStreamWriter xmlWriter, String namespace)
        throws javax.xml.stream.XMLStreamException {
      String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /** Factory class that keeps the parse method */
    public static class Factory {
      private static org.apache.commons.logging.Log log =
          org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an element, the current
       * or next start element starts this object and any intervening reader events are ignorable If
       * this object is not an element, it is a complex type and the reader is at the event just
       * after the outer start element Postcondition: If this object is an element, the reader is
       * positioned at its end element If this object is a complex type, the reader is positioned at
       * the end element of its outer element
       */
      public static GetHrmSubcompanyInfoXMLResponse parse(javax.xml.stream.XMLStreamReader reader)
          throws Exception {
        GetHrmSubcompanyInfoXMLResponse object = new GetHrmSubcompanyInfoXMLResponse();

        int event;
        javax.xml.namespace.QName currentQName = null;
        String nillableValue = null;
        String prefix = "";
        String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          currentQName = reader.getName();

          if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type")
              != null) {
            String fullTypeName =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
            if (fullTypeName != null) {
              String nsPrefix = null;
              if (fullTypeName.indexOf(":") > -1) {
                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
              }
              nsPrefix = nsPrefix == null ? "" : nsPrefix;

              String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

              if (!"getHrmSubcompanyInfoXMLResponse".equals(type)) {
                // find namespace for the prefix
                String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                return (GetHrmSubcompanyInfoXMLResponse)
                    ExtensionMapper.getTypeObject(nsUri, type, reader);
              }
            }
          }

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          reader.next();

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://localhost/services/HrmService", "out")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if (!"true".equals(nillableValue) && !"1".equals(nillableValue)) {

              String content = reader.getElementText();

              object.setOut(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

            } else {

              reader.getElementText(); // throw away text nodes if any.
            }

            reader.next();

          } // End of if for expected property start element
          else {
            // 1 - A start element we are not expecting indicates an invalid parameter was passed
            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());
          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement())
            // 2 - A start element we are not expecting indicates a trailing invalid property

            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  public static class ChangeUserPasswordResponse implements org.apache.axis2.databinding.ADBBean {

    public static final javax.xml.namespace.QName MY_QNAME =
        new javax.xml.namespace.QName(
            "http://localhost/services/HrmService", "changeUserPasswordResponse", "ns2");

    /** field for Out */
    protected boolean localOut;

    /**
     * Auto generated getter method
     *
     * @return boolean
     */
    public boolean getOut() {
      return localOut;
    }

    /**
     * Auto generated setter method
     *
     * @param param Out
     */
    public void setOut(boolean param) {

      this.localOut = param;
    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
        final javax.xml.namespace.QName parentQName, final org.apache.axiom.om.OMFactory factory)
        throws org.apache.axis2.databinding.ADBException {

      return factory.createOMElement(
          new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME));
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
      serialize(parentQName, xmlWriter, false);
    }

    public void serialize(
        final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter,
        boolean serializeType)
        throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

      String prefix = null;
      String namespace = null;

      prefix = parentQName.getPrefix();
      namespace = parentQName.getNamespaceURI();
      writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

      if (serializeType) {

        String namespacePrefix =
            registerPrefix(xmlWriter, "http://localhost/services/HrmService");
        if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              namespacePrefix + ":changeUserPasswordResponse",
              xmlWriter);
        } else {
          writeAttribute(
              "xsi",
              "http://www.w3.org/2001/XMLSchema-instance",
              "type",
              "changeUserPasswordResponse",
              xmlWriter);
        }
      }

      namespace = "http://localhost/services/HrmService";
      writeStartElement(null, namespace, "out", xmlWriter);

      if (false) {

        throw new org.apache.axis2.databinding.ADBException("out cannot be null!!");

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localOut));
      }

      xmlWriter.writeEndElement();

      xmlWriter.writeEndElement();
    }

    private static String generatePrefix(String namespace) {
      if (namespace.equals("http://localhost/services/HrmService")) {
        return "ns2";
      }
      return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /** Utility method to write an element start tag. */
    private void writeStartElement(
        String prefix,
        String namespace,
        String localPart,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
      } else {
        if (namespace.length() == 0) {
          prefix = "";
        } else if (prefix == null) {
          prefix = generatePrefix(namespace);
        }

        xmlWriter.writeStartElement(prefix, localPart, namespace);
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
    }

    /** Util method to write an attribute with the ns prefix */
    private void writeAttribute(
        String prefix,
        String namespace,
        String attName,
        String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String writerPrefix = xmlWriter.getPrefix(namespace);
      if (writerPrefix != null) {
        xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
      } else {
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
        xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeAttribute(
        String namespace,
        String attName,
        String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attValue);
      } else {
        xmlWriter.writeAttribute(
            registerPrefix(xmlWriter, namespace), namespace, attName, attValue);
      }
    }

    /** Util method to write an attribute without the ns prefix */
    private void writeQNameAttribute(
        String namespace,
        String attName,
        javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      String attributeNamespace = qname.getNamespaceURI();
      String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
      if (attributePrefix == null) {
        attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
      }
      String attributeValue;
      if (attributePrefix.trim().length() > 0) {
        attributeValue = attributePrefix + ":" + qname.getLocalPart();
      } else {
        attributeValue = qname.getLocalPart();
      }

      if (namespace.equals("")) {
        xmlWriter.writeAttribute(attName, attributeValue);
      } else {
        registerPrefix(xmlWriter, namespace);
        xmlWriter.writeAttribute(attributePrefix, namespace, attName, attributeValue);
      }
    }
    /** method to handle Qnames */
    private void writeQName(
        javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
      String namespaceURI = qname.getNamespaceURI();
      if (namespaceURI != null) {
        String prefix = xmlWriter.getPrefix(namespaceURI);
        if (prefix == null) {
          prefix = generatePrefix(namespaceURI);
          xmlWriter.writeNamespace(prefix, namespaceURI);
          xmlWriter.setPrefix(prefix, namespaceURI);
        }

        if (prefix.trim().length() > 0) {
          xmlWriter.writeCharacters(
              prefix
                  + ":"
                  + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        } else {
          // i.e this is the default namespace
          xmlWriter.writeCharacters(
              org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }

      } else {
        xmlWriter.writeCharacters(
            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
      }
    }

    private void writeQNames(
        javax.xml.namespace.QName[] qnames, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {

      if (qnames != null) {
        // we have to store this data until last moment since it is not possible to write any
        // namespace data after writing the charactor data
        StringBuffer stringToWrite = new StringBuffer();
        String namespaceURI = null;
        String prefix = null;

        for (int i = 0; i < qnames.length; i++) {
          if (i > 0) {
            stringToWrite.append(" ");
          }
          namespaceURI = qnames[i].getNamespaceURI();
          if (namespaceURI != null) {
            prefix = xmlWriter.getPrefix(namespaceURI);
            if ((prefix == null) || (prefix.length() == 0)) {
              prefix = generatePrefix(namespaceURI);
              xmlWriter.writeNamespace(prefix, namespaceURI);
              xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
              stringToWrite
                  .append(prefix)
                  .append(":")
                  .append(
                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            } else {
              stringToWrite.append(
                  org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
            }
          } else {
            stringToWrite.append(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
          }
        }
        xmlWriter.writeCharacters(stringToWrite.toString());
      }
    }

    /** Register a namespace prefix */
    private String registerPrefix(
        javax.xml.stream.XMLStreamWriter xmlWriter, String namespace)
        throws javax.xml.stream.XMLStreamException {
      String prefix = xmlWriter.getPrefix(namespace);
      if (prefix == null) {
        prefix = generatePrefix(namespace);
        javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
        while (true) {
          String uri = nsContext.getNamespaceURI(prefix);
          if (uri == null || uri.length() == 0) {
            break;
          }
          prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }
        xmlWriter.writeNamespace(prefix, namespace);
        xmlWriter.setPrefix(prefix, namespace);
      }
      return prefix;
    }

    /** Factory class that keeps the parse method */
    public static class Factory {
      private static org.apache.commons.logging.Log log =
          org.apache.commons.logging.LogFactory.getLog(Factory.class);

      /**
       * static method to create the object Precondition: If this object is an element, the current
       * or next start element starts this object and any intervening reader events are ignorable If
       * this object is not an element, it is a complex type and the reader is at the event just
       * after the outer start element Postcondition: If this object is an element, the reader is
       * positioned at its end element If this object is a complex type, the reader is positioned at
       * the end element of its outer element
       */
      public static ChangeUserPasswordResponse parse(javax.xml.stream.XMLStreamReader reader)
          throws Exception {
        ChangeUserPasswordResponse object = new ChangeUserPasswordResponse();

        int event;
        javax.xml.namespace.QName currentQName = null;
        String nillableValue = null;
        String prefix = "";
        String namespaceuri = "";
        try {

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          currentQName = reader.getName();

          if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type")
              != null) {
            String fullTypeName =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type");
            if (fullTypeName != null) {
              String nsPrefix = null;
              if (fullTypeName.indexOf(":") > -1) {
                nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
              }
              nsPrefix = nsPrefix == null ? "" : nsPrefix;

              String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

              if (!"changeUserPasswordResponse".equals(type)) {
                // find namespace for the prefix
                String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                return (ChangeUserPasswordResponse)
                    ExtensionMapper.getTypeObject(nsUri, type, reader);
              }
            }
          }

          // Note all attributes that were handled. Used to differ normal attributes
          // from anyAttributes.
          java.util.Vector handledAttributes = new java.util.Vector();

          reader.next();

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement()
              && new javax.xml.namespace.QName("http://localhost/services/HrmService", "out")
                  .equals(reader.getName())) {

            nillableValue =
                reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
              throw new org.apache.axis2.databinding.ADBException(
                  "The element: " + "out" + "  cannot be null");
            }

            String content = reader.getElementText();

            object.setOut(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

            reader.next();

          } // End of if for expected property start element
          else {
            // 1 - A start element we are not expecting indicates an invalid parameter was passed
            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());
          }

          while (!reader.isStartElement() && !reader.isEndElement()) reader.next();

          if (reader.isStartElement())
            // 2 - A start element we are not expecting indicates a trailing invalid property

            throw new org.apache.axis2.databinding.ADBException(
                "Unexpected subelement " + reader.getName());

        } catch (javax.xml.stream.XMLStreamException e) {
          throw new Exception(e);
        }

        return object;
      }
    } // end of factory class
  }

  private org.apache.axiom.om.OMElement toOM(
      SynHrmResource param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          SynHrmResource.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      SynHrmResourceResponse param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          SynHrmResourceResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      CheckUser param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          CheckUser.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      CheckUserResponse param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          CheckUserResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      GetHrmDepartmentInfo param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          GetHrmDepartmentInfo.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      GetHrmDepartmentInfoResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          GetHrmDepartmentInfoResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      GetHrmSubcompanyInfoXML param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          GetHrmSubcompanyInfoXML.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      GetHrmSubcompanyInfoXMLResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          GetHrmSubcompanyInfoXMLResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      GetHrmUserInfoXML param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          GetHrmUserInfoXML.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      GetHrmUserInfoXMLResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          GetHrmUserInfoXMLResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      SynJobtitle param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          SynJobtitle.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      SynJobtitleResponse param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          SynJobtitleResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      GetHrmDepartmentInfoXML param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          GetHrmDepartmentInfoXML.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      GetHrmDepartmentInfoXMLResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          GetHrmDepartmentInfoXMLResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      ChangeUserPassword param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          ChangeUserPassword.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      ChangeUserPasswordResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          ChangeUserPasswordResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      GetHrmJobTitleInfoXML param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          GetHrmJobTitleInfoXML.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      GetHrmJobTitleInfoXMLResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          GetHrmJobTitleInfoXMLResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      SynSubCompany param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          SynSubCompany.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      SynSubCompanyResponse param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          SynSubCompanyResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      GetHrmJobTitleInfo param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          GetHrmJobTitleInfo.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      GetHrmJobTitleInfoResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          GetHrmJobTitleInfoResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      GetHrmSubcompanyInfo param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          GetHrmSubcompanyInfo.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      GetHrmSubcompanyInfoResponse param,
      boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          GetHrmSubcompanyInfoResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      GetHrmUserInfo param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          GetHrmUserInfo.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      GetHrmUserInfoResponse param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          GetHrmUserInfoResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      SynDepartment param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          SynDepartment.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.om.OMElement toOM(
      SynDepartmentResponse param, boolean optimizeContent)
      throws org.apache.axis2.AxisFault {

    try {
      return param.getOMElement(
          SynDepartmentResponse.MY_QNAME,
          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      SynHrmResource param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  SynHrmResource.MY_QNAME, factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      CheckUser param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  CheckUser.MY_QNAME, factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      GetHrmDepartmentInfo param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  GetHrmDepartmentInfo.MY_QNAME, factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      GetHrmSubcompanyInfoXML param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  GetHrmSubcompanyInfoXML.MY_QNAME,
                  factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      GetHrmUserInfoXML param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  GetHrmUserInfoXML.MY_QNAME, factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      SynJobtitle param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  SynJobtitle.MY_QNAME, factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      GetHrmDepartmentInfoXML param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  GetHrmDepartmentInfoXML.MY_QNAME,
                  factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      ChangeUserPassword param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  ChangeUserPassword.MY_QNAME, factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      GetHrmJobTitleInfoXML param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  GetHrmJobTitleInfoXML.MY_QNAME, factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      SynSubCompany param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  SynSubCompany.MY_QNAME, factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      GetHrmJobTitleInfo param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  GetHrmJobTitleInfo.MY_QNAME, factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      GetHrmSubcompanyInfo param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  GetHrmSubcompanyInfo.MY_QNAME, factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      GetHrmUserInfo param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  GetHrmUserInfo.MY_QNAME, factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(
      org.apache.axiom.soap.SOAPFactory factory,
      SynDepartment param,
      boolean optimizeContent,
      javax.xml.namespace.QName elementQName)
      throws org.apache.axis2.AxisFault {

    try {

      org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
      emptyEnvelope
          .getBody()
          .addChild(
              param.getOMElement(
                  SynDepartment.MY_QNAME, factory));
      return emptyEnvelope;
    } catch (org.apache.axis2.databinding.ADBException e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
  }

  /* methods to provide back word compatibility */

  /** get the default envelope */
  private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory) {
    return factory.getDefaultEnvelope();
  }

  private Object fromOM(org.apache.axiom.om.OMElement param, Class type)
      throws org.apache.axis2.AxisFault {

    try {

      if (ChangeUserPassword.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        Object result =
            ChangeUserPassword.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (ChangeUserPasswordResponse.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        Object result =
            ChangeUserPasswordResponse.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (CheckUser.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        Object result =
            CheckUser.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (CheckUserResponse.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        Object result =
            CheckUserResponse.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (GetHrmDepartmentInfo.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        Object result =
            GetHrmDepartmentInfo.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (GetHrmDepartmentInfoResponse.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        Object result =
            GetHrmDepartmentInfoResponse.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (GetHrmDepartmentInfoXML.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        Object result =
            GetHrmDepartmentInfoXML.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (GetHrmDepartmentInfoXMLResponse.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        Object result =
            GetHrmDepartmentInfoXMLResponse.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (GetHrmJobTitleInfo.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        Object result =
            GetHrmJobTitleInfo.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (GetHrmJobTitleInfoResponse.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        Object result =
            GetHrmJobTitleInfoResponse.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (GetHrmJobTitleInfoXML.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        Object result =
            GetHrmJobTitleInfoXML.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (GetHrmJobTitleInfoXMLResponse.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        Object result =
            GetHrmJobTitleInfoXMLResponse.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (GetHrmSubcompanyInfo.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        Object result =
            GetHrmSubcompanyInfo.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (GetHrmSubcompanyInfoResponse.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        Object result =
            GetHrmSubcompanyInfoResponse.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (GetHrmSubcompanyInfoXML.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        Object result =
            GetHrmSubcompanyInfoXML.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (GetHrmSubcompanyInfoXMLResponse.class.equals(
          type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        Object result =
            GetHrmSubcompanyInfoXMLResponse.Factory.parse(
                reader);
        reader.close();
        return result;
      }

      if (GetHrmUserInfo.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        Object result =
            GetHrmUserInfo.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (GetHrmUserInfoResponse.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        Object result =
            GetHrmUserInfoResponse.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (GetHrmUserInfoXML.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        Object result =
            GetHrmUserInfoXML.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (GetHrmUserInfoXMLResponse.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        Object result =
            GetHrmUserInfoXMLResponse.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (SynDepartment.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        Object result =
            SynDepartment.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (SynDepartmentResponse.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        Object result =
            SynDepartmentResponse.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (SynHrmResource.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        Object result =
            SynHrmResource.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (SynHrmResourceResponse.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        Object result =
            SynHrmResourceResponse.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (SynJobtitle.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        Object result =
            SynJobtitle.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (SynJobtitleResponse.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        Object result =
            SynJobtitleResponse.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (SynSubCompany.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        Object result =
            SynSubCompany.Factory.parse(reader);
        reader.close();
        return result;
      }

      if (SynSubCompanyResponse.class.equals(type)) {

        javax.xml.stream.XMLStreamReader reader = param.getXMLStreamReaderWithoutCaching();
        Object result =
            SynSubCompanyResponse.Factory.parse(reader);
        reader.close();
        return result;
      }

    } catch (Exception e) {
      throw org.apache.axis2.AxisFault.makeFault(e);
    }
    return null;
  }
}
