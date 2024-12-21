package Test;
import jdk.jshell.execution.Util;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Company company = Utils.dataInit();
        // Punkt pierwszy
        String title = "Panel administracyjny firmy: " + company.getName();
        System.out.println("-".repeat(title.length()));
        System.out.println(title);
        System.out.println("-".repeat(title.length()));

        // Punkt drugi
        boolean done = false;
        while (!done) {
            System.out.println("Dostępne operacje:");
            System.out.println("1 - Wyświetl pracowników");
            System.out.println("2 - Zatrudnij pracownika");
            System.out.println("3 - Zwolnij pracownika");
            System.out.println("0 - Zakończ program");
            System.out.println();

            int choice = Utils.inputInt("Wybierz operację:");

            switch (choice) {

                case 1:
                    Utils.printAnswer(company.getEmployees().toString());
                    break;

                case 0:
                    Utils.printAnswer("Do zobaczenia");
                    done = true;
                    break;
                case 2:

                    String name = Utils.inputString("Podaj imię: ");
                    String surname = Utils.inputString("Podaj nazwisko: ");
                    company.addEmployee(name, surname);
                    System.out.println("Dodano pracownika: " + name + " " + surname);
                    break;

                case 3:

                    break;

                default:
                    Utils.printAnswer("Podano złą wartość, spróbuj jeszcze raz");
            }
        }
    }
}
