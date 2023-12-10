package builder;

public class TextBuilder implements Builder {
    // 동기화처리 x , 동기화처리가 되는 클래스는 StringBuffer
    private StringBuilder sb = new StringBuilder();

    @Override
    public void makeTitle(String title) {
        sb.append("======================================\n");
        sb.append("[");
        sb.append(title);
        sb.append("]\n\n");
    }

    @Override
    public void makeString(String str) {
        sb.append("ㅁ");
        sb.append(str);
        sb.append("\n\n");
    }

    @Override
    public void makeItems(String[] items) {
        for (String s : items) {
            sb.append(" *");
            sb.append(s);
            sb.append("\n");
        }
        sb.append("\n");
    }

    @Override
    public void close() {
        sb.append("======================================\n");
    }

    public String getTextResult() {
        return sb.toString();
    }
}
