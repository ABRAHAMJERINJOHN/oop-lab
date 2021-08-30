//filename: SavingAccount.java
// SavingAccount class
public class SavingsAccount {
public static double annualInterestRate;
private double savingsBalance;
public SavingsAccount() {
annualInterestRate = 0.0;
savingsBalance = 0.0;
}

public SavingsAccount(double intRate, double savBal) {
annualInterestRate = intRate;
savingsBalance = savBal;
}

public double calculateMonthlyInterest() {
double intRate = (savingsBalance * annualInterestRate/12);
savingsBalance = savingsBalance + intRate;
return intRate;
}

public static void modifyInterestRate(double newInteresRate) {
annualInterestRate = newInteresRate;
}

public void setSavingsBalance(double newBal) {
savingsBalance = newBal;
}
public double getSavingsBalance() {
return savingsBalance;
}
public double getAnnualInterestRate() {
return annualInterestRate;
}
}
//filename: SavingsAccountTest.java
// SavingsAccount testing class with the main() method
public class SavingsAccountTest {
public static void main(String[] args) {
SavingsAccount saver1 = new SavingsAccount();
SavingsAccount saver2 = new SavingsAccount();
saver1.setSavingsBalance(2000.00);
saver2.setSavingsBalance(3000.00);
SavingsAccount.modifyInterestRate(0.04);
saver1.calculateMonthlyInterest();
saver2.calculateMonthlyInterest();
System.out.printf(“New Balance for Saver1=%f\n”,saver1.getSavingsBalance());
System.out.printf(“New Balance for Saver2=%f\n”,saver2.getSavingsBalance());

SavingsAccount.modifyInterestRate(0.05);
saver1.calculateMonthlyInterest();
saver2.calculateMonthlyInterest();
System.out.printf(“New Balance for Saver1=%f\n”,saver1.getSavingsBalance());
System.out.printf(“New Balance for Saver2=%f\n”,saver2.getSavingsBalance());

}
}
class CPU{
    double price;
    RAM robj;
    Processor pobj;
    CPU(double p,String rmemory,String rmanufacturer,String pmanufacturer,int pcores){
        price=p;
        robj=new RAM(rmemory,rmanufacturer);
        pobj=new Processor(pcores,pmanufacturer);
    }
    class Processor{
        int pcores;
        String pmanufacturer;
        Processor(int pcores,String pmanufacturer){
            this.pcores=pcores;
            this.pmanufacturer=pmanufacturer;
        }
        void pdisplay(){
            System.out.println("Processor Core = "+pcores);
            System.out.println("Processor manufacturer = "+pmanufacturer);
        }
    }
    static class RAM{
        String rmemory;
        String rmanufacturer;
        RAM(String rmemory, String rmanufacturer){
            this.rmemory=rmemory;
            this.rmanufacturer=rmanufacturer;
        }
        void rdisplay(){
            System.out.println("RAM Memory = "+rmemory);
            System.out.println("RAM manufacturer = "+rmanufacturer);
        }
    }
    void display(){
        System.out.println("CPU Price = "+price);
        robj.rdisplay();
        pobj.pdisplay();
    }
}
class java_8_CPU {
    public static void main(String args[]) {
        CPU c=new CPU(1500,"50 GB","RAMmanufacturer","Processormanufacturer",4);
        c.display();

    }
}