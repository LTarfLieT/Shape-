class TestShape {

        public static void main(String[] args) {

            Circle circle = new Circle(9);  //Circle Area
            System.out.println("Circle area = " +circle.calcArea());
            Rectangle rectangle = new Rectangle(8, 5);  //Rectangle Area
            System.out.println("Rectangle area = " + rectangle.calcArea());
            Triangle triangle = new Triangle(8, 5); //Triangle Area
            System.out.println("Triangle area = " + triangle.calcArea());
      
        
        }
    }
