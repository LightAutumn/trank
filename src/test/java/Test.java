import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by yinyuxia on 2016/5/24.
 */
public class Test {
    public static void main(String[] args){
   String str="abc";
        StringBuffer buffer=new StringBuffer();
        for(int i=str.length()-1;i>=0;i-- ){
            buffer.append(str.charAt(i));
        }
        System.out.print(buffer);
    }
}
