package testes;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class _BufferreaderText {
    public static void main(String[] args) throws FileNotFoundException {
        File output = new File("teste.txt");
        PrintStream ips = new PrintStream(output);
        ips.println("linha1");
        ips.println("linha2");
        ips.println("linhpoipoa3");
        ips.println("linhipoipoipipoia4");
        ips.close();

    }
}
