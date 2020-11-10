import java.util.Scanner;

class TicTac{
	               
        public static void main(String[] args){

                char[] game = startGame();
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter 1 or 2");
                int in=sc.nextInt();
	  
		boolean output=checkMove(game);
		System.out.println(output);
        }
	
        public static char[] startGame(){

                char[] game = new char[10];

                for(int j=0; j<10 ; j++){

                        game[j]=' ';
			

                }
                return game;
        }
	
	public static boolean checkMove(char[] game){
	  	Scanner s =new Scanner(System.in);
		System.out.println("Enter your choice space :");
	  	int choice=s.nextInt();
                boolean flag=false;

			if (game[choice]==' ') {
                          	flag=true;	
			  
			}else if(choice>10) {
				System.out.println("Invalid Input.");
			}
		
			return flag;

		}		
}



