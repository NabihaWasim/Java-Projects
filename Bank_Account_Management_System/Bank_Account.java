package Bank_Account_Management_System;

public class Bank_Account {
    private double Balance;
    private final String Holder_name;
    public  Bank_Account(double Balance,String Holder_name){
        this.Balance=Balance;
        this.Holder_name=Holder_name;
    }
    public void Check_Balance(){
        System.out.println("Balance of the Acconut-"+Balance);
    }
    public void Withdraw_Amount(double amount){
        if(amount>Balance){
            System.out.println("Insufficinet Balance.");
        }
        else{
            System.out.println("Withdrwl of ammount "+amount+" is succesfull.");
            Balance=Balance-amount;
            Check_Balance();
        }
    }
    public void Deposit_Amount(double amount){

        System.out.println("Enter the amount to Deposit in account-"+amount);
        if(amount<0){
            System.out.println("Invalid amount.");
        }else{
            Balance+=amount;
            Check_Balance();

        }
        
    }

}
