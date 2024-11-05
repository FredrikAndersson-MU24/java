import java.util.ArrayList;

public class App {
    ArrayList<Employee> employees = new ArrayList<>();
    ArrayList<Address> addresses = new ArrayList<>();

    public void run(){
        initApp();

        employees.get(0).greeting();
        employees.get(0).setAddress(addresses.get(2));
        employees.get(0).greeting();

    }

    public void initApp(){

        Address a1 = new Address("Gatan", "555", "TheCity");
        Address a2 = new Address("Vägen", "2", "Landet");
        Address a3 = new Address("Gränden", "1A", "Byn");
        addresses.add(a1);
        addresses.add(a2);
        addresses.add(a3);

        Employee e1 = new Employee("John", 800, 28, a1); // Skapa ett nytt objekt av typen Employee
        Employee e2 = new Employee("Bill", 950, 41, a2); // Skapa ett nytt objekt av typen Employee
        Employee e3 = new Employee("Anne", 1200, 30, a3); // Skapa ett nytt objekt av typen Employee
        Employee e4 = new Employee();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);

        e1.greeting();
        e2.greeting();
        e3.greeting();
        e4.greeting();

    }

    public void printEmployees(){
        for(Employee e : employees){
            System.out.println(e);
        }
    }

    public void printEmployees2(){
        employees.forEach(System.out::println);
    }
}
