package DynammicProgramming;

import java.util.Arrays;

//public class Main implements B{
//    public static void main(String[] args){
//        Main ob = new Main();
//        String a = ob.m1();
//        System.out.println(a);
//    }
//}

//public class Main implements B{
//    public static void main(String[] args){
//        Main ob = new Main();
//        String a = ob.m1();
//        System.out.println(a);
//    }
//}

//public class Main implements B , A{
//    public static void main(String[] args){
//        A ob = new Main();
//        String a = ob.m1();
//        System.out.println(a);
//    }
//}


//class NT1{
//    Thread t1;
//
//    public NT1() {
//        this.t1 = new Thread("Print1");
//    }
//
//    public void run() {
//        for (int i = 1; i <= 5; i++) {
//            System.out.println(i);
//        }
//    }
//}
//
//class NT2{
//    Thread t2;
//
//    public NT2() {
//        this.t2 = new Thread("Print2");
//    }
//
//    synchronized public void run() {
//        for (int i = 11; i <= 15; i++) {
//            System.out.println(i);
//        }
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        NT1 ob1 = new NT1();
//        NT2 ob2 = new NT2();
//        ob2.t2.run();
//        ob1.t1.start();
//        System.out.println(ob1.t1.getName());
//    }
//}

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
System.out.println("Please enter a five letter word");
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();

for (int i = 0; i < input.length(); i++) {             // pos. of 1st letter
        for (int j = 0; j < input.length(); j++) {         // pos. of 2nd letter
            for (int k = 0; k < input.length(); k++) {     // pos. of 3rd letter
                if (i == j || i == k || j == k) continue;  // any letter taken twice? -> skip
                System.out.printf("%c%c%c\n", input.charAt(i), input.charAt(j), input.charAt(k));
            }
        }
    }
    }
}
