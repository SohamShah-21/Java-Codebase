import java.util.*;

class Details{
    public static void main(String args[]){
        int rollno;
        String nm;
        float per;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Roll no :");
        rollno=sc.nextInt();
        System.out.println("Enter Name :");
        nm=sc.next();
        System.out.println("Enter Per(%) :");
        per=sc.nextfloat();
        System.out.println("My Roll no is --> " +rollno);
        System.out.println("My Name is --> " +nm);
        System.out.println("My Percentage is --> " +per);
    }
}