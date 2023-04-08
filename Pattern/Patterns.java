public class Patterns {
    public static void main(String[] args) {
        System.out.println("Pattern");
        pattern15(30);
    }

    static void pattern5(int n) {
        for (int row = 1; row <= 2 * n - 1; row++) {
            int c = row > n ? 2 * n - row : row;
            for (int col = 1; col <= c; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern6(int n) {
        for (int row = 1; row <= n; row++) {
            int c = row;
            int totalSpaces = n - row;
            for (int col = 1; col <= totalSpaces; col++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= c; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern7(int n) {
        for (int row = 1; row <= n; row++) {
            int totalColinRow = n - row + 1;
            int totalSpaceinRow = row - 1;
            for (int col = 1; col <= totalSpaceinRow; col++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= totalColinRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern8(int n) {
        for (int row = 1; row <= n; row++) {
            int totalColinRow = 2 * row - 1;
            int totalSpaceinRow = n - row;
            for (int col = 1; col <= totalSpaceinRow; col++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= totalColinRow; col++) {
                System.out.print("* ");
            }
            for (int col = 1; col <= totalSpaceinRow; col++) {
                System.out.print("  ");
            }
            System.out.println();
        }
    }

    static void pattern9(int n) {
        for (int row = 1; row <= n; row++) {
            int totalColinRow = 2 * n - (2 * row - 1);
            int totalSpaceinRow = row - 1;
            for (int col = 1; col <= totalSpaceinRow; col++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= totalColinRow; col++) {
                System.out.print("* ");
            }
            for (int col = 1; col <= totalSpaceinRow; col++) {
                System.out.print("  ");
            }
            System.out.println();
        }
    }

    static void pattern10(int n) {
        for (int row = 1; row <= n; row++) {
            int totalColinRow = row;
            int totalSpaceinRow = n - row;
            for (int col = 1; col <= totalSpaceinRow; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= totalColinRow; col++) {
                System.out.print("* ");
            }
            for (int col = 1; col <= totalSpaceinRow; col++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void pattern11(int n) {
        for (int row = 1; row <= n; row++) {
            int totalColinRow = n - row + 1;
            int totalSpaceinRow = row - 1;
            for (int col = 1; col <= totalSpaceinRow; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= totalColinRow; col++) {
                System.out.print("* ");
            }
            for (int col = 1; col <= totalSpaceinRow; col++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void pattern12(int n) {
        for (int row = 1; row <= 2 * n; row++) {
            int totalColinRow = row > n ? row - n : n - row + 1;
            int totalSpaceinRow = row > n ? 2 * n - row : row - 1;
            for (int col = 1; col <= totalSpaceinRow; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= totalColinRow; col++) {
                System.out.print("* ");
            }
            // for(int col=1;col<=totalSpaceinRow;col++){
            // System.out.print(" ");
            // }
            System.out.println();
        }
    }

    static void pattern13(int n) {
        // loop through each row
        for (int row = 1; row <= n; row++) {
            for (int col = row; col < row-1; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= 2 * n - 1; col++) {
                if (col == 1 || col == (2 * row - 1) || row == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }

            // move to the next row
            System.out.println();
        }
    }

    static void pattern14(int n) {
        for (int row = n; row >= 1; row--) {
            for (int col = row; col <=n-1; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= 2 * n - 1; col++) {
                if (col == 1 || col ==(2 * row - 1) || row == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }

            // move to the next row
            System.out.println();
        }
      
    }
    static void pattern15(int n){
        for(int row=1;row<=2*n-1;row++){
            int totalSpaceOfRow=row>n?row-n:n-row;
            int totalCol=row>n?2*(2*n-row)-1:2*row-1;
            for(int col=1;col<=totalSpaceOfRow;col++){
                System.out.print(" ");
            }
            for(int col=1;col<=totalCol;col++){
                if(col==1 || col==totalCol){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
