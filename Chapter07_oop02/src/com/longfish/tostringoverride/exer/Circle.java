package com.longfish.tostringoverride.exer;

public class Circle extends GeometricObject{
    double radium;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radium, radium) == 0;
    }

    public boolean colorEquals(Object o){
        return super.equals(o);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radium=" + radium +
                '}';
    }
}
