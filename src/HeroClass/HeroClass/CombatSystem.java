package HeroClass;

import java.util.List;

public class CombatSystem {

    private final HeroClass player;
    private final List<MonsterClass> manyEnemy;

    public CombatSystem(HeroClass player, List<MonsterClass> manyEnemy) {
        this.player = player;
        this.manyEnemy = manyEnemy;
    }

    // this code is the combat system of the game
    // is calls the  attacks from player and the monster and subtracts them from their life total until someone hp is 0

    public void Combat() {
        MonsterClass enemy = manyEnemy.get(0);
        System.out.println("Your hp is : " + player.hp);

        System.out.println("The monsters hp  " + enemy.hp);

        while (player.hp > 0 && enemy.hp > 0) {

            System.out.println("   ");
            player.hp = (int) (player.hp - enemy.getRandomAttack());
            System.out.println( "You have " + player.hp + " life left");
            enemy.hp = (int) (enemy.hp - player.getAttack());
            System.out.println( " The monster has " + enemy.getHp() + " life left");
            if ( player.hp < 0 ) {
                System.out.println(" you are dead");
            } if ( enemy.hp < 0 ) {
                System.out.println(" You have beat the monster");
            }

        }
    }
}
