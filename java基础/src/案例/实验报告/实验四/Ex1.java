package 案例.实验报告.实验四;

class Words {
    static void printWords() {
        for (char i = 'a'; i < 'z'; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (char i = 'A'; i < 'Z'; i++) {
            System.out.print(i + " ");
        }
    }
}

public class Ex1 {
    public static void main(String[] args) {
        Words.printWords();

    }
}
