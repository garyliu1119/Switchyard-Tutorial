
package com.ggl.switchyard.switchyard_helloworld_demo;

import static java.lang.System.out;
import javax.xml.namespace.QName;

import org.switchyard.remote.RemoteInvoker;
import org.switchyard.remote.RemoteMessage;
import org.switchyard.remote.http.HttpInvoker;

/**
 * Test client which uses RemoteInvoker to invoke a service with an SCA binding.
 */
public final class RemoteClientDemo {

    private static final QName SERVICE = new QName(
            "urn:com.ggl.switchyard:switchyard-helloworld-demo:1.0",
            "HelloWorldService");
    private static final String URL = "http://localhost:8080/switchyard-remote";

    /**
     * Private no-args constructor.
     */
    private RemoteClientDemo() {
    }

    /**
     * Only execution point for this application.
     * @param ignored not used.
     * @throws Exception if something goes wrong.
     */
    public static void main(final String[] ignored) throws Exception {
        // Create a new remote client invoker
        RemoteInvoker invoker = new HttpInvoker(URL);


        RemoteMessage message = new RemoteMessage();
        message.setService(SERVICE).setOperation("sayHello").setContent("My Dear Earth");

        // Invoke the service
        RemoteMessage reply = invoker.invoke(message);
        if (reply.isFault()) {
            System.err.println("Oops ... something bad happened.  "
                    + reply.getContent());
        } else {
            String greeting = (String) reply.getContent();
            out.println("==================================");
            out.println("Got reply from HelloWorld Service: " + greeting);
            out.println("==================================");
        }
    }


}
