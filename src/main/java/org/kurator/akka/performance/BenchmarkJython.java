package org.kurator.akka.performance;

import org.python.util.PythonInterpreter;
import org.python.core.PySystemState;

public class BenchmarkJython {

    public static void main(String[] args) {

        int count = Integer.valueOf(args[0]);

        for (int i = 1; i <= count; i++) {
            System.out.println("Starting interpreter: " + i);
            PythonInterpreter interpreter = new PythonInterpreter(null, new PySystemState());
        }
    }
}