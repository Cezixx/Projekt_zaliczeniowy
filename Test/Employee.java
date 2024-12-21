package Test;

public class Employee extends Person {
    private Departament departament;

    public Employee(Person person, Departament departament) {
        super(person.getName(), person.getSurname());
        this.departament = departament;
    }

    public Departament getDepartament() {
        return departament;
    }

    public void setDepartament(Departament departament) {
        this.departament = departament;
    }
}
