package com.imooc.groovy;

/**
 * @author cody
 * @version V1.0
 * @create 2017/9/17 15:06
 */
public class TodoItem {
    private String name;
    private boolean hasDo;

    public TodoItem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHasDo() {
        return hasDo;
    }

    public void setHasDo(boolean hasDo) {
        this.hasDo = hasDo;
    }

    @Override
    public String toString() {
        return "TodoItem{" +
                "name='" + name + '\'' +
                ", hasDo=" + hasDo +
                '}';
    }
}
