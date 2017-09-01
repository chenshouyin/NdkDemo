package com.example.testndkeclipse;

/** 
 * ClassField.java 
 * 用于本地代码访问和修改该类的属性 
 * @author yangxin 
 * 
 */  
public class ClassField {  

    private static int num;  //静态变量

    private String str;  //属性变量

    public int getNum() {  
        return num;  
    }  

    public void setNum(int num) {  
        ClassField.num = num;  
    }  

    public String getStr() {  
        return str;  
    }  

    public void setStr(String str) {  
        this.str = str;  
    }  
}  