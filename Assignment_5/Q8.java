import java.util.Scanner;
class Demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 1 no :");
		int no1 = sc.nextInt();

		System.out.println("Enter 2 no :");
                int no2 = sc.nextInt();

		if(no1 < 0 || no2 <0){
			System.out.println("Sorry negative numbers is not allowed");
		}
		else{
			int product = no1 *no2;
			System.out.println("Product: "+product);

			switch(product %2){
				case 0:
					System.out.println("even");
					break;
				case 1:
					System.out.println("odd");
			}
		}
	}
}

