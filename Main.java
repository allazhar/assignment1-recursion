import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        //task10
        System.out.print("input: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(GCD(a,b));
    }
    //task10
    static int GCD(int a, int b){
        if(b==0) return a;
        return GCD(b,a%b);
    }
}