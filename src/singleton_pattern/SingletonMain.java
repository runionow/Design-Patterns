package singleton_pattern;

public class SingletonMain {
    public static void main(String[] args) {
        Sample sample = Sample.getInstance();
        Sample sample1 = Sample.getInstance();

        if(sample == sample1){
            System.out.println("Same Instances");
        }
    }
}
