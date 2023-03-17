package Recursion;

public class ProductOfTwoNumbers {
    public static void main(String[] args) {
        int x = 3;
        int y = 20;
        int product = 0;

        if(x > y)
            product = productOfTwoNumbers(y, x, 0);
        else
            product = productOfTwoNumbers(x, y, 0);

        System.out.println(product);

    }

    private static int productOfTwoNumbers(int x, int y, int product) {
        if(y < 1)
            return product;

        product = product + x;
        y = y - 1;
        return productOfTwoNumbers(x, y, product);
    }
}
