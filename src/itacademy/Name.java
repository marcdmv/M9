package itacademy;

public class Name {

    private String name;

    public Name (String name) {
        this.name = name;
    }

    public void printName(){
        System.out.println(name);
    }

    public char getFirstChar(){
        return name.charAt(0);
    }

    public int getLength(){
        return name.length();
    }

}
