package com.longfish.oopbase;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.getInfo(11,"魔法Zc目录",13,100000);

        Employee employee2 = new Employee();
        employee2.getInfo(12,"逍遥散人\t",35,10);

        employee1.showInfo();
        employee2.showInfo();

        employee2.birthday = new MyDate();
        employee2.getBirthday(1997,2,29);
        employee2.showBirthday();

    }
}
