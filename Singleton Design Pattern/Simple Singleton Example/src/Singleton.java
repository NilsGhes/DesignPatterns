
// This is an example of th lazy singleton instantiation
/**
 *
 * @author Nils
 */
public class Singleton {
    //a static variable to hold our one instance of the class singleton
    private static Singleton uniqueInstance;

    //private constructor Only singleton can initiate this class
    private Singleton() {
    }

    //getInstance() gives us a way to instantiate the class and also to return an instance of it.
    //public static Singleton getInstance()
    //will break when using multiThreading in that case use 
public static synchronized Singleton getInstance(){ //!!!!!! will decrease performance
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
// other methods
}
