import java.util.ArrayList;

public class ArrayListCode {
	public static void main(String[] args) {
		// defination
		ArrayList<Integer> list1 = new ArrayList<>(5);
		list1.add(1);
		list1.add(2);
		list1.add(3);
		System.out.println(list1); // [1, 2, 3]


		ArrayList<Integer> list2 = new ArrayList<>(5);   
		list2.add(4);
		list2.add(5);
		list2.add(6);
		System.out.println(list2);  // [4,5,6]


		// add from other list
		list1.addAll(list2);
		System.out.println(list1);  // [1, 2, 3, 4, 5, 6]

		list1.clear();
		System.out.println(list1);  // [ ]

		System.out.println(list1.isEmpty());  // true

		// getting element. list2[0] dont work
		System.out.println(list2.get(0));  // 4

		// modify
		list2.set(0, 99);
		System.out.println(list2);  // [99, 5, 6]

		// iterate
		for (int i = 0; i < list2.size(); i++) {
			System.out.print(list2.get(i) + ", ");  // 99, 5, 6,
		}
		System.out.println();
		// delete all
		list2.clear();
		list2.add(1);
		list2.add(6);
		list2.add(4);
		list2.add(6);
		list2.remove(1);  // remove element at given index
		System.out.println(list2);

	}
}