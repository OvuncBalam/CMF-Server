package cfm.controller;

import cfm.service.CSVService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.*;
import java.nio.Buffer;

@RestController
public class HelloController {

    @Autowired
    private CSVService csvService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home() {

        return "welcome";
    }

    @RequestMapping(value = "/parse", method = RequestMethod.GET)
    public String parse() {
        final String csvFileUrl = "config/variable.csv";
        final ClassLoader classLoader = getClass().getClassLoader();

        try {
            final File csvFile = new File(classLoader.getResource(csvFileUrl).getFile());
            final FileReader fileReader = new FileReader(csvFile);
            final BufferedReader bufferedReader = new BufferedReader(fileReader);

            csvService.parse(bufferedReader);

            return "Oldu";
        }catch (Exception exception) {

            return "An error occured";
        }
    }
}
