public class Day6 {

    public String firstHalf(String str) {
        int halfLength = str.length() / 2;
              return str.substring(0, halfLength);
       }
       
       public String withoutEnd(String str) {
  
        if (str.length() < 2) {
             return "";
         }
 
         return str.substring(1, str.length() - 1);
 }

 public String comboString(String a, String b) {
    if (a.length() > b.length()){
      
      return b + a + b;
    
   } else{
      
      return a + b +a;
    
    }
  }

  public String nonStart(String a, String b) {
    if (a.length() > 0 && b.length( )>0 ){
      
             String baru = a.substring(1) + b.substring(1);
             
             return baru;
        
    }
    
  
    return " ";
  }

  public  String left2(String str) {
  
  
    if (str.length() <= 2) {
           return str;
       }
       return str.substring(2) + str.substring(0, 2);
}

public String right2(String str) {
  
    if (str.length() <= 2) {
             return str;
         }
         
         
         String test1 = str.substring(str.length() - 2);
         
         
         String test2 = str.substring(0, str.length() - 2);
         
     
         return test1 + test2;
 }

 public String theEnd(String str, boolean front) {
    if (front) {
       return str.substring(0, 1);
   } else {
       return str.substring(str.length() - 1);
   }
}


public String repeatSeparator(String word, String sep, int count) {
     
    if (count <= 0) {
       return "";
   } else if (count == 1) {
       return word;
   } else {
       StringBuilder result = new StringBuilder();
       for (int i = 0; i < count - 1; i++) {
           result.append(word).append(sep);
       }
       result.append(word);
       return result.toString();
   }
}

public int countTriple(String str) {
    int count = 0;
    for (int i = 0; i < str.length() - 2; i++) {
        char currentChar = str.charAt(i);
        if (str.charAt(i + 1) == currentChar && str.charAt(i + 2) == currentChar) {
            count++;
        }
    }
    return count;
}


public int countYZ(String str) {
    int count = 0;
    str = str.toLowerCase();

    for (int i = 0; i < str.length(); i++) {
        if ((str.charAt(i) == 'y' || str.charAt(i) == 'z') && (i == str.length() - 1 || !Character.isLetter(str.charAt(i + 1)))) {
            count++;
        }
    }

    return count;

}



public int maxBlock(String str) {
    int maxBlock = 0;
       int currentBlock = 1;  
       char prevChar = '\0';  

       for (char a : str.toCharArray()) {
           if (a == prevChar) {
               currentBlock++;  
           } else {
               prevChar = a;  
               currentBlock = 1;
           }
           maxBlock = Math.max(maxBlock, currentBlock);  
       }

       return maxBlock;
}




    public static void main(String[] args) {

        // String a ="hanif";
        // String b = " Ibrahim";


        // System.out.println(a.concat(b));

        
        // System.out.println(a.indexOf("hanif"));
    }
}
