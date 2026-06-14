public class Main {
    public static void main(String[] args) {
        var myClass = new MyClass(2);
        if (myClass.getOtherClass().getNum() != null) {
            myClass.getOtherClass().printNum();
        }

        myClass.getOtherClass().setNum(4);

        if (myClass.getOtherClass().getNum() != null) {
            myClass.getOtherClass().printNum();
        }

    }
}
