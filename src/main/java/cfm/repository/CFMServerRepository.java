package cfm.repository;

import cfm.entity.ServerDataObject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.awt.print.Pageable;
import java.util.List;
import java.util.UUID;

public interface CFMServerRepository extends JpaRepository<ServerDataObject, UUID> {

    @Query(value = "Select * from objects ServerDataObject  where code LIKE CONCAT('%',:filterWord,'%')", nativeQuery = true)
    List<ServerDataObject> filterByCode(@Param("filterWord") String filterWord);
}
