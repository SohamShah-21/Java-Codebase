class Calc{
    int sum(int a,int b)
    {
        return(a+b);
    }
    int sum(int a,int b,int c)
    {
        return(a+b+c);
    }
}
class CalcDemo{
    public static void main(String args[]){
        Calc clc=new Clac();
        int s1,s2;
        s1=clc.sum(10,20);
        s2=clc.sum(10,20,30);
        System.out.println("Sum of two values --> " +s1);
        System.out.println("Sum of three values --> "+s2S); 
    }
}