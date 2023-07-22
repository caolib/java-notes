package javaSE.src.OS.磁盘调度算法;

import java.util.ArrayList;
import java.util.Arrays;

public class CSCANPro {
    public static void main(String[] args) {
        int start = 100;
        boolean larger = true;//表示先从小到大
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(55, 58, 39, 18, 90, 160, 150, 38, 184));
        runCSCANPro(arr, start, larger);

        int start2 = 100;
        boolean larger2 = false;//表示先从大到小
        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(55, 58, 39, 18, 90, 160, 150, 38, 184));
        runCSCANPro(arr2, start2, larger2);

    }

    public static ArrayList<Integer> getTargetArr(ArrayList<Integer> arr, int start, boolean larger) {
        //创建目标数组，并将开始位置作为第一个值
        ArrayList<Integer> target = new ArrayList<>();
        target.add(start);

        //升序排序
        arr.add(start);
        arr.sort((v1, v2) -> v1 - v2);

        //打印相关信息
        System.out.println("----------------------------------------------------------------");
        System.out.println("开始点：" + start);
        System.out.println("方向：" + (larger ? "先从小到大" : "先从大到小"));
        System.out.println(arr);

        //排序后找到插入的start的索引index
        int index = -1;
        for (int i = 0; i < arr.size(); i++) {
            if (start == arr.get(i)) {
                index = i;
            }
        }
        //把数组分成前后两部分
        ArrayList<Integer> pre = new ArrayList<>();
        ArrayList<Integer> next = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            if (i < index) {
                pre.add(arr.get(i));
            } else if (i > index) {
                next.add(arr.get(i));
            }
        }

        //如果越来越大，就先遍历右边的数组
        if (larger) {
            //addAll：将数组的所有元素添加
            target.addAll(next);
            target.addAll(pre);
        } else {
            pre.sort((v1, v2) -> v2 - v1);
            next.sort((v1, v2) -> v2 - v1);
            target.addAll(pre);
            target.addAll(next);
        }
        return target;
    }

    public static void runCSCANPro(ArrayList<Integer> arr, int start, boolean larger) {
        ArrayList<Integer> target = getTargetArr(arr, start, larger);
        int length = 0;
        for (int i = 0; i < target.size() - 1; i++) {
            length += Math.abs(target.get(i) - target.get(i + 1));
        }
        System.out.print("寻道顺序：");
        for (int i = 0; i < target.size(); i++) {
            System.out.print(i != (target.size() - 1) ? target.get(i) + "->" : target.get(i));
        }
        System.out.println("\n寻道总长度：" + length);
        System.out.println("平均寻道长度：" + length * 1.0 / (target.size() - 1));
        System.out.println("----------------------------------------------------------------");
    }
}
