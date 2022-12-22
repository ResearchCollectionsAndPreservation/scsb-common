package org.recap.repository;

import org.recap.model.jpa.ItemRequestReceivedInformationEntity;
import org.recap.repository.jpa.BaseRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

/**
 * @author Dinakar N created on 14/09/22
 */
@Repository
public interface ItemRequestInformationRepository extends BaseRepository<ItemRequestReceivedInformationEntity> {
    @Query(value = "select requests from ItemRequestReceivedInformationEntity requests where requests.requestInstitution = :requestInstitution order by requests.date desc")
    Page<ItemRequestReceivedInformationEntity> findByInstitution(Pageable pageable, @Param("requestInstitution") String requestInstitution);

    @Query(value = "select requests from ItemRequestReceivedInformationEntity requests where requests.status = :status order by requests.date desc")
    Page<ItemRequestReceivedInformationEntity> findByStatus(Pageable pageable, @Param("status") String status);

    @Query(value = "select requests from ItemRequestReceivedInformationEntity requests where requests.requestInstitution = :requestInstitution and requests.status = :status order by requests.date desc")
    Page<ItemRequestReceivedInformationEntity> findByInstitutionAndStatus(Pageable pageable, @Param("requestInstitution") String requestInstitution, @Param("status") String status);

    @Modifying(clearAutomatically = true)
    @Query(value = "update ItemRequestReceivedInformationEntity entity set entity.status = :status , entity.statusId = :statusId, entity.date = :date where entity.id = :id")
    void update(@Param("id") Integer id, @Param("status") String status, @Param("statusId") Integer statusId, @Param("date") Date date);

    @Query(value = "select requests from ItemRequestReceivedInformationEntity requests where requests.statusId = :statusId order by requests.date desc")
    Page<ItemRequestReceivedInformationEntity> findAllByStatusId(Pageable pageable, @Param("statusId") Integer statusId);

    @Query(value = "select requests from ItemRequestReceivedInformationEntity requests where requests.requestInstitution = :requestInstitution and requests.status = :status and requests.date >= :fromDate and requests.date <= :toDate order by requests.date desc")
    Page<ItemRequestReceivedInformationEntity> findByInstitutionAndStatusAndFromDateAndEndDate(Pageable pageable, @Param("requestInstitution") String institution,@Param("status") String status,@Param("fromDate") Date fromDate,@Param("toDate") Date toDate);

    @Query(value = "select requests from ItemRequestReceivedInformationEntity requests where requests.requestInstitution = :requestInstitution and requests.date >= :fromDate and requests.date <= :toDate order by requests.date desc")
    Page<ItemRequestReceivedInformationEntity> findByInstitutionAndFromDateAndEndDate(Pageable pageable, @Param("requestInstitution") String institution,@Param("fromDate") Date fromDate,@Param("toDate") Date toDate);

    @Query(value = "select requests from ItemRequestReceivedInformationEntity requests where requests.status = :status  and requests.date >= :fromDate and requests.date <= :toDate order by requests.date desc")
    Page<ItemRequestReceivedInformationEntity> findByStatusAndFromDateAndEndDate(Pageable pageable,@Param("status") String status,@Param("fromDate") Date fromDate,@Param("toDate") Date toDate);

    @Query(value = "select requests from ItemRequestReceivedInformationEntity requests where requests.date >= :fromDate and requests.date <= :toDate order by requests.date desc")
    Page<ItemRequestReceivedInformationEntity> findByFromDateAndEndDate(Pageable pageable, @Param("fromDate") Date fromDate, @Param("toDate") Date toDate);

    @Query(value = "select requests from ItemRequestReceivedInformationEntity requests where requests.statusId = :statusId  and requests.date >= :fromDate and requests.date <= :toDate order by requests.date desc")
    Page<ItemRequestReceivedInformationEntity> findByStatusIdAndFromDateAndEndDate(Pageable pageable, @Param("statusId") Integer statusId,@Param("fromDate") Date fromDate,@Param("toDate") Date toDate);

    @Query(value = "select requests from ItemRequestReceivedInformationEntity requests order by requests.date desc")
    Page<ItemRequestReceivedInformationEntity> findAllByOrderByDateDesc(Pageable pageable);

    @Query(value = "select requests from ItemRequestReceivedInformationEntity requests where requests.date >= :fromDate and requests.status in (:status) order by requests.date desc")
    Optional<List<ItemRequestReceivedInformationEntity>> findAllByDateAndStatus(@Param("fromDate") Date fromDate, @Param("status") String status);
}
