package project;

public class View {
    public static void main(String[] args) {
        View view = new View();
        view.Menu01();
    }
    StudentList studentList = new StudentList(20);
    AdminList adminList = new AdminList(10);

    public void Menu01(){
        while (true){
            System.out.println("\n----------菜单--------\n");
            System.out.println("1.注册");
            System.out.println("2.登陆");
            System.out.println("0.退出\n");
            System.out.print("请选择(0-2):");
            int key = CMUtility.readMenuSelection();
            switch (key){
                case '1':
                    register();
                    break;
                case '2':
                    login();
                    break;
                case '0':
                    System.out.println("是否确认(Y/N)");
                    char yn = CMUtility.readConfirmSelection();
                    if (yn=='Y') System.exit(0);
                    break;
                default:
                    System.out.println("选择错误");
            }
        }
    }

    private void register(){
        System.out.println("注册账号");
        if (adminList.getTotal()==adminList.getMax()) System.out.println("记录已满，无法添加！");
        else {
            System.out.print("账号");
            String id = CMUtility.readString(10);
            System.out.print("密码");
            String password = CMUtility.readString(10);
            adminList.addAdmin(new Admin(id,password));
            System.out.println("---------------------添加完成-----------------------");
        }
    }

    private void login(){
        System.out.println("登陆");
        while (true){
            System.out.println("请输入账号(-1退出)");
            String id = CMUtility.readString(10);
            if (id.equals("-1")) return;
            System.out.println("请输入密码");
            String password = CMUtility.readString(10);

            for (int i = 0; i < adminList.getTotal(); i++) {
                if (adminList.getAdmin(i).getId().equals(id)&&
                adminList.getAdmin(i).getPassword().equals(password))enterMainMenu();
            }
            System.out.println("账号或密码错误");
        }
    }

    private void enterMainMenu(){
        while (true){
            System.out.println("\n------------------------------学生管理系统-----------------------------\n");
            System.out.println("                                1.添 加 学 生");
            System.out.println("                                2.修 改 学 生");
            System.out.println("                                3.删 除 学 生");
            System.out.println("                                4.学 生 列 表");
            System.out.println("                                0.返回上级菜单\n");
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
                    if (yn=='Y') Menu01();
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
            System.out.print("年级：");
            int age = CMUtility.readInt(2);
            System.out.print("得分");
            double grade = CMUtility.readDouble(4);
            System.out.print("学号：");
            String id = CMUtility.readString(20);
            System.out.print("是否毕业（0否1是）：");
            boolean isGenerate = CMUtility.readBoolean();
            studentList.addStudent(new Student(name,gender,age,grade,id,isGenerate));
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
        System.out.print("年级（"+stu.getGrade()+"）：");
        int grade = CMUtility.readInt(2,stu.getGrade());
        System.out.print("得分（"+stu.getScore()+"）：");
        double score = CMUtility.readDouble(4,stu.getScore());
        System.out.print("学号（"+stu.getId()+"）：");
        String id = CMUtility.readString(20,stu.getId());
        System.out.print("是否毕业（0否1是）（"+stu.isGenerate()+"）：");
        boolean isGenerate = CMUtility.readBoolean(stu.isGenerate());
        studentList.replaceStudent(index-1,new Student(name,gender,grade,score,id,isGenerate));
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
            System.out.println("编号\t姓名\t性别\t年级\t学分\t学号\t是否毕业");
            for (int i = 0; i < students.length; i++) {
                System.out.println((i+1)+"\t"+students[i].getDetail());
            }
        }
        System.out.println("----------------------学生列表完成---------------------");
    }
}
