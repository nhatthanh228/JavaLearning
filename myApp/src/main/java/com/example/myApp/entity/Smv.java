package com.example.myApp.entity;

import org.springframework.data.annotation.TypeAlias;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "smv")
public class Smv {
    @Id
    @GeneratedValue
    @Column(name = "ID")
    private String id;
    @Column(name = "CIF_NUMBER")
    private String cifNumber;
    @Column(name = "CARD_ID")
    private String cardId;
    @Column(name = "STATUS")
    private String status;
    @Column(name = "CARD_HOLDER_NAME")
    private String cardHolderName;
    @Column(name = "CURRENT_BALANCE")
    private String currentBalance;
    @Column(name = "CURRENT_LIMIT")
    private String currentLimit;
    @Column(name = "CREDIT_LIMIT")
    private String creditLimit;
    @Column(name = "TRACE_NUMBER")
    private String traceNumber;
    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;
    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;
    @Column(name = "DELETED_FLAG")
    private boolean deletedFlag;

    //constructor with all args
    public Smv(String id, String cifNumber, String cardId, String status, String cardHolderName, String currentBalance, String currentLimit, String creditLimit, String traceNumber, LocalDateTime createdAt, LocalDateTime updatedAt, boolean deletedFlag) {
        this.id = id;
        this.cifNumber = cifNumber;
        this.cardId = cardId;
        this.status = status;
        this.cardHolderName = cardHolderName;
        this.currentBalance = currentBalance;
        this.currentLimit = currentLimit;
        this.creditLimit = creditLimit;
        this.traceNumber = traceNumber;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.deletedFlag = deletedFlag;
    }
    //constructor with no arg
    public Smv() {
    }

    //setup setter & getter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCifNumber() {
        return cifNumber;
    }

    public void setCifNumber(String cifNumber) {
        this.cifNumber = cifNumber;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public String getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(String currentBalance) {
        this.currentBalance = currentBalance;
    }

    public String getCurrentLimit() {
        return currentLimit;
    }

    public void setCurrentLimit(String currentLimit) {
        this.currentLimit = currentLimit;
    }

    public String getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(String creditLimit) {
        this.creditLimit = creditLimit;
    }

    public String getTraceNumber() {
        return traceNumber;
    }

    public void setTraceNumber(String traceNumber) {
        this.traceNumber = traceNumber;
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

    public boolean isDeletedFlag() {
        return deletedFlag;
    }

    public void setDeletedFlag(boolean deletedFlag) {
        this.deletedFlag = deletedFlag;
    }

    //for testing printout
    @Override
    public String toString() {
        return "Smv{" +
                "id='" + id + '\'' +
                ", cifNumber='" + cifNumber + '\'' +
                ", cardId='" + cardId + '\'' +
                ", status='" + status + '\'' +
                ", cardHolderName='" + cardHolderName + '\'' +
                ", currentBalance='" + currentBalance + '\'' +
                ", currentLimit='" + currentLimit + '\'' +
                ", creditLimit='" + creditLimit + '\'' +
                ", traceNumber='" + traceNumber + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", deletedFlag=" + deletedFlag +
                '}';
    }
}
