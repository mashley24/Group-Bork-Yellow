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
public class ScoreCommand extends Command{

    /**
     *
     */
    private int scoreCommand;

    /**
     *
     */
    private String displayCommand;
    ScoreCommand(int scoreCommand) {
        this.scoreCommand = scoreCommand;
    }
    /**
     * @return String
    */
    public String execute() {
        if(scoreCommand>=0 && scoreCommand<=2){
            displayCommand="You are a novice.";
        }
        if(scoreCommand>=3 && scoreCommand<=4){
            displayCommand="You are an apprentice";
        }
        if(scoreCommand>=5 && scoreCommand<=6){
            displayCommand="You are an adept";
        }
        if(scoreCommand>=7 && scoreCommand<=8){
            displayCommand="You are an expert";
        }
        if(scoreCommand>=9 && scoreCommand<=10){
            displayCommand="You are a master";
        }
        return "Your score is currently: " + scoreCommand + "\".\n + displayCommand";
    }
}
