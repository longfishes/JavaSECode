package com.longfish.project.project4;

import java.util.Scanner;

public class CMUtility {
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
        String str = "";
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

    public static char readChar(){
        String str = readKeyboard(1, false);
        return str.charAt(0);
    }

    public static char readChar(char defaultValue){
        String str = readKeyboard(1,true);
        if (str.length()==0)return defaultValue;
        return str.charAt(0);
    }

    public static String readString(int limit){
        return readKeyboard(limit,false);
    }

    public static String readString(int limit,String defaultValue){
        String str = readKeyboard(limit,true);
        if (str.length()==0) return defaultValue;
        return str;
    }

    public static int readInt(int limit){
        String str = "";
        int n;
        while (true){
            str = readKeyboard(limit,false);
            try{
                n = Integer.parseInt(str);
                break;
            }catch (NumberFormatException e){
                System.out.println("输入数字错误");
            }
        }
        return n;
    }

    public static int readInt(int limit,int defaultValue){
        String str = "";
        int n;
        while (true){
            str = readKeyboard(limit,true);
            if (str.length()==0) return defaultValue;
            try{
                n = Integer.parseInt(str);
                break;
            }catch (NumberFormatException e){
                System.out.println("输入数字错误");
            }
        }
        return n;
    }

    public static double readDouble(int limit){
        String str = "";
        double d;
        while (true){
            str = readKeyboard(limit,false);
            try{
                d = Double.parseDouble(str);
                break;
            }catch (NumberFormatException e){
                System.out.println("输入数字错误");
            }
        }
        return d;
    }

    public static double readDouble(int limit,double defaultValue){
        String str = "";
        double d;
        while (true){
            str = readKeyboard(limit,true);
            if (str.length()==0)return defaultValue;
            try{
                d = Double.parseDouble(str);
                break;
            }catch (NumberFormatException e){
                System.out.println("输入数字错误");
            }
        }
        return d;
    }

    public static boolean readBoolean(){
        String str = "";
        while (true){
            str = readKeyboard(1,false);
            if (str.equals("0")) return false;
            else if (str.equals("1")) return true;
            System.out.println("选择错误");
        }
    }

    public static boolean readBoolean(boolean defaultValue){
        String str = "";
        while (true){
            str = readKeyboard(1,true);
            if (str.length()==0) return defaultValue;
            else if (str.equals("0")) return false;
            else if (str.equals("1")) return true;
            System.out.println("选择错误");
        }
    }

    public static char readConfirmSelection(){
        String str = "";
        while (true){
            str = readKeyboard(1,false);
            if (str.equals("y")||str.equals("Y"))return 'Y';
            else if (str.equals("N")||str.equals("n"))return 'N';
            System.out.println("选择错误");
        }
    }
}
