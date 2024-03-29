package org.recap.model.search;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.recap.ScsbCommonConstants;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by rajeshbabuk on 6/7/16.
 */
@ApiModel(value="SearchRecordsRequest", description="Model for showing user details")
public class SearchRecordsRequest  implements Serializable {


    @ApiModelProperty(name= "fieldValue", value= "Search Value",  position = 0)
    private String fieldValue = "";

    @ApiModelProperty(name ="fieldName", value= "Select a field name",position = 1)
    private String fieldName;

    @ApiModelProperty(name= "owningInstitutions", value= "Publications Owning Instutions", position = 2)
    private List<String> owningInstitutions = null;

    @ApiModelProperty(name= "collectionGroupDesignations", value= "Collection Group Designations",position = 3, allowableValues="Shared, Open, Private, Committed, Uncommittable")
    private List<String> collectionGroupDesignations = null;

    @ApiModelProperty(name= "availability", value= "Availability of books in Storage Locations",position = 4, allowableValues = "Available, NotAvailable")
    private List<String> availability = null;

    @ApiModelProperty(name= "materialTypes", value= "Material Types",position = 5, allowableValues = "Serial, Monograph, Other")
    private List<String> materialTypes = null;

    @ApiModelProperty(name= "titleMatch", value= "Title Matches",position = 6, allowableValues = "Matched, Not Matched")
    private List<String> titleMatch = null;

    @ApiModelProperty(name= "useRestrictions", value= "Book Use Restrictions",position = 7, allowableValues = "NoRestrictions, InLibraryUse, SupervisedUse")
    private List<String> useRestrictions = null;

    @ApiModelProperty(name= "storageLocations", value= "Storage Locations",position = 8)
    private List<String> imsDepositoryCodes = null;

    @ApiModelProperty(name= "isDeleted", value= "Is Deleted",position = 9)
    private boolean isDeleted = false;

    @ApiModelProperty(name= "catalogingStatus", value= "Cataloging Status",position = 10, allowableValues = "Complete, Incomplete")
    private String catalogingStatus;

    @ApiModelProperty(name= "pageNumber", value= "Current Page Number",position = 11)
    private Integer pageNumber = 0;

    @ApiModelProperty(name= "pageSize", value= "Total records to show is page", position = 12)
    private Integer pageSize = 10;

    @ApiModelProperty(required = false,hidden = true)
    private boolean barcodeSearch = false;

    /**
     * Instantiates a new Search records request.
     */
    public SearchRecordsRequest() {
        setDefaults();
    }

    public SearchRecordsRequest(List<String> owningInstitutions) {
        this.owningInstitutions=owningInstitutions;
        setDefaults();
    }

    private void setDefaults() {
        this.setFieldName("");
        this.setFieldValue("");
        this.setDeleted(false);
        this.setCatalogingStatus(ScsbCommonConstants.COMPLETE_STATUS);

        this.getCollectionGroupDesignations().add("Shared");
        this.getCollectionGroupDesignations().add("Private");
        this.getCollectionGroupDesignations().add("Open");
        this.getCollectionGroupDesignations().add("Committed");
        this.getCollectionGroupDesignations().add("Uncommittable");

        this.getAvailability().add("Available");
        this.getAvailability().add("NotAvailable");

        this.getMaterialTypes().add("Monograph");
        this.getMaterialTypes().add("Serial");
        this.getMaterialTypes().add("Other");

        this.getUseRestrictions().add("NoRestrictions");
        this.getUseRestrictions().add("InLibraryUse");
        this.getUseRestrictions().add("SupervisedUse");

        this.getTitleMatch().add("Matched");
        this.getTitleMatch().add("Not Matched");

        this.setPageNumber(0);
        this.setPageSize(10);
        this.setBarcodeSearch(false);
    }


    /**
     * Gets field value.
     *
     * @return the field value
     */
    public String getFieldValue() {
        return fieldValue;
    }

    /**
     * Sets field value.
     *
     * @param fieldValue the field value
     */
    public void setFieldValue(String fieldValue) {
        this.fieldValue = fieldValue;
    }

    /**
     * Gets field name.
     *
     * @return the field name
     */
    public String getFieldName() {
        return fieldName;
    }

    /**
     * Sets field name.
     *
     * @param fieldName the field name
     */
    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    /**
     * Gets owning institutions.
     *
     * @return the owning institutions
     */
    public List<String> getOwningInstitutions() {
        if (null == owningInstitutions) {
            owningInstitutions = new ArrayList<>();
        }
        return owningInstitutions;
    }

    /**
     * Sets owning institutions.
     *
     * @param owningInstitutions the owning institutions
     */
    public void setOwningInstitutions(List<String> owningInstitutions) {
        this.owningInstitutions = owningInstitutions;
    }

    /**
     * Gets collection group designations.
     *
     * @return the collection group designations
     */
    public List<String> getCollectionGroupDesignations() {
        if (null == collectionGroupDesignations) {
            collectionGroupDesignations = new ArrayList<>();
        }
        return collectionGroupDesignations;
    }

    /**
     * Sets collection group designations.
     *
     * @param collectionGroupDesignations the collection group designations
     */
    public void setCollectionGroupDesignations(List<String> collectionGroupDesignations) {
        this.collectionGroupDesignations = collectionGroupDesignations;
    }

    /**
     * Gets availability.
     *
     * @return the availability
     */
    public List<String> getAvailability() {
        if (null == availability) {
            availability = new ArrayList<>();
        }
        return availability;
    }

    /**
     * Sets availability.
     *
     * @param availability the availability
     */
    public void setAvailability(List<String> availability) {
        this.availability = availability;
    }

    /**
     * Gets material types.
     *
     * @return the material types
     */
    public List<String> getMaterialTypes() {
        if (null == materialTypes) {
            materialTypes = new ArrayList<>();
        }
        return materialTypes;
    }

    /**
     * Sets material types.
     *
     * @param materialTypes the material types
     */
    public void setMaterialTypes(List<String> materialTypes) {
        this.materialTypes = materialTypes;
    }

    /**
     * Gets use restrictions.
     *
     * @return the use restrictions
     */
    public List<String> getUseRestrictions() {
        if(null == useRestrictions) {
            useRestrictions = new ArrayList<>();
        }
        return useRestrictions;
    }

    /**
     * Sets use restrictions.
     *
     * @param useRestrictions the use restrictions
     */
    public void setUseRestrictions(List<String> useRestrictions) {
        this.useRestrictions = useRestrictions;
    }

    /**
     * Is deleted boolean.
     *
     * @return the boolean
     */
    @ApiModelProperty(example = "false")
    public boolean isDeleted() {
        return isDeleted;
    }

    /**
     * Sets deleted.
     *
     * @param deleted the deleted
     */
    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    /**
     * Gets cataloging status.
     *
     * @return the cataloging status
     */
    public String getCatalogingStatus() {
        return catalogingStatus;
    }

    /**
     * Sets cataloging status.
     *
     * @param catalogingStatus the cataloging status
     */
    public void setCatalogingStatus(String catalogingStatus) {
        this.catalogingStatus = catalogingStatus;
    }

    /**
     * Gets page number.
     *
     * @return the page number
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    /**
     * Sets page number.
     *
     * @param pageNumber the page number
     */
    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * Gets page size.
     *
     * @return the page size
     */
    @ApiModelProperty(example = "10", position = 10)
    public Integer getPageSize() {
        return pageSize;
    }

    /**
     * Sets page size.
     *
     * @param pageSize the page size
     */
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     *
     * @return strorageLocations
     */
    public List<String> getImsDepositoryCodes() {
        if(null == imsDepositoryCodes) {
            imsDepositoryCodes = new ArrayList<>();
        }
        return imsDepositoryCodes;
    }

    /**
     * set the storage Locations
     * @param imsDepositoryCodes
     */
    public void setImsDepositoryCodes(List<String> imsDepositoryCodes) {
        this.imsDepositoryCodes = imsDepositoryCodes;
    }

    public List<String> getTitleMatch() {
        if(null == titleMatch) {
            titleMatch = new ArrayList<>();
        }
        return titleMatch;
    }

    public void setTitleMatch(List<String> titleMatch) {
        this.titleMatch = titleMatch;
    }

    public boolean isBarcodeSearch() {
        return barcodeSearch;
    }

    public void setBarcodeSearch(boolean barcodeSearch) {
        this.barcodeSearch = barcodeSearch;
    }
}
