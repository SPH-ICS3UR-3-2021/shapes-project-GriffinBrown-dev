package shapes;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Rectangle rect = new Rectangle();
        Circle cir = new Circle();
        Triangle tri = new Triangle();
        Prism prism = new Prism();
        Sphere sphere = new Sphere();
        Cone cone = new Cone();
        Scanner in = new Scanner(System.in);
        boolean looping = true;

        while (looping) {
            System.out.println("**********");
            System.out.println("Please select one of the following:");
            System.out.println("(1) Rectangle (2) Circle (3) Equilateral Triangle");
            System.out.println("(4) Rectangular Prism (5) Sphere (6) Cone (7) Quit");

            switch (in.nextInt()) {
                case (1): // Rectangle
                    if (rect.getCreated()) {
                       System.out.println("Length: " + rect.getLength() + " meters.");
                       System.out.println("Width: " + rect.getWidth() + " meters."); 
                       System.out.println("Area: " + (rect.getLength() * rect.getWidth()) + " meters squared."); 
                       System.out.println("Perimeter: " + (2 * rect.getLength() + 2 * rect.getWidth()) + " meters."); 
                    } else {
                       System.out.println("Please enter the length of the rectangle in meters.");
                       rect.setLength(in.nextInt());
                       System.out.println("Please enter the width of the rectangle in meters.");
                       rect.setWidth(in.nextInt());
                       System.out.println("The rectangle has been created!");
                       rect.setCreated(true);
                    }
                    break;    
                case (2): // Circle
                    if (cir.getCreated()) {
                       System.out.println("Radius: " + cir.getRadius() + " meters.");
                       System.out.println("Area: " + (Math.PI * Math.pow(cir.getRadius(), 2)) + " meters squared."); 
                       System.out.println("Circumference: " + (2 * Math.PI * cir.getRadius()) + " meters."); 
                    } else {
                       System.out.println("Please enter the radius of the circle in meters.");
                       cir.setRadius(in.nextInt());
                       System.out.println("The circle has been created!");
                       cir.setCreated(true);
                    }
                    break;    
                case (3): // Triangle
                    if (tri.getCreated()) {
                       System.out.println("Side Length: " + tri.getLength() + " meters.");
                       System.out.println("Height: " + (tri.getLength() * Math.sqrt(3)/2)  + " meters."); 
                       System.out.println("Area: " + (tri.getLength() * (tri.getLength() * Math.sqrt(3)/2))/2 + " meters squared."); 
                       System.out.println("Perimeter: " + (3 * tri.getLength()) + " meters."); 
                    } else {
                       System.out.println("Please enter the side length of the triangle in meters.");
                       tri.setLength(in.nextInt());
                       System.out.println("The triangle has been created!");
                       tri.setCreated(true);
                    }
                    break;
                case (4): // Prism
                    if (prism.getCreated()) {
                       System.out.println("Length: " + prism.getLength() + " meters.");
                       System.out.println("Width: " + prism.getWidth() + " meters.");
                       System.out.println("Height: " + prism.getHeight() + " meters.");
                       System.out.println("Volume: " + (prism.getLength() * prism.getWidth() * prism.getHeight()) + " meters cubed."); 
                       System.out.println("Surface Area: " + (2*prism.getLength()*prism.getWidth() + 2*prism.getLength()*prism.getHeight() + 2*prism.getWidth()*prism.getHeight()) + " meters squared.");
                    } else {
                       System.out.println("Please enter the length of the rectangular prism in meters.");
                       prism.setLength(in.nextInt());
                       System.out.println("Please enter the width of the rectangular prism in meters.");
                       prism.setWidth(in.nextInt());
                       System.out.println("Please enter the height of the rectangular prism in meters.");
                       prism.setHeight(in.nextInt());
                       System.out.println("The rectangular prism has been created!");
                       prism.setCreated(true);
                    } 
                    break;
                case (5): // Sphere
                    if (sphere.getCreated()) {
                       System.out.println("Radius: " + sphere.getRadius() + " meters.");
                       System.out.println("Volume: " + (4 * Math.PI * Math.pow(sphere.getRadius(), 3)/3)  + " meters cubed."); 
                       System.out.println("Surface Area: " + (4 * Math.PI * Math.pow(sphere.getRadius(), 2)) + " meters squared."); 
                    } else {
                       System.out.println("Please enter the radius of the sphere in meters.");
                       sphere.setRadius(in.nextInt());
                       System.out.println("The sphere has been created!");
                       sphere.setCreated(true);
                    }
                    break;
                case (6): // Cone
                    if (cone.getCreated()) {
                       System.out.println("Radius: " + cone.getRadius() + " meters.");
                       System.out.println("Height: " + cone.getHeight() + " meters.");
                       System.out.println("Volume: " + ((Math.PI * Math.pow(cone.getRadius(), 2) * cone.getHeight())/3)  + " meters cubed."); 
                       System.out.println("Surface Area: " + (Math.PI * cone.getRadius() * (cone.getRadius() + Math.sqrt(Math.pow(cone.getRadius(), 2) + Math.pow(cone.getHeight(), 2)))) + " meters squared."); 
                    } else {
                       System.out.println("Please enter the radius of the cone in meters.");
                       cone.setRadius(in.nextInt());
                       System.out.println("Please enter the height of the cone in meters.");
                       cone.setHeight(in.nextInt());
                       System.out.println("The cone has been created!");
                       cone.setCreated(true);
                    }
                    break;
                case (7): // Quit
                    looping = false;
                    System.out.println("Thank you for using this program.");
                    break;
                default: // Invalid Number
                    System.out.println("Error - please enter a valid number.");
            } 
        }
        in.close();
    }
}
