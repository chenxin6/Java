package cn.edu.ustc.nsrl.g_file;

import java.io.File;
import java.io.IOException;

/*
 * 可以利用File类对象，创建文件或者文件夹
 * boolean createNewFile();
 * 	使用File类对象，创建File类对象里面保存的地址指定的普通文件
 * 	返回值boolean：创建成功返回true，创建失败返回false
 * 	返回false的原因可能是：
 * 		一，文件已经存在
 * 		二，操作路径非法，例如：文件指定所在文件夹不存在
 * 		三，操作文件夹没有写入权限
 * 		四，硬盘坏了
 * boolean mkdir();
 * 	使用File类对象里面保存的文件夹地址，创建对应的文件夹
 * 	返回值boolean：创建成功返回true，创建失败返回false
 * 	返回false的原因同上
 * boolean mkdirs();
 * 	使用File类对象里面保存的文件夹地址，创建对应的文件夹
 * 	如果该路径中的中间文件夹不存在则把中间路径同时创建，其他同上
 * boolean renameTo(File dest);
 * 	类似Linux命令中的mv
 * 	功能1：重命名文件或者文件夹
 * 	功能2：剪切（原地址和目标地址都要带有文件或者文件夹名）
 * 
 * 创建的文件必须带有文件后缀名
 * 
 * */

public class Demo2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file1 = new File("E:/Program Files/eclipse-workspace/Day19/demo21.txt");
		boolean ret = file1.createNewFile();
		System.out.println(ret);
		
		File file2 = new File("E:/Program Files/eclipse-workspace/Day19/bbb");
		ret = file2.mkdir();
		System.out.println(ret);
		
		File dest1 = new File("E:/Program Files/eclipse-workspace/Day19/demo22.txt");
		ret = file1.renameTo(dest1);
		System.out.println(ret);
	}

}
