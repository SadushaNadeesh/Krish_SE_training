package MementoPattern;

import java.util.Stack;

/**
 *
 * @author Sadusha
 */
//CareTaker class
public class CartData {
    Stack<Cart.CartMemento> history = new Stack<>();
    
    public void save(Cart cart){
        history.push(cart.save());
    }
    public void revert(Cart cart){
        if(!history.isEmpty()){
            cart.revert(history.pop());
        }else{
            System.out.println("Cannot undo");
        }
    }
}
