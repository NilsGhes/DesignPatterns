// Uses less resources because we only synchronize the first time (checks if the instance is created first , if not, then synchronizes)
// WONT WORK IN JAVA 1.4 OR EARLIER
/**
 *
 * @author Nils
 */
public class DoubleCheckedLockingSingleton {
    //The volatile keyword ensures that multiple threads handle the uniqueInstance variable correctly when it is being initialized to the Singleton instance.
    private volatile static DoubleCheckedLockingSingleton uniqueInstance;
    
    private DoubleCheckedLockingSingleton (){}
    public static DoubleCheckedLockingSingleton getInstance(){
        //Checks foor an instance, if there isn't one, enter a synchronized block ( we only synchronized the first time through that way)
        if(uniqueInstance ==null){
            synchronized (DoubleCheckedLockingSingleton.class){
                if (uniqueInstance ==null){
                    //Check agaian, if it's still null, create the instance
                    uniqueInstance = new DoubleCheckedLockingSingleton();
                }
            }
        }
        return uniqueInstance;
    }
}
