package MementoPattern;

/**
 *
 * @author Sadusha
 */
public class CartFunction {

    public static void main(String[] args) {
        CartData cartData = new CartData();
        Cart cart = new Cart();
        cart.addItem(new Item("book"));
        cart.addItem(new Item("pen"));

        cartData.save(cart);
        System.out.println(cart);

        cart.addItem(new Item("pencil"));
        cartData.save(cart);
        System.out.println(cart);

        cart.addItem(new Item("bag"));
        //cartData.save(cart);
        System.out.println(cart);

        cartData.revert(cart);
        System.out.println(cart);

        cart.addItem(new Item("IPad"));
        //cartData.save(cart);
        System.out.println(cart);

        cartData.revert(cart);
        System.out.println(cart);
    }
}