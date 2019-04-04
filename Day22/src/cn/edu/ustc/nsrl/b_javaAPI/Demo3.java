package cn.edu.ustc.nsrl.b_javaAPI;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Demo3 {

	public static void main(String[] args) {
		// Date封装了系统当中的时间类
		Date date = new Date();
		// Calender 日历类 可以直接获取年月日时分秒
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH);
		int day = c.get(Calendar.DAY_OF_MONTH);
		// 周日算是一周的第一天
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		int hour = c.get(Calendar.HOUR);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		System.out.println(year + "年" + (month + 1) + "月" + day + "日（" + dayOfWeek + "）"
					+ hour + "：" + minute + "：" + second);
		
		SimpleDateFormat sf = new SimpleDateFormat("yyyy年MM月dd日 E a hh:mm:ss");
		System.out.println(sf.format(date));
		SimpleDateFormat sf2 = new SimpleDateFormat("yyyy年MM月dd日 E HH:mm:ss");
		System.out.println(sf2.format(date));
		
		// 输出如下 
//		2019年4月2日（3）4：34：0
//		2019年04月02日 星期二 下午 04:34:00
//		2019年04月02日 星期二 16:34:00
	}

}
