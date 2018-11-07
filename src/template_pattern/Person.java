package template_pattern;

import java.util.Comparator;

public class Person implements Comparable<Person>{
    private final String name;
    private final String contactNo;
    private final int age;

    public Person(String name, String contactNo, int age) {
        this.name = name;
        this.contactNo = contactNo;
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        if(this.age>o.age){
            return 1;
        }
        else if(this.age<o.age){
            return -1;
        }
        return 0;
    }

    public int getAge(){
        return this.age;
    }
}
