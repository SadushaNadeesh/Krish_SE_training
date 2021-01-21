package castingDemo;

/**
 *
 * @author Sadusha
 */
public class CastingDemo {

    public void automaticTypeConversion() {
        int i = 100;

        // automatic type conversion 
        long l = i;

        // automatic type conversion 
        float f = l;
        System.out.println("Int value " + i);
        System.out.println("Long value " + l);
        System.out.println("Float value " + f);
    }

    public void explicitConversion() {
        char ch = 'c';
        int num = 88;
        //ch = num; 
        //error: incompatible types: possible lossy conversion from int to char
        
        double d = 100.04;  
          
        //explicit type casting 
        long l = (long)d; 
          
        //explicit type casting  
        int i = (int)l;  
        System.out.println("Double value "+d); 
          
        //fractional part lost 
        System.out.println("Long value "+l);  
          
        //fractional part lost 
        System.out.println("Int value "+i);  
    }

    public static void main(String[] args) {
        CastingDemo castingDemo = new CastingDemo();
        castingDemo.automaticTypeConversion();
    }

}
/*
 Int value 100
 Long value 100
 Float value 100.0
 */