import java.util.*;

public class MatrixCalculatins {
    public static void main(String[] args) {
        int rowSum , colSum , diagonalSum=0 , diagonal2Sum=0 ;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter RowSize:");
        int rowSize = sc.nextInt();
        System.out.println("enter Column Size:");
        int colSize = sc.nextInt();
        System.out.print("Enter the numbers in matrix");
        int arr[][]=new int[rowSize][colSize];


        //Filling Matrix with inputs
        for(int i=0;i<rowSize;i++){
            for(int j=0;j<colSize;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("---------------------------------------------");

        //Displaying Matrix
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("---------------------------------------------");

        //Sum of Diagonals
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
                if(i==j){
                    diagonalSum += arr[i][j];
                }
                if((i+j)==(colSize-1)){
                    diagonal2Sum += arr[i][j];
                }

            }
        
        }
        System.out.println("---------------------------------------------");
        System.out.println("Sum Of Diagonals\nDiagonal1Sum: "+diagonalSum+"\nDiagonal2Sum: "+diagonal2Sum);
        
        //RowSum and Max
        int rowSumMax = 0;

        for (int i = 0; i < rowSize; i++) {
            rowSum = 0;
            for (int j = 0; j < colSize; j++) {
                rowSum+=arr[i][j];
            }
            if(rowSumMax<rowSum){
                rowSumMax=rowSum;
            }
            System.out.println(rowSum);
        }

        System.out.println("---------------------------------------------");
        int colSumMax=0;

        //Column Sum and Max
        for (int i = 0; i < rowSize; i++) {
            colSum = 0;
            for (int j = 0; j < colSize; j++) {
                colSum += arr[j][i];
            }
            if(colSumMax<colSum){
                colSumMax=colSum;
            }
            System.out.println(colSum);
        }

        System.out.println("---------------------------------------------");
        System.out.println("Maximum Among Sum of Rows "+rowSumMax);
        System.out.println("Maximum Among Sum of Columns " + colSumMax);




        

        

        
    }
}
