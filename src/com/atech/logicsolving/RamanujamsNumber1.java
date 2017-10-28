package com.atech.logicsolving;

import java.util.*;

public class RamanujamsNumber1 {
	public static void main(String[] args) {
		int sum = 0;
		int numbersAdd = 0;
		LinkedHashSet<Integer> add = new LinkedHashSet<Integer>();
		;
		HashMap<LinkedHashSet<Integer>, String> hm = new HashMap<LinkedHashSet<Integer>, String>();
		System.out.println("Finding Ramanujam's number : ");
		try {
			for (int a = 0; a < 100; a++) {
				for (int b = 0; b < 100; b++) {
					if (a != b) {
						sum = ((a * a * a) + (b * b * b));
						for (int i = 0; i < 100; i++) {
							for (int j = 0; j < 100; j++) {
								if (a != b && a != i && a != j && b != a
										&& b != i && b != j && j != i) {
									if ((i * i * i) + (j * j * j) == sum) {
										numbersAdd = i + j + a + b;
										add.add(numbersAdd);
										String str = i + " " + j + " " + a
												+ " " + b + " ";
										hm.put(add, str);

									}
								}

							}
						}
					}

				}
			}
			Set set = hm.entrySet();
			Iterator itr = set.iterator();
			while (itr.hasNext()) {
				Map.Entry me = (Map.Entry) itr.next();
				System.out.println("The 4 numbers are : " + me.getValue());
			}

		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("Exception handled !!");
		}

	}

}
