public class Main {
    public static void main(String[] args) {
        Marine marine = new Marine("Marshall","Master Sargent", 123566);
        NavySeal navySeal = new NavySeal("Joe", "peon", 123);
        Army army = new Army ("Robert","Sargent Master", 9876);
        marine.YouGotShot();
        marine.YouGotStabbed();
        marine.speak();
        marine.Wound();

        System.out.println("----------------------");
        navySeal.PunchtotheFace();
        navySeal.speak();
        navySeal.Bomb();
        navySeal.toString();


        System.out.println("-----------------------");
        army.YouGotStabbed();
        army.speak();
    }
}
