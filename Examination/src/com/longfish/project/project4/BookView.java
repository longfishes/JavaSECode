package com.longfish.project.project4;

public class BookView {
    public static void main(String[] args) {
        BookView view = new BookView();
        view.enterMainMenu();
    }
    BookList bookList = new BookList(10);

    public void enterMainMenu(){
        boolean isFlag = true;
        while (isFlag){
            System.out.println("\n------------------------------图书管理系统-----------------------------\n");
            System.out.println("                                1.添 加 图 书");
            System.out.println("                                2.修 改 图 书");
            System.out.println("                                3.删 除 图 书");
            System.out.println("                                4.图 书 列 表");
            System.out.println("                                0.退 出 系 统\n");
            System.out.print("                     请选择(0-4):");
            char c = CMUtility.readMenuSelection();
            switch (c){
                case '1':
                    addNewBook();
                    break;
                case '2':
                    modifyBook();
                    break;
                case '3':
                    deleteBook();
                    break;
                case '4':
                    listAllBook();
                    break;
                case '0':
                    System.out.println("是否确认(Y/N)");
                    char yn = CMUtility.readConfirmSelection();
                    if (yn=='Y') isFlag = false;
                    break;
            }
        }
    }

    public void addNewBook() {
        System.out.println("-----------------------添加图书--------------------------");
        if (bookList.getTotal() == bookList.getMax()) {
            System.out.println("记录已满，无法添加！");
            return;
        }
        System.out.print("名称：");
        String name = CMUtility.readString(20);
        System.out.print("出版社：");
        String press = CMUtility.readString(20);
        System.out.print("价钱：");
        int price = CMUtility.readInt(4);
        System.out.print("年份：");
        int year = CMUtility.readInt(4);
        bookList.addBook(new Book(name, press, price, year));
        System.out.println("------------------------添加完成--------------------------");
    }

    public void modifyBook() {
        System.out.println("-----------------------修改图书--------------------------");
        int index;
        Book book;
        while (true) {
            System.out.println("请选择待修改的图书（-1退出）");
            index = CMUtility.readInt(2);
            if (index == -1) return;
            book = bookList.getBook(index - 1);
            if (book == null) System.out.println("无法找到指定图书");
            else break;
        }
        System.out.print("名称（" + book.getName() + "）：");
        String name = CMUtility.readString(20, book.getName());
        System.out.print("出版社（" + book.getPress() + "）：");
        String press = CMUtility.readString(20, book.getPress());
        System.out.print("价钱（" + book.getPrice() + "）：");
        int price = CMUtility.readInt(4, book.getPrice());
        System.out.print("年份（" + book.getYear() + "）：");
        int year = CMUtility.readInt(4, book.getYear());
        bookList.replaceBook(index - 1, new Book(name, press, price, year));
        System.out.println("------------------------修改完成--------------------------");
    }

    public void deleteBook() {
        System.out.println("-----------------------删除图书--------------------------");
        int index;
        Book book;
        while (true) {
            System.out.println("请选择待删除的图书（-1退出）");
            index = CMUtility.readInt(2);
            if (index == -1) return;
            book = bookList.getBook(index - 1);
            if (book == null) System.out.println("无法找到指定图书");
            else break;
        }
        System.out.println("是否确认(Y/N)");
        if (CMUtility.readConfirmSelection() == 'Y') {
            bookList.deleteBook(index - 1);
            System.out.println("------------------------删除完成--------------------------");
        }

    }

    public void listAllBook(){
        System.out.println("------------------------图书列表--------------------------");
        Book[] b = bookList.getAllBook();
        if (b.length==0) System.out.println("没有记录！");
        else {
            System.out.println("编号\t书名\t\t出版社\t\t价格\t年份");
            for (int i = 0; i < b.length; i++) {
                System.out.println((i+1)+"\t"+b[i].getDetail());
            }
        }
        System.out.println("----------------------图书列表完成------------------------");
    }
}
