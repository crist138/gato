package tablero;
import java.util.*;

public class Gato{
	Scanner in = new Scanner(System.in);


//Atributos
	int[][] tablero = new int[3][3];


//Metodos
	public void showTab(){
		int i,j;



		for (i=0;i<3;i++){
			for(j=0;j<3;j++){
				System.out.print("Ingresa el dato para la posicion ["+i+"] ["+j+"]\n: ");
				tablero[i][j] = in.nextInt();
			}
		}

		for (i=0;i<3;i++){
			for(j=0;j<3;j++){
				if(j>0 || j<3){
					System.out.print(tablero[i][j]+"|");
				} 

				if(j==2){
					System.out.println();
				}
			}
		}
	}


}