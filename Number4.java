public class Number4 {
    public static void main(String[] arg){
        boolean weekday = false; // рабочий день //
        boolean vacation = true; // отпуст //
        if(vacation|| !weekday) {
            System.out.println("Можно спать дальше");
        } else {
            System.out.println("Пора идти на работу");
        }
    }
}
