import java.util.*;


public class HashMapp {
		public static void main(String[] args) {
				// creation
				HashMap<String, Integer> map = new HashMap<>();
				
				// add : map(key, value)
				
				map.put("Sudin", 33);
				map.put("Sunil", 34);
				map.put("Sushil", 35);
				map.put("Suyog", 36);
				map.put("Utsav", 37);
				
				// search
				System.out.println(map.containsKey("Sunil")); // case sensitive
				System.out.println(map.get("Sunil")); // 34
				System.out.println(map.get("Bibesh")); // null // not present
				
				// iterate over keys only
				Set<String> keys = map.keySet();
				
				for (String key : keys){
						System.out.print(key + " ");
				}
				System.out.println("\n");
				
				
				// iterate over key, value
				
				for(Map.Entry<String,Integer> elem : map.entrySet()){
						System.out.println(elem.getKey() + " = " + elem.getValue());
				}
		}
}