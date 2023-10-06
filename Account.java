
public class Account {
int acc_no,balance;
String name,acc_type;

Account(int acc_no,int balance,String name,String acc_type)
{
	this.acc_no=acc_no;
	this.balance=balance;
	this.name=name;
	this.acc_type=acc_type;
	
}
void display() 
	{
		System.out.println("Accno: "+acc_no+" Acctype: "+acc_type+" Name: "+name+" Balance: "+balance);
		
	}

}
