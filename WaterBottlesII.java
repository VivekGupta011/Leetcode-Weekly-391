class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int res = numBottles;
        int empty = res;

        while (empty >= numExchange) {
            res += 1;
            empty -= numExchange;
            empty += 1;
            numExchange += 1;
        }

        return res;
    }
}
