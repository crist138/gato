import java.util.*;
import tablero.*;

public class index{

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		Random ran = new Random();

		int pos;

		Gato gato = new Gato();


		gato.showTab();

	while(true){

	do{
		System.out.println("Turno de jugador 1\n Ingresa la posicion: ");
		pos = in.nextInt();
		gato.checkTurn(pos);
		
		gato.fill_X(pos);
		}while(gato.full);

		gato.showTab();




		if(gato.checkVictory()){
			break;
		}
		

		System.out.println("Turno de jugador 2\n Ingresa la posicion: ");
		pos = in.nextInt();
		gato.checkTurn(pos);
		gato.fill_O(pos);
		gato.showTab();
		gato.checkVictory();
		

		if(gato.checkVictory()){
			break;
		}
	
	}

	}

}