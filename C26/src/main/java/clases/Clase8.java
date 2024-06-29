package clases;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Clase8 {

    private static final Logger LOG= Logger.getLogger(Clase8.class.getName());

    public static void main(String[] args) {
        LOG.setLevel(Level.INFO);
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.INFO);
        LOG.addHandler(consoleHandler);


        LOG.info("Esto es un log");
        System.out.println("Esto imprime por SOUT");
    }
}
