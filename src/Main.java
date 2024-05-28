public class Main {
    public static void main(String[] args) {
        Cat mruczek = new Cat("Mruczek");
        mruczek.start();
        System.out.println(mruczek.getName());
        mruczek.stop();
    }
}
//Cat starts!
//Cat     <---- missing in console; this should cite the name of the cat class-> Cat
//Mruczek
//Cat stopped!

//current display:
//Mruczek ---->  System.out.println(name); in cat class
// Cat is stati...
//Mruczek
//Cat has stopped..
