import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HelloWorldTest {

  public void testHello(){
    System.out.println("Test Hello.....");
  }

  public void testWorld(){
    System.out.println("Test World!!!!");
  }

  public void tesGetHello(){
    HelloWorld helloWorld = new HelloWorld();
    assert("".equals(helloWorld.getHello()));
  }

  @Test
  public void getHello(){
    HelloWorld helloWorld = new HelloWorld();
    assertEquals("Hello Groovy",helloWorld.getHello());
  }
}
