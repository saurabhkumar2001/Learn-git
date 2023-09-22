import java.util.Scanner;
public class diff{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = obj.nextInt();
        System.out.println("Enter a number");
        int b = obj.nextInt();
        int c = a-b;
        System.out.println("the difference of two number is "+c);

    }
    
}
