import java.util.List;

public final class  Dog extends Pet {
    private String name;
    private String breed;
    private String commands;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getCommands() {
        return commands;
    }

    public void setCommands(String commands) {
        this.commands = commands;
    }

    public Dog(String name, String breed, String commands) {
        this.name = name;
        this.breed = breed;
        this.commands = commands;
    }
    public Dog(String name, String breed, String commands, String color, String shelter,int age) {
        this.name = name;
        this.breed = breed;
        this.commands = commands;
        this.color = color;
        this.shelter = shelter;
    }
    public Dog(String name, String breed, String color,String shelter) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.shelter = shelter;
    }
    public String makeVoice(String voice) {
        return voice;
    }
    public String getInfo() {
        this.commands = commands;
        this.shelter = shelter;
        this.color = color;
        this.breed = breed;
        this.age = age;
        this.name = name;
        return List.of(commands,shelter,color,breed,age,name).toString();
    }
}
