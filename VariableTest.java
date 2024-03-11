/*
变量的使用
1. java定义变量的格式：数据类型 变量名 = 变量值；
2. 说明：
   变量必须先声明，后使用；
   变量都定义在其作用域内；
   同一个作用域内，不可以声明两个同名的变量。
*/

public class VariableTest {
    public static void main(String[] args) {
        //变量的定义
        int myAge = 12;
        //变量的使用
        System.out.println(myAge);

        //使用myNumber之前并未定义过myNumber
        //System.out.println(myNumber);

        //变量的声明
        int myNumber;

        //变量的赋值
        myNumber = 1001;
    }

    public void method(){
        int myClass = 1;
    }
}

