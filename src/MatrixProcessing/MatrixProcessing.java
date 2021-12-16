package MatrixProcessing;
import java.util.Scanner;

public class MatrixProcessing {
    public static void main (String[] arg){
        Scanner in = new Scanner(System.in);
        int sizeA[] = new int[2];
        System.out.print("Enter size matrix A: ");
        for (int i = 0; i < 2; i ++){
            sizeA[i] = in.nextInt();
        }int [][] matrixA = new int[sizeA[0]][sizeA[1]];
        System.out.println("Enter matrix: ");
        for (int i = 0; i < sizeA[0]; i ++){
            for (int i1 = 0; i1 < sizeA[1]; i1 ++){
                matrixA[i][i1] = in.nextInt();
            }
        }System.out.print("Enter constanta: ");
        int constanta = in.nextInt();
        for (int i2 = 0; i2 < sizeA[0]; i2 ++){
            for (int i3 = 0; i3 < sizeA[1]; i3 ++){
                System.out.print(matrixA[i2][i3] * constanta + " ");
            }System.out.println();
        }
    }
}
