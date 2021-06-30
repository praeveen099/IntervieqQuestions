//Zero Matrix: Write an algorithm such that if an element in an MxN matrix is 0, its entire row and
//        column are set to 0.
public class ZeroMatrix
{
    public static void main(String[] args)
    {
       int[][] matrixToZero = new int[3][3];
       for(int row = 0; row < matrixToZero.length; row++)
           for (int column = 0; column <matrixToZero.length; column++)
           {
               matrixToZero[row][column] = 1;
           }  // for
        matrixToZero[1][1] = 0;

        for(int row = 0; row < matrixToZero.length; row++)
        {
            for (int column = 0; column < matrixToZero.length; column++)
            {
                System.out.print(matrixToZero[row][column]);
            } // for
            System.out.println();
        } // for
        System.out.println();

        int[][] matrixReturned = zeroMatrix(matrixToZero);

        for(int row = 0; row < matrixToZero.length; row++)
        {
            for (int column = 0; column < matrixToZero.length; column++)
            {
                System.out.print(matrixReturned[row][column]);
            } // for
            System.out.println();
        } // for

    } // main

    private static int[][] zeroMatrix(int[][] matrixToZero)
    {
        boolean[] doesRowHaveAZero = new boolean[matrixToZero.length];
        boolean[] doesColumnHaveAZero = new boolean[matrixToZero[0].length];

        for(int row = 0; row < matrixToZero.length; row++)
            for (int column = 0; column < matrixToZero.length; column++)
            {
                if (matrixToZero[row][column] == 0)
                {
                    doesRowHaveAZero[row] = true;
                    doesColumnHaveAZero[column] = true;
                } // if
            } // for

        for(int row = 0; row < matrixToZero.length; row++)
            for (int column = 0; column < matrixToZero.length; column++)
            {
                if (doesRowHaveAZero[row] || doesColumnHaveAZero[column])
                  matrixToZero[row][column] = 0;
            }

        return matrixToZero;

    } // zeroMatrix
}
