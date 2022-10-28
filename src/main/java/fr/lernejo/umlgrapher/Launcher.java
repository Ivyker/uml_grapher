package fr.lernejo.umlgrapher;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

@Command()
public class Launcher implements Runnable{
    @Option(names = {"-c", "--class"}, required = true, description = "Renseigne la class.")
    private final Class<?>[] classe = null;
    @Option(names = {"-g", "--graph-type"},required = false, description = "Renseigne le type de graph.")
    private final GraphType grType = GraphType.Mermaid;
    @Override
    public void run() {
        // TODO Auto-generated method stub
        UmlGraph graph = new UmlGraph(classe);
        String st = graph.as(grType);
        System.out.println(st);
        
    }
    public static void main(String... args) {
        int exitCode = new CommandLine(new Launcher()).execute(args);
        System.exit(exitCode);
    }
}
