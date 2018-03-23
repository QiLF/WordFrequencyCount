package WordFrequencyCount;

import java.io.File;
import java.util.Scanner;

public class ImportFiles {
    public static void main(String[] args){
        //通过命令行传参,检测是否有文件输入
        if(args.length == 0){
            System.out.println("ERROR:No Files");
            System.exit(0);
        }
        File file = new File(args[0]);
    }

    public static void LoadOneFile(String fileName[])throws Exception{
        int length = fileName.length;
        for(int i=0;i<length;i++)
        {
            File file = new File(fileName[i]);
            Scanner fileScanner = new Scanner(file);
        }
    }
}
