// If you application always creates and uses an instance of the singleton you want to create the singleton like this
// It will always create the instance
/**
 *
 * @author Nils
 */
public class EagerlySingleton {
    private static EagerlySingleton uniqueInstance = new EagerlySingleton();
    
    private EagerlySingleton(){}
    
    public static EagerlySingleton getInstance(){
        return uniqueInstance;
    }
}
