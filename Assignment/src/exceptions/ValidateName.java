package exceptions;

import java.util.Scanner;

public class ValidateName extends Exception{
    public ValidateName(String name){
        super(name);
    }
}
