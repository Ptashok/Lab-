import java.util.Arrays;
//Відсортувати слова заданого тексту за зростанням кількості голосних літер. тип Str.
public class Lab3 {
public static void main(String[] args) {
        String str = "programming is hard but i am ready to fight";
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
        System.out.print(words[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < words[1].length(); i++) {
        System.out.print(words[1].charAt(i) + " ");
        }
        System.out.println();
        String vowel = "aeiouy"; // строка из гласных
        System.out.println("Індекс кожної букви:");
        for (int i = 0; i < words.length; i++) {
        for (int j = 0; j < words[i].length(); j++) {
        int index = vowel.indexOf(words[i].charAt(j));
        System.out.print(index + " ");
        }
        System.out.println();
        }
        int[] count = new int[words.length];
        for (int i = 0; i < words.length; i++) {
        for (int j = 0; j < words[i].length(); j++) {
        int index = vowel.indexOf(words[i].charAt(j));
        if (index > 0) {
        count[i] = count[i] + 1;
        }
        }
        }
        System.out.println("Кількість голосних у словах:");
        for (int i = 0; i < count.length; i++) {
        System.out.print(count[i] + " ");
        }
        for (int i = 0; i < count.length - 1; i++) {
        for (int j = i+1; j < count.length; j++) {
        if (count[i] > count[j]) {
        int buf = count[i];
        count[i] = count[j];
        count[j] = buf;
        String sbuf = words[i];
        words[i] = words[j];
        words[j] = sbuf;
        }
        }
        }
        System.out.println();
        System.out.println("Відсортовані слова :");
        System.out.println(Arrays.toString(words));
        }
}

