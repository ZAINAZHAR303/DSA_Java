public class Main {
    public static void main(String[] args) {
        Pattern30(5);
    }

    static void Pattern30(int n){
        for(int row = 1;row<=n;row++){
            for (int space = 0 ; space< n-row; space++){
                System.out.print("  ");
            }
            for (int col=row; col>=1;col--){
                System.out.print(col + " ");
            }
            for (int col = 2; col <=row;col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
    static void Pattern28(int n){
        for(int row=1;row<=2*n;row++){
            int TotalcolsinRow = row>n? 2*n-row : row;
//            int spaces = row>n ? row-n : n-row;
            int spaces = n-TotalcolsinRow;
            for (int space =1;space<=spaces;space++){
                System.out.print(" ");
            }
            for(int col = 1; col<=TotalcolsinRow;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    static void Pattern5(int n){
        for(int row = 1; row<=2*n;row++){
            int TotalColinRow = row> n ? 2*n-row : row;
            for(int col = 1; col<=TotalColinRow;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void Pattern4(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void Pattern3(int n){
        for(int i =n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void Pattern2(int rows){
        for(int row = 1; row<=rows;row++){
            for(int col = 1; col<=rows;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void Pattern1(int rows){
        for(int row=1; row<=rows;row++){
            for(int col=1; col<=row; col++){
                System.out.print("* ");
            }
            System.out.println();

        }

    }
}
