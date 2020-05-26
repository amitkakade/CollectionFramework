/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package map.properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

/**
 *
 * @author amit
 */
public class PropertiesIntro {

    public static void main(String[] args) {

        try {
            
            String file = "./src/map/properties/sample.properties";
            
            /**
             * Reading properties from file.
             */
            FileInputStream fis = new FileInputStream(file);
            Properties p = new Properties();
            p.load(fis);
            System.out.println("Displaying all data of properties file");
            System.out.println(p);

            /**
             * Adding properties to the file.
             */
            FileOutputStream fos = new FileOutputStream(file);
            p.setProperty("unknown", "unknown");
            p.store(fos, "Adding unknown member");
            
            /**
             * Iterating over properties object with enumeration object.
             */
            System.out.println("\nDisplaying value of Properties object using elements()");
            Enumeration values = p.elements();
            while (values.hasMoreElements()) {
                System.out.println(values.nextElement());
            }
            
            System.out.println("\nDisplaying keys of Properties object using keys()");
            Enumeration keys = p.keys();
            while (keys.hasMoreElements()) {
                System.out.println(keys.nextElement());
            }
            
            System.out.println("\nDisplaying keys of Properties object using propertyNames()");
            Enumeration property_names = p.propertyNames();
            while (property_names.hasMoreElements()) {
                System.out.println(property_names.nextElement());
            }
            
        } catch (IOException e) {
            System.out.println("Exception occour please try again.");
        }

    }

}
