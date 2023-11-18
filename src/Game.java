import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Game {
    Queue<Monster> monster = new LinkedList<>();
    private Character hero;


    public void createHero(String name, String race) throws WrongRaceException{
        if(race.equals("Paladin")){
            this.hero = new Paladin(name, 150, 25, race);
        } else if (race.equals("Witcher")) {
            this.hero = new Wicher(name, 120, 30, race);
        } else if (race.equals("Varvar")) {
            this.hero = new Varvar(name, 180, 35, race);
        } else if (race.equals("Nekromant")) {
            this.hero = new Nekromant(name, 130, 25, race);
        } else if (race.equals("Amazon")) {
            this.hero = new Amazon(name, 100, 20, race);
        }
        else if(race.isEmpty()){
            throw new WrongRaceException();
        }
        else{
            throw new  WrongRaceException();
        }
        System.out.println(this.hero.getPower());
    }

    public void addMonster(String monster) throws WrongRaceException{
        if(monster.equals("FallenShaman")){
            this.monster.add(new FallenShaman("FallenShaman", 40, 26, "FallenShaman"));
        }
        else if(monster.equals("SkeletonKing")){
            this.monster.add(new SkeletonKing("SkeletonKing", 50, 40, "SkeletonKing"));
        }
        else if(monster.equals("Butcher")){
            this.monster.add(new Butcher("Butcher", 60, 32, "Butcher"));
        }
        else if(monster.isEmpty()){
            throw new WrongRaceException();
        }
        else{
            throw new WrongRaceException();
        }
    }


}
