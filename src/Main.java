class Application {

    interface Animal {
        void sound();
        default void sleep() {
            System.out.println("Zwierzę idzie spać.");
        }
        static void endOfDay() {
            System.out.println("Dzień się skończył, zwierzęta idą spać.");
        }
        default void eats(){
            System.out.println("zwierze je");
        }
    }

    static class Dog implements Animal {
        @Override
        public void sound() {
            System.out.println("Woof Woof!");
        }
    }
    static class Cow implements Animal {
        @Override
        public void sound() {
            System.out.println("moo moo");

        }
    }
    static class Bird implements Animal {
        @Override
        public void sound() {
            System.out.println("twweet tweet");
        }
    }
    static class Cat implements Animal {
        @Override
        public void sound() {
            System.out.println("Meow Meow!");
        }
    }

    public static void main(String[] args) {

        Animal cow = new Cow();
        Animal bird = new Bird();

        Animal dog = new Dog();
        Animal cat = new Cat();

        System.out.print("ptak ");
        bird.sound();
        bird.eats();
        bird.sleep();


        System.out.print("krowa ");
        cow.sound();
        cow.eats();
        cow.sleep();





        System.out.print("Pies: ");
        dog.sound();
        dog.eats();
        dog.sleep();


        System.out.print("Kot: ");
        cat.sound();
        cat.eats();
        cat.sleep();

        Animal.endOfDay();
    }
}
