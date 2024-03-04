import java.util.Scanner;
public class Casino01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean q;
        int a = (int) (Math.random() * 6 + 1);
        int b = (int) (Math.random() * 6 + 1);
        int n = a + b;
        int x = -1;
        int money;
        int i;
        int score = 20000;

        outer0 : while (true) {
            outer:
            while (true) {
                x++;
                if (x == 1) {
                    money = 1000;
                } else if (x == 2) {
                    money = 3000;
                } else if (x == 3) {
                    money = 6000;
                } else if (x == 4) {
                    money = 10000;
                } else if (x == 5) {
                    money = 20000;
                } else if (x == 6) {
                    money = 50000;
                } else if (x > 6) {
                    money = 100000;
                } else {
                    money = 0;
                }
                System.out.println("一号骰子:" + a);
                System.out.println("二号骰子:" + b);
                System.out.println("得分:" + (a+b));
                System.out.println("----------------------------------------------------当前得分："+score);
                if (x == 0) System.out.println("猜下次的结果比这次大请输入1，猜下次的结果比这次小请输入0");
                else {
                    System.out.println("恭喜，当前已成功" + x + "次，共计赢得现金" + money + "元");
                    System.out.println("猜下次的结果比这次大请输入1，猜下次的结果比这次小请输入0，见好就收请输入6");
                }
                while (true) {
                    i = s.nextInt();
                    if (x == 0) {
                        if (i == 0) {
                            q = false;
                            break;
                        }else if (i == 1) {
                            q = true;
                            break;
                        }else if (i == 6) {
                            System.out.println("不带一开始就退出的,请重输!");
                        }else if (i==66) {
                            break outer0;
                        }else if (i == 114514) {
                            score += 10000;
                            System.out.println("已执行");
                            System.out.println("----------------------------------------------------当前得分："+score);
                        }else {
                            System.out.println("请重输!");
                        }
                    } else if (i==66) {
                        break outer0;
                    }else {
                        if (i == 0) {
                            q = false;
                            break;
                        }else if (i == 1) {
                            q = true;
                            break;
                        }else if (i == 6) {
                            break outer;
                        }else if (i == 114514) {
                            score = 10000;
                            System.out.println("已执行");
                            System.out.println("----------------------------------------------------当前得分："+score);
                        }else {
                            System.out.println("请重输!");
                        }
                    }
                }
                a = (int) (Math.random() * 6 + 1);
                b = (int) (Math.random() * 6 + 1);
                if (q) {
                    if ((a + b) > n) {
                        n = a + b;
                    } else {
                        System.out.println("一号骰子:" + a);
                        System.out.println("二号骰子:" + b);
                        System.out.println("得分:" + (a + b));
                        System.out.println("----------------------------------------------------当前得分："+score);
                        break;
                    }
                } else {
                    if ((a + b) < n) {
                        n = a + b;
                    } else {
                        System.out.println("一号骰子:" + a);
                        System.out.println("二号骰子:" + b);
                        System.out.println("得分:" + (a + b));
                        System.out.println("----------------------------------------------------当前得分："+score);
                        break;
                    }
                }
            }

            if (x == 0) {
                System.out.println("很遗憾，你失败了，扣除入场费5000");
                score -= 5000;
                x = -1;
            } else if (i == 0 | i == 1) {
                System.out.println("你虽然成功了" + x + "次，但很遗憾没有及时退出");
                System.out.println("你的" + money + "元被猴子偷走了，还被赌场罚款" + money*2 + "元");
                score -= money*2;
                x = -1;
            } else {
                System.out.println("你成功了" + x + "次");
                System.out.println("恭喜赢得现金" + money + "元!");
                score += money;
                x = -1;
            }
        }
        System.out.println("----------------------------------");
        System.out.println("最终得分："+score);
    }
}
