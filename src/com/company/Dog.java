package com.company;

public class Dog extends Animal implements Drawable,SoundProducable {

    public Dog() {
        super("Alabai: ");
    }

    public Dog(String name) {
        super(name);
    }

    @Override
    public String draw() {
        return "\ud83d\udc29";
    }

    @Override
    public String callSound() {
        return ("Тяв-тяв");
    }
}
