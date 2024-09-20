public class CatRunner {
    public static void main(String[] args) {
        
        Cat cat1 = new Cat("bob", 1974, 2);
        cat1.introduce();
        cat1.printCatInfo();

        Cat cat2 = new Cat("uhiouf", -3, 1083);
        cat2.printCatInfo();
        cat2.introduce();
    }
}
