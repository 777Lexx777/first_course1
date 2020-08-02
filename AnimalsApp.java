package Lesson_6;

import java.util.Scanner;

public class AnimalsApp {
        public static  void main(String[] args) {
            Animal animal = new Animal();
            Cat cat = new Cat();
            Dog dog = new Dog();
            Scanner scanner = new Scanner(System.in);
            System.out.println(" Who would you like to know, about cat or dog ? ");
            String animals = scanner.next();
            String animalsLike = animal.animalsLike(animals);
            Boolean catLike = animalsLike.equals("cat");
            Boolean dogLike = animalsLike.equals("dog");
            if (catLike == true) {
                System.out.println(" What to do cat: run, jump or swim ? ");
                String act = scanner.next();
                String action = animal.actionTrue(act);
                System.out.println(" Please entered the length of the obstacle above zero.");
                int lengthObstacle = scanner.nextInt();
                cat.catAction(action, lengthObstacle);

            } else if (dogLike == true) {
                System.out.println(" We have twq dogs. ");
                System.out.println(" What to do dogs: run, jump or swim ? ");
                String act = scanner.next();
                String action = animal.actionTrue(act);
                System.out.println(" Please entered the length of the obstacle above zero.");
                int lengthObstacle = scanner.nextInt();
                dog.dogAction(action, lengthObstacle);
            }

        }


}
