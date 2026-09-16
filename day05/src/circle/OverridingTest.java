package circle;

public class OverridingTest {
    public static void main(String[] args) {
        System.out.println(">>> 원");
        Circle c = new Circle(5.0);
        System.out.println("반지름 : " + c.getRadius());
        System.out.println("면적 : ");
    }
}
