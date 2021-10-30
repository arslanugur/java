import java.util.*;

class Cylinder
{
    public static void main(String[] args)
    {
        double PI = 3.14;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius: ");
        double r = sc.nextDouble();

        System.out.print("Enter Height: ");
        double h = sc.nextDouble();

        double volume = PI * r * r * h;
        double area = 2 * PI * r * (r + h);
        System.out.println("Volume of Cylinder: " + volume);
        System.out.println("Area of Cylinder: " + area);
    }
}

/*
Output:
Enter Radius: 1
Enter Height: 2
Volume of Cylinder: 6.28
Area of Cylinder: 18.84
*/
  
  
