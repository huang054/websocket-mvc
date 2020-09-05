package com.hj.webSocket.service;

import com.hj.websocket.mvc.annotation.Path;
import org.springframework.stereotype.Service;

@Service
@Path("demo")
public class Demo {

    @Path("hello")
    public String demo(){
        return "hello,webSocket";
    }
}
