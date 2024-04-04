class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
         int totalBottles = numBottles;

        while (numBottles >= numExchange) {
           numBottles -= numExchange;
           numExchange++;
           totalBottles++;
           numBottles++;
        }

        return totalBottles;
    }
}