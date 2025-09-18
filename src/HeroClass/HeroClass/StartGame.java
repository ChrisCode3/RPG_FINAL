package HeroClass;



import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

public class StartGame {
  private List<MonsterClass> monsters ;
  private HeroClass hero ;

  public StartGame(List<MonsterClass> monsters, HeroClass hero) {
        this.monsters = monsters;
        this.hero = hero;
  }


    //  Loads a list of predefined monsters for the game.
    static List<MonsterClass> loadMonsters(){
        MonsterClass frank = new MonsterClass( "Monster " , 1000 , 1 , 100);
        MonsterClass bob = new MonsterClass( " Monster " , 1000 , 1 , 100);
        MonsterClass deep = new MonsterClass( "Monster " , 1000 , 1 , 100);
        return List.of(frank,bob,deep);
    }


    // Defines a set of heroes using a Map where each entry maps a hero name to a supplier of a HeroClass.
// This allows easy selection and potential expansion of hero types.
    static Map<String, Supplier<HeroClass>> getHeroes(){
        return Map.of(
                "Hero", () -> new HeroClass("Hero", "Warrior", 100, 1, 8, 1),
                "Magnus" ,() ->new HeroClass("Magnus", "Wizard", 50, 2, 8, 20),
                "Rock" ,() -> new HeroClass( "Rock " , "Barbarian " , 45 , 20 , 20 ,20)
        );
    }
    // enum for hero selection
    enum HERO{
        WARRIOR("Hero"), WIZARD("Magnus"), BARBARIAN("Rock");
        private String name;
        HERO(String name) {
            this.name = name;
        }
        public String getName(){
            return name;
        }
    }




    // feature to inform how many monster there are left in the game
    public void printMonstersList() {
        int monstersAmount = 0;
        for (MonsterClass monster : monsters) {
            monstersAmount = monstersAmount +1;
            System.out.println("-----");
            System.out.println(" The name of the monster is " + monster.getName());
            System.out.println("Life is left:  " + monster.getHp());
            System.out.println("-----");
            System.out.println("There are " + monstersAmount + " Monster left in the game");
        }
    }
    // features to remove monsters from he game
    public void removeMonster(MonsterClass monster) {
        monsters.remove(monster);
    }
    public List<MonsterClass> getMonsters() {
        return monsters;
    }
    public HeroClass getHero() {
        return hero;
    }



}





