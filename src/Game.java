import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Game {
    private final Queue<Monster> monster = new LinkedList<>();
    private Character hero;


    public void createHero(String name, String race) throws WrongRaceException{
        if(race.equals("Paladin")){
            this.hero = new Paladin(name, 150, 25, race, 1, 0);
        } else if (race.equals("Witcher")) {
            this.hero = new Wicher(name, 120, 30, race, 1, 0);
        } else if (race.equals("Varvar")) {
            this.hero = new Varvar(name, 180, 35, race, 1, 0);
        } else if (race.equals("Nekromant")) {
            this.hero = new Nekromant(name, 130, 25, race, 1, 0);
        } else if (race.equals("Amazon")) {
            this.hero = new Amazon(name, 100, 20, race, 1, 0);
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
            this.monster.add(new FallenShaman("Shaman", 60, 29, "FallenShaman"));
        }
        else if(monster.equals("SkeletonKing")){
            this.monster.add(new SkeletonKing("King", 55, 35, "SkeletonKing"));
        }
        else if(monster.equals("Butcher")){
            this.monster.add(new Butcher("Butcher", 65, 32, "Butcher"));
        }
        else if(monster.isEmpty()){
            throw new WrongRaceException();
        }
        else{
            throw new WrongRaceException();
        }
    }

    public void startBattle() throws WrongNameException, InterruptedException {
        int numberOfMonsters = monster.size();
        if(!this.monster.isEmpty()){
            for(int i=0; i<numberOfMonsters; i++){
                Monster mons = this.monster.poll();
                System.out.println(mons.getName());
                if(hero.getHealth() <= 0){
                    break;
                }
                while (mons.getHealth() >= 0 && hero.getHealth() > 0) {
                    mons.takeDamage(hero.getPower());
                    if (mons.getHealth() == 0) {
                        // da ne nadvishava max zhivota na geroq
                        hero.heal(hero, 15);
                        Thread.sleep(5000);
                        if(monster.isEmpty()){
                            break;
                        }
                        System.out.println("Hero is ready for next battle!");
                        System.out.println(hero.getHealth());
                        break;
                    }
                    hero.defend(mons.getPower());
                }
            }
            if(hero.getHealth() == 0){
                System.out.println("Your hero is dead! Game over!");
            }
            else{
                System.out.println("Your hero is a winner of the game! Congratulations!");
            }

        }

    }


}
