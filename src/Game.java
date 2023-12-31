public class Game {
    public static void main(String[] args) {
        /*Player player = new Player();

        player.username = "Helena";
        player.health = 20;
        player.weapon = "sword";

        int damage = 10;
        player.loosHealth(damage);
        System.out.println("Remaining health: " + player.healthRemaining());
        player.health = 200;
        player.loosHealth(11);
        System.out.println("Remaining health: " + player.healthRemaining());*/

        EnhancedPlayer player = new EnhancedPlayer("Helena", 500, "Sword");
        System.out.println(player.healthRemaining());
        player.loosHealth(50);
        System.out.println(player.healthRemaining());
        player.restoreHealth(50);
        player.loosHealth(100);
        System.out.println(player.healthRemaining());

    }
}
