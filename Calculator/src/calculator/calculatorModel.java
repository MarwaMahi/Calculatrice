/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;




import java.util.logging.Level;
import java.util.logging.Logger;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class calculatorModel {

     
   public Double eval(String infix) {        
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");    
        String stringResult;
        try {
            stringResult = engine.eval(infix).toString();
            double doubleResult = Double.valueOf(stringResult);
                 
            return doubleResult;
        } catch (ScriptException ex) {
            Logger.getLogger(calculatorModel.class.getName()).log(Level.SEVERE, null, ex);
        }
       return null;
      

    }
    
   public Double carree(String x) { 
       Double a = Double.valueOf(x)*Double.valueOf(x);
       return a;
   } 
    public Double expo(String x) { 
       Double a =Math.exp(Double.valueOf(x));
       return a;
   } 
    public Double racine(String x) { 
       Double a=Math.sqrt(Double.valueOf(x));
      return a;
   }
   public Double inverse(String x) { 
       Double a=1/Double.valueOf(x);
       
       return a;
   }
     public Double cos(String x) { 
       Double a=Math.cos(Double.valueOf(x));
       
       return a;
   }
         public Double sin(String x) { 
       Double a=Math.sin(Double.valueOf(x));
       
       return a;
   }
    public Double tan(String x) { 
       Double a=Math.tan(Double.valueOf(x));
       
       return a;
   }
    public String bin(String x) { 
     
    Integer valeur=Integer.valueOf(String.valueOf(x),16);
    String chiffreBinaire=Integer.toBinaryString(valeur.intValue());
    String a=String.format("%08d", Integer.parseInt(chiffreBinaire));    
     return a; 
   }      
   public byte oct(String x) { 
       int a = Integer.valueOf(x);
       byte b  =(byte)a;
       return b;
      
   }
   public String hex(String x) { 
      int Val=Integer.valueOf(x);
      String h=Integer.toHexString(Val);
     return h  ;
       
   }
      public String pi() { 
       String x=String.valueOf(Math.PI);   
       return x;
   } 
  
   
}
