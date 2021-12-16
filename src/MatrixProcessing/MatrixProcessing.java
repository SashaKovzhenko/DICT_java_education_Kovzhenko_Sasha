package MatrixProcessing;
import java.util.Scanner;

public class MatrixProcessing {
    public static void main (String[] arg){
        Scanner in = new Scanner(System.in);
        int sizeA[] = new int[2];
        for (int i = 0; i < 2; i ++){
            sizeA[i] = in.nextInt();
        }int [][] matrixA = new int[sizeA[0]][sizeA[1]];
        for (int i = 0; i < sizeA[0]; i ++){
            for (int i1 = 0; i1 < sizeA[1]; i1 ++){
                matrixA[i][i1] = in.nextInt();
            }
        }int sizeB[] = new int[2];
        for (int i = 0; i < 2; i ++){
            sizeB[i] = in.nextInt();
        }int [][] matrixB = new int[sizeB[0]][sizeB[1]];
        for (int i = 0; i < sizeB[0]; i ++){
            for (int i1 = 0; i1 < sizeB[1]; i1 ++){
                matrixB[i][i1] = in.nextInt();
            }
        }if (sizeA[0] == sizeB[0]){
            if (sizeA[1] ==sizeB[1]){
                for (int i2 = 0; i2 < sizeB[0]; i2 ++){
                    for (int i3 = 0; i3 < sizeB[1]; i3 ++){
                        System.out.print(matrixB[i2][i3] + matrixA[i2][i3] + " ");
                    }System.out.println();
                }
            }else{
                System.out.println("ERROR");
            }
        }else{
            System.out.println("ERROR");
        }
    }
}
