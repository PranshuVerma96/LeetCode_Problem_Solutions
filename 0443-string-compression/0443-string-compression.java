class Solution {
    public int compress(char[] chars) {
        int readIndex =0;
        int writeIndex =0;

        // first loop for check data 

        while(readIndex < chars.length){
            char curentChar = chars[readIndex];
            int count =0;
        
        // check loop me duplicate 
            while(readIndex < chars.length && curentChar == chars[readIndex]){
                readIndex++;
                count++;
            }
            // ab mare pass current char and uska count dono he
            chars[writeIndex] = curentChar;
            writeIndex++;

            // now insert the count 

            if(count >1){
                  String countStr = String.valueOf(count);
                for(char digit : countStr.toCharArray()){
                    chars[writeIndex] = digit;
                    writeIndex++;

                }
            } 
        }

        return writeIndex;
        
    }
}