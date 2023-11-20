import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main{
    public static void main(String[] args) throws WrongRaceException, WrongNameException, InterruptedException {
        Game myGame = new Game();
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Create your hero");
        System.out.println("Import hero name");
        String heroName;
        heroName = myScanner.next();
        System.out.println("Import its race");
        String heroRace;
        heroRace = myScanner.next();
        myGame.createHero(heroName, heroRace);

        System.out.println("Import number of monsters");
        int n;
        n = myScanner.nextInt();
        System.out.println("Now import monsters");
        for(int i = 0; i < n; i++){
            String monsterRace;
            System.out.println("import " + (i+1) +" number of monster");
            monsterRace = myScanner.next();
            myGame.addMonster(monsterRace);
        }

        try {
            myGame.startBattle();
        } catch (WrongNameException | InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}