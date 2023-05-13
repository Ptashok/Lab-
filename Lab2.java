public class Lab2 {
    public static void main(String[] args) {
        int n = 3;
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = n*i + j;
            }
        }
        // вивід на екран початкову матрицю
        System.out.println("Початкова Матриця");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%3d", a[i][j]);
            }
            System.out.println();
        }
        // транспонування матриці
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
        // вивід на екран транспоновану матрицю
        System.out.println("Нова матриця");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%3d", a[i][j]);
            }
            System.out.println();
        }
        //вибір мінімальних елементів та вивід суми
        System.out.println("Мінімальні елементи кожного стовпця");
        int sum = 0;
        for (int j = 0; j < a[0].length; j++) {
            int min = a[0][j];
            for (int i = 0; i < a.length; i++) {
                if (a[i][j] < min) {
                    min = a[i][j];
                }
            }
            System.out.printf("%3d", min);
            sum += min;
        }
        System.out.println();
        System.out.println("cума = " + sum);
    }
}
// Виконання роботи було зроблено за наступними данними: C5= "C=Bт"; C7= long; C11= "Обчислити суму найменших елементів кожного стовпця матриці"
