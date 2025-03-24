import java.util.Scanner;
class Demo {
	public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
	 System.out.println("chooes the plan:");
	 System.out.println("1.Platinum");
	 System.out.println("2.Gold");
	 System.out.println("3.Silver");
	 System.out.println("4.Bronze");
	 System.out.println("5.Free");

	 System.out.println("Enter your plan:");
	 int plan =sc.nextInt();

	 switch(plan){
		 case 1:
			 System.out.println("Price is 799");
			 break;
		 case 2:
			 System.out.println("price is 599");
			 break;
		 case 3:
			 System.out.println("price is 199");
			 break;
		 case 4:
			 System.out.println("free with limited access");
			 break;
		 default:
			 System.out.println("invalid input");
	 }
	}
}


