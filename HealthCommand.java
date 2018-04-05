/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GroupBork;

/**
 *
 * @author Matt
 */
public class HealthCommand extends Command{
    /**
     * 
     */
    private int healthCommand;
    /**
     * 
     */
    private String displayCommand;
    HealthCommand(int healthCommand) {
        this.healthCommand = healthCommand;
    }
    /**
     * 
     * @return String
     */

    public String execute() {
        if(healthCommand==0){
            displayCommand="You are dead";
        }
        if(healthCommand>=1 && healthCommand<=3){
            displayCommand="You are on the brink of death";
        }
        if(healthCommand>=4 && healthCommand<=6){
            displayCommand="You are on starting to fatigue";
        }
        if(healthCommand>=7 && healthCommand<=9){
            displayCommand="You feel good";
        }
        else{displayCommand="You have perfect health";}
        return "Your health is currently: " + healthCommand + "\".\n + displayCommand";
    }
}
