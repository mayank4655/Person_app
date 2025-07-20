package PersonXmlApp;

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Person p = new Person("Alice", 25, 2000.5, Arrays.asList("Reading", "Coding"));

        // ✅ XML Write
        XmlManualExample.writeToXml(p, "person.xml");

        // ✅ XML Read
        Person fromXml = XmlManualExample.readFromXml("person.xml");
        System.out.println("From XML: " + fromXml);
    }
}
