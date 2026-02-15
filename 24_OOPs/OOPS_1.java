
public class OOPS_1 {

    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("red");
        p1.setTip(5);

        System.out.println(p1.color);
        System.out.println(p1.tip);

        p1.setColor("blue");
        System.out.println(p1.color);
    }

}

class Pen {

    String color;
    int tip;

    void setColor(String c) {
        color = c;
    }

    void setTip(int n) {
        tip = n;
    }
}
