package org.recap.model.request;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @author Dinakar N created on 26/09/22
 */
@Setter
@Getter
public class RequestInfo {
    private Integer id;
    private String requestInstitution;
    private String itemOwningInstitution;
    private String requestRecieved;
    private String requestedItemBarcode;
    private String responseMessage;
    private String validationMessage;
    private Integer statusId;
    private String status;
    private Date date;
}
