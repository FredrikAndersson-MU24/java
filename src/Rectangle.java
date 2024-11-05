public class Rectangle {
    private double x;
    private double y;
    private double width;
    private double height;

    public Rectangle(){
        this.x = 0;
        this.y = 0;
        this.height = 0;
        this.width = 0;
    }

    public Rectangle(double newWidth, double newHeight){
        this.x = 0;
        this.y = 0;
        this.width = newWidth;
        this.height = newHeight;
    }

    public Rectangle( double newX, double newY, double newWidth, double newHeight){
        this.x = newX;
        this.y = newY;
        this.width = newWidth;
        this.height = newHeight;
    }

    public double calculateArea(){
        return this.width * this.height;
    }

    public double calculatePerimeter(){
        return this.width * 2 + this.height * 2;
    }

    public void setXY(double newX, double newY){
        this.x = newX;
        this.y = newY;
    }

    public void setWidth(double newWidth){
        this.width = newWidth;
    }

    public void setHeight(double newHeight){
        this.height = newHeight;
    }

}


//todo övning 1
//Skapa en klass Rectangle enligt nedan samt skriv ett program som använder din Rectangle klass
//
//har tre konstruktörer
//en smetod setXY som låter dig sätta medlemsvariablerna x och y
//två metoder setWidth och setHeight som låter dig sätta motsvarande medelmsvariabler