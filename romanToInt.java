class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> roman = new HashMap<Character, Integer>();
        
        roman.put('I', new valueOf(1));
        roman.put('V', new valueOf(5));
        roman.put('X', new valueOf(10));
        roman.put('L', new valueOf(50));
        roman.put('C', new valueOf(100));
        roman.put('D', new ValueOf(500));
        roman.put('M', new ValueOf(1000));
        
        int result = 0;
        for(int i = 0; i < s.length(); i++){
         char ltr = s.charAt(i);
         if(i > 0 && roman.get(ltr) > roman.get(s.charAt(i-1))){
             result += roman.get(ltr) - 2*roman.get(s.charAt(i-1));
            }
            else{
                result += roman.get(ltr);
            }  
        }
        return result;
    }
                  
}
    