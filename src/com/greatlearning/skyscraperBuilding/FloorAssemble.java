package com.greatlearning.skyscraperBuilding;

import java.util.Collections;
import java.util.LinkedList;

public class FloorAssemble {

	public static LinkedList<Integer> ls = new LinkedList<Integer>();
	static int day = 1;
	static int j = 0;

	public static void floorsAssemble(LinkedList<Integer> link1, int key)

	{

		for (int i = 0; i < link1.size(); i++) {

			if (link1.get(i) == key) {
				System.out.println("Day :" + day);
				System.out.println(link1.get(i));

				key = key - 1;
				if (ls.isEmpty()) {

					int value = link1.getFirst();
					for (int k = 0; k < link1.size(); k++)

					{
						if (link1.get(i) == value) {
							continue;
						}
						ls.add(link1.get(i));
					}

				} else {

					if (ls.isEmpty()) {
						return;
					}

					for (int j = 0; j < ls.size(); j++) {

						if (ls.get(j) == key) {
							System.out.println(ls.remove(j));
							key = key - 1;
							j = 0;

						}
					}
				}
				day++;
			}

			else {
				System.out.println("Day :" + day);
				System.out.println();
				ls.add(link1.get(i));
				day++;
			}
		}
		if (!ls.isEmpty()) {
			if (ls.getFirst() == 1) {
				System.out.println(ls.poll());
			}
		}

	}

}
