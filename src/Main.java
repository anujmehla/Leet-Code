import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       // String s = scanner.nextLine();
        String r = "He is a very very good boy, isn't he?";

        String[] a =r.split("[^a-zA-Z]+");
        System.out.println(a.length);
        for (String q:a){
            System.out.println(q);
        }

    }
}