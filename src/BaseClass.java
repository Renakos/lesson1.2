public class BaseClass {
    private int privateInt;
    public void oneMethod() {
        System.out.println("Method");
    }

    public void nonOverridableMethod() {
    }

    public int getPrivateInt() {
        return privateInt;
    }

    public String getPrivateField() {
        return getPrivateField();
    }
}
