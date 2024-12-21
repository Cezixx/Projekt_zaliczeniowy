package Test;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Utils {
    //Dodanie pracowników do firmy
    static Company dataInit() {
        Person firstPerson = new Person("Jan", "Testowy");
        Employee firstEmployee = new Employee(firstPerson, Departament.SALES);

        Person secondPerson = new Person("Kazimierz", "Deyna");
        Employee secondEmployee = new Employee(secondPerson, Departament.FINANCES);

        Person thirdPerson = new Person("Janusz", "Nosal");
        Employee thirdEmployee = new Employee(thirdPerson, Departament.ADMINISTRATION);

        Company company = new Company("NetTech");

        company.getEmployees().add(firstEmployee);
        company.getEmployees().add((secondEmployee));
        company.getEmployees().add(thirdEmployee);

        return company;
    }

    static int inputInt(String message) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.print(message);
            return input.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Podano złą wartość");
            return inputInt(message);
        }
    }

    static void printAnswer(String message) {
        System.out.println();
        System.out.println(message);
        System.out.println();
    }

    static String inputString(String message) {
        Scanner input = new Scanner(System.in);
        System.out.println(message);
        return input.nextLine();
    }
}
