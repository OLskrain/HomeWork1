package ru.geekbrains.javacore2.lesson1.obstacles;

import ru.geekbrains.javacore2.lesson1.competitors.iChallengable;

public class Water extends Obstacle {
    private double distance;

    public Water(double distance) {
        this.distance = distance;
    }

    @Override
    public void doIt(iChallengable ichallengable) {
        ichallengable.swim(distance);
    }
}
