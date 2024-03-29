package com.udacity.gradle.builditbigger.backend;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.Rayan.javajokes.javaJokes;

@Api(
        name = "myApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.builditbigger.gradle.udacity.com",
                ownerName = "backend.builditbigger.gradle.udacity.com",
                packagePath = ""
        )
)
public class MyEndpoint {

    @ApiMethod(name = "sayJoke")
    public MyBean sayJoke() {
        javaJokes myJoke = new javaJokes();
        MyBean response = new MyBean();
        response.setData(myJoke.getMyJoke());

        return response;
    }

}
