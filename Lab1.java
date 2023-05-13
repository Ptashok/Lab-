import java.util.Scanner;
public class Lab1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введіть число а:");
            char a = scanner.next().charAt(0);
            System.out.println("a = " + a);
            System.out.println("Введіть число b:");
            char b = scanner.next().charAt(0);
            System.out.println("b = " + b);
            System.out.println("Введіть число n:");
            char n = scanner.next().charAt(0);
            System.out.println("n = " + n);
            System.out.println("Введіть число m:");
            char m = scanner.next().charAt(0);
            System.out.println("m = " + m);
            scanner.close();
            final char C = 2;
            double result = 0;
            if (a <= C && C <=n || b <= 0 && 0 <= m ) {
                System.out.println("Error");
            } else {
                for (char i = a; i <= n; i++) {
                    for (char j = b; j <= m; j++) {
                        result += ((double) i / j) / (i - C);
                    }
                }
            }
            System.out.println("Результат: " +result);
        }
}
//Виконання було зроблено за наступними данними: С2= "-"; C3= 2; C5= "/"; C7= char. 
