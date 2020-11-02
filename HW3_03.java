package helloworld;

import java.util.ArrayList;

public class HW3_03 {
	public static void sort(ArrayList<Number> list) {
		if (list == null || list.size() == 0) {
			return;
		}
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.size() - 1 - i; j++) {
				if (list.get(j + 1).doubleValue() < list.get(j).doubleValue()) {
					Number temp = list.get(j + 1);
					list.set(j + 1, list.get(j));
					list.set(j, temp);
				}
			}
		}
	}

	public static void main(String[] args) {
		ArrayList<Number> list = new ArrayList<>();
		list.add(3);
		list.add(9);
		list.add(90);
		list.add(8);
		list.add(100);
		list.add(8);
		list.add(6);
		list.add(1);
		System.out.println("初始列表为："+list);
		sort(list);
		System.out.println("排序后的列表为："+list);
	}
}
