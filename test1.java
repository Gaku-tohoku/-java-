1. JDK、JRE、JVM三者之间的关系，以及JDK、JRE包含的主要结构有哪些？
答：
JDK = JRE + Java的开发工具（javac.exe, java.exe, javadoc.exe）
JRE = JVM + Java核心类库

2. 为什么要配置path环境变量？如何配置？
答：
希望在任何文件路径下都可以执行java的开发工具，如javac。
JAVA_HOME = bin的上一层目录
path = &JAVA_HOME%\bin

3. 常用的几个命令行操作有哪些？（至少4个）
答：
cd
md 创建文件目录
rd 删除文件
del
cd..
cd/

4. 创建如下的类，使得运行的话可以输出。
答：
创建java文件，ChairMan.java

public class ChairMan{
  public static void main(String[] args){
    System.out.println("姓名： 张三");
    System.out.println();    
    System.out.println("性别： 男");       
    System.out.println("家庭住址： 北京市海淀区");    
  }
}

5. 编译和运行上述代码的指令。
答：
编译：javac ChairMan.java
运行：java ChairMan
