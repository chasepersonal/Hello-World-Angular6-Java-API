package com.demo.hello;

import static org.junit.Assert.assertEquals;

import java.util.Collections;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoJavaApiApplicationTests {

	@Test
	public void testStringHelloWorld() {
		
		HelloWorldController tester = new HelloWorldController();
		
		Map<String, String> testData = Collections.singletonMap("response", "Hello World");
		
		assertEquals(testData, tester.getString());
		
	}

}
