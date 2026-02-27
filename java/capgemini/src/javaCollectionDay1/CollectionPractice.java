package javaCollectionDay1;

import java.util.ArrayList;
import java.util.List;

//add() , addall(), clear, contains
public class CollectionPractice {

    public static ArrayList<String> food = new ArrayList<>();

    static {
        food.add("pizza");
        food.add("burger");
        food.add("fries");
        food.add("iceCream");
        food.add("coffee");
    }

    public static void main(String[] args) {

        System.out.println("Original food list:");
        for(String foo : food){
            System.out.println(foo);
        }


        food.addAll(List.of("dosa", "chowmin"));
        System.out.println("\nAfter adding more items:");
        System.out.println(food);

        System.out.println("\nChecking for items:");
        System.out.println("Contains lassi? " + food.contains("lassi"));
        System.out.println("Contains dosa? " + food.contains("dosa"));

        food.remove("pizza");
        System.out.println("\nAfter removing pizza:");
        System.out.println(food);
        food.clear();
        System.out.println("\nList after clear(): " + food);
        System.out.println("Total items: " + food.size());
    }
}