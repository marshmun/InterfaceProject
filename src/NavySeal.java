class NavySeal extends Soldier implements HandtoHand {

    public NavySeal(String name, String rank, int serialNmumber){};

    @Override
    public void PunchtotheFace() {
        System.out.println("Neavy Seal just PUNCHED you... I'm so terribly sorry we will inform the family");

    }

    @Override
    void speak() {
        System.out.println("I'm going to attack you from the air! and the Sea!");
    }
}
