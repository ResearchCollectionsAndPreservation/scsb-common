package org.recap.model.search;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


/**
 * Created by rajesh on 18-Jul-16.
 */
@Data
public class AbstractSearchItemResultRow {
    @ApiModelProperty(name= "callNumber", value= "Call Number",position = 0)
    private String callNumber;
    @ApiModelProperty(name= "chronologyAndEnum", value= "Chronology And Enum",position = 1)
    private String chronologyAndEnum;
    @ApiModelProperty(name= "customerCode", value= "Customer Code",position = 2)
    private String customerCode;
    @ApiModelProperty(name= "barcode", value= "barcode",position = 3)
    private String barcode;
    @ApiModelProperty(name= "useRestriction", value= "use Restriction",position = 4)
    private String useRestriction;
    @ApiModelProperty(name= "collectionGroupDesignation", value= "collection Group Designation",position = 5)
    private String collectionGroupDesignation;
    @ApiModelProperty(name= "availability", value= "Availability",position = 6)
    private String availability;
    @ApiModelProperty(name= "imsLocation", value= "Ims Location",position = 7)
    private String imsLocation;
    @ApiModelProperty(name= "selectedItem", value= "selected Item",position = 8)
    private boolean selectedItem = false;

    @ApiModelProperty(hidden = true)
    private boolean itemMatched = false;
}

