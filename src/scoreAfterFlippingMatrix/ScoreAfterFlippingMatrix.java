package scoreAfterFlippingMatrix;

public class ScoreAfterFlippingMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = {
				{0, 0, 1, 1},
				{1, 0, 1, 0},
				{1, 1, 0, 0}
				};
		System.out.println(matrixScore(grid));
	}

	public static int matrixScore(int[][] grid) {
        int score = 0;
        int leftSide = 0;
        int rightSide = 0;
        
        //Change matrix - rows
        for (int i = 0; i < grid.length; i++) {
        	if (grid[i].length == 1) {
        		if (grid[i][0] == 0) {
        			grid[i][0] = 1;
        		}
        		continue;
        	}
        	//If there are more 1s on the right than left, flip the row 
        	for (int j = 0; j < grid[i].length; j++) {
        		//Even length rows
        		if (grid[i].length % 2 == 0) {
        			//Count left side
            		if (j < grid[i].length/2) {
            			if (grid[i][j] == 1) {
            				leftSide++;
            			}
            			
            		}
            		//Count right side
            		else {
            			if (grid[i][j] == 1) {
            				rightSide++;
            			}
            		}
        		}
        		//Odd length rows
        		else {
        			//Count left side
            		if (j < grid[i].length/2 + 1) {
            			if (grid[i][j] == 1) {
            				leftSide++;
            			}
            		}
            		//Count right side
            		else {
            			if (grid[i][j] == 1) {
            				rightSide++;
            			}
            		}
        		}
        		
        		//Check for flip
        		
        		
        	}
        	
        	//Flip algorithm
        	if (leftSide < grid[i].length/2) {
        		for (int j = 0; j < grid[i].length; j++) {
            		if (grid[i][j] == 0) {
            			grid[i][j] = 1;
            		} else {
            			grid[i][j] = 0;
            		}
            	}
        	}
        	
        	leftSide = 0;
        	rightSide = 0;
        }
        
      //Change matrix - columns
       int zeroes = 0;
        for (int i = 0; i < grid[0].length; i++) {
        	for (int j = 0; j < grid.length; j++) {
        		//If more than half are zeroes, flip
        		if (grid[j][i] == 0) {
        			zeroes++;
        		}
        	}
        	if (zeroes > (grid.length/2)) {
        		//Flip algorithm
        		for (int j = 0; j < grid.length; j++) {
            		//If more than half are zeroes, flip
            		if (grid[j][i] == 0) {
            			grid[j][i] = 1;
            		} else {
            			grid[j][i] = 0;
            		}
            	}
        	}
        	zeroes = 0;
        }
        
        //Gather score - start from back
        int magnitude = 1;
        for (int i = 0; i < grid.length; i++) {
        	for (int j = grid[i].length-1; j > -1; j--) {
        		if (grid[i][j] == 1) {
            		score += magnitude;
        		}
        		magnitude *= 2;
            }
        	magnitude = 1;
        }
        
        return score;
    }
}
