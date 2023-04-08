import java.util.Scanner;

public class Question{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of row and col for matrix 1");
        int row1=sc.nextInt();
        int col1=sc.nextInt();
        System.out.println("Enter no row and col for matrix 2");
        int row2=sc.nextInt();
        int col2=sc.nextInt();
        int[][] arr1=new int[row1][col1];
        int[][] arr2=new int[row2][col2];
         System.out.println("Enter the elements of matrix 1");
         for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                arr1[i][j]=sc.nextInt();
            }
         }
         System.out.println("Enter the elements of matrix 2");
         for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr2[i].length;j++){
                arr2[i][j]=sc.nextInt();
            }
         }
         if(col1!=row2){
            System.out.println("Matrix multiplication not possible");
         }
         else{
            for(int i=0;i<row1;i++){
                for(int j=0;j<col2;j++){
                    
                }
            }
         }


        sc.close();
    }
}