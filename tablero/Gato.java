package tablero;
import java.util.*;

public class Gato{
	Scanner in = new Scanner(System.in);


//Atributos
	String[][] tablero = {{".",".","."},{".",".","."},{".",".","."}};


//Metodos
	public void showTab(){
		int i,j;


		/* Test para llenarlo por interaccion
		for (i=0;i<3;i++){
			for(j=0;j<3;j++){
				System.out.print("Ingresa el dato para la posicion ["+i+"] ["+j+"]\n: ");
				tablero[i][j] = in.nextLine();
			}
		}

		*/

		/*System.out.print("\t\t---------------\n"); */
		System.out.println("\n\n");
		for (i=0;i<3;i++){
			System.out.print("\t\t");
			for(j=0;j<3;j++){
				
					System.out.print("| "+tablero[i][j]+" |");

				
				if(j==2){
					System.out.println("\n\n\n");

				/*	System.out.print("\t\t---------------\n"); */

				}
			}
		}
	}


}