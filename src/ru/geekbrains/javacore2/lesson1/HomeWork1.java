package ru.geekbrains.javacore2.lesson1;

import ru.geekbrains.javacore2.lesson1.competitors.*;
import ru.geekbrains.javacore2.lesson1.obstacles.*;

/**
 * Java1. Homework 6.
 *
 * @author Andrey Ievlev
 * @version Jan 21, 2018
 * @link
 */

public class HomeWork1 {
    public static void main(String[] args) {
        Team team = new Team("TyTy", new iChallengable[]{
                new Cat("Cat","Barsic", 100, 2, 0),
                new Dog("Dog","Bobic", 300, 0.3,7),
                new Human("Human","Bob", 5000, 1, 30),
                new Child("Human","Andrey", 1000, 10, 50)});

        Course course = new Course(new Obstacle[]{new Cross(200), new Wall(0.5), new Water(10)});

        course.doIt(team);
        System.out.println();
        team.info();
//        Obstacle[] course = {new Cross(200), new Wall(0.5), new Water(10)};
//              iChallengable[] ichallengable = {
//                new Human("Human","Bob", 5000, 1, 30),
//                new Child("Human","Andrey", 1000, 10, 50),
//                new Cat("Cat","Barsic", 100, 2, 0),
//                new Dog("Dog","Bobic", 300, 0.3,7)};


//        for (iChallengable c: ichallengable) {
//            for (Obstacle o: course) {
//                o.doIt(c);
//                if (!c.isOnDistance())break;
//            }System.out.println();
//        }
//        System.out.println("==========================");
//        for (iChallengable c: ichallengable) {
//            c.showResult();
//        }
    }
}
