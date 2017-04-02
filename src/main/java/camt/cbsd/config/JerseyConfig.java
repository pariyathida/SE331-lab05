package camt.cbsd.config;

import camt.cbsd.controller.StudentController;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

/**
 * Created by pariy on 4/1/2017.
 */
@Configuration
public class JerseyConfig extends ResourceConfig{
    public JerseyConfig(){
        register(StudentController.class);
    }
}
