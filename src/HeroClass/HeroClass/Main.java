package HeroClass;

import java.util.List;
import static HeroClass.StartGame.getHeroes;
import static HeroClass.StartGame.loadMonsters;

// entry of program where we beg
class Main {

    public static void main(String[] args) {

        List<MonsterClass> monsters = loadMonsters();
        HeroClass hero = getHeroes().get(StartGame.HERO.WARRIOR.getName()).get();
        StartGame newGame = new StartGame(monsters, hero);

        // Create a game map and start traversing it
        GameMap activeMap = new GameMap(newGame.getHero(), newGame.getMonsters());

        System.out.println("The game has begun");
        System.out.println("Use WASD to move your Hero");
        System.out.println("Then press ENTER to input it");

        activeMap.traverseMap();


    }
}



