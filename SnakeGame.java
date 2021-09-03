package bankAccountPackage;

public class SnakeGame {

	int tailleSnake;
	char[] array = {D, G, B,H};
	 private int xPosition;
     private int yPosition;
	
	//check that each position preceding 
	 //the one square from the head represents the next position of the next square
	
	void checkDirection(char currentDir, char prevDir){
		if((currentDir == 'D' && prevDir == 'G') || (currentDir == 'H' && prevDir == 'B') 
				|| (currentDir == 'G' && prevDir == 'D') || (currentDir == 'B' && prevDir == 'H') ) {
			throw Exception("illegal deplacement");
		}
	}
	
	 //update Position sur l'axe des X, n taille
	int UpdateXPosition()
	//si X(n) = X(n-1) + 1 alors Y++
	//si X(n) = X(n-1) - 1 alors Y--
	
	
	 //update Position sur l'axe des Y
	int UpdateYPosition()
	//si Y(n) = Y(n-1) +1 alors X++
	//si Y(n) = Y(n-1) -1 alors X--
	
	
}
