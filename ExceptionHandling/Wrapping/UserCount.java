package wrapping;

import exceptions.UserAlreadyExistException;
import exceptions.UserBlocked;

/**
 *
 * @author Sadusha
 */
public class UserCount {
    public void userCount(int count){
        try {
            throw new UserAlreadyExistException(count+"");
        } catch (UserAlreadyExistException e) {
            throw new UserBlocked("Maximum User count reached, exceed 1000 : "+e);
        }
    }
    
    public static void main(String[] args) {
        UserCount userCount = new UserCount();
        userCount.userCount(1001);
    }
}