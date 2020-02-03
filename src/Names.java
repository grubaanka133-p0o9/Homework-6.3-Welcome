import java.util.Scanner;

public class Names {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj 5 imion: ");
        String[] name = new String [5];
        for (int index = 0; index < name.length; index++){
            name [index] = scanner.nextLine();
        }
        for (int index = 4; index >= 0; index--){
            System.out.println("Cześć" + name[index] );
        }

    }
}
