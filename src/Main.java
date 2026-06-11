public class Main {
    public static void main(String[] args) {
        var myClass = new MyClass(2);
        myClass.getOtherClass().printNum();

        myClass.getOtherClass().setNum(4);

        myClass.getOtherClass().printNum();

    }
}
