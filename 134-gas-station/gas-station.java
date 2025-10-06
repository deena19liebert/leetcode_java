class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0;
        int totalCost = 0;
    
        //calculate total gas and total cose
        for(int i=0; i < gas.length; i++){
            totalGas += gas[i];
            totalCost += cost[i];
        }
        //if total Cas is less than total Cost, return -1
        if (totalGas < totalCost) return -1;
        
        int currentGas = 0, startIndex = 0;
        
        //iterate through the gas stations
        for(int i=0; i < gas.length; i++){
            currentGas += gas[i] - cost[i];

            //if current gas is negative, reset start index and current gas
            if (currentGas < 0) {
                startIndex = i + 1;
                currentGas = 0;
            }
        }

    return startIndex;

    }
}