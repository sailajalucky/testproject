package javapackage;

public class Accountholderobject {

	public static void main(String[] args) {
		Accountholder tom=new Accountholder();
		Accountholder tonny=new Accountholder();
		Accountholder sara=new Accountholder();
		
		tom.FirstName="tom";
		tom.Lastname="smith";
		tom.Age=21;
		tom.Accountbalance=10000;
		tom.Eligibleforcreditcard();
		System.out.println("Is tom eligible for cc:"+tom.Eligibleforcreditcard);
		
				
		

	}

}
