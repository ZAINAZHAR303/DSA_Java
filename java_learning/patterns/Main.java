public class Main {
    public static void main(String[] args) {
        Pattern2(5);
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
