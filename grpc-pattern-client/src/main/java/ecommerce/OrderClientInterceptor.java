package ecommerce;

import io.grpc.*;

public class OrderClientInterceptor implements ClientInterceptor {

    @Override
    public <ReqT, RespT> ClientCall<ReqT, RespT> interceptCall(io.grpc.MethodDescriptor<ReqT, RespT> method, CallOptions callOptions, Channel next) {
        return null;
    }
}
