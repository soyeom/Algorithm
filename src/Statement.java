import java.util.Scanner;

public class Statement {
    public static void main(String[] args) {
        int c;
        int d;

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        NestedIfElse(a, b);

        for(int i =1; i<=10; i++) {
            System.out.printf("%d * %d = %d", a, i, a*i).println();
        }
    }

    private static void NestedIfElse(int a, int b) {
        if(a > b) {
            System.out.println("Hello");
        }
        else if(a == b) {
            System.out.println("Hi");
        }
        else {
            System.out.println("Hey");
        }
    }
}
