package eighth;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

public class HighestRepeatingWord {

	public static void CheckWord(String word) throws FileNotFoundException,
	IOException{
        FileReader f=new FileReader("File");
		BufferedReader b=new BufferedReader(f);
        ArrayList <String> words=new ArrayList<String>();
        String line, maxword="";
        while((line=b.readLine())!=null)
			{
			    String s[]=line.split(" ");
			    for(String t:s) words.add(t);   
			}
		int max=0;
        for(int i=0;i<words.size();i++)
        {
            int count=1;
            for(int j=i+1;j<words.size();j++)
            {
                if(words.get(i).equals(words.get(j))) count++;
            }
            if(count>max)
            {
                max=count;
                maxword=words.get(i);
            }
        }
        System.out.println("The highest occuring word is: "
        		+ ""+maxword+". It occured "+max+" times.");
	}
//	public static Map<String, Integer> buildWordMap(String fileName) {
//        // Using diamond operator for clean code
//        Map<String, Integer> wordMap = new HashMap<>();
//        // Using try-with-resource statement for automatic resource management
//        try (FileInputStream fis = new FileInputStream(fileName);
//                DataInputStream dis = new DataInputStream(fis);
//                BufferedReader br = new BufferedReader(
//                                     new InputStreamReader(dis))) {
//            // words are separated by whitespace
//            Pattern pattern = Pattern.compile("\\s+");
//            String line = null;
//            while ((line = br.readLine()) != null) {
//                // do this if case sensitivity is not required i.e. Java = java
//                line = line.toLowerCase();
//                String[] words = pattern.split(line);
//                for (String word : words) {
//                    if (wordMap.containsKey(word)) {
//                        wordMap.put(word, (wordMap.get(word) + 1));
//                    } else {
//                        wordMap.put(word, 1);
//                    }
//                }
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return wordMap;
//    }
//
//    public static List<Entry<String, Integer>> sortByValueInDecreasingOrder(
//                                 Map<String, Integer> wordMap) {
//        Set.en<Entry<String, Integer>> entries = wordMap.entrySet();
//        List<Entry<String, Integer>> list = new ArrayList<>(entries);
//        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
//            
//            public int compare(Map.Entry<String, Integer> o1, 
//                               Map.Entry<String, Integer> o2) {
//                return (o2.getValue()).compareTo(o1.getValue());
//            }
//        });
//        return list;
//    }
}