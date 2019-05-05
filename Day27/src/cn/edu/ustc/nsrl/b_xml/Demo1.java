package cn.edu.ustc.nsrl.b_xml;

import java.io.File;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;

/*
 * XML：XML也是通过标签来做组成的语言，但是这些标签是可以自定义的，只要符合语法规定即可
 * 使用场景：
 * 一：properties文件
 * 二：作为一些小型数据库
 * 
 * XML文件的语法规范
 * 	一，文档声明 固定格式
 * 		<?xml version="1.0" encoding="utf-8"?>
 * 	二，标签语法需要严格要求，严格遵守大小写，一一匹配注意顺序不允许交叉嵌套，有且只能有一个根结点
 * 		双标签
 * 		<自定义标签名>数据</自定义标签名>
 * 		单标签
 * 		<自定义标签名 />
 * 	三，属性，属性必须使用引号包含，最好使用双引号
 * 		例如：
 * 		<Student name="chenxin"></Student>
 * 	四，注释的格式<!-- 注释的内容 -->
 * 	五，转义字符，有对应的转义表，自行百度
 * 
 * XML解析
 * 方法一：DOM解析，使用的工具有JAXP，JDOM，Dom4j
 * 方法二：SAX解析，使用的工具有SAX解析工具（常用于Android开发使用，降低了内存的压力）
 * 
 * 这里我们使用Dom4j进行解析，由于是第三方工具包所以需要以下步骤
 * 一，下载jar包，连接是https://dom4j.github.io/
 * 二，在Java Project里面新建文件夹，该文件夹一般命名为lib或者libs，这里我选择命名为libs
 * 三，把下载来的jar包粘贴到这个文件夹
 * 四，在Eclipse中右键单击这个jar包，然后依次选择Build Path -> Add to Build Path
 * 五，此时会出现Referenced Libraries，这便导入成功了，这是手动导入第三方包的方式，以后可以用Maven！！！
 * */

public class Demo1 {
	public static void main(String[] args) {
		// 一，创建一个XML文件的解析器
		SAXReader reader = new SAXReader();
		// 二，读取XML文件，得到XML文件的Document对象
		try {
			Document doc = reader.read(new File("./src/cn/edu/ustc/nsrl/b_xml/Contact.xml"));
			System.out.println(doc);
		} catch (DocumentException e) {
			e.printStackTrace();
		}
	}
}
