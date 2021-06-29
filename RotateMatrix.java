//Rotate Matrix: Given an image represented by an NxN matrix, where each pixel in the image is 4
//        bytes, write a method to rotate the image by 90 degrees. Can you do this in place?


public class RotateMatrix
{

    private static int[][]matrixToRotate = new int[4][4];
    public static void main(String[] args)
    {
        // just setting up the matrix
        int value = 0;
        for (int row = 0; row < matrixToRotate.length; row ++)
            for (int column = 0; column < matrixToRotate[0].length; column ++)
            {
                value++;
                if(value>9)
                    value=1;
                matrixToRotate[row][column] = value;
            } // for

        // printing out old matrix
        for (int row = 0; row < matrixToRotate.length; row ++) {
            for (int column = 0; column < matrixToRotate[0].length; column++) {
                System.out.print(matrixToRotate[row][column]);
            } // for
            System.out.println();
        }

        boolean hasMatrixBeenRotated = matrixRotation(matrixToRotate);
        System.out.println(hasMatrixBeenRotated);

        // printing out the matrix after being rotated
        for (int row = 0; row < matrixToRotate.length; row ++) {
            for (int column = 0; column < matrixToRotate[0].length; column++) {
                System.out.print(matrixToRotate[row][column]);
            } // for
            System.out.println();
        }
    }

    private static boolean matrixRotation(int[][] matrixForRotation)
    {

      // check if matrix is square matrix and also if greater than 0 length
      if (matrixForRotation.length == 0 || matrixForRotation.length != matrixForRotation[0].length)
          return false;

      int n = matrixForRotation.length;

      for(int layer = 0; layer < n/2; layer++)
      {
          int first = layer;
          int last = n - 1 - layer;
          for(int i= first; i< last; i++)
          {
              int offset = i -first;
              // the top element which will be moved to the right
              int top = matrixForRotation[first][i];
              // top = left
              matrixForRotation[first][i] = matrixForRotation[last-offset][first];
              // left = bottom
              matrixForRotation[last-offset][first] = matrixForRotation[last][last-offset];
              // bottom = right
              matrixForRotation[last][last-offset] = matrixForRotation[i][last];
              // right = top
              matrixForRotation[i][last] = top;

          } // for
      } // for
        return true;
    } // matrixRotation

} // RotateMatrix class
