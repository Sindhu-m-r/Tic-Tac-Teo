import board.board;
import game.game;
import player.player;

public class App {
    // public App() {

    // }

    public static void main(String[] args) throws Exception {
        // Scanner sc = new Scanner(System.in);
        System.out.println("first project ->Tic Tac Toe");
        board b = new board(3, '-');

        // b.setDefaultSymbol('@');
        // b.printboardConfig();
        player p1 = new player();
        // System.out.println("enter player 1 name");
        // String name = sc.nextLine();
        // System.out.println("enter player 1 Symbol");
        // char symbol = sc.next().charAt(1);
        // System.out.println("enter player 1 address");
        // String address = sc.nextLine();
        // System.out.println("enter player 1 conum");
        // String conum = sc.nextLine();
        // System.out.println("enter player 1 emailid");
        // String emailid = sc.nextLine();
        // System.out.println("enter player 1 age");
        // int age = sc.nextInt();

        // p1.setPlayerDetails(name, symbol, address, conum, emailid, age);
        p1.setPlayerDetails("Ravi", 'x', "Mysore", "7558984077", "fs@gmail.com", 17);
        p1.getPlayerDetails();
        player p2 = new player();
        p2.setPlayerDetails("Arun", '0', "Dvg", "7558984077", "fs@gmail.com", 17);
        p2.getPlayerDetails();
        game game = new game(new player[] { p1, p2 }, b);
        game.play();
    }
}
