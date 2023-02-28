package College.OOM_Prac1;

public class Triangle extends Shape {
    
    private double length;
    private double width;

        public Triangle(double l, double w) {

        length = l;
        width = w;
        
        }
        public double calcArea() {

            area = (length * width)/2;
            return (area);

        }
}