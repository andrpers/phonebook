package lv.tele2.javaschool.phonebook;

import asg.cliche.ShellFactory;
import asg.cliche.example.HelloWorld;

import java.io.IOException;

/**
 * Created by andrpers on 07.03.2017.
 */
public class Main {
    public static  void  main (String[] args){
        try {
            ShellFactory.createConsoleShell("Hello", null, new PhoneBook())
                    .commandLoop();
        } catch (IOException e){e.printStackTrace();}
    }
}
