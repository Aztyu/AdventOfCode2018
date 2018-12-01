import java.io.File;

public class Main {

    public static void main(String [ ] args){
        ClassLoader classLoader = Main.class.getClassLoader();
        File file = new File(classLoader.getResource("file/test.xml").getFile());

        System.out.println("Hello world");
    }
}
