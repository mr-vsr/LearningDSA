package OOPSJLabPrograms;

import java.util.Random;

class Number implements Runnable{
    private final Random random = new Random();
    private volatile boolean running = true;

    public void stop(){
        running = false;
    }

    public void run(){
        while(running){
            int num = random.nextInt(100);
            System.out.println("Generated Random Number is " + num);

            if(num%2==0){
                SquareThread squareThread = new SquareThread(num);
                Thread thread = new Thread(squareThread);
                thread.start();
            }
            else{
                CubeThread cubeThread = new CubeThread(num);
                Thread thread = new Thread(cubeThread);
                thread.start();
            }

            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }

}
class SquareThread implements Runnable{
    private int num;
    public SquareThread(int num){
        this.num = num;
    }
    public void run(){
        int square = this.num*this.num;
        System.out.println("Square of the number " + this.num + " is " + square);
    }
}

class CubeThread implements Runnable{
    private int num;
    public CubeThread(int num){
        this.num = num;
    }
    public void run(){
        int cube = this.num*this.num*this.num;
        System.out.println("The cube of the number " + this.num + " is " + cube);
    }
}


public class MultiThreading {
    public static void main(String[] args){
        Number generator = new Number();
        Thread thread = new Thread(generator);

        thread.start();
        try{
            Thread.sleep(10000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        generator.stop();
    }

}
