public class ArrayOfArrays {
    public static void main(String[] args) {
        int[][] aMatrix = new int[4][];
//        int[][] aMatrix = new int[4][5];

        //populate matrix
        for (int row = 0; row < aMatrix.length; row++) {
            aMatrix[row] = new int[row+2];	//create sub-array
            for (int col = 0; col < aMatrix[row].length; col++) {
                aMatrix[row][col] = row + col;
            }
        }

        //print matrix
        for (int row = 0; row < aMatrix.length; row++) {
            for (int col = 0; col < aMatrix[row].length; col++) {
                System.out.print(aMatrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
