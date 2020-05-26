/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package map.properties.recompute_methods;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author amit
 */
public class PropertiesRecomputation {

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
             * Recomputing properties object with java 1.8 new methods.
             */
            p.compute("meghvi", (key, old_value) -> {
                return "pangham";
            });

            p.computeIfAbsent("luv", (key) -> {
                return "kush";
            });

            p.computeIfPresent("luv", (key, value) -> "son of king shree ram and queen janki");

            FileOutputStream fos = new FileOutputStream(file);
            p.store(fos, "Adding new Members if Present");
        } catch (IOException e) {
            System.out.println("Exception occour please try again later.");
        }
    }
}
