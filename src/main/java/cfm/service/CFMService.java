package cfm.service;

import cfm.entity.ServerDataObject;

import java.util.List;

public interface CFMService {

    List<ServerDataObject> getAllServerDataObject(String filterWord);
}
