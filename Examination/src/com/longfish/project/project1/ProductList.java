package com.longfish.project.project1;

public class ProductList {
    private Product[] products;
    private int total;

    public ProductList(int maxNumOfProduct) {
        products = new Product[maxNumOfProduct];
    }

    public Product getProduct(int index) {
        if (index < 0 || index > total - 1) return null;
        else return products[index];
    }

    public Product[] getAllProduct(){
        Product[] newProducts = new Product[total];
        System.arraycopy(products, 0, newProducts, 0, total);
        return newProducts;
    }

    public int getTotal() {
        return total;
    }

    public int getMax() {
        return products.length;
    }

    public void addProduct(Product product) {
        products[total++] = product;
    }

    public void replaceProduct(int index, Product product) {
        products[index] = product;
    }

    public void deleteProduct(int index) {
        if (total - 1 - index >= 0) System.arraycopy(products, index + 1, products, index, total - 1 - index);
        products[--total] = null;
    }
}
