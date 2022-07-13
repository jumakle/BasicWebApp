package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

@Service
public class QueryProcessor {

    public String process(String query) {
		query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
           return "julian";
        } else if (query.contains("plus")){
            //query = "what is 9 plus 3"
            String[] wordList = query.split(" ");
            int sum = 0;
            for (String word : wordList){
                try{
                    int intOfWord = Integer.parseInt(word);
                    sum += intOfWord;
                }catch (Exception e){

                }

            }
           return String.valueOf(sum);
        } else { // TODO extend the programm here
            return "";

        }
        //hello world again
        //Integer.parseInt("myString 2")
        //String nine = query.substring(8, 1);
        //String three = query.substring(13, 1);
        //int result = Integer.parseInt(nine);
        //return String.valueOf(result);
    }
}
