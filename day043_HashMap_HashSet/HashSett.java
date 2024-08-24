import java.util.HashSet;
import java.util.Iterator;


public class HashSett {
		public static void main(String[] args) {
				
				// creating object of HashSet
				HashSet<Integer> hs = new HashSet<>();
				
				// check where it is defined in collection framework
				System.out.println(hs.getClass());
				
				// add -> insertion
				hs.add(0);
				hs.add(1);
				hs.add(5);
				hs.add(72);
				
				// duplicate will be omitted
				hs.add(1);
				
				
				// contains -> search
				System.out.println(hs.contains(0)); // true
				
				// check how many elements are added
				System.out.println(hs.size()); // 4
				
				// remove -> delete
				hs.remove(72);
				System.out.println(hs); // [0,1,5]  // can be in any order
				
				
				// remove element that is not in set
				hs.remove(7292); // doesnt give any error
				
				
				// iterate using for loop
				for(int i : hs){
						System.out.print(i + " ");
				}
				
				System.out.println();
				
				
				// iterate using iterator
				Iterator<Integer> it = hs.iterator();
				while(it.hasNext()){
						System.out.print(it.next() + " ");
				}
				
				System.out.println();
				
				hs.clear();  // deletes all elements
				System.out.println(hs.isEmpty()); // true
		}
}