public class Player {
    public String username;
    public int health;
    public String weapon;

    public void loosHealth(int damage) {
        health = health - damage;
        if (health <= 0) {
            System.out.println("Game over, you died!");
        }
    }

    public int healthRemaining() {
        return health;
    }

    public void restoreHealth(int extraHealth) {
        health = health + extraHealth;
        if (health > 100) {
            System.out.println("Player restored to 100%");
            health = 100;
        }
    }
}
