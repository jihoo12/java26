package animal;

public class Goldfish extends Animal {
    String fin;

    @Override 
    public void eat() {
        System.out.println("플랑크톤을 먹는다");
    }
}
