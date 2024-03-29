package me.whiteship.designpatterns._01_creational_patterns._02_factory_method._02_after.sunju;

import me.whiteship.designpatterns._01_creational_patterns._03_abstract_factory._02_after.sunju.Anchor;
import me.whiteship.designpatterns._01_creational_patterns._03_abstract_factory._02_after.sunju.Wheel;

public class Ship {

    private String name;

    private String color;

    private String logo;

    private Anchor anchor;

    private Wheel wheel;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", logo='" + logo + '\'' +
                '}';
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public Anchor getAnchor() {
        return anchor;
    }

    public void setAnchor(Anchor anchor) {
        this.anchor = anchor;
    }
}
