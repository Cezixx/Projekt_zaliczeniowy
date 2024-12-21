package Test;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Company{
    private String name;
    private Address address;
    private final List<Employee> employees;

    public Company(String name) {
        this.name = name;
        this.address = new Address("Warszawa", "Turmoncka");
        this.employees = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void addEmployee(String name, String surname) {
        Person person = new Person(name, surname);
        Employee employee = new Employee(person, Departament.BOOKING);

        employees.add(employee);
    }

}
