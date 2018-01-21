package ru.geekbrains.javacore2.lesson1.competitors;

public class Human implements iChallengable {
    private String type;
    private String name;
    private double maxRunDistance;
    private double maxJumpHeight;
    private double maxSwimDistance;
    private boolean active;

    public Human(String type, String name, double maxRunDistance, double maxJumpHeight, double maxSwimDistance) {
        this.type = type;
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.maxSwimDistance = maxSwimDistance;
        this.active = true;
    }
    @Override
    public boolean isOnDistance() {
        return active;
    }

    @Override
    public void run(double distance) {
        if (distance <= maxRunDistance) {
            System.out.println(type + " " + name + " successfully coped with cross.");
        } else {
            System.out.println(type + " " + name + " could not overcome the cross!");
            active = false;
        }
    }
    @Override
    public void jump(double height) {
        if (height <= maxJumpHeight) {
            System.out.println(type + " " + name + " successfully overtook an obstacle.");
        } else {
            System.out.println(type + " " + name + " could not jump over the obstacle!");
            active = false;
        }
    }
    @Override
    public void swim(double distance) {
        if (maxSwimDistance == 0) {
            System.out.println(type + " " + name + " can not swim!!!");
            active = false;
            return;
        }
        if (distance <= maxSwimDistance) {
            System.out.println(type + " " + name + " successfully swam the distance.");
        } else {
            System.out.println(type + " " + name + " could not swim a distance!");
            active = false;
        }
    }
    @Override
    public void showResult() {
        System.out.println(type + " " + name + ": " + active);
    }

}
