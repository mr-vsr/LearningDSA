package BitwiseOperationsAndMathsRequiredForDsa;

public class OddEven {
    public static void main(String[] args) {
        int num = 6;
        System.out.println(isOdd(num));
    }

    public static boolean isOdd(int num){
        return (num & 1) == 1;
    }
}
