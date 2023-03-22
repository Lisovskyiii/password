package com.company;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Main {

    public static void main(String[] args) {
        try {
            System.out.println("Введите пароль");
            Scanner in = new Scanner(System.in);
            String password = in.next();
            byte count=0;
            Pattern pattern = Pattern.compile("[A-Za-zА-Яа-я]");
            Pattern pattern1 = Pattern.compile("[0-9]");
            Pattern pattern2 = Pattern.compile("[#*-]");
            Matcher a = pattern.matcher(password);
            Matcher b = pattern1.matcher(password);
            Matcher c = pattern2.matcher(password);
            if(!a.find()) {
                System.out.println("*В пароле отсутствуют буквы*");
                count++;
            }
            if (!b.find()) {
                System.out.println("*В пароле отсутствуют цифры*");
                count++;
            }
            if (!c.find()) {
                System.out.println("* В пароле используются не предусмотренные символы (все кроме *, - , #)*");
                count++;
            }
            if (password.length() != 8) {
                System.out.println("*Длина пароля не равна 8*");
                count++;
            }
            if(count==0){
                System.out.println("[Введен надежный пароль]");
            }
            if(count!=0){
                main(args);
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            main(args);
        }
    }
}
