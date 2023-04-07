package java基础.src.案例.实验报告.实验四;

/**
 * 2. 用类描述计算机中CPU的速度和硬盘的容量。要求Java应用程序有4个类，名字分别是PC，CPU和HardDisk和Test，其中Test是主类。
 * 	PC类与CPU和HardDisk类关联的UML图（图1）
 * 其中，CPU类要求getSpeed()返回speed的值；要求setSpeed(int m)方法将参数m的值赋值给speed。HardDisk类要求getAmount()返回amount的值，要求setAmount(int m)方法将参数m的值赋值给amount。PC类要求setCUP(CPU c) 将参数c的值赋值给cpu，要求setHardDisk (HardDisk h)方法将参数h的值赋值给HD，要求show()方法能显示cpu的速度和硬盘的容量。
 * 	主类Test的要求
 * ①	main方法中创建一个CPU对象cpu，cpu将自己的speed设置为2200，
 * ②	main方法中创建一个HardDisk对象disk，disk将自己的amount设置为200，
 * ③	main方法中创建一个PC对象pc，
 * ④	pc调用setCUP(CPU c)方法，调用时实参是cpu，
 * ⑤	pc调用setHardDisk (HardDisk h)方法，调用时实参是disk，
 * ⑥	pc调用show()方法。
 */

class CPU {
    int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "CPU{" +
                "speed=" + speed +
                '}';
    }
}

class HardDisk {
    int amount;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "HardDisk{" +
                "amount=" + amount +
                '}';
    }
}

class PC {
    CPU cpu;
    HardDisk hd;

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public void setHd(HardDisk hd) {
        this.hd = hd;
    }

    public void show() {
        System.out.println("cpuSpeed:" + cpu.getSpeed());
        System.out.println("hardDiskAmount:" + hd.getAmount());
    }
}

public class Test {
    public static void main(String[] args) {
        CPU cpu = new CPU();
        HardDisk hd = new HardDisk();
        cpu.setSpeed(2200);
        hd.setAmount(200);
        PC pc = new PC();
        pc.setCpu(cpu);
        pc.setHd(hd);
        pc.show();
    }
}
