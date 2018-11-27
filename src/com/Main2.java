package com;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main2 {
    public static void main(String[] args) {
       // Pattern p2 = Pattern.compile("\".*\"");
        //  Pattern p2 = Pattern.compile("\".*?\"");
          Pattern p2=Pattern.compile("\"[^\"\r\n]*\"");
        //  Matcher m2 = p2.matcher("Put a \"string\" between double quotes");
          Matcher m2=p2.matcher("Houston, we have a problem with \"string one\" and \"string two\". Please respond.");
        while (m2.find()) {
            System.out.println(m2.start() + " " + m2.group() + " ");
        }
    }
}
