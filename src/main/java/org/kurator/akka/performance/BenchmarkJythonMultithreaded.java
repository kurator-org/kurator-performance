package org.kurator.akka.performance;

import java.lang.Thread;
import org.python.util.PythonInterpreter;
import org.python.core.PySystemState;

public class BenchmarkJythonMultithreaded extends Thread {

    public void run() {
        PythonInterpreter interpreter = new PythonInterpreter(null, new PySystemState());
    }

    public static void main(String[] args) {

        int count = Integer.valueOf(args[0]);

        for (int i = 1; i <= count; i++) {
            System.out.println("Starting interpreter: " + i);
            (new BenchmarkJythonMultithreaded()).start();
        }
    }
}