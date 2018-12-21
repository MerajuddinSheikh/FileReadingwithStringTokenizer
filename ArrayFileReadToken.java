package ArrayFileRead;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class ArrayFileReadToken {
    public static void main(String[] args)throws Exception{
        ArrayList <String>words= new  ArrayList<String>();
        try{
        FileReader fr = new FileReader("h:\\filek.csv");
        BufferedReader br = new BufferedReader(fr);
        String Lines= br.readLine();
        String lines= " ";
        while (Lines !=null){
             //lines += Lines + " \n";
            words.add(Lines);

            Lines=br.readLine();

        }
        br.close();
        fr.close();
            System.out.println(words.size());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

                 String name=" "; int rollno=0; int age=0;
                 int count=0;
              for(String wk : words){

                  StringTokenizer sz =new StringTokenizer(wk,",");

               //   System.out.println(sz.countTokens());

                   count =1;
                  while(sz.hasMoreElements()){

                      String token1=sz.nextToken();

                     // System.out.println(token1);
                      switch (count) {
                         case 1: {
                               rollno = Integer.parseInt(token1); // first token is rollno
                              break;
                          }
                          case 2: {
                               name = token1; // second token is name
                              break;
                          }
                          case 3: {
                               age = Integer.parseInt(token1); // third token is age
                              break;
                          }
                      }
                      count++;
                  } // while loop ends here

                 System.out.println("the name of the students are " + name);
                  System.out.println(" and age of the students are :" + age );
              } // for loop ends here



    }

        }




















