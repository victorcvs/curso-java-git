import java.util.Scanner;


/* Fazer um programa para ler dois números inteiros M e N, e depois ler uma matriz de 
 * M linhas por N colunas contendo números inteiros, podendo haver repetições. 
 * Em seguida, ler um número inteiro X que pertence à matriz. 
 * Para cada ocorrência de X, mostrar os valores à esquerda, acima, à direita e abaixo 
 * de X, quando houver, conforme exemplo.
*/

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		int mat[][] = new int[m][n];
		
		for (int i= 0 ; i < mat.length ; i++) {
			for (int j = 0 ; j< mat[i].length ; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		int x = sc.nextInt();
		
		for (int i = 0 ; i < m ; i++) {
			for (int j = 0; j < n ; j++) {
				if (mat[i][j] == x) {
					System.out.println("Position " + i + "," + j + ":" );
					
					int xLeft  = j - 1;
					int xRight = j + 1;
					int xUp    = i - 1;
					int xDown  = i + 1;
					
					if (xLeft >= 0) {
						System.out.println("Left: " + mat[i][xLeft]);
					}
					if (xRight < n) {     // só existe posição até "n-1" pois começa do 0
						System.out.println("Right: " + mat[i][xRight]);
					}
					if (xUp >= 0) {
						System.out.println("Up: " + mat[xUp][j]);
					}
					if (xDown < m) {   // só existe posição até "m-1" pois começa do 0
						System.out.println("Down: " + mat[xDown][j]);
					}
				}
			}
		}
		
		sc.close();
		
	}

}
