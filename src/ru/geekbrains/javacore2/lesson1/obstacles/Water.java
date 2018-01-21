package ru.geekbrains.javacore2.lesson1.obstacles;

import ru.geekbrains.javacore2.lesson1.competitors.iChallengable;

public class Water extends Obstacle {
    private int distance;

    public Water(int distance) {
        this.distance = distance;
    }

    @Override
    public void doIt(iChallengable ichallengable) {
        ichallengable.swim(distance);
    }
}
