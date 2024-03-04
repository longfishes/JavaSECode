package com.longfish._enum;

import java.util.Objects;

public enum Season {
    SPRING("春",null),
    SUMMER("夏",null),
    AUTUMN("秋",null),
    WINTER("冬",null);

    private final String seasonName;
    private final String desc;

    Season(String seasonName, String desc) {
        this.seasonName = seasonName;
        this.desc = desc;
    }

    public String getSeasonName() {
        return seasonName;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}

//jdk5.0之前(同上)
class Season2{
    private final String seasonName;
    private final String desc;

    private Season2(String seasonName, String desc) {
        this.seasonName = seasonName;
        this.desc = desc;
    }

    public String getSeasonName() {
        return seasonName;
    }

    public String getDesc() {
        return desc;
    }

    public static final Season2 SPRING = new Season2("春",null);
    public static final Season2 SUMMER = new Season2("夏",null);
    public static final Season2 AUTUMN = new Season2("秋",null);
    public static final Season2 WINTER = new Season2("冬",null);

    @Override
    public String toString() {
        return "Season2{" +
                "seasonName='" + seasonName + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
