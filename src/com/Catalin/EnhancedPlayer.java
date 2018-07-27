package com.Catalin;

public class EnhancedPlayer {
    private String name;
    private int hitpoints = 100;
    /** The name of the health field was changed to hitpoints (right click, refactor, rename) and this does not affect
     * in any way, the code used in the Main class. Because we are not directly using the field name, but instead we
     * are using the getter method, that still has the name we initially set.
     * We don't need to know what the name of this field is, or what the name was, because we are not directly interacting
     * with it.
     */
    //default hitpoints value was set here.
    private String weapon;
    /** All of the fields are now private and they can't be directly accessed from outside this class.
     * They can only be used with the help of getters and they can be modified only if setters were defined.
     */

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;

        if(health > 0 && health <= 100){
            this.hitpoints = health;
            /** Now we can set a validation here, to only assign the value of hitpoints to the hitpoints field if the
             * conditions are met. Since the fields are now private, this method can not be bypassed in the Main class.
             */
        }
        this.weapon = weapon;
    }
    public void loseHealth(int damage){
        this.hitpoints = this.hitpoints - damage;
        if(this.hitpoints <= 0){
            System.out.println("Player knocked out");
        }
    }

    public int getHealth() {
        return hitpoints;
    }
    /** Getter for hitpoints.
     */
}
