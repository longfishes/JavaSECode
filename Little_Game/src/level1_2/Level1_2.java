package level1_2;

import java.util.Scanner;

public class Level1_2 {
    Office office = new Office();
    MedicineKit medicineKit = new MedicineKit();
    Player p = new Player();

    public static void main(String[] args) throws InterruptedException {
        Level1_2 view = new Level1_2();
        view.startGame();
    }
    public void startGame() throws InterruptedException {
        System.out.println("你站在空荡荡的走廊里");
        Thread.sleep(1000);
        System.out.println("望着楼梯口的方向");
        Thread.sleep(1000);
        System.out.println("你心想：");
        Thread.sleep(1000);
        System.out.println("我：这样下去也不是办法啊");
        Thread.sleep(1000);
        System.out.println("我：迟早要被ZOMBIE打死");
        Thread.sleep(1000);
        System.out.println("我：还是找找有什么东西吧");
        Thread.sleep(100);
        System.out.println();
        for (int i = 0; i < 15; i++) {
            System.out.print("*");
            Thread.sleep(200);
        }



        while (true){
            System.out.println();
            System.out.println("\n------------------第二章 逃离-------------------\n");
            System.out.println("-开始探索-\n");
            System.out.println("1.办公室旁边的箱子");
            System.out.println("2.药箱");
            System.out.println("3.直接离开");
            System.out.println("请选择(1-3)");
            char key = CMUtility.readMenuSelection();
            switch (key){
                case '1':
                    System.out.println("进入办公室\n");
                    Thread.sleep(1500);
                    exploreOffice();
                    break;
                case '2':
                    System.out.println("打开药箱\n");
                    Thread.sleep(1500);
                    openMedicineKit();
                    break;
                case '3':
                    System.out.println("你离开了\n");
                    Thread.sleep(1500);
                    goDownStairs();
                    break;
                default:
                    System.out.println("选择错误，请重输！");
                    break;
            }
        }
    }

    private void goDownStairs() throws InterruptedException {
        System.out.println("探索周围地点后");
        Thread.sleep(1000);
        System.out.println("你开始下楼");
        Thread.sleep(1000);
        System.out.println("在下楼过程中");
        Thread.sleep(1000);
        System.out.println("遇到了一只ZOMBIE");
        Thread.sleep(1000);
        System.out.println("即将开始战斗\n");
        Thread.sleep(1000);

        System.out.println("--------------------战斗开始---------------------");
        System.out.println("ZOMBIE:血量90，攻击11，防御5，经验值24，等级3");
        System.out.println();
        if (p.isEquip){
            System.out.println("我：幸好找到了根铁棍");
            Thread.sleep(1000);
            System.out.println("我：这下不怕你了");
            Thread.sleep(1000);
            System.out.println("<你胜利了>");
            Thread.sleep(100);
            System.out.print("获得奖励：");
            Thread.sleep(100);
            System.out.println("24EXP");

            System.out.println("----------------------第二章 完-----------------------");
            System.exit(0);
        }else {
            System.out.println("我：你拼尽全力");
            Thread.sleep(1000);
            System.out.println("我：可是你与ZOMBIE实力悬殊");
            Thread.sleep(1000);
            System.out.println("<你失败了>");
            Thread.sleep(1000);

            System.out.print("G");
            Thread.sleep(200);
            System.out.print("A");
            Thread.sleep(200);
            System.out.print("M");
            Thread.sleep(200);
            System.out.print("E");
            Thread.sleep(200);
            System.out.print(" ");
            Thread.sleep(200);
            System.out.print("O");
            Thread.sleep(200);
            System.out.print("V");
            Thread.sleep(200);
            System.out.print("E");
            Thread.sleep(200);
            System.out.print("R");
            System.out.println();
            System.out.println("-------------------你失败了--------------------");
            System.out.println("    再次尝试提示：多探索四周以获得更多物资对抗ZOMBIE");
            System.exit(0);
        }
    }

    private void openMedicineKit() throws InterruptedException {
        if (medicineKit.isExplore) {
            System.out.println("这里什么都没有了");
            Thread.sleep(1500);
            return;
        }
        System.out.println("你找到了一个药箱，是否使用？(Y/N)");
        char c = CMUtility.readConfirmSelection();
        if (c=='Y') {
            System.out.println("血量上限加10！");
            Thread.sleep(1500);
            medicineKit.isExplore = true;
        }
        else {
            System.out.println("取消使用");
            Thread.sleep(1500);
        }
    }

    private void exploreOffice() throws InterruptedException {
        while (true){
            System.out.println("\n-办公室-");
            System.out.println("1.打开箱子");
            System.out.println("2.离开");
            System.out.println("请选择(1-2)");
            char key = CMUtility.readMenuSelection();
            switch (key){
                case '1':
                    if (office.isFlag){
                        System.out.println("这里什么都没有了");
                    }else {
                        System.out.println("你找到一根铁棍，是否装备？(Y/N)");
                        char c = CMUtility.readConfirmSelection();
                        if (c=='Y') {
                            System.out.println("装备成功！");
                            p.isEquip = true;
                            office.isFlag = true;
                        }else System.out.println("取消装备");
                    }
                    break;
                case '2':
                    System.out.println("你离开了\n");
                    Thread.sleep(1500);
                    return;
                default:
                    System.out.println("    选择错误，请重输！");
                    break;
            }
        }
    }
    static class MedicineKit {
        boolean isExplore;
    }
    static class Office {
        boolean isFlag;
    }
    static class Player {
        boolean isEquip;
    }
    static class CMUtility {
        private static final Scanner scanner = new Scanner(System.in);

        public static String readKeyboard(int limit,boolean blankReturn){
            String str = "";
            while (scanner.hasNextLine()){
                str = scanner.nextLine();
                if (str.length()==0){
                    if (blankReturn) return str;
                }
                if (str.length()>limit) {
                    System.out.println("不大于"+limit+"错误");
                    continue;
                }
                break;
            }
            return str;
        }

        public static char readMenuSelection(){
            String str;
            while (true){
                str = readKeyboard(1,false);
                if (!str.equals("0")&&!str.equals("1")&&
                        !str.equals("2")&&!str.equals("3")&&!str.equals("4")){
                    System.out.println("选择错误");
                    continue;
                }
                break;
            }
            return str.charAt(0);
        }

        public static char readConfirmSelection(){
            String str;
            while (true){
                str = readKeyboard(1,false);
                if (str.equals("y")||str.equals("Y"))return 'Y';
                else if (str.equals("N")||str.equals("n"))return 'N';
                System.out.println("选择错误");
            }
        }
    }

}
