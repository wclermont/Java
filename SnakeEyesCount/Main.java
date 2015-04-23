/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakeeyescount;

/**
 *
 * @author PC
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int die1;
        int die2;
        int countSnakeEyes;
        die1 = (int)(Math.random()*6)+1;
        die2 = (int)(Math.random()*6)+1;
        countSnakeEyes = 1;
        while (die1 != 1 || die2 != 1){
            TextIO.putln("Count is: "+countSnakeEyes+" | Die1:"+die1+" | Die2:" + die2);
            die1 = (int)(Math.random()*6)+1;
            die2 = (int)(Math.random()*6)+1;
            countSnakeEyes++;
        }
        if (die1 == 1 && die2 == 1) {
            TextIO.putln("Count is: "+countSnakeEyes+" | Die1:"+die1+" | Die2:"+die2+". And we have success!");
            TextIO.putln("Snake Eyes after "+countSnakeEyes+" rolls of the dice.");
        }
        
    }
    
}
