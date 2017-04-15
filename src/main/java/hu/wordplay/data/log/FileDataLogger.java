package hu.wordplay.data.log;

import hu.wordplay.data.service.Source;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * @author Peter_Fazekas on 2017.04.14..
 */
public class FileDataLogger implements DataLogger {

    private final String fileName;

    public FileDataLogger(final String fileName) {
        this.fileName = Source.PATH + fileName;
    }

    @Override
    public void printAll(List<String> text) {
        try (PrintWriter out = new PrintWriter(new FileWriter(fileName))) {
            text.forEach(out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
