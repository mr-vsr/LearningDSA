package OOPSJLabPrograms;

public class MainQ {
    public static void main(String[] args) {
        int age = 17;
        ExceptionDemo ob = new ExceptionDemo();
        try{
            ob.test(17);
        }
        catch(InvalidAgeException Eg){
            System.out.println(Eg + ": Underage " + age);
        }
    }
}
