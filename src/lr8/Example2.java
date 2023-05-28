package lr8;
import java.io.*;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;
public class Example2 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        BufferedReader br = null;
        String fname = "sc.nextLine()";
        File f1=new File(fname);
        f1.createNewFile();
        File f2=new File("file");
        f2.createNewFile();
        try {
            Writer bw = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream(f1), StandardCharsets.UTF_8));
            String s;
            for (int i = 0; i < 3; i++){
                s = (i+1) + "-ая строчка \n";
                bw.write(s);
            }
            Double[] doubles  = new Double[] {12.46,444.44, -335.4335,-1135.4,452.0};
            for (int i = 0; i < doubles.length; i ++){
                Double d = doubles[i];
                String q = d.toString() + " ";
                bw.write(q);
            }
            bw.flush();
            bw.close();
            br = new BufferedReader(new InputStreamReader(new FileInputStream(f1),"UTF-8"));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(f2)));
            for (int i = 0; i < 4; i++){
                s = br.readLine();
                if (i == 1) {
                    writer.write(s + "\n");
                }
                if (i == 3){

                    String[] items;
                    items= s.split(" ");

                    for(int j = 0; j < items.length; j++){
                        System.out.println(Double.parseDouble(items[j]));
                        try{

                            if (Double.parseDouble(items[j]) > 0){
                                double z = Double.parseDouble(items[j]);
                                String x = Double.toString(z) + " ";
                                writer.write(x);
                            }
                            writer.flush();
                        }catch (NumberFormatException nfe) {
                            System.out.println("Ошибка v arr");
                        }

                    }

                }
            }

        }catch (Exception e){
            System.out.println("Ошибка !!!!!!!!");
        }

    }
}