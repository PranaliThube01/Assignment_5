import java.util.Scanner;
class Demo {
	public static void main(String [] args){
		int num =5;
		int num1 =6;

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the opeartion:");
		char operation = sc.next().charAt(0);
		

	      switch(operation){
		      case '+':
		System.out.println("Sum: " + (num+ num1));
		  break;
		      case '-':
		  System.out.println("Sub:" +(num - num1));
		  break;
		      case'*':
		  System.out.println("Multi:" +(num*num1));
		  break;
		      case '%':
		  System.out.println("div;" +(num % num1));
		  break; 

                  default:
                System.out.println("no option");
	      }
	}
}


