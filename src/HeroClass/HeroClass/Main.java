package HeroClass;

class Main {

    static void warScream () {

        System.out.println(" For the empreszxsssror ");

    }


    public static void main(String[] args) {

        HeroClass Warrior = new HeroClass("Hero", "Warrior", 9999, 1, 8, 1);
        
        HeroClass Wizard = new HeroClass("Magnus", "Wizard", 50, 2, 8, 20);

        HeroClass Barbarian = new HeroClass( " Rock " , "Barbarian " , 45 , 20 , 20 , 5 );

        MonsterClass Frank = new MonsterClass( "Monster " , 1000 , 1 , 100);

        MonsterClass Bob = new MonsterClass( " Monster " , 1000 , 1 , 100);

        MonsterClass Deep = new MonsterClass( "Monster " , 1000 , 1 , 100);

        StartGame newGame = new StartGame();

        newGame.monsters.add(Frank);

        newGame.monsters.add(Bob);

        newGame.monsters.add(Deep);

        newGame.classes.add(Warrior);

        newGame.monsters.add(Frank);

        gameMap testMap = new gameMap(Warrior , newGame.monsters);

        testMap.traverseMap();

    }
}



