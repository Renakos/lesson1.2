public  class NonInheritableClass<EnumType> {
    private EnumType enumField;
    public NonInheritableClass(){
        this.enumField = enumField;
    }
    public EnumType getEnumField() {
        return enumField;
    }
    public void someMethod() {
        System.out.println("noinherateclass");
    }


}