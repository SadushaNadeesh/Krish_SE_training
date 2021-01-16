package Com.CheckAndUnchecked;

import Com.Exceptions.UserAlreadyExistException;
import Com.Exceptions.UserBlocked;

/**
 *
 * @author Sadusha
 */
public class UserExist {
    public void userExist(boolean available){
        try {
            throw new UserAlreadyExistException("User already exists : "+available +" : checked exception");
        } catch (UserAlreadyExistException e) {
            e.printStackTrace();
        }
    }
    public void userIsaBot(boolean bot){
        throw new UserBlocked("User is a bot : "+bot+" : Run time exception");
//        try {
//            System.out.println("User is a Bot.");
//        } catch (Exception e) {
//            e.printStackTrace();
//            throw new UserBlocked("User valid : "+bot+" Run time exception");
//        }
    }
    
    
    public static void main(String[] args) {
        UserExist exist = new UserExist();
        exist.userExist(true);
        exist.userIsaBot(true);
    }
}
