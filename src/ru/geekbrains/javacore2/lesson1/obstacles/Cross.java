package ru.geekbrains.javacore2.lesson1.obstacles;
import ru.geekbrains.javacore2.lesson1.competitors.iChallengable;

public class Cross extends Obstacle {
    private double distance;

    public Cross(double distance) {
        this.distance = distance;
    }

    @Override
    public void doIt(iChallengable ichallengable) {
        ichallengable.run(distance);
    }
}
