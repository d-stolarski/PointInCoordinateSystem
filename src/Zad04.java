import java.util.Scanner;

public class Zad04 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj X:");
        int x = 0;
        x = scan.nextInt();
        System.out.println("Podaj Y:");
        int y = 0;
        y = scan.nextInt();

        if( x > 0 && y > 0){
            System.out.println("Punkt leży w I ćwiartce układu współrzędnych.");
        } else if (x  > 0 && y < 0){
            System.out.println("Punkt leży w II ćwiartce układu współrzędnych.");
        } else if (x < 0 && y < 0){
            System.out.println("Punkt leży w III ćwiartce układu współrzędnych");
        } else if (x < 0 && y > 0){
            System.out.println("Punkt leży w IV ćwiartce układu współrzędnych");
        } else if (x == 0 || y == 0){
            System.out.println("Punkt leży na osi.");
        }
        scan.close();
    }
}
