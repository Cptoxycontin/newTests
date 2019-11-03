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
    int coal;
    
    players(){
        this.health = 25;
        this.wood = 10;
        this.coal = 10;
    }
    
    public void getHealth(){
        System.out.println("Health =" + this.health);
    }
}
