class NavySeal extends Soldier implements HandtoHand, Bomb {

    public NavySeal(String name, String rank, int serialNmumber){};

    @Override
    public String PunchtotheFace() {
        System.out.println("Navy Seal just PUNCHED you... I'm so terribly sorry we will inform the family");
        return "Navy Seal just PUNCHED you... I'm so terribly sorry we will inform the family";
    }

    @Override
    void speak() {
        System.out.println("I'm going to attack you from the air! and the Sea!");
    }

    @Override
    public String Bomb() {
        System.out.println("Kablooooooy!!!!!!! That was a crazy bomb that just went off");
        return "Kablooooooy!!!!!!! That was a crazy bomb that just went off" ;

    }

    @Override
    public String toString(){
        return Bomb();
    }
}
