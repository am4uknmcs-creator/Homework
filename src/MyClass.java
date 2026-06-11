public final class MyClass{
    private OtherClass otherClass;

    MyClass(Integer num) {
        this.otherClass = new OtherClass(num);
    }

    public OtherClass getOtherClass() {
      return otherClass;
    }

}

