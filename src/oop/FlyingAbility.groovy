package oop

trait FlyingAbility {
    private String name;

    String speak() {
        "Flying!"
    }

    abstract String speakAbstract()

    private String speakPrivate() {
        return speak();
    }

}