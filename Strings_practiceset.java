package com.red_sandel;

import java.util.Scanner;
public class Strings_practiceset {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
// 1        System.out.println(str.toUpperCase());
// 2       String under = str.replace("a","_");
// 2        System.out.println(under);
//   3    REplacing a string
 /*       String sen = "Dear <|name|> Thanks a lot";
        String senn = sen.replace("<|name|>","Gowtham");
        System.out.println(senn); */
//        Problem -4 (find double and triple spaces)
        String Strr = "  hello   my  dear world  ";
        System.out.println(Strr.indexOf("  "));
        System.out.println(Strr.indexOf("   "));

    }
}
