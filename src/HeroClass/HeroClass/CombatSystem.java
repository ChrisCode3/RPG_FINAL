package HeroClass;

import java.util.List;

// this class is the combat system of the game
// is calls the  attacks from player and the monster and subtracts them from their life total until someone hp is 0
public class CombatSystem {

    private final HeroClass player;
    private final List<MonsterClass> manyEnemy;

    public CombatSystem(HeroClass player, List<MonsterClass> manyEnemy) {
        this.player = player;
        this.manyEnemy = manyEnemy;
    }


// combat starts from here
    public void Combat() {
        MonsterClass enemy = manyEnemy.get(0);
        System.out.println("Your hp is : " + player.hp);

        System.out.println("The monsters hp  " + enemy.hp);

        int combatRound = 1;

        System.out.println("   ");
        while (player.hp > 0 && enemy.hp > 0) {

            System.out.println("Round  :" + combatRound );
            System.out.println("Combat Starts" );
            System.out.println("   ");

            player.hp = (int) (player.hp - enemy.getRandomAttack());
            System.out.println( "You have " + player.hp + " hp left");
            if ( player.hp <= 0 ) {
                System.out.println("you are dead");
                System.out.println(" Game Over!!");
                break; // if the  player dies exit the loop
            } if ( enemy.hp < 0 ) {
                System.out.println(" You have beat the monster");

            }
            enemy.hp = (int) (enemy.hp - player.getAttack());
            System.out.println( " The monster has " + enemy.getHp() + " life left");

            combatRound = combatRound +1; // counter for the rounds of the game


        }
    }
}
