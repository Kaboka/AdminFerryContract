package ferry.eto;

/**
 *
 * @author Mads
 */
public class NoSuchTravelingEntityException extends Exception {

    public NoSuchTravelingEntityException() {
    }
    
    public NoSuchTravelingEntityException(String message){
        super(message);
    }
}
