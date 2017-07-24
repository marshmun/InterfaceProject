import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

public abstract class Soldier {
    String name;
    String rank;
    int serialNmumber;



    public void sleep(){
        System.out.println("ZZZZZZZ");
    }
    public void eat(){
        System.out.println("CHEW CHEW CHEW ");
    }
    public void walk(){
        System.out.println("Trudge");
    }
    abstract void speak();

}
