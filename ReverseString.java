import java.util.StringTokenizer;
class ReverseString{

public static void main(String[] args){
    String str= "I'm being interviewed by Amazon";
    System.out.println(reverseStr(str));
}

private static String reverseStr(String reverseMe){ 
    StringTokenizer st = new StringTokenizer(reverseMe); 
    int j=st.countTokens()  ; 
    String[] iamReversed = new String[j];
     while(st.hasMoreElements()){
        iamReversed[--j] = st.nextElement().toString()+" ";
      } 

      StringBuilder sb=new StringBuilder();
      for(String str: iamReversed){
          sb.append(str);
      }
      return sb.toString();
    }


}