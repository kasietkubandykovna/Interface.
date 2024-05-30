public class Cake extends Sweet{
    public Cake(java.lang.String name) {
        super(name);
    }

    @java.lang.Override
    public void cookinTime() {
        System.out.println("50  minute");
    }

    @java.lang.Override
    public void howMuchSugar() {
        System.out.println(250+"gm");
    }
}
