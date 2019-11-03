/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newguiconcept;

/**
 *
 * @author Tanner
 */
public class players {

    int health;
    int wood;
    int food;

    players() {
        this.health = 25;
        this.wood = 10;
        this.food = 10;
    }

    public void getHealth() {
        System.out.println("Health = " + this.health);
    }

    public void getWood() {
        System.out.println("Wood = " + this.wood);
    }

    public void getFood() {
        System.out.println("Food = " + this.food);
    }

    public int forageWood() {
        this.wood += 5;
        getWood();
        return (this.wood);
    }

    public int huntFood() {
        this.food += 10;
        getFood();
        return (this.food);
    }

}
