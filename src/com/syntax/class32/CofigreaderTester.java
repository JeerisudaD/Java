package com.syntax.class32;
import com.syntax.util.ConfigReader;
import java.io.IOException;
import java.util.Properties;

public class CofigreaderTester {
    public class ConfigReaderTester {
        public static void main(String[] args) throws IOException {
            System.out.println(ConfigReader.getProperty("URl"));
            System.out.println(ConfigReader.getProperty("password"));
        }
    }
}
