class Marine extends Soldier implements HandtoHand, RiffleFighting, KnifeFight {

    public Marine(String name, String rank, int serialNmumber){};

    @Override
    public void PunchtotheFace() {
        System.out.println("You just got punched in the face by a marine... Your probably dead.");

    }

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
}
