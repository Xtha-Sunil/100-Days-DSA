import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>(10);

        fruits.add("apple");
        fruits.add("banana");
        fruits.add("mango");
        fruits.add("guava");

        // add at desired location
        fruits.add(0,"pineapple");
        System.out.println(fruits);
        
        // replace at index
        fruits.set(0, "new name");
        System.out.println(fruits);
        
        String lastFruit = fruits.getLast();
        String firstFruit = fruits.getFirst();
        String byIndex = fruits.get(1);

        System.out.println(lastFruit +  firstFruit + byIndex);

        fruits.clear();
        fruits.isEmpty();
        fruits.contains("Pumpkin");
        
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        
        for(int i=0; i<3; i++)
            list.add(new ArrayList<>(3));
        

        for(int i=0; i<3; i++)
            for(int j=0; j<3; j++)
                list.get(i).add(i+j+1);

        System.out.println(list);
    }
}
