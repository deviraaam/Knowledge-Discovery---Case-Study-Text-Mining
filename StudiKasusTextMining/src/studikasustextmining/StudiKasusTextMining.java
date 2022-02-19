/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studikasustextmining;
import ALI.*;
import java.util.Map;
/**
 *
 * @author user
 */
public class StudiKasusTextMining {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         VectorLib vlib = new VectorLib();
        TextMiningLib tmlib = new TextMiningLib();
        
        String dir="C:\\Users\\user\\Documents\\NetBeansProjects\\NNXOR\\build\\classes\\nnxor\\berita/";       
        String[] docs = {"data1.txt","data2.txt","data3.txt","data4.txt","data5.txt"
                        ,"data6.txt","data7.txt","data8.txt","data9.txt","data10.txt"
                        ,"data11.txt","data12.txt","data13.txt","data14.txt","data15.txt"
                        ,"data16.txt","data17.txt","data18.txt","data19.txt","data20.txt"
                        ,"data21.txt","data22.txt","data23.txt","data24.txt","data25.txt"
                        ,"data26.txt","data27.txt","data28.txt","data29.txt","data30.txt"
                        ,"data31.txt","data32.txt","data33.txt","data34.txt","data35.txt"
                        ,"data36.txt","data37.txt","data38.txt","data39.txt","data40.txt"
                        ,"data41.txt","data42.txt","data43.txt","data44.txt","data45.txt"
                        ,"data46.txt","data47.txt","data48.txt","data49.txt","data50.txt"};
        int n_docs=docs.length;
        String text;
        String[] words, keywords;
        Map[] map=new Map[n_docs];
        String query;
        String[] querylist;
        Map results;
        
        for (int i = 0; i < n_docs; i++) {
            text = tmlib.readFile(dir+docs[i]);
            words = tmlib.Tokenizing(text);
            words = tmlib.Filtering(words);
            keywords = tmlib.StemmingTagging(words);
            map[i] = tmlib.Scoring(words,0.5);
        }
    }
    
}
