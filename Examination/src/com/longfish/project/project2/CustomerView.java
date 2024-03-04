package com.longfish.project.project2;

public class CustomerView {
    public static void main(String[] args) {
        CustomerView view = new CustomerView();
        view.enterMainMenu();
    }

    CustomerList customerList = new CustomerList(10);

    public void enterMainMenu() {
        boolean isFlag = true;
        while (isFlag) {
            System.out.println("\n-------------------客户后台管理系统-----------------\n");
            System.out.println("                   1 添 加 客 户");
            System.out.println("                   2 删 除 客 户");
            System.out.println("                   3 修 改 客 户");
            System.out.println("                   4 客 户 列 表");
            System.out.println("                   0 退       出\n");
            System.out.print("                   请选择(0-4)：");
            char key = CMUtility.readMenuSelection();
            switch (key) {
                case '1':
                    addNewCustomer();
                    break;
                case '2':
                    deleteCustomer();
                    break;
                case '3':
                    modifyCustomer();
                    break;
                case '4':
                    listAllCustomer();
                    break;
                case '0':
                    System.out.println("是否确认（Y/N）");
                    char yn = CMUtility.readConfirmSelection();
                    if (yn == 'Y') isFlag = false;
                    break;
            }
        }
    }

    private void addNewCustomer() {
        System.out.println("-------------------添加客户-------------------");
        if (customerList.getTotal() == customerList.getMax()) {
            System.out.println("记录已满，无法添加\n");
        } else {
            System.out.print("姓名：");
            String name = CMUtility.readString(8);
            System.out.print("性别：");
            char gender = CMUtility.readChar();
            System.out.print("年龄：");
            int age = CMUtility.readInt(3);
            System.out.print("手机：");
            String phone = CMUtility.readString(11);
            System.out.print("邮箱：");
            String email = CMUtility.readString(30);
            customerList.addCustomer(new Customer(name, gender, age, phone, email));
            System.out.println("--------------------添加完成------------------");
        }
    }

    private void modifyCustomer() {
        System.out.println("-------------------修改客户-------------------");
        Customer cust;
        int index;
        while (true) {
            System.out.println("请选择待修改的客户编号（-1退出）");
            index = CMUtility.readInt(2);
            if (index == -1) return;
            cust = customerList.getCustomer(index - 1);
            if (cust == null) System.out.println("无法找到指定客户");
            else break;
        }
        System.out.print("姓名（" + cust.getName() + "）：");
        String name = CMUtility.readString(8, cust.getName());
        System.out.print("性别（" + cust.getGender() + "）：");
        char gender = CMUtility.readChar(cust.getGender());
        System.out.print("年龄（" + cust.getAge() + "）：");
        int age = CMUtility.readInt(3, cust.getAge());
        System.out.print("手机（" + cust.getPhone() + "）：");
        String phone = CMUtility.readString(11, cust.getPhone());
        System.out.print("邮箱（" + cust.getEmail() + "）：");
        String email = CMUtility.readString(30, cust.getEmail());
        customerList.replaceCustomer(index - 1, new Customer(name, gender, age, phone, email));
        System.out.println("-------------------修改完成--------------------");
    }

    private void deleteCustomer() {
        System.out.println("----------------删除客户---------------");
        Customer cust;
        int index;
        while (true) {
            System.out.println("请选择待删除的客户编号（-1退出）");
            index = CMUtility.readInt(2);
            if (index == -1) return;
            cust = customerList.getCustomer(index - 1);
            if (cust == null) System.out.println("无法找到指定客户");
            else break;
        }
        System.out.println("是否确认（Y/N）");
        char c = CMUtility.readConfirmSelection();
        if (c == 'Y') {
            customerList.deleteCustomer(index - 1);
            System.out.println("-------------------删除完成！---------------------");
        }
    }

    private void listAllCustomer() {
        System.out.println("-----------------客户列表--------------------");
        if (customerList.getAllCustomer().length==0) {
            System.out.println("没有客户！");
        }else {
            System.out.println("编号\t姓名\t性别\t年龄\t手机\t\t邮箱");
            Customer[] customers = customerList.getAllCustomer();
            for (int i = 0; i < customers.length; i++) {
                System.out.println((i+1)+"\t"+customers[i].getDetails());
            }
        }
        System.out.println("---------------客户列表完成------------------");
    }
}
