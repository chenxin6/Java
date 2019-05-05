package cn.edu.ustc.nsrl.b_xml;

import java.io.File;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;
import org.junit.Test;

/*
 * 获取XML文件的节点信息
 * Node 节点
 * Element 标签节点
 * Attribute 属性节点
 * text 文本节点
 * */

public class Demo2 {

	@Test
	public void XMLNode() throws DocumentException {
		// 一，创建XML文档的解析器，返回Document
		Document doc = new SAXReader().read(new File("./src/cn/edu/ustc/nsrl/b_xml/Contact.xml"));
		// 二，nodeIterator得到当前节点下的所有子节点（不能跨界）
		Iterator<Node> it = doc.nodeIterator();
		while (it.hasNext()) {
			Node node = it.next(); // 得到一个Node类型的节点，所有的XML文件节点都是Node类型
			String nodeName = node.getName(); // 获取节点的名字
			System.out.println(nodeName);
			// 发现XML文件中，有一些标签是没有子节点的，这些标签也不是Element标签
			// 所以我们要做一个过滤，如果是Element标签则继续解析
			// instanceof：判断当前对象是不是指定类的对象
			// 如果是标签节点我们就继续解析
			if (node instanceof Element) {
				Element ele = (Element) node;
				Iterator<Node> it2 = ele.nodeIterator();
				while (it2.hasNext()) {
					Node node2 = it2.next();
					System.out.println(node2.getName());
				}
			}
		}
	}
	
	// 使用递归遍历所有的XML文件的节点
	@Test
	public void XMLNode2() throws DocumentException {
		// 一，创建XML文档的解析器，返回Document
		Document doc = new SAXReader().read(new File("./src/cn/edu/ustc/nsrl/b_xml/Contact.xml"));
		// 二，获取根结点
		Element rootElem = doc.getRootElement();
		// 调用递归方法，遍历整个XML文件
		getChildNode(rootElem);
	}
	private void getChildNode(Element element) {
		System.out.println("--->" + element.getName());
		Iterator<Node> it = element.nodeIterator();
		while (it.hasNext()) {
			Node node = it.next();
			if (node instanceof Element) {
				Element ele = (Element) node;
				getChildNode(ele);
			}
		}
	}
	
	// 获取标签
	@Test
	public void XMLElement() throws DocumentException {
		// 一，创建XML文档的解析器，返回Document
		Document doc = new SAXReader().read(new File("./src/cn/edu/ustc/nsrl/b_xml/Contact.xml"));
		// 二，获取根结点
		Element rootElem = doc.getRootElement();
		
		// 有三种方法可以获取标签
		// 方法一，获取当前节点下的指定名字的节点，拿到的是第一个节点
		Element contactElem = rootElem.element("contact");
		System.out.println(contactElem.attributeValue("id"));
		// 方法二，获取当前节点下指定名字节点的所有子节点的迭代器
		// elementIterator(String name)
		Iterator<Element> elementIterator = rootElem.elementIterator("contact");
		while (elementIterator.hasNext()) {
			System.out.println(elementIterator.next().attributeValue("id"));
		}
		// 方法三，获取当前节点下的所有子节点
		//List<Element> elements();
		List<Element> elements = rootElem.elements();
		for (Element element : elements) {
			System.out.println(element.getName());
		}
	}
	
	// 获取属性
	@Test
	public void XMLAttribute() throws DocumentException {
		// 一，读取XML文件，获取Document对象
		Document doc = new SAXReader().read(new File("./src/cn/edu/ustc/nsrl/b_xml/Contact.xml"));
		Element element = doc.getRootElement().element("contact");
		// 获取属性：必须获取到属性所在的标签节点才可以
		// 有四种方法可以获取标签
		// 方法一，根据名字获取属性值
		// attributeValue(String name)
		String idValue = element.attributeValue("id");
		System.out.println(element.getName() + ":" + idValue);
		// 方法二，根据名字获取属性节点的对象
		Attribute idAttr = element.attribute("id");
		System.out.println(idAttr.getName() + ":" + idAttr.getValue());
		// 方法三，获取指定节点里面所有属性节点的List集合
		List<Attribute> listAttr = element.attributes();
		for (Attribute attribute : listAttr) {
			System.out.println(attribute.getName() + ":" + attribute.getValue());
		}
		// 方法四，获取指定节点里面所有属性节点的迭代器
		Iterator<Attribute> it = element.attributeIterator();
		while (it.hasNext()) {
			Attribute attr = it.next();
			System.out.println(attr.getName() + ":" + attr.getValue());
		}
	}
	
	// 获取文本节点
	@Test
	public void XMLText() throws DocumentException {
		Document doc = new SAXReader().read(new File("./src/cn/edu/ustc/nsrl/b_xml/Contact.xml"));
		Element rootElem = doc.getRootElement();
		Element element = rootElem.element("contact").element("name");
		System.out.println(element.getName() + ":" + element.getText());
		// 输出为“name:卷福”
	}
	
}
