import java.util.*;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class NumPlate {
    public static void main(String[] args) {
      String[] op = {"+", "-", "*", "/", ""};
      ScriptEngineManager manager = new ScriptEngineManager();
      ScriptEngine engine = manager.getEngineByName("JavaScript");

        for (int i = 1000; i < 10000; i++) {
          String str = String.valueOf(i);
          for (int j = 0; j < op.length; j++) {
            for (int j2 = 0; j2 < op.length; j2++) {
              for (int k = 0; k < op.length; k++) {
                String val = str.charAt(0) + op[j] + str.charAt(1) + op[j2] + str.charAt(2) + op[k] + str.charAt(3);
                try{
                  Object ob = engine.eval("8 + 2");
                } catch(ScriptException e) {
                  e.printStackTrace();
                }
              }
            }
          }
        }

    }
    
}