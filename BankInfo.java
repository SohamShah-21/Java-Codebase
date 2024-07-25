class Bank
{
    int code;
    String name;
    String city;
    void getBank(int cd,String nm,String cty)
    {
        code=cd;
        name=nm;
        city=cty;
    }
    void putBank()
    {
        System.out.println("Bank code =" +code);
        System.out.println("Bank's name =", +name);
        System.out.println("Bank's city =",city);
    }
}

class BankInfo
{
    public static void main(String args[]){
        Bank bnk = new Bank();
        bnk.getBank(360002,"HDFC Bank","Rajkot");
        System.out.println("Bank Details");
        bnk.putBank();
    }
}
    