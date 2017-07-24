public class Main {
    public static void main(String[] args) {
        Marine marine = new Marine("Marshall","Master Sargent", 123566);
        NavySeal navySeal = new NavySeal("Joe", "peon", 123);
        Army army = new Army ("Robert","Sargent Master", 9876);
        marine.PunchtotheFace();
        marine.YouGotShot();
        marine.YouGotStabbed();
        marine.speak();

        navySeal.PunchtotheFace();
        navySeal.speak();

        army.YouGotStabbed();
        army.speak();
    }
}
