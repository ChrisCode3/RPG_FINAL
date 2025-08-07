package HeroClass;

import java.util.*;

public class GameMap {

    private HeroClass player;
    private List<MonsterClass> manyEnemy;
    int enemyRow = 0;
    int enemyColumn = 0;

    /// size of the map
    int row = 6;
    int column = 6;
    ///  ensuring the boundaries of the map
    int boundariesRow = row - 1;
    int boundariesColumn = column - 1;

    // Directions
    final int Up_Key_W = -1; // y axis
    final int Down_Key_S = +1; // y axis
    final int Right_Key_D = +1;// x axis
    final int Left_Key_A = -1; // x axis

    public GameMap(HeroClass player, List<MonsterClass> manyEnemy) {
        this.player = player;
        this.manyEnemy = manyEnemy;
   //     MonsterClass enemy = manyEnemy.get(0); this feature here is for in the implementation of many enemies
    }

    public static int DirectionY(int a) {return a;}
    public static int DirectionX(int a) {return a;}

    // method that shows the playable map
    // the hero is marked as H
    public static void printMap(GameEntity[][] map) {

        for (GameEntity[] gameEntities : map) {
            for (GameEntity gameEntity : gameEntities) {
                if (gameEntity == null) {
                    System.out.print(". "); // empty space
                } else if (gameEntity instanceof HeroClass) {
                    System.out.print("H "); // Hero marker
                } else {
                    System.out.print("? "); // unknown object
                }
            }
            System.out.println(); // new line after each row
        }
    }

    // The method which contains the logic for moving in the map and encountering enemies
    public void traverseMap() {
        CombatSystem encounter  = new CombatSystem( player ,manyEnemy);
        GameEntity[][] myMap = new GameEntity[row][column];
        myMap[0][0] = player;
        Random random = new Random();

        //  loop to create a random position for the monster which is not {0,0}
        do {
            enemyRow = random.nextInt(6);
            enemyColumn = random.nextInt(6);
        } while (enemyRow == 0 && enemyColumn == 0);

        row = 0;
        column = 0;
        int[] enemyLocation= new int[]{enemyRow, enemyColumn};
        Scanner myObj = new Scanner(System.in);


        // while the player has over zero life the game still runs.
        // movement is controlled via the wasd keys.
        // each time wasd is pressed the character moves 1 index in the direction inputted
            while ( player.getHp() > 0) {
                printMap(myMap);
            System.out.println(" Move your character");
            String userName = myObj.nextLine();

            if (Objects.equals(userName, "s") && row < boundariesRow) {
                row = row  + DirectionY(Down_Key_S);
                myMap[row][column] = this.player;
                myMap[row - 1][column] = null;
            }
            if (Objects.equals(userName, "w")  && row > 0 ) {
                row = row  +DirectionY(Up_Key_W);
                myMap[row][column] = this.player;
                myMap[row +1 ][column] = null;
            }
            if (Objects.equals(userName, "d") &&  column < boundariesColumn )  {
                column = column +DirectionX(Right_Key_D);
                myMap[row][column] = this.player;
                myMap[row][column - 1] = null;

            }   if (Objects.equals(userName, "a") && column > 0)  {
                column = column +DirectionX(Left_Key_A);
                myMap[row][column] = this.player;
                myMap[row][column + 1] = null;
            }

            // if the players position ends up in the position a monster is combat ensures
            if (myMap[row][column] == myMap[enemyLocation[0]][enemyLocation[1]]) {
                System.out.println( " there is a monster here");
                encounter.Combat();
            }
        }
    }
}