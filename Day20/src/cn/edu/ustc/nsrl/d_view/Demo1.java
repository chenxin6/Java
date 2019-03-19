package cn.edu.ustc.nsrl.d_view;

import java.util.Comparator;

import cn.edu.ustc.nsrl.b_entity.Worker;
import cn.edu.ustc.nsrl.c_dao.WorkManager;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WorkManager wm = WorkManager.getInstance("nsrl");
		Worker worker1 = new Worker("a", "123", '男', 24f);
		Worker worker2 = new Worker("b", "222", '男', 23f);
		Worker worker3 = new Worker("c", "333", '男', 22f);
		Worker worker4 = new Worker("d", "444", '男', 21f);
		Worker worker5 = new Worker("e", "555", '男', 20f);
		wm.addWorker(worker1);
		wm.addWorker(worker2);
		wm.addWorker(worker3);
		wm.addWorker(worker4);
		wm.addWorker(worker5);
		
		wm.showAllWorker();
		wm.removeWorkerById(1);
		wm.showAllWorker();
		
		wm.selectSortUsingCompare(new Comparator<Worker>() {
			
			@Override
			public int compare(Worker o1, Worker o2) {
				return (int) (100 * (o1.getSalary() - o2.getSalary()));
			}
		});
	}

}
