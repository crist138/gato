package tablero;
import java.util.*;

public class Gato{
	Scanner in = new Scanner(System.in);


//Atributos
	String[][] tablero = {{".",".","."},{".",".","."},{".",".","."}};
	public int jugador=0;
	public boolean full = false;
	


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

	public void fill_X(int pos){
		switch(pos){
			case 1:
				if(tablero[0][0] != "O"){
				tablero[0][0] = "X";
				full = false;
				} else {
				System.out.println("El espacio esta ocupado");
				full = true;
			}
			break;
		
			case 2:
				if(tablero[0][1] != "O"){
				tablero[0][1] = "X";
				full = false;
				} else {
				System.out.println("El espacio esta ocupado");
				full = true;
			}
			break;

			case 3:
				if(tablero[0][2] != "O"){
				tablero[0][2] = "X";
				full = false;
				} else {
				System.out.println("El espacio esta ocupado");
				full = true;
			}
			break;

			case 4:
				if(tablero[1][0] != "O"){
				tablero[1][0] = "X";
				full = false;
				} else {
				System.out.println("El espacio esta ocupado");
				full = true;
			}
			break;

			case 5:
				if(tablero[1][1] != "O"){
				tablero[1][1] = "X";
				full = false;
				} else {
				System.out.println("El espacio esta ocupado");
				full = true;
			}
			break;

			case 6:
				if(tablero[1][2] != "O"){
				tablero[1][2] = "X";
				full = false;
				} else {
				System.out.println("El espacio esta ocupado");
				full = true;
			}
			break;

			case 7:
				if(tablero[2][0] != "O"){
				tablero[2][0] = "X";
				full = false;
				} else {
				System.out.println("El espacio esta ocupado");
				full = true;
			}
			break;

			case 8:
				if(tablero[2][1] != "O"){
				tablero[2][1] = "X";
				full = false;
				} else {
				System.out.println("El espacio esta ocupado");
				full = true;
			}
			break;

			case 9:
				if(tablero[2][2] != "O"){
				tablero[2][2] = "X";
				full = false;
				} else {
				System.out.println("El espacio esta ocupado");
				full = true;
			}
			break;
		}

	}

	public void fill_O(int pos){
		switch(pos){
			
			case 1:
				if(tablero[0][0] != "X"){
				tablero[0][0] = "O";
				full = false;
				} else {
				System.out.println("El espacio esta ocupado");
				full = true;
			}
			break;
		
			case 2:
				if(tablero[0][1] != "X"){
				tablero[0][1] = "O";
				full = false;
				} else {
				System.out.println("El espacio esta ocupado");
				full = true;
			}
			break;

			case 3:
				if(tablero[0][2] != "X"){
				tablero[0][2] = "O";
				full = false;
				} else {
				System.out.println("El espacio esta ocupado");
				full = true;
			}
			break;

			case 4:
				if(tablero[1][0] != "X"){
				tablero[1][0] = "O";
				full = false;
				} else {
				System.out.println("El espacio esta ocupado");
				full = true;
			}
			break;

			case 5:
				if(tablero[1][1] != "X"){
				tablero[1][1] = "O";
				full = false;
				} else {
				System.out.println("El espacio esta ocupado");
				full = true;
			}
			break;

			case 6:
				if(tablero[1][2] != "X"){
				tablero[1][2] = "O";
				full = false;
				} else {
				System.out.println("El espacio esta ocupado");
				full = true;
			}
			break;

			case 7:
				if(tablero[2][0] != "X"){
				tablero[2][0] = "O";
				full = false;
				} else {
				System.out.println("El espacio esta ocupado");
				full = true;
			}
			break;

			case 8:
				if(tablero[2][1] != "X"){
				tablero[2][1] = "O";
				full = false;
				} else {
				System.out.println("El espacio esta ocupado");
				full = true;
			}
			break;

			case 9:
				if(tablero[2][2] != "X"){
				tablero[2][2] = "O";
				full = false;
				} else {
				System.out.println("El espacio esta ocupado");
				full = true;
			}
			break;
		}

	}

	public void checkTurn(int pos){
		switch(jugador){
			case 1:
				fill_X(pos);
			break;

			case 2:
				fill_O(pos);
			break;
		}
	}


	public boolean checkVictory(){

		// Patrones de victoria rectos
		if((tablero[0][0] == "X" && tablero[0][1] == "X" && tablero[0][2] == "X")){
			System.out.println("==================\n\nGANO JUGADOR 1\n\n==================");
			return true;
		}
		if((tablero[0][0] == "O" && tablero[0][1] == "O" && tablero[0][2] == "O")){
			System.out.println("==================\n\nGANO JUGADOR 2\n\n==================");
			return true;
		}


		if((tablero[1][0] == "X" && tablero[1][1] == "X" && tablero[1][2] == "X")){
			System.out.println("==================\n\nGANO JUGADOR 1\n\n==================");
			return true;
		}
		if((tablero[1][0] == "O" && tablero[1][1] == "O" && tablero[1][2] == "O")){
			System.out.println("==================\n\nGANO JUGADOR 2\n\n==================");
			return true;
		}


		if((tablero[2][0] == "X" && tablero[2][1] == "X" && tablero[2][2] == "X")){
			System.out.println("==================\n\nGANO JUGADOR 1\n\n==================");
			return true;
		}
		if((tablero[2][0] == "O" && tablero[2][1] == "O" && tablero[2][2] == "O")){
			System.out.println("==================\n\nGANO JUGADOR 2\n\n==================");
			return true;
		}


		// Patrones en diagonal

		if((tablero[0][0] == "X" && tablero[1][1] == "X" && tablero[2][2] == "X")){
			System.out.println("==================\n\nGANO JUGADOR 1\n\n==================");
			return true;
		}
		if((tablero[0][0] == "O" && tablero[1][1] == "O" && tablero[2][2] == "O")){
			System.out.println("==================\n\nGANO JUGADOR 2\n\n==================");
			return true;
		}

		if((tablero[0][2] == "X" && tablero[1][1] == "X" && tablero[2][0] == "X")){
			System.out.println("==================\n\nGANO JUGADOR 1\n\n==================");
			return true;
		}
		if((tablero[0][2] == "O" && tablero[1][1] == "O" && tablero[2][0] == "O")){
			System.out.println("==================\n\nGANO JUGADOR 2\n\n==================");
			return true;
		}


		// Patrones de victoria para arriba

		if((tablero[0][0] == "X" && tablero[1][0] == "X" && tablero[2][0] == "X")){
			System.out.println("==================\n\nGANO JUGADOR 1\n\n==================");
			return true;
		}
		if((tablero[0][0] == "O" && tablero[1][0] == "O" && tablero[2][0] == "O")){
			System.out.println("==================\n\nGANO JUGADOR 2\n\n==================");
			return true;
		}

		
		if((tablero[0][1] == "X" && tablero[1][1] == "X" && tablero[2][1] == "X")){
			System.out.println("==================\n\nGANO JUGADOR 1\n\n==================");
			return true;
		}
		if((tablero[0][1] == "O" && tablero[1][1] == "O" && tablero[2][1] == "O")){
			System.out.println("==================\n\nGANO JUGADOR 2\n\n==================");
			return true;
		}


		if((tablero[0][2] == "X" && tablero[1][2] == "X" && tablero[2][2] == "X")){
			System.out.println("==================\n\nGANO JUGADOR 1\n\n==================");
			return true;
		}
		if((tablero[0][2] == "O" && tablero[1][2] == "O" && tablero[2][2] == "O")){
			System.out.println("==================\n\nGANO JUGADOR 2\n\n==================");
			return true;	
		}

		
		return false;	
	}


}