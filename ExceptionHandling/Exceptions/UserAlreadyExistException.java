package Exceptions;

/**
 *
 * @author Sadusha
 */
public class UserAlreadyExistException extends Exception{
    public UserAlreadyExistException(String s) {
        super(s);
    }
}