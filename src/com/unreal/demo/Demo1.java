package com.unreal.demo;

public class Demo1 {
    public static void main(String[] args) {
        Demo1 demo1 = new Demo1();
       demo1.add();
    }
    public void add(){
       for (int i=1;i<=9;i++){
           for (int j=1;j<=i;j++){
               System.out.print(j+"x"+i+"="+j*i+"\t");
           }System.out.println(" ");
       }

    }

}
