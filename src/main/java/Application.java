import groovy.lang.GroovyObject;
import groovy.lang.GroovyShell;
import org.codehaus.groovy.control.CompilationFailedException;

import java.io.File;
import java.io.IOException;

public class Application {

    public static void testGroovy1() throws CompilationFailedException, IOException {
        GroovyShell groovyShell = new GroovyShell();
//        Object result = groovyShell.evaluate(new File("src/main/groovy/org.example/First.groovy"));
        Object result = groovyShell.evaluate(new File("C:\\Users\\xdj\\IdeaProjects\\GroovyDemo\\src\\main\\groovy\\org\\example\\First.groovy"));
    }

    public static void testGroovy2() throws CompilationFailedException, IOException {
        GroovyShell groovyShell = new GroovyShell();
        groovyShell.run(new File("C:\\Users\\xdj\\IdeaProjects\\GroovyDemo\\src\\main\\groovy\\org\\example\\Main.groovy"), new String[]{"arg111", "arg222"});
    }


    public static void main(String[] args) {
        try {
            testGroovy1();
            testGroovy2();
            System.out.println("Groovy script executed successfully");
        } catch (Exception error){
            error.printStackTrace();
        }
    }
}
