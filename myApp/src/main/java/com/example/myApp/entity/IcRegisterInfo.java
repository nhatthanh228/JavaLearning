package com.example.myApp.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "ic_register_info")
public class IcRegisterInfo {
    @Id
    @GeneratedValue
    @Column(name = "ID")
    private String id;
    @Column(name = "CARD_TOKEN")
    private String cardToken;
    @Column(name = "CARD_ID")
    private String cardId;
    @Column(name = "TRACE_NUMBER")
    private String traceNumber;
    @Column(name = "VENDOR_CODE")
    private String vendorCode;
    @Column(name = "PRODUCT_CODE")
    private String productCode;
    @Column(name = "FULL_NAME")
    private String fullName;
    @Column(name = "IC_TYPE")
    private String icType;
    @Column(name = "IC_NUMBER")
    private String icNumber;
    @Column(name = "OLD_IC_NUMBER")
    private String oldIcNumber;
    @Column(name = "ISSUANCE_DATE")
    private String issuanceDate;
    @Column(name = "EXPIRE_DATE")
    private String expireDate;
    @Column(name = "ISSUE_PLACE")
    private String issuePlace;
    @Column(name = "DATE_OF_BIRTH")
    private String dateOfBirth;
    @Column(name = "GENDER")
    private String gender;
    @Column(name = "NATIONALITY")
    private String nationality;
    @Column(name = "MARITAL_STATUS")
    private String maritalStatus;
    @Column(name = "FULL_ADDRESS_PERMANENT")
    private String fullAddressPermanent;
    @Column(name = "PROVINCE_PERMANENT")
    private String provincePermanent;
    @Column(name = "DISTRICT_PERMANENT")
    private String districtPermanent;
    @Column(name = "WARD_PERMANENT")
    private String wardPermanent;
    @Column(name = "FULL_ADDRESS")
    private String fullAddress;
    @Column(name = "PROVINCE")
    private String province;
    @Column(name = "DISTRICT")
    private String district;
    @Column(name = "WARD")
    private String ward;
    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;
    @Column(name = "EMAIL_ADDRESS")
    private String emailAddress;
    @Column(name = "JOB")
    private String job;
    @Column(name = "POSITION")
    private String position;
    @Column(name = "COMPANY_NAME")
    private String companyName;
    @Column(name = "COMPANY_PHONE_NUMBER")
    private String companyPhoneNumber;
    @Column(name = "PROVINCE_COMPANY")
    private String provinceCompany;
    @Column(name = "DISTRICT_COMPANY")
    private String districtCompany;
    @Column(name = "WARD_COMPANY")
    private String wardCompany;
    @Column(name = "MONTH_INCOME")
    private String monthIncome;
    @Column(name = "PAYMENT_RATE")
    private String paymentRate;
    @Column(name = "CREDIT_LIMIT")
    private String creditLimit;
    @Column(name = "FULL_ADDRESS_CARD")
    private String fullAddressCard;
    @Column(name = "PROVINCE_CARD")
    private String provinceCard;
    @Column(name = "DISTRICT_CARD")
    private String districtCard;
    @Column(name = "WARD_CARD")
    private String wardCard;
    @Column(name = "SECURITY_QUESTION")
    private String securityQuestion;
    @Column(name = "SECURITY_ANSWER")
    private String securityAnswer;
    @Column(name = "PHONE_NUMBER_RELATION_1")
    private String phoneNumberRelation1;
    @Column(name = "PHONE_NUMBER_RELATION_2")
    private String phoneNumberRelation2;
    @Column(name = "SALARY_TYPE")
    private String salaryType;
    @Column(name = "ACADEMY_LEVEL")
    private String academyLevel;
    @Column(name = "SCORE_MIMI")
    private String scoreMimi;
    @Column(name = "REF_CODE")
    private String refCode;
    @Column(name = "DEVICE_ID")
    private String deviceId;
    @Column(name = "LOCATION")
    private String location;
    @Column(name = "IPADDRESS")
    private String ipAddress;
    @Column(name = "IMAGES")
    private String images;
    @Column(name = "RCODE")
    private String rCode;
    @Column(name = "CIF_NUMBER")
    private String cifNumber;
    @Column(name = "STATUS_SLS")
    private String statusSls;
    @Column(name = "STATUS_LANDINGPAGE")
    private String statusLandingpage;
    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;
    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;
    @Column(name = "STATUS")
    private String status;
    @Column(name = "STATUS_AML_VMS")
    private String statusAmlVms;
    @Column(name = "STATUS_CHECK_CIF")
    private String statusCheckCif;
    @Column(name = "STATUS_CREATE_CIF")
    private String statusCreateCif;
    @Column(name = "STATUS_CREATE_TKTT")
    private String statusCreateTktt;
    @Column(name = "STATUS_CREATE_TKCT")
    private String statusCreateTkct;
    @Column(name = "STATUS_CREATE_CARD")
    private String statusCreateCard;
    @Column(name = "STATUS_CICS37_PCB")
    private String statusCics37Pcb;
    @Column(name = "ACCOUNT_NO")
    private String accountNo;
    @Column(name = "ACCOUNT_CHUYENTHU")
    private String accountChuyenthu;
    @Column(name = "CARD_NUMBER")
    private String cardNumber;
    @Column(name = "FULL_ADDRESS_COMPANY")
    private String fullAddressCompany;
    @Column(name = "E_SIGN_ID")
    private String eSignId;
    @Column(name = "LANDING_PAGE")
    private String landingPage;
    @Column(name = "URL_REDIRECT_SUCCESS")
    private String urlRedirectSuccess;
    @Column(name = "URL_REDIRECT_FAILED")
    private String urlRedirectFailed;
    @Column(name = "ECM_STATUS")
    private String ecmStatus;
    @Column(name = "TYPE_PROCESS")
    private String typeProcess;
    @Column(name = "CRM_LEAD_ID")
    private String crmLeadId;
    @Column(name = "CRM_STATUS")
    private String crmStatus;
    @Column(name = "DELETED_FLAG")
    private boolean deletedFlag;

    //constructor with all args
    public IcRegisterInfo(String id, String cardToken, String cardId, String traceNumber, String vendorCode, String productCode, String fullName, String icType, String icNumber, String oldIcNumber, String issuanceDate, String expireDate, String issuePlace, String dateOfBirth, String gender, String nationality, String maritalStatus, String fullAddressPermanent, String provincePermanent, String districtPermanent, String wardPermanent, String fullAddress, String province, String district, String ward, String phoneNumber, String emailAddress, String job, String position, String companyName, String companyPhoneNumber, String provinceCompany, String districtCompany, String wardCompany, String monthIncome, String paymentRate, String creditLimit, String fullAddressCard, String provinceCard, String districtCard, String wardCard, String securityQuestion, String securityAnswer, String phoneNumberRelation1, String phoneNumberRelation2, String salaryType, String academyLevel, String scoreMimi, String refCode, String deviceId, String location, String ipAddress, String images, String rCode, String cifNumber, String statusSls, String statusLandingpage, LocalDateTime createdAt, LocalDateTime updatedAt, String status, String statusAmlVms, String statusCheckCif, String statusCreateCif, String statusCreateTktt, String statusCreateTkct, String statusCreateCard, String statusCics37Pcb, String accountNo, String accountChuyenThu, String cardNumber, String fullAddressCompany, String eSignId, String landingPage, String urlRedirectSuccess, String urlRedirectFailed, String ecmStatus, String typeProcess, String crmLeadId, String crmStatus, boolean deletedFlag) {
        this.id = id;
        this.cardToken = cardToken;
        this.cardId = cardId;
        this.traceNumber = traceNumber;
        this.vendorCode = vendorCode;
        this.productCode = productCode;
        this.fullName = fullName;
        this.icType = icType;
        this.icNumber = icNumber;
        this.oldIcNumber = oldIcNumber;
        this.issuanceDate = issuanceDate;
        this.expireDate = expireDate;
        this.issuePlace = issuePlace;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.nationality = nationality;
        this.maritalStatus = maritalStatus;
        this.fullAddressPermanent = fullAddressPermanent;
        this.provincePermanent = provincePermanent;
        this.districtPermanent = districtPermanent;
        this.wardPermanent = wardPermanent;
        this.fullAddress = fullAddress;
        this.province = province;
        this.district = district;
        this.ward = ward;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.job = job;
        this.position = position;
        this.companyName = companyName;
        this.companyPhoneNumber = companyPhoneNumber;
        this.provinceCompany = provinceCompany;
        this.districtCompany = districtCompany;
        this.wardCompany = wardCompany;
        this.monthIncome = monthIncome;
        this.paymentRate = paymentRate;
        this.creditLimit = creditLimit;
        this.fullAddressCard = fullAddressCard;
        this.provinceCard = provinceCard;
        this.districtCard = districtCard;
        this.wardCard = wardCard;
        this.securityQuestion = securityQuestion;
        this.securityAnswer = securityAnswer;
        this.phoneNumberRelation1 = phoneNumberRelation1;
        this.phoneNumberRelation2 = phoneNumberRelation2;
        this.salaryType = salaryType;
        this.academyLevel = academyLevel;
        this.scoreMimi = scoreMimi;
        this.refCode = refCode;
        this.deviceId = deviceId;
        this.location = location;
        this.ipAddress = ipAddress;
        this.images = images;
        this.rCode = rCode;
        this.cifNumber = cifNumber;
        this.statusSls = statusSls;
        this.statusLandingpage = statusLandingpage;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.status = status;
        this.statusAmlVms = statusAmlVms;
        this.statusCheckCif = statusCheckCif;
        this.statusCreateCif = statusCreateCif;
        this.statusCreateTktt = statusCreateTktt;
        this.statusCreateTkct = statusCreateTkct;
        this.statusCreateCard = statusCreateCard;
        this.statusCics37Pcb = statusCics37Pcb;
        this.accountNo = accountNo;
        this.accountChuyenthu = accountChuyenThu;
        this.cardNumber = cardNumber;
        this.fullAddressCompany = fullAddressCompany;
        this.eSignId = eSignId;
        this.landingPage = landingPage;
        this.urlRedirectSuccess = urlRedirectSuccess;
        this.urlRedirectFailed = urlRedirectFailed;
        this.ecmStatus = ecmStatus;
        this.typeProcess = typeProcess;
        this.crmLeadId = crmLeadId;
        this.crmStatus = crmStatus;
        this.deletedFlag = deletedFlag;
    }

    //constructor without args
    public IcRegisterInfo() {
    }

    //setup setter & getter

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCardToken() {
        return cardToken;
    }

    public void setCardToken(String cardToken) {
        this.cardToken = cardToken;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getTraceNumber() {
        return traceNumber;
    }

    public void setTraceNumber(String traceNumber) {
        this.traceNumber = traceNumber;
    }

    public String getVendorCode() {
        return vendorCode;
    }

    public void setVendorCode(String vendorCode) {
        this.vendorCode = vendorCode;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getIcType() {
        return icType;
    }

    public void setIcType(String icType) {
        this.icType = icType;
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

    public String getIssuanceDate() {
        return issuanceDate;
    }

    public void setIssuanceDate(String issuanceDate) {
        this.issuanceDate = issuanceDate;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    public String getIssuePlace() {
        return issuePlace;
    }

    public void setIssuePlace(String issuePlace) {
        this.issuePlace = issuePlace;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getFullAddressPermanent() {
        return fullAddressPermanent;
    }

    public void setFullAddressPermanent(String fullAddressPermanent) {
        this.fullAddressPermanent = fullAddressPermanent;
    }

    public String getProvincePermanent() {
        return provincePermanent;
    }

    public void setProvincePermanent(String provincePermanent) {
        this.provincePermanent = provincePermanent;
    }

    public String getDistrictPermanent() {
        return districtPermanent;
    }

    public void setDistrictPermanent(String districtPermanent) {
        this.districtPermanent = districtPermanent;
    }

    public String getWardPermanent() {
        return wardPermanent;
    }

    public void setWardPermanent(String wardPermanent) {
        this.wardPermanent = wardPermanent;
    }

    public String getFullAddress() {
        return fullAddress;
    }

    public void setFullAddress(String fullAddress) {
        this.fullAddress = fullAddress;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getWard() {
        return ward;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyPhoneNumber() {
        return companyPhoneNumber;
    }

    public void setCompanyPhoneNumber(String companyPhoneNumber) {
        this.companyPhoneNumber = companyPhoneNumber;
    }

    public String getProvinceCompany() {
        return provinceCompany;
    }

    public void setProvinceCompany(String provinceCompany) {
        this.provinceCompany = provinceCompany;
    }

    public String getDistrictCompany() {
        return districtCompany;
    }

    public void setDistrictCompany(String districtCompany) {
        this.districtCompany = districtCompany;
    }

    public String getWardCompany() {
        return wardCompany;
    }

    public void setWardCompany(String wardCompany) {
        this.wardCompany = wardCompany;
    }

    public String getMonthIncome() {
        return monthIncome;
    }

    public void setMonthIncome(String monthIncome) {
        this.monthIncome = monthIncome;
    }

    public String getPaymentRate() {
        return paymentRate;
    }

    public void setPaymentRate(String paymentRate) {
        this.paymentRate = paymentRate;
    }

    public String getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(String creditLimit) {
        this.creditLimit = creditLimit;
    }

    public String getFullAddressCard() {
        return fullAddressCard;
    }

    public void setFullAddressCard(String fullAddressCard) {
        this.fullAddressCard = fullAddressCard;
    }

    public String getProvinceCard() {
        return provinceCard;
    }

    public void setProvinceCard(String provinceCard) {
        this.provinceCard = provinceCard;
    }

    public String getDistrictCard() {
        return districtCard;
    }

    public void setDistrictCard(String districtCard) {
        this.districtCard = districtCard;
    }

    public String getWardCard() {
        return wardCard;
    }

    public void setWardCard(String wardCard) {
        this.wardCard = wardCard;
    }

    public String getSecurityQuestion() {
        return securityQuestion;
    }

    public void setSecurityQuestion(String securityQuestion) {
        this.securityQuestion = securityQuestion;
    }

    public String getSecurityAnswer() {
        return securityAnswer;
    }

    public void setSecurityAnswer(String securityAnswer) {
        this.securityAnswer = securityAnswer;
    }

    public String getPhoneNumberRelation1() {
        return phoneNumberRelation1;
    }

    public void setPhoneNumberRelation1(String phoneNumberRelation1) {
        this.phoneNumberRelation1 = phoneNumberRelation1;
    }

    public String getPhoneNumberRelation2() {
        return phoneNumberRelation2;
    }

    public void setPhoneNumberRelation2(String phoneNumberRelation2) {
        this.phoneNumberRelation2 = phoneNumberRelation2;
    }

    public String getSalaryType() {
        return salaryType;
    }

    public void setSalaryType(String salaryType) {
        this.salaryType = salaryType;
    }

    public String getAcademyLevel() {
        return academyLevel;
    }

    public void setAcademyLevel(String academyLevel) {
        this.academyLevel = academyLevel;
    }

    public String getScoreMimi() {
        return scoreMimi;
    }

    public void setScoreMimi(String scoreMimi) {
        this.scoreMimi = scoreMimi;
    }

    public String getRefCode() {
        return refCode;
    }

    public void setRefCode(String refCode) {
        this.refCode = refCode;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public String getrCode() {
        return rCode;
    }

    public void setrCode(String rCode) {
        this.rCode = rCode;
    }

    public String getCifNumber() {
        return cifNumber;
    }

    public void setCifNumber(String cifNumber) {
        this.cifNumber = cifNumber;
    }

    public String getStatusSls() {
        return statusSls;
    }

    public void setStatusSls(String statusSls) {
        this.statusSls = statusSls;
    }

    public String getStatusLandingpage() {
        return statusLandingpage;
    }

    public void setStatusLandingpage(String statusLandingpage) {
        this.statusLandingpage = statusLandingpage;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatusAmlVms() {
        return statusAmlVms;
    }

    public void setStatusAmlVms(String statusAmlVms) {
        this.statusAmlVms = statusAmlVms;
    }

    public String getStatusCheckCif() {
        return statusCheckCif;
    }

    public void setStatusCheckCif(String statusCheckCif) {
        this.statusCheckCif = statusCheckCif;
    }

    public String getStatusCreateCif() {
        return statusCreateCif;
    }

    public void setStatusCreateCif(String statusCreateCif) {
        this.statusCreateCif = statusCreateCif;
    }

    public String getStatusCreateTktt() {
        return statusCreateTktt;
    }

    public void setStatusCreateTktt(String statusCreateTktt) {
        this.statusCreateTktt = statusCreateTktt;
    }

    public String getStatusCreateTkct() {
        return statusCreateTkct;
    }

    public void setStatusCreateTkct(String statusCreateTkct) {
        this.statusCreateTkct = statusCreateTkct;
    }

    public String getStatusCreateCard() {
        return statusCreateCard;
    }

    public void setStatusCreateCard(String statusCreateCard) {
        this.statusCreateCard = statusCreateCard;
    }

    public String getStatusCics37Pcb() {
        return statusCics37Pcb;
    }

    public void setStatusCics37Pcb(String statusCics37Pcb) {
        this.statusCics37Pcb = statusCics37Pcb;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getAccountChuyenThu() {
        return accountChuyenthu;
    }

    public void setAccountChuyenThu(String accountChuyenThu) {
        this.accountChuyenthu = accountChuyenThu;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getFullAddressCompany() {
        return fullAddressCompany;
    }

    public void setFullAddressCompany(String fullAddressCompany) {
        this.fullAddressCompany = fullAddressCompany;
    }

    public String geteSignId() {
        return eSignId;
    }

    public void seteSignId(String eSignId) {
        this.eSignId = eSignId;
    }

    public String getLandingPage() {
        return landingPage;
    }

    public void setLandingPage(String landingPage) {
        this.landingPage = landingPage;
    }

    public String getUrlRedirectSuccess() {
        return urlRedirectSuccess;
    }

    public void setUrlRedirectSuccess(String urlRedirectSuccess) {
        this.urlRedirectSuccess = urlRedirectSuccess;
    }

    public String getUrlRedirectFailed() {
        return urlRedirectFailed;
    }

    public void setUrlRedirectFailed(String urlRedirectFailed) {
        this.urlRedirectFailed = urlRedirectFailed;
    }

    public String getEcmStatus() {
        return ecmStatus;
    }

    public void setEcmStatus(String ecmStatus) {
        this.ecmStatus = ecmStatus;
    }

    public String getTypeProcess() {
        return typeProcess;
    }

    public void setTypeProcess(String typeProcess) {
        this.typeProcess = typeProcess;
    }

    public String getCrmLeadId() {
        return crmLeadId;
    }

    public void setCrmLeadId(String crmLeadId) {
        this.crmLeadId = crmLeadId;
    }

    public String getCrmStatus() {
        return crmStatus;
    }

    public void setCrmStatus(String crmStatus) {
        this.crmStatus = crmStatus;
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
        return "IcRegisterInfo{" +
                "id='" + id + '\'' +
                ", cardToken='" + cardToken + '\'' +
                ", cardId='" + cardId + '\'' +
                ", traceNumber='" + traceNumber + '\'' +
                ", vendorCode='" + vendorCode + '\'' +
                ", productCode='" + productCode + '\'' +
                ", fullName='" + fullName + '\'' +
                ", icType='" + icType + '\'' +
                ", icNumber='" + icNumber + '\'' +
                ", oldIcNumber='" + oldIcNumber + '\'' +
                ", issuanceDate='" + issuanceDate + '\'' +
                ", expireDate='" + expireDate + '\'' +
                ", issuePlace='" + issuePlace + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", gender='" + gender + '\'' +
                ", nationality='" + nationality + '\'' +
                ", maritalStatus='" + maritalStatus + '\'' +
                ", fullAddressPermanent='" + fullAddressPermanent + '\'' +
                ", provincePermanent='" + provincePermanent + '\'' +
                ", districtPermanent='" + districtPermanent + '\'' +
                ", wardPermanent='" + wardPermanent + '\'' +
                ", fullAddress='" + fullAddress + '\'' +
                ", province='" + province + '\'' +
                ", district='" + district + '\'' +
                ", ward='" + ward + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", job='" + job + '\'' +
                ", position='" + position + '\'' +
                ", companyName='" + companyName + '\'' +
                ", companyPhoneNumber='" + companyPhoneNumber + '\'' +
                ", provinceCompany='" + provinceCompany + '\'' +
                ", districtCompany='" + districtCompany + '\'' +
                ", wardCompany='" + wardCompany + '\'' +
                ", monthIncome='" + monthIncome + '\'' +
                ", paymentRate='" + paymentRate + '\'' +
                ", creditLimit='" + creditLimit + '\'' +
                ", fullAddressCard='" + fullAddressCard + '\'' +
                ", provinceCard='" + provinceCard + '\'' +
                ", districtCard='" + districtCard + '\'' +
                ", wardCard='" + wardCard + '\'' +
                ", securityQuestion='" + securityQuestion + '\'' +
                ", securityAnswer='" + securityAnswer + '\'' +
                ", phoneNumberRelation1='" + phoneNumberRelation1 + '\'' +
                ", phoneNumberRelation2='" + phoneNumberRelation2 + '\'' +
                ", salaryType='" + salaryType + '\'' +
                ", academyLevel='" + academyLevel + '\'' +
                ", scoreMimi='" + scoreMimi + '\'' +
                ", refCode='" + refCode + '\'' +
                ", deviceId='" + deviceId + '\'' +
                ", location='" + location + '\'' +
                ", ipAddress='" + ipAddress + '\'' +
                ", images='" + images + '\'' +
                ", rCode='" + rCode + '\'' +
                ", cifNumber='" + cifNumber + '\'' +
                ", statusSls='" + statusSls + '\'' +
                ", statusLandingpage='" + statusLandingpage + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", status='" + status + '\'' +
                ", statusAmlVms='" + statusAmlVms + '\'' +
                ", statusCheckCif='" + statusCheckCif + '\'' +
                ", statusCreateCif='" + statusCreateCif + '\'' +
                ", statusCreateTktt='" + statusCreateTktt + '\'' +
                ", statusCreateTkct='" + statusCreateTkct + '\'' +
                ", statusCreateCard='" + statusCreateCard + '\'' +
                ", statusCics37Pcb='" + statusCics37Pcb + '\'' +
                ", accountNo='" + accountNo + '\'' +
                ", accountChuyenThu='" + accountChuyenthu + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", fullAddressCompany='" + fullAddressCompany + '\'' +
                ", eSignId='" + eSignId + '\'' +
                ", landingPage='" + landingPage + '\'' +
                ", urlRedirectSuccess='" + urlRedirectSuccess + '\'' +
                ", urlRedirectFailed='" + urlRedirectFailed + '\'' +
                ", ecmStatus='" + ecmStatus + '\'' +
                ", typeProcess='" + typeProcess + '\'' +
                ", crmLeadId='" + crmLeadId + '\'' +
                ", crmStatus='" + crmStatus + '\'' +
                ", deletedFlag=" + deletedFlag +
                '}';
    }
}
