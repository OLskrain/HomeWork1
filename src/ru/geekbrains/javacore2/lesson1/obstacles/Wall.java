package ru.geekbrains.javacore2.lesson1.obstacles;
import ru.geekbrains.javacore2.lesson1.competitors.iChallengable;

public class Wall extends Obstacle{
    private double height;

    public Wall(double height) {
        this.height = height;
    }

    @Override
    public void doIt(iChallengable ichallengable) {
        ichallengable.jump(height);
    }
}
