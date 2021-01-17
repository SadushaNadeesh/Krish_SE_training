package Exceptions;

/**
 *
 * @author Sadusha
 */
public class UserBlocked extends RuntimeException {

    public UserBlocked(String s) {
        super(s);
    }
}