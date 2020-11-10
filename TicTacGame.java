import java.util.Scanner;

class TicTacGame{

 public static void main(String[] args){

                char[] game = startGame();
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter 1 or 2");
                int in=sc.nextInt();

                allowInput();
        }

	public static void allowInput(){
		System.out.println("Enter Input as 'x' or 'o' ");
		char input=sc.next().charAt(0);
		switch(input){
			case 'x':
				User='x';
				opponent='o';
				break;
			case 'o':
				User='o';
				opponent='x';
				break;
			default:
				break;
		}

	}
}
