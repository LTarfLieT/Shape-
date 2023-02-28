package College.OOM_Prac1;

public class Rectangle extends Shape {
    
    private double length;
    private double width;

        public Rectangle(double l, double w) {

        length = l;
        width = w;
        
        }
        public double calcArea() {

            area = length * width;
            return (area);

        }
}
    
