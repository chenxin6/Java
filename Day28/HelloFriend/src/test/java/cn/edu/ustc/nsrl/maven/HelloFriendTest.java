package cn.edu.ustc.nsrl.maven;

import org.junit.Test;
import static junit.framework.Assert.*;
import cn.edu.ustc.nsrl.maven.Hello;

public class HelloFriendTest {
	@Test
	public void testHelloFriend() {
		HelloFriend helloFriend = new HelloFriend();
		String results = helloFriend.sayHelloToFriend("chenxin");
		assertEquals("Hello chenxin! I am chenxin2", results);
	}
}

