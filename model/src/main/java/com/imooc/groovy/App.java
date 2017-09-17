package com.imooc.groovy;

import java.util.Scanner;

/**
 * @author cody
 * @version V1.0
 * @create 2017/9/17 15:06
 */
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while(++i < 4){
            System.out.println(i + " please input todo item name");
            TodoItem todoItem = new TodoItem(scanner.nextLine());
            System.out.println(todoItem.toString());
        }

    }
}
