import java.util.Scanner;
import java.util.regex.*;

public class lab1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите дату в формате dd/mm/yyyy с 1900 по 9999 года");
        String date;
        date = sc.nextLine();
        Pattern p = Pattern.compile("^(0[1-9]|[12]\\d|3[01])/([0][1-9]|1[0-2])/((?:1[9]|[2-9]\\d)\\d{2})$");
        Matcher m = p.matcher(date);
        if (m.find()) {
            do {
                System.out.print(date.substring(m.start(), m.end()) + " соответствует дате в формате dd/mm/yyyy");
                break;
            } while (m.find());
        } else {
            System.out.println("Введенная строка не является датой в формате dd/mm/yyyy с 1900 по 9999 года");
        }
        sc.close();
    }
}
