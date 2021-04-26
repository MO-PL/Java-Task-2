import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.*;

public class Main {

    public static String dataFormat;
    public static String fileName;
    public static String[] result = new String[6];
    public static void main(String[] args) {

//         Input validation

        InputValidation.check(args);

//         Input processing

        dataFormat = args[0];
        fileName = args[1];

//         XML processing

        ReadXmlSaxParser.pass();

//         Data displaying

        displayResult.show();
    }
}
