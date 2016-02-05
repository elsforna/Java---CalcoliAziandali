/*
Classe che permette di effettuare l'input da tastiera in modo molto easy u.u
Per ora ci sono i metodi:
    InputS (restituisce stringa)
    InputI (restituisce intero)
*/
package inserimentodatiaziendali;

import java.io.*;
import java.util.*;

public class EasyInput {
    public static String inputS(String arg){
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader tastiera = new BufferedReader(input);
        
        System.out.println(arg);
        try{
                String letto = tastiera.readLine();
                return letto;
                //System.out.println(letto);

            }
            catch(Exception e){
                System.out.println("ERRORE");
                return "";
            }
        
    }
    
    public static int inputI(String arg){
        String input = inputS(arg);
        int re = 0;
        try{
            re = Integer.parseInt(input);   
        }
        catch(Exception e){
            System.err.println("Error! Unparsable value");   
        }
        return re;
    }
    
    public static float inputF(String arg){
        String input = inputS(arg);
        float parse = 0;
        try{
            parse = Float.parseFloat(input);
        }
        catch (Exception e){
            System.err.println("Error! Unparsable value.");
        }
        return parse;
    }
    
    public static char inputC(String arg){   
        String input = inputS(arg);
        char reC = ' ';
        try
        {
            reC = input.charAt(0);
        }
        catch(Exception e)
        {
            System.err.println("Error! Unparsable value.");
        }
        return reC;
    }   
    public static boolean inputB(String arg)
    {
        String input = inputS(arg);
        boolean reB = true;
        try
        {
            reB = Boolean.valueOf(input);
        }
        catch(Exception e)
        {
            System.err.println("Error! Unparsable value.");
        }
        return reB;
                
    }
    
    public static double inputD(String args)
    {
        String input = inputS(args);
        double reD = 0.0;
        try
        {
            reD = Double.parseDouble(input);
        }
        catch(Exception e)
        {
            System.err.println("Error! Unparsable value.");
        }
        return reD;
    }
        
        
   
}

