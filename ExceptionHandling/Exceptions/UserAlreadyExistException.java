package exceptions;

/**
 *
 * @author Sadusha
 */
public class UserAlreadyExistException extends Exception{
    public UserAlreadyExistException(String s) {
        super(s);
    }
}