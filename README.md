### Run gRPC Server-Client

---------
* Server : 
    - build<br>
    `/project-info-service/grpc-server >> gradle build`<br>
    `/project-info-service/grpc-pattern-server >> gradle build`
    - run<br>
    `/project-info-service/grpc-server >> java -jar build/libs/grpc-server.jar`<br>
    `/project-info-service/grpc-pattern-server >> java -jar build/libs/grpc-pattern-server.jar`
    
* Client :
    - build<br>
    `/project-info-service/grpc-client >> gradle build`<br>
    `/project-info-service/grpc-pattern-client >> gradle build`
    - run<br>
    `/project-info-service/grpc-client >> java -jar build/libs/grpc-client.jar`<br>
    `/project-info-service/grpc-pattern-client >> java -jar build/libs/grpc-pattern-client.jar`
    