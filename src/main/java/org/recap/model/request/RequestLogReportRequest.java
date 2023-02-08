package org.recap.model.request;

import lombok.Getter;
import lombok.Setter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.recap.model.request.RequestInfo;


@Setter
@Getter
public class RequestLogReportRequest {
    private long totalRecordsCount = 0;
    private Integer pageNumber = 0;
    private Integer pageSize = 10;
    private Integer totalPageCount = 0;
    private String fromDate;
    private String toDate;
    private String institution;
    private String status;
    private String validationStatus;
    private Integer gatewayRequestLogId;
    private List<RequestInfo> requestInfoList = new ArrayList<>();
}