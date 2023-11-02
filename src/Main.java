// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
            Paladin myPaladin = new Paladin("Bat Gergi", 100, 25, "Paladin");
            SkeletonKing SkeletonKing = new SkeletonKing("King", 80, 30, "Skeleton King");


            while (myPaladin.getHealth() != 0 && SkeletonKing.getHealth() != 0){
                System.out.println(myPaladin.defend(SkeletonKing.getPower()));
                System.out.println(SkeletonKing.defend(myPaladin.getPower()));
            }


            if(myPaladin.getHealth() == 0 && SkeletonKing.getHealth() == 0){
                System.out.println("No winner both are dead!");
            }
            if(myPaladin.getHealth() == 0){
                System.out.println(SkeletonKing.getName() + " is a winner!");
            }
            if(SkeletonKing.getHealth() == 0){
                System.out.println(myPaladin.getName() + " is a winner!");
            }
        }
    }