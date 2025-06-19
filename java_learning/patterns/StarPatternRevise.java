public class StarPatternRevise {
    public static void main(String[] args) {
        spacePattern(5);
    }
    static void StarPattern(int n){
        for(int i = 1; i<=n;i++){
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    static void spacePattern(int n){
        for (int i = 1; i<=n;i++){
            for (int l=1;l<= n-i;l++){
                System.out.print(" ");
            }
            for (int j= 1;j<=i;j++){

                System.out.print(" * ");

            }
            System.out.println();
        }
    }
}
