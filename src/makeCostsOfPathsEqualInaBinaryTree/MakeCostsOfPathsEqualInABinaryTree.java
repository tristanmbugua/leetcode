package makeCostsOfPathsEqualInaBinaryTree;

public class MakeCostsOfPathsEqualInABinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {1, 2, 3, 4, 5, 6, 7};
		System.out.println(minIncrements(nums.length, nums));
	}
	public static int minIncrements(int n, int[] cost) {
        int totalMoves = 0;
		
		//The total paths in the number of nodes.
		int totalPaths = (n + 1)/2;
		
		int treeHeight = (int)(Math.log(n + 1) / Math.log(2)) - 1;
		
		int rightSwitch = 0;
		int leftSwitch = 0;
		
		//Find highest value path.
		while (rightSwitch < treeHeight || leftSwitch < treeHeight) {
			if (rightSwitch > leftSwitch) {
				
				rightSwitch++;
			} else if (rightSwitch > leftSwitch) {
				
				leftSwitch++;
			} else {
				
				//Increment right switch
				rightSwitch++;
			}
		}
		
		return totalMoves;
	}
	
}
