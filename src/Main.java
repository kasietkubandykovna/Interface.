public class Main {
    public static void main(String[] args) {
     Bread bread=new Bread("Bread");
     System.out.println(bread);
     bread.cookinTime();
     bread.howMuchSugar();
     Cake cake=new Cake("Cake");
     System.out.println(cake);
     cake.cookinTime();
     cake.howMuchSugar();
     Cookie cookie=new Cookie("Cookie");
     System.out.println(cookie);
     cake.cookinTime();
     cake.howMuchSugar();

    }
}