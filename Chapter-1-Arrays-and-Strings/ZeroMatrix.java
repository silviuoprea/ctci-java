class ZeroMatrix {
    public static void fillMatrixZero(int[][] input) {
        int rowSize = input.length, columnSize = input[0].length;
        int[] columns = new int[columnSize], rows = new int[rowSize];
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < columnSize; j++) {
                if (input[i][j] == 0) {
                    rows[i] = 1;
                    columns[j] = 1;
                }
            }
        }
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < columnSize; j++) {
                if (rows[i] == 1 || columns[j] == 1) {
                    input[i][j] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] input = {
                { 1, 1, 1 }, { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 }
        };
        fillMatrixZero(input);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(input[i][j] + " ");
                if (j == 2)
                    System.out.println();
            }
        }
    }
}
