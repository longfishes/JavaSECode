package com.longfish.project.project1;

public class ProductView {
    ProductList productList = new ProductList(10);

    public static void main(String[] args) {
        ProductView view = new ProductView();
        view.enterMainMenu();
    }

    public void enterMainMenu() {
        while (true) {
            System.out.println("\n--商品后台管理系统--");
            System.out.println("\t1.添加商品");
            System.out.println("\t2.删除商品");
            System.out.println("\t3.修改商品信息");
            System.out.println("\t4.查询商品");
            System.out.println("\t0.退出");
            System.out.print("键入数字以继续：");
            char key = CMUtility.readMenuSelection();
            switch (key) {
                case '1':
                    addNewProduct();
                    break;
                case '2':
                    deleteProduct();
                    break;
                case '3':
                    modifyProduct();
                    break;
                case '4':
                    listAllProduce();
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

    private void addNewProduct() {
        System.out.println("-----------------添加商品----------------");
        if (productList.getTotal() == productList.getMax()) {
            System.out.println("记录已满，无法添加");
            return;
        }
        System.out.print("名称：");
        String name = CMUtility.readString(10);
        System.out.print("价格：");
        double price = CMUtility.readDouble(10);
        System.out.print("是否有货（0无1有）：");
        boolean isStored = CMUtility.readBoolean();
        System.out.print("回购率：");
        double rate = CMUtility.readDouble(4);

        productList.addProduct(new Product(name, price, isStored, rate));
        System.out.println("添加完成！");
    }

    private void modifyProduct() {
        System.out.println("-----------------修改商品----------------");
        int index;
        Product prod;
        while (true) {
            System.out.println("请输入待修改的商品编号（-1退出）");
            index = CMUtility.readInt(2);
            if (index == -1) return;
            prod = productList.getProduct(index - 1);
            if (prod == null) {
                System.out.println("无法找到指定商品！");
                continue;
            }
            break;
        }
        System.out.print("名称(" + prod.getName() + ")：");
        String name = CMUtility.readString(10, prod.getName());
        System.out.print("价格(" + prod.getPrice() + ")：");
        double price = CMUtility.readDouble(10, prod.getPrice());
        System.out.print("是否有货(" + prod.isStored() + ")（0无1有）：");
        boolean isStored = CMUtility.readBoolean(prod.isStored());
        System.out.print("回购率(" + prod.getRate() + ")：");
        double rate = CMUtility.readDouble(4, prod.getRate());

        productList.replaceProduct(index - 1, new Product(name, price, isStored, rate));
        System.out.println("添加完成！");
    }

    private void deleteProduct() {
        int index;
        Product prod;
        while (true) {
            System.out.println("请输入待删除的商品编号（-1退出）");
            index = CMUtility.readInt(2);
            if (index == -1) return;
            prod = productList.getProduct(index - 1);
            if (prod == null) {
                System.out.println("无法找到指定商品！");
                continue;
            }
            break;
        }
        System.out.println("是否确认(Y/N)");
        char c = CMUtility.readConfirmSelection();
        if (c == 'Y') {
            productList.deleteProduct(index - 1);
            System.out.println("删除完成！");
        } else {
            System.out.println("删除取消！");
        }
    }

    private void listAllProduce() {
        System.out.println("------------------商品列表------------------");
        if (productList.getTotal() == 0) System.out.println("没有商品！");
        else {
            Product[] products = productList.getAllProduct();
            System.out.println("编号\t名称\t价格\t是否有货\t回购率");
            for (int i = 0; i < products.length; i++) {
                System.out.println((i + 1) + "\t" + products[i].getDetail());
            }
        }
        System.out.println("---------------商品列表完成----------------");
    }
}
