package fr.poc.publisher;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.xml.ws.Endpoint;


public class Servicespublisher {

    private String urlEndpoint;

    public static void main(String[] args) {
        // il suffit de surcharger cette propriété.
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        Endpoint.publish("http://localhost:9905/UC", context.getBean("mathOperation"));
    }

}
