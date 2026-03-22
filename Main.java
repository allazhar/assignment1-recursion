import java.util.Scanner;
public class Main {
//    static Scanner sc = new Scanner(System.in);
//    public static void main(String[] args){
//        //task1
//        System.out.print("Input:");
//        int n = sc.nextInt();
//        printdigits(n);
//    }
//
//    //task1
//    static void printdigits(int n){
//        if(n<10){
//            System.out.println(n);
//            return;
//        }
//        printdigits(n/10);
//        System.out.println(n%10);
//    }

//    static Scanner sc = new Scanner(System.in);
//    public static void main(String[] args){
//
//        //task2
//        System.out.print("input:");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        fillarray(arr,0);
//        double avr=sum(arr,n)/(double)n;
//        System.out.println(avr);
//    }
//
//    //task2
//    static void fillarray(int[] arr, int index) {
//        if (index == arr.length) return;
//        arr[index] = sc.nextInt();
//        fillarray(arr,index+1);
//    }
//    static int sum(int[] arr, int n){
//        if(n<=0) return 0;
//        return arr[n-1]+sum(arr,n-1);
//    }

//    static Scanner sc = new Scanner(System.in);
//    public static void main(String[] args){
//        //task3
//        System.out.print("input:");
//        int n = sc.nextInt();
//
//        if(n==0||n==1){
//            System.out.println("neither prime nor composite");
//        } else if(isprime(n,2)){
//            System.out.println("prime");
//        } else{
//            System.out.println("composite");
//        }
//    }
//
//    //task3
//    static boolean isprime(int n, int i) {
//        if(n==2) return true;
//        if(n%i==0) return false;
//        if(i*i>n) return true;
//
//        return isprime(n,i+1);
//    }

//    static Scanner sc = new Scanner(System.in);
//    public static void main(String[] args){
//        //task4
//        System.out.print("input:");
//        int n = sc.nextInt();
//        System.out.println(factorial(n));
//    }
//    //task4
//    static int factorial(int n) {
//        if(n==1) return 1;
//        return factorial(n-1)*n;
//    }

//    static Scanner sc = new Scanner(System.in);
//    public static void main(String[] args){
//        //task5
//        System.out.print("input:");
//        int n = sc.nextInt();
//        System.out.println(fibonacci(n));
//    }
//    //task5
//    static int fibonacci(int n){
//        if(n==0) return 0;
//        if(n==1) return 1;
//        return fibonacci(n-1)+fibonacci(n-2);
//    }

//    static Scanner sc = new Scanner(System.in);
//    public static void main(String[] args){
//        //task6
//        System.out.print("input:");
//        int a = sc.nextInt();
//        int n = sc.nextInt();
//        System.out.println(power(a,n));
//    }
//    //task6
//    static int power(int a, int n){
//        if(n==0) return 1;
//        return a*power(a,n-1);
//    }

//    static Scanner sc = new Scanner(System.in);
//    public static void main(String[] args){
//        //task7
//        System.out.print("input:");
//        int n = sc.nextInt();
//        reverse(n);
//    }
//    //task7
//    static void reverse(int n){
//        if(n==0) return;
//        int a= sc.nextInt();
//        reverse(n-1);
//        System.out.print(a+" ");
//    }

//    static Scanner sc = new Scanner(System.in);
//    public static void main(String[] args){
//        //task8
//        System.out.print("input: ");
//        String n = sc.next();
//        if(alldigits(n,0)){
//            System.out.println("yes");
//        } else{
//            System.out.println("no");
//        }
//    }
//    //task8
//    static boolean alldigits(String n, int i){
//        if(i==n.length()) return true;
//        char c=n.charAt(i);
//        if(Character.isDigit(c)){
//            return alldigits(n,i+1);
//        } else{
//            return false;
//        }
//    }

//    static Scanner sc = new Scanner(System.in);
//    public static void main(String[] args){
//        //task9
//        System.out.print("input: ");
//        String n = sc.next();
//        System.out.println(totalnum(n));
//    }
//    //task9
//    static int totalnum(String s){
//        if(s.equals("")) return 0;
//        return 1+totalnum(s.substring(1));
//    }

//    static Scanner sc = new Scanner(System.in);
//    public static void main(String[] args){
//        //task10
//        System.out.print("input: ");
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        System.out.println(GCD(a,b));
//    }
//    //task10
//    static int GCD(int a, int b){
//        if(b==0) return a;
//        return GCD(b,a%b);
//    }
}