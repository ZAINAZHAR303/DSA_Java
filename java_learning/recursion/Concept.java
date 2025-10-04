public class Concept {
    public static void main(String[] args) {

    }

    static void concept(int n){
        if (n==0){
            return;

        }

        System.out.println(n);
        concept(n--);
    }
}
