class Solution {
    private boolean hasEvenDigits(int num){
        int digitCount = 0;
        while(num > 0){
            digitCount++;
            num/=10;
        }
        return (digitCount & 1) == 0;
    }

    public int findNumbers(int[] nums) {
        int evenDigit = 0;
        
        for(int num: nums){
            if(hasEvenDigits(num) == true){
                evenDigit++;
            }
        } 
        return(evenDigit);
    }    
}