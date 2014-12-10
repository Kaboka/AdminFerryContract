package ferry.eto;

/**
 *
 * @author Mads
 */
public class NoSuchRouteException extends Exception {

    public NoSuchRouteException() {
    }
    
    public NoSuchRouteException(String message){
        super(message);
    }
}
