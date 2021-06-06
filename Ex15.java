/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Sriharsha Aitharaju
 */
import java.util.*;

public class Ex15
{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String password = "";
        String correct = "abc$123";
        System.out.print("What is the password?");
        password = kb.next();
        if(password.equals(correct))
        {
            System.out.print("Welcome!");
        }
        else{
            System.out.print("I don't know you.");
        }
    }

}

