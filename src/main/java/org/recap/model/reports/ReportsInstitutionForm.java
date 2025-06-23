package org.recap.model.reports;

import lombok.Data;

@Data
public class ReportsInstitutionForm {
    private String institution;
    private long retrievalRequestCount;
    private long recallRequestCount;
    private long eddRequestCount;
    private long totalRequestByTypeCount;
    private long physicalPrivateCount;
    private long physicalSharedCount;
    private long physicalPartnerSharedCount;
    private long subTotalPhysicalCount;
    private long eddPrivateCount;
    private long eddSharedOpenCount;
    private long eddPartnerSharedOpenCount;
    private long subTotalEddCount;
    private long totalRequestByPartnerCount;
    private long totalRequestByPartnerHulCount;
    private long accessionPrivateCount;
    private long accessionSharedCount;
    private long accessionOpenCount;
    private long accessionCommittedCount;
    private long accessionUncommittableCount;
    private long subTotalAccessionCount;
    private long deaccessionPrivateCount;
    private long deaccessionSharedCount;
    private long deaccessionOpenCount;
    private long deaccessionCommittedCount;
    private long deaccessionUncommittableCount;
    private long subTotalDeaccessionCount;
    private long openCgdCount;
    private long sharedCgdCount;
    private long privateCgdCount;
    private long committedCgdCount;
    private long uncommittableCgdCount;
    private long totalCgdCount;
}
