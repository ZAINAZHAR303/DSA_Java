public class Main {
    public static void main(String[] args) {
        Pattern(5);
    }
    static void Pattern(int rows){
        for(int row=1; row<=rows;row++){
            for(int col=1; col<=row; col++){
                System.out.print("* ");
            }
            System.out.println();

        }

    }
}
