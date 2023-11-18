import java.util.ArrayList;
import java.util.Queue;
import java.util.Scanner;

public abstract class Game {
    Queue<Monster> monster;
    private Character hero;
    

    public void createHero(String name, String race) throws WrongRaceException{
        if(race.equals("Paladin")){
            Paladin paladin = new Paladin(name, 150, 25, race);
        } else if (race.equals("Witcher")) {
            Wicher wicher = new Wicher(name, 120, 30, race);
        } else if (race.equals("Varvar")) {
            Varvar varvar = new Varvar(name, 180, 35, race);
        } else if (race.equals("Nekromant")) {
            Nekromant nekromant = new Nekromant(name, 130, 25, race);
        } else if (race.equals("Amazon")) {
            Amazon amazon = new Amazon(name, 100, 20, race);
        }
        else if(race.isEmpty()){
            throw new WrongRaceException();
        }
        else{
            throw new  WrongRaceException();
        }
    }

}
