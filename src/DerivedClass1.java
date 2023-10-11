public class DerivedClass1 extends BaseClass{
    private String complexField;
    public String getComplexField() {
        return complexField;
    }
    public void someMethod () {
        System.out.println("Derived class1");
    }
    public final void noOverride() {
        System.out.println("nonOverride");
    }

}
