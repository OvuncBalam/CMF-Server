package cfm.service.impl;

import cfm.entity.ServerDataObject;
import cfm.repository.CFMServerRepository;
import cfm.service.CSVService;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.UUID;

@Service
public class CSVServiceImpl implements CSVService {

    private CFMServerRepository repository;

    public CSVServiceImpl(final CFMServerRepository repository) {
        this.repository = repository;
    }

    public void parse(final BufferedReader csvFile) throws IOException {
        final String cvsSplitBy = ",";
        final ServerDataObject serverDataObject = new ServerDataObject();
        String line = "";
        int counter = 0;

        while ((line = csvFile.readLine()) != null) {
            if(counter != 0) {
                String[] csvLine = line.split(cvsSplitBy);

                serverDataObject.setObjectId(csvLine[0]);

                repository.save(serverDataObject);
            }
            counter++;

        }
    }
}
