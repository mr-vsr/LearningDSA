package OOPSJLabPrograms;

public class StringName {
    public static void main(String[] args) {
        String str = "Vikas";
        int size = str.length();boolean isApresent=false;
        for(int i=0;i<size;i++){
            if(str.charAt(i)=='a') {
                isApresent = true;
                System.out.println("A is present in my name at " +i);
            }
        }
        if(!isApresent) {
            System.out.println("A is not present in my name");
        }
        System.out.println("Size is " + size);
    }
}
