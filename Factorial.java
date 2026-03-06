public class Factorial{
    public static void fact(int n){
        if(n<0){
            System.out.println("Invalid");
        return;
    }
    int factorial = 1;
    for(int i=n;i>=1;i--){
        factorial=factorial*i;

    }
    System.err.println(fact);
    return;
}
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    //System.out.println("Enter number");
    int n=sc.nextInt();
    fact(n);
}
}
