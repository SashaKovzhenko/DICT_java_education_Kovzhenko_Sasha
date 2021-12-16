package MatrixProcessing;
import java.util.Scanner;

public class MatrixProcessing {
    public static void main (String[] arg){
        Scanner in = new Scanner(System.in);
        int menu;
        do{
            System.out.println("1. Add matrices");
            System.out.println("2. Multiply matrix by a const");
            System.out.println("3. Multiply matrices");
            System.out.println("4. EXIT");
            System.out.print("Your choice: ");
            menu = in.nextInt();
            switch(menu){
                case 1:
                    int sizeA[] = new int[2];
                    System.out.print("Enter size of first matrix A: ");
                    for (int i = 0; i < 2; i ++){
                        sizeA[i] = in.nextInt();
                    }double [][] matrixA = new double[sizeA[0]][sizeA[1]];
                    System.out.println("Enter first matrix A: ");
                    for (int i = 0; i < sizeA[0]; i ++){
                        for (int i1 = 0; i1 < sizeA[1]; i1 ++){
                            matrixA[i][i1] = in.nextDouble();
                        }
                    }int sizeB[] = new int[2];
                    System.out.print("Enter size of second matrix B: ");
                    for (int i = 0; i < 2; i ++){
                        sizeB[i] = in.nextInt();
                    }double [][] matrixB = new double[sizeB[0]][sizeB[1]];
                    System.out.println("Enter second matrix B: ");
                    for (int i = 0; i < sizeB[0]; i ++){
                        for (int i1 = 0; i1 < sizeB[1]; i1 ++){
                            matrixB[i][i1] = in.nextDouble();
                        }
                    }if (sizeA[0] == sizeB[0]){
                        if (sizeA[1] ==sizeB[1]){
                            System.out.println("The result is: ");
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
                    }break;
                case 2:
                    int sizeC[] = new int[2];
                    System.out.print("Enter size matrix C: ");
                    for (int i = 0; i < 2; i ++){
                        sizeC[i] = in.nextInt();
                    }double [][] matrixC = new double[sizeC[0]][sizeC[1]];
                    System.out.println("Enter matrix C: ");
                    for (int i = 0; i < sizeC[0]; i ++) {
                        for (int i1 = 0; i1 < sizeC[1]; i1++) {
                            matrixC[i][i1] = in.nextDouble();
                        }
                    }System.out.print("Enter constanta: ");
                    double constanta = in.nextDouble();
                    for (int i2 = 0; i2 < sizeC[0]; i2 ++){
                        for (int i3 = 0; i3 < sizeC[1]; i3 ++){
                            System.out.print(matrixC[i2][i3] * constanta + " ");
                        }System.out.println();
                    }break;
                case 3:
                    int sizeD[] = new int[2];
                    System.out.print("Enter size of first matrix D: ");
                    for (int i = 0; i < 2; i ++){
                        sizeD[i] = in.nextInt();
                    }double [][] matrixD = new double[sizeD[0]][sizeD[1]];
                    System.out.println("Enter first matrix D: ");
                    for (int i = 0; i < sizeD[0]; i ++){
                        for (int i1 = 0; i1 < sizeD[1]; i1 ++){
                            matrixD[i][i1] = in.nextDouble();
                        }
                    }int sizeE[] = new int[2];
                    System.out.print("Enter size of second matrix E: ");
                    for (int i = 0; i < 2; i ++){
                        sizeE[i] = in.nextInt();
                    }double [][] matrixE = new double[sizeE[0]][sizeE[1]];
                    System.out.println("Enter second matrix E: ");
                    for (int i = 0; i < sizeE[0]; i ++){
                        for (int i1 = 0; i1 < sizeE[1]; i1 ++){
                            matrixE[i][i1] = in.nextDouble();
                        }
                    }double[][] matrixF = new double[sizeD[0]][sizeE[1]];
                    for (int i9 = 0; i9 < sizeD[0]; i9 ++){
                        for (int i10= 0; i10 < sizeE[1]; i10 ++){
                            matrixF[i9][i10] = 0;
                        }
                    }if (sizeD[1] == sizeE[0]) {
                        for (int i5 = 0; i5 < sizeD[0]; i5++) {
                            for (int i6 = 0; i6 < sizeE[1]; i6++) {
                                for (int i7 = 0; i7 < sizeD[1]; i7++) {
                                matrixF[i5][i6] = matrixF[i5][i6] + matrixD[i5][i7] * matrixE[i7][i6];
                                }System.out.print(matrixF[i5][i6] + " ");
                            }System.out.println();
                        }
                    }else {
                        System.out.println("ERROR");
                    }
                case 4:
                    System.exit(0);
                    break;
            }
        }while (true);

    }
}
