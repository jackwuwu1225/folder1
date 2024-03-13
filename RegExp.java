import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class RegMethod{
    
    //判斷是否回文
    public void palinCheck(String str){
        str = str.toLowerCase();
        StringBuffer stringbuffer = new StringBuffer(str);
        stringbuffer.reverse();  //翻轉字串作為對比
        String comString = stringbuffer.toString();
        if(str.equals(comString)) System.out.print("Y,");
        else System.out.print("N,");
    }

    //找尋是否包含str1字串
    public void Str1Check(String str1, String arg1){
        str1 = str1.toLowerCase(); arg1 = arg1.toLowerCase();
        int IndexCheck = str1.indexOf(arg1);
        if(IndexCheck != -1) System.out.print("Y,");  //indexOf找不到會回傳-1找到會傳字串長度
        else System.out.print("N,");
    }

    //選找str2字串是否出現n次以上
    public void Str2Check(String str2, String arg2, int arg3){
        str2 = str2.toLowerCase(); arg2 = arg2.toLowerCase();
        int count = 0, index = 0;  //count記次數，index記是否有找到
        int FinalPosition = 0;  //記字串尾端位置
        while((index = str2.indexOf(arg2, FinalPosition)) != -1){
            count++;
            FinalPosition = index + arg2.length();
        }
        if(count >= arg3) System.out.print("Y,");
        else System.out.print("N,");
    }

    //是否有出現amXb2m字串
    public void RepeatCheck(String str){
        str = str.toLowerCase();
        int Start = 0, index = 0;  //start起始位置，index判斷是否找到
        if(str.indexOf('a') == -1) System.out.print("N");
        else{
            Start = str.indexOf('a');
            if((index = str.indexOf("bb", Start)) == -1) System.out.print("N");
            else System.out.print("Y");
        }
    }
}

public class RegExp {
    
    public static void main(String[] args) {
        String str1 = args[1];
        String str2 = args[2];
        int s2Count = Integer.parseInt(args[3]);

        //檢查字串讀取的正確性
        // System.out.println("The input file:"+args[0]);
        // System.out.println("str1="+str1);
        // System.out.println("str2="+str2);
        // System.out.println("num of repeated requests of str2 = "+s2Count);

        try {
            BufferedReader reader = new BufferedReader(new FileReader(args[0]));
            String line;
            RegMethod func = new RegMethod();
            while ((line = reader.readLine()) != null) {
                if(!line.isEmpty()){  //檢查是否為空字串
                    func.palinCheck(line);
                    func.Str1Check(line, str1);
                    func.Str2Check(line, str2, s2Count);
                    func.RepeatCheck(line);
                }
                else System.out.print("Y,N,N,N");

                System.out.println();
            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}