package HeroClass;

import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

class Main {

    public static void main(String[] args) {
        List<MonsterClass> monsters = loadMonsters();
        HeroClass hero = getHeroes().get(HERO.WARRIOR.getName()).get();

        StartGame newGame = new StartGame(monsters, hero);

        GameMap testMap = new GameMap(newGame.getHero() , newGame.getMonsters());
        testMap.traverseMap();
    }

    private static List<MonsterClass> loadMonsters(){
        MonsterClass frank = new MonsterClass( "Monster " , 1000 , 1 , 100);
        MonsterClass bob = new MonsterClass( " Monster " , 1000 , 1 , 100);
        MonsterClass deep = new MonsterClass( "Monster " , 1000 , 1 , 100);
        return List.of(frank,bob,deep);
    }

    private static Map<String,Supplier<HeroClass>> getHeroes(){
        return Map.of(
                "Hero", () -> new HeroClass("Hero", "Warrior", 100, 1, 8, 1),
                "Magnus" ,() ->new HeroClass("Magnus", "Wizard", 50, 2, 8, 20),
                "Rock" ,() -> new HeroClass( "Rock " , "Barbarian " , 45 , 20 , 20 ,20)
        );
    }

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




}



