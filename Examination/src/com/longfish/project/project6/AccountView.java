package com.longfish.project.project6;

public class AccountView {
    AccountList accountList = new AccountList(10);

    public static void main(String[] args) {
        AccountView view = new AccountView();
        view.enterMainMenu();
    }

    public void enterMainMenu() {
        while (true) {
            System.out.println("\n--账户后台管理系统--");
            System.out.println("\t1.添加账户");
            System.out.println("\t2.删除账户");
            System.out.println("\t3.修改账户信息");
            System.out.println("\t4.查询账户");
            System.out.println("\t0.退出");
            System.out.print("键入数字以继续：");
            char key = CMUtility.readMenuSelection();
            switch (key) {
                case '1':
                    addNewAccount();
                    break;
                case '2':
                    deleteAccount();
                    break;
                case '3':
                    modifyAccount();
                    break;
                case '4':
                    listAllAccount();
                    break;
                case '0':
                    System.out.println("是否确认(Y/N)");
                    char c = CMUtility.readConfirmSelection();
                    if (c == 'Y') return;
                    System.out.println("已取消");
                    break;
            }
        }
    }

    private void addNewAccount() {
        System.out.println("-----------------添加账户----------------");
        if (accountList.getTotal() == accountList.getMax()) {
            System.out.println("记录已满，无法添加");
            return;
        }
        System.out.print("账号：");
        String id = CMUtility.readString(10);
        System.out.print("密码：");
        String password = CMUtility.readString(10);
        System.out.print("是否会员（0无1有）：");
        boolean isPlus = CMUtility.readBoolean();
        System.out.print("余额：");
        double balance = CMUtility.readDouble(20);

        accountList.addAccount(new Account(id, password, isPlus, balance));
        System.out.println("添加完成！");
    }

    private void modifyAccount() {
        System.out.println("-----------------修改账户----------------");
        int index;
        Account acc;
        while (true) {
            System.out.println("请输入待修改的账户编号（-1退出）");
            index = CMUtility.readInt(2);
            if (index == -1) return;
            acc = accountList.getAccount(index - 1);
            if (acc == null) {
                System.out.println("无法找到指定账户！");
                continue;
            }
            break;
        }
        System.out.print("账号(" + acc.getId() + ")：");
        String id = CMUtility.readString(10, acc.getId());
        System.out.print("密码(" + acc.getPassword() + ")：");
        String password = CMUtility.readString(10, acc.getPassword());
        System.out.print("是否会员(" + acc.isPlus() + ")（0无1有）：");
        boolean isPlus = CMUtility.readBoolean(acc.isPlus());
        System.out.print("余额(" + acc.getBalance() + ")：");
        double balance = CMUtility.readDouble(4, acc.getBalance());

        accountList.replaceAccount(index - 1, new Account(id, password, isPlus, balance));
        System.out.println("添加完成！");
    }

    private void deleteAccount() {
        int index;
        Account acc;
        while (true) {
            System.out.println("请输入待删除的账户编号（-1退出）");
            index = CMUtility.readInt(2);
            if (index == -1) return;
            acc = accountList.getAccount(index - 1);
            if (acc == null) {
                System.out.println("无法找到指定账户！");
                continue;
            }
            break;
        }
        System.out.println("是否确认(Y/N)");
        char c = CMUtility.readConfirmSelection();
        if (c == 'Y') {
            accountList.deleteAccount(index - 1);
            System.out.println("删除完成！");
        } else {
            System.out.println("删除取消！");
        }
    }

    private void listAllAccount() {
        System.out.println("------------------账户列表------------------");
        if (accountList.getTotal() == 0) System.out.println("没有账户！");
        else {
            Account[] accounts = accountList.getAllAccount();
            System.out.println("编号\t\tid\t\t密码\t会员\t余额");
            for (int i = 0; i < accounts.length; i++) {
                System.out.println((i + 1) + "\t" + accounts[i].getDetail());
            }
        }
        System.out.println("---------------账户列表完成----------------");
    }
}
