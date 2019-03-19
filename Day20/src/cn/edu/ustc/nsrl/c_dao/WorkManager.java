package cn.edu.ustc.nsrl.c_dao;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import cn.edu.ustc.nsrl.b_entity.Worker;

public class WorkManager {
	private String companyName;
	HashMap<Integer, Worker> allWorkers = new HashMap<>();
	
	private static WorkManager w = null;
	
	private WorkManager(String companyName) {
		this.companyName = companyName;
	}
	
	public static WorkManager getInstance(String companyName) {
		if (w == null) {
			w = new WorkManager(companyName);
		}
		return w;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	/*
	 * HashMap数据结构的增删改查
	 * */
	public void showAllWorker() {
		Set<Entry<Integer, Worker>> entrySet = allWorkers.entrySet();
		Iterator<Entry<Integer, Worker>> iterator = entrySet.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	public void addWorker(Worker worker) {
		if (null == worker) {
			throw new NullPointerException();
		}
		//判断当前HashMap中是否存在当前worker，判断worker的id是否在Map中存在
		if (!allWorkers.containsKey(worker.getId())) {
			allWorkers.put(worker.getId(), worker);
		} else {
			System.out.println("该员工已存在");
		}
	}
	public void removeWorkerById(int id) {
		if (allWorkers.remove(id) != null) {
			System.out.println("删除成功");
		} else {
			System.out.println("删除失败");
		}
	}
	public void selectSortUsingCompare(Comparator<Worker> com) {
		if (null == com) {
			throw new NullPointerException();
		}
		//取出所有的HashMap中的Values值
		Collection<Worker> c = allWorkers.values();
		Worker[] sortTemp = new Worker[allWorkers.size()];
		c.toArray(sortTemp);
		for (int i = 0; i < sortTemp.length - 1; i++) {
			int index = i;
			for (int j = i + 1; j < sortTemp.length; j++) {
				if (com.compare(sortTemp[index], sortTemp[j]) > 0) {
					index = j;
				}
			}
			if (index != i) {
				Worker temp = sortTemp[index];
				sortTemp[index] = sortTemp[i];
				sortTemp[i] = temp;
			}
		}
		showSortResult(sortTemp);
	}
	private void showSortResult(Worker[] sortTemp) {
		for (Worker worker : sortTemp) {
			System.out.println(worker);
		}
	}
	
}
