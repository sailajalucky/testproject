package javapackage;



public class Accountholder {
	String	FirstName;
	String	Lastname;
		int	Age;
double	Accountbalance;
	boolean	Eligibleforcreditcard;	
	
	public void Eligibleforcreditcard() {
		if(Age<25 && Accountbalance<=20000) {
			Eligibleforcreditcard=true;
	}
			
			

	}
}
