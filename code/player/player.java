package player;

public class player {
    private String name;
    private String address;
    private int age;
    private String conum;
    private char symbol;
    private String emailid;

    public void setPlayerDetails(String name, char symbol, String address, String conum, String emailid, int age) {
        this.name = name;
        this.symbol = symbol;
        this.address = address;
        this.conum = conum;
        this.emailid = emailid;
        this.age = age;

    }

    public void changeSymbol(char symbol) {
        this.symbol = symbol;
    }

    public void setPlayerNameAndSymbol(String name, char symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    public void setPlayerNameAndAge(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getPlayerName() {
        return this.name;
    }

    public char getPlayerSymbol() {
        return this.symbol;
    }

    public void setPlayerNameSymbolEmailIdAge(String name, char symbol, String emailid, int age) {
        this.name = name;
        this.age = age;
        this.emailid = emailid;
        this.symbol = symbol;
    }

    public void getPlayerNameAndSymbol() {
        System.out.println("Player Name:" + this.name);
        System.out.println("player Symbol :" + this.symbol);
    }

    public void getPlayerNameAndAge() {
        System.out.println("Player Name: " + this.name);
        System.out.println("Player Age: " + this.age);
    }

    public void getPlayerDetails() {
        System.out.println("Player Name:" + this.name);
        System.out.println("Player symbol:" + this.symbol);
        System.out.println("Player emailid:" + this.emailid);
        System.out.println("Player age:" + this.age);
        System.out.println("Player phonenumber:" + this.conum);
        System.out.println("Player address:" + this.address);
    }
}
