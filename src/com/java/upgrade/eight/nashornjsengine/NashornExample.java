package com.java.upgrade.eight.nashornjsengine;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class NashornExample {

    public static void main(String[] args) {

        ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");

        try {
            Object result = engine.eval("var x = 10; var y = 20; x + y");
            System.out.println("Result: " + result);

            engine.eval("function add(a, b) { return a + b; }");
            result = engine.eval("add(5, 7);");
            System.out.println("Result of function call: " + result);
        } catch (ScriptException e) {
            e.printStackTrace();
        }

    }

}
