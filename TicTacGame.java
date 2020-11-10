import java.util.Scanner;

class TicTac{

        public static void main(String[] args){

                Scanner sc=new Scanner(System.in);
                System.out.println("Enter 1 or 2");
                int in=sc.nextInt();
		
		char[] game = startGame();


        }
// Uc-1
        public static char[] startGame(){

                char[] game = new char[10];

                for(int j=0; j<9 ; j++){

                        game[j]=' ';


                }
                return game;
        }
}
