package template_pattern;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * 1. Code Reuse
 * 2. Common in libraries and frameworks
 * 3. IoC
 * 4. Algorithm Emphasis
 *
 * Ex:
 * 1. java.Collections#sort()
 * 2. java.util.AbstractList#indexOf()
 *
 * Consists of Abstract Class and Concrete class
 *
 */
public class TemplateMain {
    public static void main(String[] args){

        // [Example 1 - Using comparator]
        Person bryan = new Person("Bryan","8011-555-1212",39);
        Person bryan1 = new Person("Bryan","8011-555-1212",40);
        Person bryan2 = new Person("Bryan","8011-555-1212",12);

        List<Person> people = new ArrayList<Person>();

        people.add(bryan);
        people.add(bryan1);
        people.add(bryan2);

        Collections.sort(people);

        System.out.println("\n Sorted by age");
        for(Person p : people){
            System.out.println(p.getAge());
        }
        // [Example 1 - END]

        OrderTemplate order = new WebOrder();
        order.processOrder();
    }
}

