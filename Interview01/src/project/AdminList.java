package project;

public class AdminList {
    private Admin[] admins;
    private int total;


    public AdminList(int max) {
        admins = new Admin[max];
    }

    public int getTotal() {
        return total;
    }

    public int getMax(){
        return admins.length;
    }

    public Admin getAdmin(int index){
        if (index<0||index>total-1) return null;
        return admins[index];
    }

    public void addAdmin(Admin admin){
        admins[total++] = admin;
    }
}
