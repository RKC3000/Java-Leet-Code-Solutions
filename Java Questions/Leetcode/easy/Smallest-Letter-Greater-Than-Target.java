// Add the solution for this question
// https://leetcode.com/problems/find-smallest-letter-greater-than-target/
class Solution{
public char nextGreatestLetter(char[] letters, char target) {
        
        int start = 0;
        int end = letters.length-1;
        
	
        if(target >= letters[letters.length-1]){
            return letters[0];
        }
        
        while(start <= end){
            
            int mid = start + (end-start)/2;
            
            if(target >= letters[mid]){
                start = mid+1;
            }
            else if(target < letters[mid]){
                end = mid-1;
            }
        }
        
	
        return letters[start];
    }}
