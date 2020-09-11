package cfm.service;


import java.io.BufferedReader;
import java.io.IOException;

public interface CSVService {

    void parse(BufferedReader bufferedReader) throws IOException;
}
