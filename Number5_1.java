import java.util.Objects;
import java.util.Scanner;
public class Number5_1 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        String name =  scanner.nextLine();
        if(Objects.equals(name, "Вася")){
            System.out.println("Привет! \n Я тебя так долго ждал");
        }
        if(Objects.equals(name, "Анастасия")){
            System.out.println("Я тебя так долго ждал");
        }
        if(!Objects.equals(name, "Вася") && Objects.equals(name, "Анастасия")){

            System.out.println("Добрый день, а вы кто?");
            }
    }
}
