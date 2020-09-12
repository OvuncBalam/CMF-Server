package cfm.service.impl;

import cfm.entity.ServerDataObject;
import cfm.repository.CFMServerRepository;
import cfm.service.CSVService;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        //Database table drop et fieldların tipi değişti.
        while ((line = csvFile.readLine()) != null) {
            if (counter != 0) {
                String[] csvLine = line.split(cvsSplitBy);
                
                serverDataObject.setObjectId(csvLine[0]);
                serverDataObject.setRowId(Long.parseLong(csvLine[1]));
                serverDataObject.setAvalue(csvLine[2]);
                serverDataObject.setAddressOut(Integer.parseInt(csvLine[3]));
                serverDataObject.setAddressIn(Integer.parseInt(csvLine[4]));
                serverDataObject.setBvalue(csvLine[5]);
                serverDataObject.setBitPosition(Integer.parseInt(csvLine[6]));
                serverDataObject.setButtonPath(csvLine[7]);
                serverDataObject.setCode(csvLine[8]);
                serverDataObject.setDecimal(csvLine[9]);
                serverDataObject.setDefaultValue(Integer.parseInt(csvLine[10]));
                serverDataObject.setDelay(Integer.parseInt(csvLine[11]));
                serverDataObject.setDelta(Integer.parseInt(csvLine[12]));
                serverDataObject.setDescription(csvLine[13]);
                serverDataObject.setDimension(Integer.parseInt(csvLine[14]));
                serverDataObject.setFrequency(Integer.parseInt(csvLine[15]));
                serverDataObject.setFunctionCode(csvLine[16]);
                serverDataObject.setGrpCategory(Integer.parseInt(csvLine[17]));
                serverDataObject.setIdgroup(Integer.parseInt(csvLine[18]));
                serverDataObject.setIdhsVariable(Integer.parseInt(csvLine[19]));
                serverDataObject.setIdVarMdl(Long.parseLong(csvLine[20]));
                serverDataObject.setImageOff(csvLine[21]);
                serverDataObject.setImageOn(Integer.parseInt(csvLine[22]));
                serverDataObject.setInsertTime(LocalDateTime.parse(csvLine[23], formatter));
                serverDataObject.setIsActive(csvLine[24]);
                serverDataObject.setIsCancelled(csvLine[25]);
                serverDataObject.setIsHaccp(LocalDateTime.parse(csvLine[26], formatter));
                serverDataObject.setIsLogic(csvLine[27]);
                serverDataObject.setIsOnChange(csvLine[28]);
                serverDataObject.setLastUpdate(LocalDateTime.parse(csvLine[29], formatter));
                serverDataObject.setLength(Integer.parseInt(csvLine[30]));
                serverDataObject.setMaximum(csvLine[31]);
                serverDataObject.setMinimum(Integer.parseInt(csvLine[32]));
                serverDataObject.setPriority(Integer.parseInt(csvLine[33]));
                serverDataObject.setReadWrite(Integer.parseInt(csvLine[34]));
                serverDataObject.setToDisplay(csvLine[35]);
                serverDataObject.setType(Integer.parseInt(csvLine[36]));
                serverDataObject.setVarEncoding(csvLine[37]);
                serverDataObject.setDetailId(csvLine[38]);
                serverDataObject.setDeviceModel(csvLine[39]);


                repository.save(serverDataObject);
            }
            counter++;

        }
    }
}
