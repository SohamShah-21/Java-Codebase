import java.util.*;
class If{
     public static void main(String args[]){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number : ");
        n=sc.nextInt();

        if(n>0)
            System.out.println("Positive");
        else if(n<0)
            System.out.println("Negative");
        else
            System.out.println("Zero");         
        }
}