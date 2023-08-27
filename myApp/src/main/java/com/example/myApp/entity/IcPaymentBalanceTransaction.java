package com.example.myApp.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "ic_payment_balance_transaction")
public class IcPaymentBalanceTransaction {
    @Id
    @GeneratedValue
    @Column(name = "ID")
    private String id;
    @Column(name = "CARD_ID")
    private String cardId;
    @Column(name = "TRANS_TIME")
    private LocalDateTime transTime;
    @Column(name = "AMOUNT")
    private String amount;
    @Column(name = "CURRENCY")
    private String currency;
    @Column(name = "REMARK")
    private String remark;
    @Column(name = "TRACE_NUMBER")
    private String traceNumber;
    @Column(name = "STATUS")
    private String status;
    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;
    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;
    @Column(name = "VENDOR_CODE")
    private String vendorCode;
    @Column(name = "FCC_REFERENCE_NO")
    private String fccReferenceNo;
    @Column(name = "FCC_MESSAGE_ID")
    private String fccMessageId;
    @Column(name = "FCC_STATUS")
    private String fccStatus;
    @Column(name = "FCC_ERROR_CODE")
    private String fccErrorCode;
    @Column(name = "FCC_ERROR_DESC")
    private String fccErrorDesc;
    @Column(name = "FCC_TRANSACTION_ID")
    private String fccTransactionId;
    @Column(name = "FCC_RESPONSE_STATUS")
    private String fccResponseStatus;
    @Column(name = "BO2_STATUS")
    private String bo2Status;
    @Column(name = "BO2_RESPONSE")
    private String bo2Response;
    @Column(name = "BO2_RESPONSE_CODE")
    private String bo2ResponseCode;
    @Column(name = "BO2_RESPONSE_DESC")
    private String bo2ResponseDesc;
    @Column(name = "BO2_RESPONSE_ID")
    private String bo2ResponseId;
    @Column(name = "BO2_HOST_REF")
    private String bo2HostRef;
    @Column(name = "BO2_OPERATION_ID")
    private String bo2OperationId;
    @Column(name = "BO2_HOST_DATE")
    private String bo2HostDate;
    @Column(name = "BO2_RESPONSE_STATUS")
    private String bo2ResponseStatus;
    @Column(name = "FCC_REMARK")
    private String fccRemark;
    @Column(name = "CARD_TYPE")
    private String cardType;
    @Column(name = "DELETED_AT")
    private boolean deletedAt;

    //constructor with all args
    public IcPaymentBalanceTransaction(String id, String cardId, LocalDateTime transTime, String amount, String currency, String remark, String traceNumber, String status, LocalDateTime createdAt, LocalDateTime updatedAt, String vendorCode, String fccReferenceNo, String fccMessageId, String fccStatus, String fccErrorCode, String fccErrorDesc, String fccTransactionId, String fccResponseStatus, String bo2Status, String bo2Response, String bo2ResponseCode, String bo2ResponseDesc, String bo2ResponseId, String bo2HostRef, String bo2OperationId, String bo2HostDate, String bo2ResponseStatus, String fccRemark, String cardType, boolean deletedAt) {
        this.id = id;
        this.cardId = cardId;
        this.transTime = transTime;
        this.amount = amount;
        this.currency = currency;
        this.remark = remark;
        this.traceNumber = traceNumber;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.vendorCode = vendorCode;
        this.fccReferenceNo = fccReferenceNo;
        this.fccMessageId = fccMessageId;
        this.fccStatus = fccStatus;
        this.fccErrorCode = fccErrorCode;
        this.fccErrorDesc = fccErrorDesc;
        this.fccTransactionId = fccTransactionId;
        this.fccResponseStatus = fccResponseStatus;
        this.bo2Status = bo2Status;
        this.bo2Response = bo2Response;
        this.bo2ResponseCode = bo2ResponseCode;
        this.bo2ResponseDesc = bo2ResponseDesc;
        this.bo2ResponseId = bo2ResponseId;
        this.bo2HostRef = bo2HostRef;
        this.bo2OperationId = bo2OperationId;
        this.bo2HostDate = bo2HostDate;
        this.bo2ResponseStatus = bo2ResponseStatus;
        this.fccRemark = fccRemark;
        this.cardType = cardType;
        this.deletedAt = deletedAt;
    }

    //constructor without args
    public IcPaymentBalanceTransaction() {
    }

    //setup setter & getter

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public LocalDateTime getTransTime() {
        return transTime;
    }

    public void setTransTime(LocalDateTime transTime) {
        this.transTime = transTime;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getTraceNumber() {
        return traceNumber;
    }

    public void setTraceNumber(String traceNumber) {
        this.traceNumber = traceNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getVendorCode() {
        return vendorCode;
    }

    public void setVendorCode(String vendorCode) {
        this.vendorCode = vendorCode;
    }

    public String getFccReferenceNo() {
        return fccReferenceNo;
    }

    public void setFccReferenceNo(String fccReferenceNo) {
        this.fccReferenceNo = fccReferenceNo;
    }

    public String getFccMessageId() {
        return fccMessageId;
    }

    public void setFccMessageId(String fccMessageId) {
        this.fccMessageId = fccMessageId;
    }

    public String getFccStatus() {
        return fccStatus;
    }

    public void setFccStatus(String fccStatus) {
        this.fccStatus = fccStatus;
    }

    public String getFccErrorCode() {
        return fccErrorCode;
    }

    public void setFccErrorCode(String fccErrorCode) {
        this.fccErrorCode = fccErrorCode;
    }

    public String getFccErrorDesc() {
        return fccErrorDesc;
    }

    public void setFccErrorDesc(String fccErrorDesc) {
        this.fccErrorDesc = fccErrorDesc;
    }

    public String getFccTransactionId() {
        return fccTransactionId;
    }

    public void setFccTransactionId(String fccTransactionId) {
        this.fccTransactionId = fccTransactionId;
    }

    public String getFccResponseStatus() {
        return fccResponseStatus;
    }

    public void setFccResponseStatus(String fccResponseStatus) {
        this.fccResponseStatus = fccResponseStatus;
    }

    public String getBo2Status() {
        return bo2Status;
    }

    public void setBo2Status(String bo2Status) {
        this.bo2Status = bo2Status;
    }

    public String getBo2Response() {
        return bo2Response;
    }

    public void setBo2Response(String bo2Response) {
        this.bo2Response = bo2Response;
    }

    public String getBo2ResponseCode() {
        return bo2ResponseCode;
    }

    public void setBo2ResponseCode(String bo2ResponseCode) {
        this.bo2ResponseCode = bo2ResponseCode;
    }

    public String getBo2ResponseDesc() {
        return bo2ResponseDesc;
    }

    public void setBo2ResponseDesc(String bo2ResponseDesc) {
        this.bo2ResponseDesc = bo2ResponseDesc;
    }

    public String getBo2ResponseId() {
        return bo2ResponseId;
    }

    public void setBo2ResponseId(String bo2ResponseId) {
        this.bo2ResponseId = bo2ResponseId;
    }

    public String getBo2HostRef() {
        return bo2HostRef;
    }

    public void setBo2HostRef(String bo2HostRef) {
        this.bo2HostRef = bo2HostRef;
    }

    public String getBo2OperationId() {
        return bo2OperationId;
    }

    public void setBo2OperationId(String bo2OperationId) {
        this.bo2OperationId = bo2OperationId;
    }

    public String getBo2HostDate() {
        return bo2HostDate;
    }

    public void setBo2HostDate(String bo2HostDate) {
        this.bo2HostDate = bo2HostDate;
    }

    public String getBo2ResponseStatus() {
        return bo2ResponseStatus;
    }

    public void setBo2ResponseStatus(String bo2ResponseStatus) {
        this.bo2ResponseStatus = bo2ResponseStatus;
    }

    public String getFccRemark() {
        return fccRemark;
    }

    public void setFccRemark(String fccRemark) {
        this.fccRemark = fccRemark;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public boolean isDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(boolean deletedAt) {
        this.deletedAt = deletedAt;
    }

    //for testing printout

    @Override
    public String toString() {
        return "IcPaymentBalanceTransaction{" +
                "id='" + id + '\'' +
                ", cardId='" + cardId + '\'' +
                ", transTime=" + transTime +
                ", amount='" + amount + '\'' +
                ", currency='" + currency + '\'' +
                ", remark='" + remark + '\'' +
                ", traceNumber='" + traceNumber + '\'' +
                ", status='" + status + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", vendorCode='" + vendorCode + '\'' +
                ", fccReferenceNo='" + fccReferenceNo + '\'' +
                ", fccMessageId='" + fccMessageId + '\'' +
                ", fccStatus='" + fccStatus + '\'' +
                ", fccErrorCode='" + fccErrorCode + '\'' +
                ", fccErrorDesc='" + fccErrorDesc + '\'' +
                ", fccTransactionId='" + fccTransactionId + '\'' +
                ", fccResponseStatus='" + fccResponseStatus + '\'' +
                ", bo2Status='" + bo2Status + '\'' +
                ", bo2Response='" + bo2Response + '\'' +
                ", bo2ResponseCode='" + bo2ResponseCode + '\'' +
                ", bo2ResponseDesc='" + bo2ResponseDesc + '\'' +
                ", bo2ResponseId='" + bo2ResponseId + '\'' +
                ", bo2HostRef='" + bo2HostRef + '\'' +
                ", bo2OperationId='" + bo2OperationId + '\'' +
                ", bo2HostDate='" + bo2HostDate + '\'' +
                ", bo2ResponseStatus='" + bo2ResponseStatus + '\'' +
                ", fccRemark='" + fccRemark + '\'' +
                ", cardType='" + cardType + '\'' +
                ", deletedAt=" + deletedAt +
                '}';
    }
}
