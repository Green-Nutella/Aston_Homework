import java.util.Arrays;

public class Task13 {
    public static void squareArray() {
        int[][] oneSquare = new int[7][7];

        for(int i = 0; i < oneSquare.length; i++){
            oneSquare[i] = new int[7];
            for(int j = 0; j < oneSquare[0].length; j++){
                oneSquare[i][j] = (i == j || i == 7 - j - 1) ? 1 : 0;
                System.out.print(oneSquare[i][j] + " ");
            }
            System.out.println();
        }

    }
}
