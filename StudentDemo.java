class Student{
        int rollno;
        String nm;
}

class StudentDemo{
    public static void main(String args[]){
        Student s1=new Student();
        s1.rollno=64;
        s1.nm="Soham Shah";
        System.out.println("Roll no :" +s1.rollno);
        System.out.println("Name : " +s1.nm);
    }
}