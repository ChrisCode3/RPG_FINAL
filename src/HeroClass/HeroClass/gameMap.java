package HeroClass;


import java.util.*;



public class gameMap {

    private HeroClass player;
    private ArrayList<MonsterClass> manyEnemy;

    int enemyRow = 0;

    int enemyColumn = 0;


    int row = 4;
    int column = 4;
    int startingLocation = 3;


    // Directions

    final int Up_Key_W = -1; // y axis
    final int Down_Key_S = +1; // y axis
    final int Right_Key_D = +1;// x axis
    final int Left_Key_A = -1; // x axis

    public gameMap(HeroClass player, ArrayList<MonsterClass> manyEnemy) {

        this.player = player;

        this.manyEnemy = manyEnemy;

        MonsterClass enemy = manyEnemy.get(0);


    }



    public static int DirectionY(int a) {
        // Example: return 0 = up, 1 = down, 2 = left, 3 = right

        return a; // Invalid input
    }


    public static int DirectionX(int a) {
        // Example: return 0 = up, 1 = down, 2 = left, 3 = right

        return a; // Invalid input
    }


    public void traverseMap() {







        MonsterClass enemy = manyEnemy.get(0);

        CombatSystem encounter  = new CombatSystem( player ,manyEnemy);



        GameEntity[][] myMap = new GameEntity[row][column];

        myMap[0][0] = player;

     //   myMap[2][0] = enemy;


        for (int l = 0; l < myMap.length; l++) {

            System.out.println(Arrays.toString(myMap[l]));


        }


        Random random = new Random();

        do {

            enemyRow = random.nextInt(4);
            enemyColumn = random.nextInt(4);

        } while (enemyRow == 0 && enemyColumn == 0);


        row = 0;

        column = 0;

        int[] enemyLocation= new int[]{enemyRow, enemyColumn};


        for (int i = 0; i < 100; i++) {



            Scanner myObj = new Scanner(System.in);  // Create a Scanner object
            System.out.println(" Move your character");

            String userName = myObj.nextLine();  // Read user input



            if (Objects.equals(userName, "s")) {
               row  = row  + DirectionY(Down_Key_S);
                myMap[row][column] = this.player;
               myMap[row - 1][column] = null;
/*
            } else if (userName.equals("w") && row != 0) {

                myMap[row + DirectionX(zeroMovement)][column + DirectionY(Up_Key_W)] = startingLocation;

            }*/
            }
            if (Objects.equals(userName, "w")) {

               row= row  +DirectionY(Up_Key_W);
                myMap[row][column] = this.player;
                myMap[row +1 ][column] = null;

            }


            if (Objects.equals(userName, "d") )  {

                column = column +DirectionX(Right_Key_D);

                System.out.println( " the row when  d IS pressed is : " + row);
                myMap[row][column] = this.player;
                myMap[row][column - 1] = null;

            }   if (Objects.equals(userName, "a"))  {

                column = column +DirectionX(Left_Key_A);
                myMap[row][column] = this.player;
                 myMap[row][column + 1] = null;

            }






            for (int l = 0; l < myMap.length; l++) {

                System.out.println(Arrays.toString(myMap[l]));


            }

            if (myMap[row][column] == myMap[enemyLocation[0]][enemyLocation[1]]) {
                System.out.println( " there is a monster here");

                encounter.Combat();
            }



        }




    }



     /*   System.out.println("enemyRow: "+enemyRow);
        System.out.println("enemyColumn: "+enemyColumn);*/


    public static int[] enemyLocation(int enemyRow, int enemyColumn) {

        int[] enemyLocation = new int[]{enemyRow, enemyColumn};

        System.out.println(Arrays.toString(enemyLocation));

        return enemyLocation;
    }







}