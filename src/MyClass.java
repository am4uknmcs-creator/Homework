public final class MyClass{
    private final OtherClass otherClass;

    public MyClass(Integer num) {
        this.otherClass = new OtherClass(num);
    }

    public OtherClass getOtherClass() {
      return new OtherClass(otherClass.getNum());
    }

}

