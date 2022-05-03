package crackingthecode;

public class RotateMatrix_PG91 {

    public static void main(String[] args) {
        char[][] matrix = new char[4][4];

        char number = 'A';
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = number;
                number++;
            }
        }

        printMatrix(matrix);

        rotateMatrix(matrix);
        System.out.println("");
        System.out.println("ROTATE");
        printMatrix(matrix);

    }

    private static void rotateMatrix(char[][] matrix) {
        int n =  matrix.length;
        // loop em todas as linhas
        for (int linha = 0; linha < n / 2 ; linha++) {

            int first = linha;
            int last = n - 1 - linha;

            for (int i = first; i < last ; i++) {
                int offset = i - first;
                 char top = matrix[first][i];

                matrix[first][i] = matrix[last-offset][first];

               matrix[last-offset][first] =   matrix[last][last-offset];

               matrix[last][last-offset] = matrix[i][last];

               matrix[i][last] = top;
            }

        }

    }

    private static void printMatrix(char[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }

}
