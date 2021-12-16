package MatrixProcessing;
import java.util.Scanner;

public class MatrixProcessing {
    public static void main (String[] arg){
        Scanner in = new Scanner(System.in);
        int menu;
        do{
            System.out.println("1. Add matrices\n" +
                    "2. Multiply matrix by a constant\n" +
                    "3. Multiply matrices\n" +
                    "4. Transport\n" +
                    "5. Exit");
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
                    int sizeG[] = new int[2];
                    System.out.print("Enter size matrix G: ");
                    for (int i = 0; i < 2; i++) {
                        sizeG[i] = in.nextInt();
                    }double[][] matrix_G = new double[sizeG[0]][sizeG[1]];
                    System.out.println("Enter matrix G: ");
                    for (int i = 0; i < sizeG[0]; i++) {
                        for (int i1 = 0; i1 < sizeG[1]; i1++) {
                            matrix_G[i][i1] = in.nextDouble();
                        }
                    }int transport;
                    System.out.println("1. Main diagonal\n" +
                            "2. Side diagonal\n" +
                            "3. Vertical line\n" +
                            "4. Horizontal line");
                    transport = in.nextInt();
                    switch (transport) {
                        case 1:
                            double[][] matrix_Gt_m_d = new double[sizeG[1]][sizeG[0]];
                            for (int i1 = 0; i1 < sizeG[1]; i1++) {
                                for (int i = 0; i < sizeG[0]; i++) {
                                    matrix_Gt_m_d[i1][i] = matrix_G[i][i1];
                                    System.out.print(matrix_Gt_m_d[i1][i] + " ");
                                }System.out.println();
                            }break;
                        case 2:
                            double[][] matrix_Gt_s_d = new double[sizeG[1]][sizeG[0]];
                            for (int i = 0; i < sizeG[0]; i++) {
                                for (int i1 = 0; i1 < sizeG[1]; i1++) {
                                    matrix_Gt_s_d[i1][i] = matrix_G[sizeG[0]-1-i][sizeG[1]-1-i1];
                                    System.out.print(matrix_Gt_s_d[i1][i] + " ");
                                }System.out.println();
                            }break;
                        case 3:
                            double[][] matrix_Gt_v = new double[sizeG[0]][sizeG[1]];
                            for (int i = 0; i < sizeG[0]; i++) {
                                for (int i1 = 0; i1 < sizeG[1]; i1++) {
                                    matrix_Gt_v[i][i1] = matrix_G[i][sizeG[1] - 1 - i1];
                                    System.out.print(matrix_Gt_v[i][i1] + " ");
                                }System.out.println();
                            }break;
                        case 4:
                            double[][] matrix_Gt_g = new double[sizeG[0]][sizeG[1]];
                            for (int i = 0; i < sizeG[0]; i++) {
                                for (int i1 = 0; i1 < sizeG[1]; i1++) {
                                    matrix_Gt_g[i][i1] = matrix_G[sizeG[0] - 1 - i][i1];
                                    System.out.print(matrix_Gt_g[i][i1] + " ");
                                }System.out.println();
                            }break;
                    }break;
                case 5:
                    System.exit(0);
                    break;
            }
        }while (true);
    }
}
