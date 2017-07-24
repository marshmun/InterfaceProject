class Marine extends Soldier implements  RiffleFighting, KnifeFight {

    public Marine(String name, String rank, int serialNmumber){};



    @Override
    public void YouGotStabbed() {
        System.out.println("You just got stabbed by a marine...tough luck");
    }

    @Override
    public void YouGotShot() {
        System.out.println("You just got shot by a marine");
    }

    @Override
    void speak() {
        System.out.println("Why would you ever want to fight with a marine");

    }

    @Override
     public void Wound(){
        System.out.println("Your bleeding!");
    }
}
