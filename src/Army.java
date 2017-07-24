class Army extends Soldier implements KnifeFight {

    public Army(String name, String rank, int serialNmumber){};

    @Override
    public void YouGotStabbed() {
        System.out.println("watch out for those pesky Army men, they are handy with a knife!");
    }

    @Override
    void speak() {
        System.out.println("I'm going to Attack you with my Army Green!");

    }
}
