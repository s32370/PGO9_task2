class Cat extends Animal implements Moveable {
    public Cat(String name) {
        super(name);
        //System.out.println(name);
    }

    @Override
    public void start() {
        System.out.println("Cat is starting to move.");
    }

    @Override
    public void stop() {
        System.out.println("Cat has stopped moving.");
    }
}
