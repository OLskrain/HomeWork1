package ru.geekbrains.javacore2.lesson1.competitors;

public interface iChallengable {
        void run(double distance);
        void swim(double distance);
        void jump(double distance);
        boolean isOnDistance();
        void showResult();
        }
