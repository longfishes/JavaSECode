package com.longfish.tostringoverride.exer;

public class GeometricObject {
    char color;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GeometricObject that = (GeometricObject) o;
        return color == that.color;
    }
}
