package javaSE.src.案例.实验报告.实验六;

public class Ex2 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("shang");
        sb.append("hai");
        System.out.println(sb);

        sb.insert(0, "china");
        System.out.println(sb);

        sb.replace(sb.indexOf("shanghai"), sb.length(), "beijing");
        System.out.println(sb);
    }
}
