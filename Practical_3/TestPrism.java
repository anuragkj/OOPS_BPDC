import java.util.Scanner;1
class Prism {
    private double l, w,h;
    public void setPrism(double l, double w, double h){
        this.l = l;
        this.w = w;
        this.h = h;
    }
    public double topArea(){
        return l*w;
    }
    public double bottomArea(){
        return l*w;
    }
    public double leftArea(){
        return h*w;
    }
    public double rightArea(){
        return h*w;
    }
    public double frontArea(){
        return h*l;
    }
    public double backArea(){
        return h*l;
    }
    public double area(){
        return 2*((l*w)+(h*w)+(h*l));
    }
}

class TestPrism {
  public static void main(String[] args) {

    double l,w,h;
    Scanner s = new Scanner(System.in);
    System.out.print("Please Enter the Length: ");
    l = s.nextDouble();
    System.out.print("Please Enter the Width: ");
    w = s.nextDouble();
    System.out.print("Please Enter the Height: ");
    h = s.nextDouble();
    Prism obj = new Prism();
    obj.setPrism(l,w,h);
    System.out.print("Top area is: ");
    System.out.print(obj.topArea()); System.out.println();
    System.out.print("Bottom area is: ");
    System.out.print(obj.bottomArea()); System.out.println();
    System.out.print("Left area is: ");
    System.out.print(obj.leftArea()); System.out.println();
    System.out.print("Right area is: ");
    System.out.print(obj.rightArea()); System.out.println();
    System.out.print("Front area is: ");
    System.out.print(obj.frontArea()); System.out.println();
    System.out.print("Back area is: ");
    System.out.print(obj.backArea()); System.out.println();
    System.out.print("Total area is: ");
    System.out.print(obj.area()); System.out.println();
  }
}
