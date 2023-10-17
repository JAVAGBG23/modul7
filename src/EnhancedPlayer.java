public class EnhancedPlayer {
    public String username;
    public int healthPercentage;
    public String weapon;

    public EnhancedPlayer(String username) {
        this(username, 100, "Sword");
    }

    public EnhancedPlayer(String username, int health, String weapon) {
        this.username = username;
       if (health <= 0) {
           this.healthPercentage = 100;
       } else if (health > 100) {
           this.healthPercentage = 100;
       } else {
           this.healthPercentage = health;
       }
        this.weapon = weapon;
    }

    public int healthRemaining() {
        return healthPercentage;
    }

    public void loosHealth(int damage) {
        healthPercentage = healthPercentage - damage;
        if (healthPercentage <= 0) {
            System.out.println("Game over, you died!");
        }
    }

    public void restoreHealth(int extraHealth) {
        healthPercentage = healthPercentage + extraHealth;
        if (healthPercentage >= 100) {
            System.out.println("Player restored to 100%");
            healthPercentage = 100;
        }
    }
}
