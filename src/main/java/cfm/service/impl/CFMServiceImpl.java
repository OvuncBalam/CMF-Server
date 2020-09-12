package cfm.service.impl;

import cfm.entity.ServerDataObject;
import cfm.repository.CFMServerRepository;
import cfm.service.CFMService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CFMServiceImpl implements CFMService {

    @Autowired
    private CFMServerRepository repository;

    public List<ServerDataObject> getAllServerDataObject(final String filterWord) {
        List<ServerDataObject> serverDataObjects = repository.findAll();
        if(!filterWord.isEmpty()) {
           serverDataObjects = repository.filterByCode(filterWord);
        }

        serverDataObjects.sort(Comparator.comparing(obj -> Integer.parseInt(obj.getRowId())));

        return serverDataObjects;
    }
}
