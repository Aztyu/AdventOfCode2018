import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String [ ] args){
        ClassLoader classLoader = Main.class.getClassLoader();
        File file = new File(classLoader.getResource("input.txt").getFile());

        try {
            List<String> contents = FileUtils.readLines(file);

            Calculator calculator = new FrequencyCalculator();
            System.out.println("Final frequency : " + calculator.calculateFrequencyChange(contents));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
