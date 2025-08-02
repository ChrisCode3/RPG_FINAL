package HeroClass;


import java.util.ArrayList;
import java.util.List;

public class StartGame {

  private List<MonsterClass> monsters ;
  private HeroClass hero ;

  public StartGame(List<MonsterClass> monsters, HeroClass hero) {
        this.monsters = monsters;
        this.hero = hero;
  }

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
