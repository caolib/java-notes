package javaSE.src.Case;

/**
 * JavaDoc Case
 */
public class JavaDoc {
    private String info;

    public JavaDoc() {
    }

    public JavaDoc(String info) {
        this.info = info;
    }

    /**
     * 获取
     *
     * @return info
     */
    public String getInfo() {
        return info;
    }

    /**
     * 设置
     *
     * @param info information
     */
    public void setInfo(String info) {
        this.info = info;
    }

    public String toString() {
        return "JavaDoc{info = " + info + "}";
    }
}
