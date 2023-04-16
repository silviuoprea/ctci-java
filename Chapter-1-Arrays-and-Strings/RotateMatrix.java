class RotateMatrix {
    public static int[][] rotateMatrix(int[][] matrix)
    {
        int N = matrix.length;
        for (int x = 0; x < N / 2; x++) 
        {
            for (int y = x; y < N - x - 1; y++) 
            {
                int temp = matrix[x][y];
                matrix[x][y] = matrix[y][N - 1 - x];
                matrix[y][N - 1 - x] = matrix[N - 1 - x][N - 1 - y];
                matrix[N - 1 - x][N - 1 - y] = matrix[N - 1 - y][x];
                matrix[N - 1 - y][x] = temp;
            }
        }
        return matrix;
    }
  public static void main(String[] args)
  {
    int[][] input = {
        {1,2,3,4}, {5,6,7,8}, {9, 10, 11, 12}, {13, 14, 15, 16}
    };
    rotateMatrix(input);
    for(int i = 0; i < 4; i++)
    {
        for(int j = 0; j < 4; j++)
        {
            System.out.print(input[i][j] + " ");
            if(j == 3)
                System.out.println();
        }
    }
  }
}
