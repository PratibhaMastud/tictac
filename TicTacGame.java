import java.util.Scanner;

class TicTac{

        public static void main(String[] args){

                Scanner sc=new Scanner(System.in);
                System.out.println("Enter 1 or 2");
                int in=sc.nextInt();
                char[] game = startGame();
		showBoard(game);
                
        }
	 public static char[] startGame(){

                char[] game = new char[10];

                for(int j=0; j<10 ; j++){

                        game[j]=' ';


                }
                return game;
        }


	public static void showBoard(char[] game){

                System.out.println("----|---|----");
                System.out.println("| " + game[0] + " | " + game[1] + " | " + game[2] + " |");
                System.out.println("|-----------|");
                System.out.println("| " + game[3] + " | " + game[4] + " | " + game[5] + " |");
                System.out.println("|-----------|");
                System.out.println("| " + game[6] + " | " + game[7] + " | " + game[8] + " |");
                System.out.println("----|---|----");


        }
}
