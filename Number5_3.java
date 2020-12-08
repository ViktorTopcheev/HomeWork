import java.util.Scanner;
public class Number5_3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String name_1 ="Вася";
        String name_2 ="Анастасия";

        switch(name) {
            case "Вася":
                System.out.print("Привет!\n Я тебя так долго ждал");
                break;
            case "Анастасия":
                System.out.print("Я тебя так долго ждал");
                break;
            default:
                System.out.print("добрый день, а вы кто?");

        }


    }
}
