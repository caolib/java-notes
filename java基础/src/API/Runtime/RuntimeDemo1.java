package java基础.src.API.Runtime;


import org.junit.jupiter.api.Test;

import java.io.IOException;

public class RuntimeDemo1 {
    //获取当前系统的运行环境对象(单例)
    private static final Runtime runtime = Runtime.getRuntime();

    public static void main(String[] args) {
    }

    //1.停止虚拟机(System中的exit使用的就是此方法)
    @Test
    public void testExit() {
        runtime.exit(0);
        System.out.println("这行执行不了");
    }

    @Test
    public void testProcess() {
        System.out.println("CPU线程数= " + runtime.availableProcessors());
    }

    @Test
    public void testMemory() {
        //获取内存byte
        System.out.println("可从虚拟机中获取的最大内存:" + runtime.maxMemory() / 1024 / 1024 + " MB");
        System.out.println("已经从虚拟机中获取到的内存:" + runtime.totalMemory() / 1024 / 1024 + " MB");
        System.out.println("虚拟机中剩余的内存:" + runtime.freeMemory() / 1024 / 1024 + " MB");
    }


    //可执行部分cmd命令
    @Test
    public void testCmd() throws IOException {
        runtime.exec("notepad");
//        runtime.exec("cmd");
        System.out.println(6);
    }

}
