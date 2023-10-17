public class EnhancedPlayer {
    public String username;
    public int healthPercentage;
    public String weapon;

    public EnhancedPlayer(String username) {
        this(username, 100, "Sword");
    }

    public EnhancedPlayer(String username, int healthPercentage, String weapon) {
        this.username = username;
        this.healthPercentage = healthPercentage;
        this.weapon = weapon;
    }

    public int healthRemaining() {
        return healthPercentage;
    }

    public void restoreHealth(int extraHealth) {
        healthPercentage = healthPercentage + extraHealth;
        if (healthPercentage >= 100) {
            System.out.println("Player restored to 100%");
            healthPercentage = 100;
        }
    }
}
