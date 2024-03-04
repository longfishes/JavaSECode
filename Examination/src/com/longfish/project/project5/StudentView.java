package com.longfish.project.project5;

public class StudentView {
    public static void main(String[] args) {
        StudentView view = new StudentView();
        view.enterMainMenu();
    }
    StudentList studentList = new StudentList(10);

    public void enterMainMenu(){
        boolean isFlag = true;
        while (isFlag){
            System.out.println("\n------------------------------学生管理系统-----------------------------\n");
            System.out.println("                                1.添 加 学 生");
            System.out.println("                                2.修 改 学 生");
            System.out.println("                                3.删 除 学 生");
            System.out.println("                                4.学 生 列 表");
            System.out.println("                                0.退 出 系 统\n");
            System.out.print("                     请选择(0-4):");
            int key = CMUtility.readMenuSelection();
            switch (key){
                case '1':
                    addNewStudent();
                    break;
                case '2':
                    modifyStudent();
                    break;
                case '3':
                    deleteStudent();
                    break;
                case '4':
                    listAllStudent();
                    break;
                case '0':
                    System.out.println("是否确认(Y/N)");
                    char yn = CMUtility.readConfirmSelection();
                    if (yn=='Y') isFlag = false;
                    break;
            }
        }
    }

    private void addNewStudent(){
        System.out.println("------------------添加学生------------------");
        if (studentList.getTotal()==studentList.getMax()) System.out.println("记录已满，无法添加！");
        else {
            System.out.print("姓名：");
            String name = CMUtility.readString(10);
            System.out.print("性别：");
            char gender = CMUtility.readChar();
            System.out.print("年龄：");
            int age = CMUtility.readInt(2);
            System.out.print("学号：");
            String id = CMUtility.readString(20);
            System.out.print("是否毕业（0否1是）：");
            boolean isGenerate = CMUtility.readBoolean();
            studentList.addStudent(new Student(name,gender,age,id,isGenerate));
            System.out.println("---------------------添加完成-----------------------");
        }
    }

    private void modifyStudent(){
        System.out.println("---------------------修改学生----------------------");
        int index;
        Student stu;
        while (true){
            System.out.print("请输入待修改的学生编号（-1退出）");
            index = CMUtility.readInt(2);
            stu = studentList.getStudent(index-1);
            if (index==-1)return;
            if (stu==null) System.out.println("无法找到指定学生");
            else break;
        }
        System.out.print("姓名（"+stu.getName()+"）：");
        String name = CMUtility.readString(10,stu.getName());
        System.out.print("性别（"+stu.getGender()+"）：");
        char gender = CMUtility.readChar(stu.getGender());
        System.out.print("年龄（"+stu.getAge()+"）：");
        int age = CMUtility.readInt(2,stu.getAge());
        System.out.print("学号（"+stu.getId()+"）：");
        String id = CMUtility.readString(20,stu.getId());
        System.out.print("是否毕业（0否1是）（"+stu.isGenerate()+"）：");
        boolean isGenerate = CMUtility.readBoolean(stu.isGenerate());
        studentList.replaceStudent(index-1,new Student(name,gender,age,id,isGenerate));
        System.out.println("---------------------修改完成-----------------------");
    }

    private void deleteStudent(){
        System.out.println("---------------------删除学生----------------------");
        int index;
        Student stu;
        while (true){
            System.out.print("请输入待删除的学生编号（-1退出）");
            index = CMUtility.readInt(2);
            stu = studentList.getStudent(index-1);
            if (index==-1)return;
            if (stu==null) System.out.println("无法找到指定学生");
            else break;
        }
        System.out.println("是否确认(Y/N)");
        char c = CMUtility.readConfirmSelection();
        if (c=='Y'){
            studentList.deleteStudent(index-1);
        }
    }

    private void listAllStudent(){
        System.out.println("-----------------------学生列表----------------------");
        Student[] students = studentList.getAllStudent();
        if (students.length==0) System.out.println("没有学生！");
        else {
            System.out.println("编号\t姓名\t性别\t年龄\t学号\t是否毕业");
            for (int i = 0; i < students.length; i++) {
                System.out.println((i+1)+"\t"+students[i].getDetail());
            }
        }
        System.out.println("----------------------学生列表完成---------------------");
    }
}
