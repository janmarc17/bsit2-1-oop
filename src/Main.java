public class Main {
    public static void main(String[] args) {

        PetService service = new PetService();
        System.out.println("Basic checkup: $" + service.calculateFee());
        System.out.println("Checkup with vaccination: $" + service.calculateFee(true));
        System.out.println("Full service: $" + service.calculateFee(true, true));
        System.out.println("Emergency: $" + service.calculateFee("emergency"));

        System.out.println();

        System.out.println("Welcome to the Pet Clinic!");
        System.out.println("==========================");

        Pet dog = new Dog("Buddy", 3);
        dog.displayInfo();
        dog.makeSound();

        System.out.println();

        Pet cat = new Cat("Whiskers", 2);
        cat.displayInfo();
        cat.makeSound();

        System.out.println();

        Pet bird = new Bird("Tweety", 1);
        bird.displayInfo();
        bird.makeSound();

        System.out.println();

        System.out.println("Training Session Started!");
        System.out.println("==========================");

        Trainable t1 = new Dog("Buddy", 3);
        t1.performTrick();

        Trainable t2 = new Bird("Tweety", 1);
        t2.performTrick();
    }
}
