package Java102;


import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Tweet t=new Tweet("yahia", "welcome to tweeter ");
        t.Reply("salman ","hi hahs");
        t.Retweet("hussin","welcome to java ");
    }
}