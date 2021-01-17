package CheckAndUnchecked;

import Exceptions.UserAlreadyExistException;
import Exceptions.UserBlocked;

/**
 *
 * @author Sadusha
 */
public class UserExist {

    public void userExist(boolean available) {
        try {
            throw new UserAlreadyExistException("User already exists : " + available + " : checked exception");
        } catch (UserAlreadyExistException e) {
            System.out.println("Exception Caused by : " + e);
        }
    }

    public void userIsaBot(boolean bot) {
        if (!bot) {
            System.out.println("User is not a bot");
        } else {
            throw new UserBlocked("User is a bot : " + bot + " : Run time exception");
        }
    }

    public static void main(String[] args) {
        UserExist exist = new UserExist();
        exist.userExist(true);
        exist.userIsaBot(true);
    }
}