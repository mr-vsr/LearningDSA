package OOPSJLabPrograms;

// Custom exception declaration

public class InvalidAgeException extends Exception{
    public InvalidAgeException() {
        super();
    }
}

// Custom exception InvalidAgeException's initialization 
class ExceptionDemo{
    public static void test(int age) throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException();
        }
    }
}


