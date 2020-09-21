package org.test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloWorldTest {

    private HelloWorld helloWorld = new HelloWorld();

    @Test
    public void shouldReturnHelloWorld() {
        String actual = helloWorld.helloWorld();
        assertEquals("Hello World!", actual);
    }
    
    @Test
    public void shouldBeFailed() {
        throw new RuntimeException();
    }
}
