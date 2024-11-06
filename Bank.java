
public class Bank {
	int acc_no;
	double bal;
	double interest;
	Bank(int a,double b,double i){
		acc_no=a;
		bal = b;
		interest=i;
	}
	void deposit(int money){
		bal+=money;
		System.out.println("successfully deposited "+money+"/- current balance: "+bal+"/-");
	}
}


