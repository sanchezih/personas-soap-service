# personas-soap-service

Java Build Path
    Libraries
        Modulepath
            JRE System Library [jdk-11.0.15]
        Classpath
            Apache CXF Library [3.5.2]
            Server Runtime [Apache Tomcat v9.0]


Create Web Service

PersonasSEI.java -> Web Services -> Create Web Service

Service implementation: com.github.sanchezih.cxf.src.PersonasSEI
Configuration:
    Server runtime: Tomcat v9.0 Server
    Web service runtime: Apache CXF 2.x
    Service project: poc-cxf-java2wsdl

Select Implementation: com.github.sanchezih.cxf.src.PersonasServiceImpl
Finish

cxf-beans.xml
delete  <import resource="classpath:META-INF/cxf/cxf-extension-soap.xml" />