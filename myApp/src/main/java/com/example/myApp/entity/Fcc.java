package com.example.myApp.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "fcc")
public class Fcc {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private String id;
    @Column(name = "CIF_NUMBER")
    private String cifNumber;
    @Column(name = "IC_NUMBER")
    private String icNumber;
    @Column(name = "OLD_IC_NUMBER")
    private String oldIcNumber;
    @Column(name = "FULL_NAME")
    private String fullName;
    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;
    @Column(name = "CONTRACT")
    private String contract;
    @Column(name = "SELFIE")
    private String selfie;
    @Column(name = "IC_FRONT")
    private String icFront;
    @Column(name = "IC_BACK")
    private String icBack;
    @Column(name = "TRACE_NUMBER")
    private String traceNumber;
    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;
    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;
    @Column(name = "DELETED_FLAG")
    private boolean deletedFlag;

    //constructor with all args
    public Fcc(String id, String cifNumber, String icNumber, String oldIcNumber, String fullName, String phoneNumber, String contract, String selfie, String icFront, String icBack, String traceNumber, LocalDateTime createdAt, LocalDateTime updatedAt, boolean deletedFlag) {
        this.id = id;
        this.cifNumber = cifNumber;
        this.icNumber = icNumber;
        this.oldIcNumber = oldIcNumber;
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.contract = contract;
        this.selfie = selfie;
        this.icFront = icFront;
        this.icBack = icBack;
        this.traceNumber = traceNumber;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.deletedFlag = deletedFlag;
    }
    //Constructor with no args
    public Fcc() {
    }

    //setup setter & getter for all fields
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

    public String getIcNumber() {
        return icNumber;
    }

    public void setIcNumber(String icNumber) {
        this.icNumber = icNumber;
    }

    public String getOldIcNumber() {
        return oldIcNumber;
    }

    public void setOldIcNumber(String oldIcNumber) {
        this.oldIcNumber = oldIcNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getContract() {
        return contract;
    }

    public void setContract(String contract) {
        this.contract = contract;
    }

    public String getSelfie() {
        return selfie;
    }

    public void setSelfie(String selfie) {
        this.selfie = selfie;
    }

    public String getIcFront() {
        return icFront;
    }

    public void setIcFront(String icFront) {
        this.icFront = icFront;
    }

    public String getIcBack() {
        return icBack;
    }

    public void setIcBack(String icBack) {
        this.icBack = icBack;
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

    /**
     * 
     * @return
     */
    @Override
    public String toString() {
        return "Fcc{" +
                "id='" + id + '\'' +
                ", cifNumber='" + cifNumber + '\'' +
                ", icNumber='" + icNumber + '\'' +
                ", oldIcNumber='" + oldIcNumber + '\'' +
                ", fullName='" + fullName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", contract='" + contract + '\'' +
                ", selfie='" + selfie + '\'' +
                ", icFront='" + icFront + '\'' +
                ", icBack='" + icBack + '\'' +
                ", traceNumber='" + traceNumber + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", deletedFlag=" + deletedFlag +
                '}';
    }
}
