public class floatingPointError{

    public static void main(String[] args) {

        for (double x = 10; x!= 0; x=x-.1) {
            if(x>0){
                System.out.println(x);
            }
        }
    }
}

