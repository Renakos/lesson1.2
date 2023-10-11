

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main<EnumType> {
    public void main(String[] args) {
        dog();
        dog(2);
        dog("third");
        DerivedClass1 objectA = new DerivedClass1();
        NonInheritableClass objectB = new NonInheritableClass();
        NonInheritableClass objectC = new NonInheritableClass();
        System.out.println("Object A - DerivedClass1:");
        System.out.println("PrivateField: " + objectA.getPrivateField());
        System.out.println("ComplexField: " + objectA.getComplexField());
        objectA.someMethod();
        objectA.nonOverridableMethod();
        System.out.println("\nObject B - NonInheritableClass (EnumField: VALUE1):");
        System.out.println("EnumField: " + objectB.getEnumField());
        objectB.someMethod();
        System.out.println("\n Object C - NonInheritableClass (EnumField: VALUE2):");
        System.out.println("EnumField: " + objectC.getEnumField());
        objectC.someMethod();
    }
    private static void dog() {
        Dog dog = new Dog("Sobaka1", "lubaya", "GiveLeg", "Green", "isInShelter",3);
        System.out.println(dog.getInfo());
        System.out.println(dog.makeVoice("GUUUV GUUUUV"));
    }
    private static void dog(int second) {
        Dog dog = new Dog("Sobaka2","lubaya2","GiveLeg2","Brown","isNotInShelter",3);
        System.out.println(dog.getInfo());
        System.out.println(dog.makeVoice("GAAV GAAV"));
    }
    private static void dog(String third) {
        Dog dog = new Dog("Sobaka3","lubaya3","GiveLeg3","Black","wasInShelter",3);
        System.out.println(dog.getInfo());
        System.out.println(dog.makeVoice("GAV GAV"));
    }



}