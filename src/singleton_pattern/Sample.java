package singleton_pattern;

public class Sample {
    private static volatile Sample instance = null;

    // Protect from reflections
    private Sample(){
        if(instance != null){
             throw new RuntimeException("Use getInstance() method to create");
        }
    }

    public static Sample getInstance(){
            // Added Lazy loading and Thread Safe
            if(instance == null) {
                synchronized (Sample.class) {
                    if (instance == null) {
                        instance = new Sample();
                    }
                }
            }
            return instance;
    }
}
