package cfm.service.impl;

import cfm.entity.ServerDataObject;
import cfm.repository.CFMServerRepository;
import cfm.service.CSVService;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.time.format.DateTimeFormatter;

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
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        //Database table drop et fieldların tipi değişti.
        while ((line = csvFile.readLine()) != null) {
            if (counter != 0) {
                String[] csvLine = line.split(cvsSplitBy);
                
                serverDataObject.setObjectId(csvLine[0]);
                serverDataObject.setRowId(csvLine[1]);
                serverDataObject.setAvalue(csvLine[2]);
                serverDataObject.setAddressOut(csvLine[3]);
                serverDataObject.setAddressIn(csvLine[4]);
                serverDataObject.setBvalue(csvLine[5]);
                serverDataObject.setBitPosition(csvLine[6]);
                serverDataObject.setButtonPath(csvLine[7]);
                serverDataObject.setCode(csvLine[8]);
                serverDataObject.setDecimal(csvLine[9]);
                serverDataObject.setDefaultValue(csvLine[10]);
                serverDataObject.setDelay(csvLine[11]);
                serverDataObject.setDelta(csvLine[12]);
                serverDataObject.setDescription(csvLine[13]);
                serverDataObject.setDimension(csvLine[14]);
                serverDataObject.setFrequency(csvLine[15]);
                serverDataObject.setFunctionCode(csvLine[16]);
                serverDataObject.setGrpCategory(csvLine[17]);
                serverDataObject.setIdgroup(csvLine[18]);
                serverDataObject.setIdhsVariable(csvLine[19]);
                serverDataObject.setIdVarMdl(csvLine[20]);
                serverDataObject.setImageOff(csvLine[21]);
                serverDataObject.setImageOn(csvLine[22]);
                serverDataObject.setInsertTime(csvLine[23]);
                serverDataObject.setIsActive(csvLine[24]);
                serverDataObject.setIsCancelled(csvLine[25]);
                serverDataObject.setIsHaccp(csvLine[26]);
                serverDataObject.setIsLogic(csvLine[27]);
                serverDataObject.setIsOnChange(csvLine[28]);
                serverDataObject.setLastUpdate(csvLine[29]);
                serverDataObject.setLength(csvLine[30]);
                serverDataObject.setMaximum(csvLine[31]);
                serverDataObject.setMinimum(csvLine[32]);
                serverDataObject.setPriority(csvLine[33]);
                serverDataObject.setReadWrite(csvLine[34]);
                serverDataObject.setToDisplay(csvLine[35]);
                serverDataObject.setType(csvLine[36]);
                serverDataObject.setVarEncoding(csvLine[37]);
                serverDataObject.setDetailId(csvLine[38]);
                serverDataObject.setDeviceModel(csvLine[39]);

                repository.save(serverDataObject);
            }
            counter++;

        }
    }
}
