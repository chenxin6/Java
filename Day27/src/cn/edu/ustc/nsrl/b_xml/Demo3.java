package cn.edu.ustc.nsrl.b_xml;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/*
 * 把XML里面的数据读取到Contact对象里面
 * */

public class Demo3 {
	public static void main(String[] args) throws DocumentException {
		ArrayList<Contact> list = new ArrayList<>();
		Document doc = new SAXReader().read(new File("./src/cn/edu/ustc/nsrl/b_xml/Contact.xml"));		
		Iterator<Element> it = doc.getRootElement().elementIterator("contact");
		while (it.hasNext()) {
			Element contactElem = it.next();
			int id = Integer.valueOf(contactElem.attributeValue("id"));
			String name = contactElem.elementText("name");
			char gender = contactElem.elementText("gender").charAt(0);
			String tel = contactElem.elementText("tel");
			int age = Integer.valueOf(contactElem.elementText("age"));
			String qq = contactElem.elementText("qq");
			String email = contactElem.elementText("email");
			Contact contact = new Contact(id, name, gender, tel, age, qq, email);
			list.add(contact);
		}
		for (Contact contact : list) {
			System.out.println(contact);
		}
	}
}
