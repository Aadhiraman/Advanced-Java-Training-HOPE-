class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int emptyBottles = numBottles;
        int totalDrank = numBottles;

        while (emptyBottles >= numExchange) {
            int newFull = emptyBottles / numExchange;
            totalDrank += newFull;
            emptyBottles = newFull + (emptyBottles % numExchange);
        }

        return totalDrank;
    }
}