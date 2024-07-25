class Employee
{
    int id,salary
    string name;
    void getValue()
    {
        id=230802105
        name="SHUBHAM GHELANI";
        salary=175000;
    }
    void putValue()
    {
        System.out.println("My Employee id -->" +id);
        System.out.println("My Name is -->" +name);
        System.out.println("My Salary is -->" +salary);
    }
}

class EmployeeInfo
{
  public static void main(String args[]){
    Info Em1=new Info();
    Em1.getValue();
    Em1.putValue();
    }
}