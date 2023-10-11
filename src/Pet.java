import java.util.Random;

public  class Pet {
    int age;
    String color;
    String shelter;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getShelter() {
        return shelter;
    }

    public void setShelter(String shelter) {
        this.shelter = shelter;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    private int generateDefaultAge() {
        Random random = new Random();
        random.nextInt(0,100);
        return age;
    }
    private Object getInfo() {
        this.color = color;
        this.age = age;
        this.shelter = shelter;

        return null;
    }
}
