public class Employee {
    private String name; //instance variable / member variable
    private int salary;
    private int age;

    private Address address;


    public Employee() {
        name = "no name";
        salary = 0;
        age = 18;
    }

    public Employee(String name, int salary, int age, Address address) {
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.address = address;
    }

    public int getSalary(){
        return this.salary;
    }
    public void setSalary(int newSalary){
        this.salary = newSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(!name.equals("")){
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void greeting(){
        if(this.address != null){
            System.out.println("Hi, my name is " + this.name + " and I live in " + this.address.getCity());
        } else {
            System.out.println("Hi, my name is " + this.name + " and I currently have no address.");

        }
    }

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                ", address=" + address;
    }
}
