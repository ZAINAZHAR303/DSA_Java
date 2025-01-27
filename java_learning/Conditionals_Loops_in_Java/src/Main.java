public class Main {
    public static void main(String[] args) {
        int i = subtractProductAndSum(234);
        System.out.println(i);
    }
     static int subtractProductAndSum(int n) {
        String StrNum = Integer.toString(n);
        int product = 1;
        int sum = 0;
        for(int i=0;i<StrNum.length();i++){
            int digit = StrNum.charAt(i) - '0';
            product= product* digit;
            sum = sum+digit;


            System.out.println("product");

            System.out.println(product);
            System.out.println("sum");
            System.out.println(sum);
        }
        return product-sum;
    }
}