cimport java.util.*;

class Mrks{
    public static void main(String args[]){
        String nm;
        int rollno;
        int total,avg, mrk,mrk1,mrk2,mrk3,mrk4;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name : ");
        nm=sc.next();
        System.out.print("Enter your roll no : ");
        rollno=sc.nextInt();
        System.out.println("Enter Marks of C - Language : ");
        mrk=sc.nextInt();
        System.out.println("Enter Marks of Computer Fundamental  : ");
        mrk1=sc.nextInt();
        System.out.println("Enter Marks of Data Structure : ");
        mrk2=sc.nextInt();
        System.out.println("Enter Marks of Web Programming : ");
        mrk3=sc.nextInt();
        System.out.println("Enter Marks of SQL : ");
        mrk4=sc.nextInt();
        total=mrk+mrk1+mrk2+mrk3+mrk4;
        avg=(total)/5;

        if(avg>=70)
        {
            System.out.println("Congrats ! Distinction Class achieved");
        }
        else if(avg>=60)
        {
            System.out.println("Congrats ! First Class achieved");
        }
        else if(avg>=50)
        {
            System.out.println("Can do better Second Class achieved");
        }
        else if(avg>=40)
        {
            System.out.println("PASS");
        }
        else
        {
            System.out.println("FAIL");
        }
    }
} 