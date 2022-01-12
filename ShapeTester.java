class Shape{
    private float width, height, depth, volume, surfaceArea;
    private String type;
    protected Shape(float side){
        width = side;
        height = side;
        depth = side;
        type = "Cube";
    }
    protected Shape(float width, float height, float depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
        type = "Cuboid";
    }
    protected void calculateVolume(float side){
        volume = side * side * side;
    }
    protected void calculateVolume(float width, float height, float depth){
        volume = width * height * depth;
    }
    protected void calculateSurfaceArea(float side){
        surfaceArea = 6f * side * side;
    }
    protected void calculateSurfaceArea(float width, float height, float depth){
        surfaceArea = 2f * (width * height + width * depth + height * depth);
    }
    protected void displayDetails(){
        System.out.println("Details");
        System.out.println("Type: " + type);
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Depth: " + depth);
        System.out.println("Volume: " + volume);
        System.out.println("Surface Area: " + surfaceArea);
    }
}
class ShapeTester{
    public static void main(String[] args){
        System.out.println("Testing cube");
        Shape obj1 = new Shape(5);
        obj1.calculateVolume(5);
        obj1.calculateSurfaceArea(5);
        obj1.displayDetails();
        System.out.println("Testing cuboid");
        Shape obj2 = new Shape(5, 10, 15);
        obj2.calculateVolume(5, 10, 15);
        obj2.calculateSurfaceArea(5, 10, 15);
        obj2.displayDetails();
    }
}
