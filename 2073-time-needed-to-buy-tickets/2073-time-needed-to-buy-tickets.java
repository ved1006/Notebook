import java.io.*;
class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        //brute 
        /*
class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int time = 0;
        while(tickets[k] != 0) {
            for(int i=0;i<tickets.length;i++) {
                
                if(tickets[i] > 0 && tickets[k] > 0) {
                    tickets[i] --;
                    time++;
                }
            }
        }
        return time;*/
        

        int time = 0;
        for(int i=0;i<tickets.length;i++){
            if(i<=k) {
                time += Math.min(tickets[i], tickets[k]);
            } else {
                time+= Math.min(tickets[i],tickets[k]-1);
            }
        }
        return time;
    }
}