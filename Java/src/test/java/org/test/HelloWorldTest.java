package org.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloWorldTest {
    
    private HelloWorld helloWorld = new HelloWorld(); 
    
    @Test
    public void shouldReturnHelloWorld() {
        String actual = helloWorld.helloWorld();
        assertEquals("Hello World!", actual);	
    }
}
