package cfm.repository;

import cfm.entity.ServerDataObject;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CFMServerRepository extends JpaRepository<ServerDataObject, UUID> {

}
