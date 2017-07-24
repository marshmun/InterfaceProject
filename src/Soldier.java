import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

abstract class Soldier {
    protected String name;
    protected String rank;
    protected int serialNmumber;


    void sleep() {
        System.out.println("ZZZZZZZ");
    }

    void eat() {
        System.out.println("CHEW CHEW CHEW ");
    }

    void walk() {
        System.out.println("Trudge");
    }

    abstract void speak();

}
