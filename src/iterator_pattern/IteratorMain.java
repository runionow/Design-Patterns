package iterator_pattern;

import java.util.*;

/**
 * Iterator Pattern:
 * 1. Traverse a container
 * 2. Doesn't expose underlying structure.
 * 3. Decouples Algorithm
 * 4. Sequential
 *
 * Ex.
 * java.util.iterator
 * java.util.enumeration
 *
 * Design:
 * Interface based
 * Factory Method based
 * Independent, but fail fast
 * Enumerators are fail safe
 *
 */
public class IteratorMain {
    public static void main(String[] args){

        // [START- Example 1]
        List<String> names = new ArrayList<>();
        names.add("Bryan");
        names.add("Arun");
        names.add("Nikhila");
        names.add("Jason");

        Iterator<String> nameItr = names.iterator();

        while(nameItr.hasNext()){
            String name = nameItr.next();
            System.out.println(name);
            nameItr.remove();
        }
    }
}
