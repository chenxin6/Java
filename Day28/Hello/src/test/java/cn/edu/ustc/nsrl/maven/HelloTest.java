package cn.edu.ustc.nsrl.maven;

import org.junit.Test;
import static junit.framework.Assert.*;

public class HelloTest {
	@Test
	public void testHello() {
		Hello hello = new Hello();
		String results = hello.sayHello("chenxin");
		assertEquals("Hello chenxin!", results);
	}
}

