import java.util.Scanner;
public class AreaOfRectangle {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length = ");
        int Length = sc.nextInt();
        System.out.print("Enter Breadth = ");
        int Breadth = sc.nextInt();
        int area = (Length*Breadth);
        System.out.println("Area of Rectangle = " + area);
        
        sc.close();
        
    }
}
