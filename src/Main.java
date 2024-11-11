public class Main {


    public static void main(String[] args) {

        exercise2();
    }

    public static void exercise1(){
        Hyena hyena = new Hyena("Bert");
        Lion lion = new Lion("Karl");

        lion.roar();
        hyena.laugh();
    }

    public static void exercise2(){

        Rectangle rectangle = new Rectangle(3,3);
        Triangle triangle = new Triangle(3,3);

        System.out.println(rectangle.getArea());
        System.out.println(triangle.getArea());



    }

}