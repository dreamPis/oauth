/*
 * This file is generated by jOOQ.
*/
package club.ndt.oauth.boot.entity.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 农业信用基础信息
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VillagePersonalBaseinfoPjo implements Serializable {

    private static final long serialVersionUID = -1768334015;

    private BigDecimal id;
    private String     name;
    private Short      gender;
    private Integer    maritalStatus;
    private String     birth;
    private String     phone;
    private String     address;
    private Integer    papersType;
    private String     papersId;
    private Integer    workingType;
    private Integer    operatingArea;
    private Integer    breedingNumber;
    private Integer    machineNumber;
    private Integer    managerLevel;
    private Integer    personalLiabilityAmount;
    private Short      status;
    private BigDecimal createUser;
    private Timestamp  createTime;
    private BigDecimal updateUser;
    private Timestamp  updateTime;
    private BigDecimal divisionId;

    public VillagePersonalBaseinfoPjo() {}

    public VillagePersonalBaseinfoPjo(VillagePersonalBaseinfoPjo value) {
        this.id = value.id;
        this.name = value.name;
        this.gender = value.gender;
        this.maritalStatus = value.maritalStatus;
        this.birth = value.birth;
        this.phone = value.phone;
        this.address = value.address;
        this.papersType = value.papersType;
        this.papersId = value.papersId;
        this.workingType = value.workingType;
        this.operatingArea = value.operatingArea;
        this.breedingNumber = value.breedingNumber;
        this.machineNumber = value.machineNumber;
        this.managerLevel = value.managerLevel;
        this.personalLiabilityAmount = value.personalLiabilityAmount;
        this.status = value.status;
        this.createUser = value.createUser;
        this.createTime = value.createTime;
        this.updateUser = value.updateUser;
        this.updateTime = value.updateTime;
        this.divisionId = value.divisionId;
    }

    public VillagePersonalBaseinfoPjo(
        BigDecimal id,
        String     name,
        Short      gender,
        Integer    maritalStatus,
        String     birth,
        String     phone,
        String     address,
        Integer    papersType,
        String     papersId,
        Integer    workingType,
        Integer    operatingArea,
        Integer    breedingNumber,
        Integer    machineNumber,
        Integer    managerLevel,
        Integer    personalLiabilityAmount,
        Short      status,
        BigDecimal createUser,
        Timestamp  createTime,
        BigDecimal updateUser,
        Timestamp  updateTime,
        BigDecimal divisionId
    ) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
        this.birth = birth;
        this.phone = phone;
        this.address = address;
        this.papersType = papersType;
        this.papersId = papersId;
        this.workingType = workingType;
        this.operatingArea = operatingArea;
        this.breedingNumber = breedingNumber;
        this.machineNumber = machineNumber;
        this.managerLevel = managerLevel;
        this.personalLiabilityAmount = personalLiabilityAmount;
        this.status = status;
        this.createUser = createUser;
        this.createTime = createTime;
        this.updateUser = updateUser;
        this.updateTime = updateTime;
        this.divisionId = divisionId;
    }

    public BigDecimal getId() {
        return this.id;
    }

    public VillagePersonalBaseinfoPjo setId(BigDecimal id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public VillagePersonalBaseinfoPjo setName(String name) {
        this.name = name;
        return this;
    }

    public Short getGender() {
        return this.gender;
    }

    public VillagePersonalBaseinfoPjo setGender(Short gender) {
        this.gender = gender;
        return this;
    }

    public Integer getMaritalStatus() {
        return this.maritalStatus;
    }

    public VillagePersonalBaseinfoPjo setMaritalStatus(Integer maritalStatus) {
        this.maritalStatus = maritalStatus;
        return this;
    }

    public String getBirth() {
        return this.birth;
    }

    public VillagePersonalBaseinfoPjo setBirth(String birth) {
        this.birth = birth;
        return this;
    }

    public String getPhone() {
        return this.phone;
    }

    public VillagePersonalBaseinfoPjo setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getAddress() {
        return this.address;
    }

    public VillagePersonalBaseinfoPjo setAddress(String address) {
        this.address = address;
        return this;
    }

    public Integer getPapersType() {
        return this.papersType;
    }

    public VillagePersonalBaseinfoPjo setPapersType(Integer papersType) {
        this.papersType = papersType;
        return this;
    }

    public String getPapersId() {
        return this.papersId;
    }

    public VillagePersonalBaseinfoPjo setPapersId(String papersId) {
        this.papersId = papersId;
        return this;
    }

    public Integer getWorkingType() {
        return this.workingType;
    }

    public VillagePersonalBaseinfoPjo setWorkingType(Integer workingType) {
        this.workingType = workingType;
        return this;
    }

    public Integer getOperatingArea() {
        return this.operatingArea;
    }

    public VillagePersonalBaseinfoPjo setOperatingArea(Integer operatingArea) {
        this.operatingArea = operatingArea;
        return this;
    }

    public Integer getBreedingNumber() {
        return this.breedingNumber;
    }

    public VillagePersonalBaseinfoPjo setBreedingNumber(Integer breedingNumber) {
        this.breedingNumber = breedingNumber;
        return this;
    }

    public Integer getMachineNumber() {
        return this.machineNumber;
    }

    public VillagePersonalBaseinfoPjo setMachineNumber(Integer machineNumber) {
        this.machineNumber = machineNumber;
        return this;
    }

    public Integer getManagerLevel() {
        return this.managerLevel;
    }

    public VillagePersonalBaseinfoPjo setManagerLevel(Integer managerLevel) {
        this.managerLevel = managerLevel;
        return this;
    }

    public Integer getPersonalLiabilityAmount() {
        return this.personalLiabilityAmount;
    }

    public VillagePersonalBaseinfoPjo setPersonalLiabilityAmount(Integer personalLiabilityAmount) {
        this.personalLiabilityAmount = personalLiabilityAmount;
        return this;
    }

    public Short getStatus() {
        return this.status;
    }

    public VillagePersonalBaseinfoPjo setStatus(Short status) {
        this.status = status;
        return this;
    }

    public BigDecimal getCreateUser() {
        return this.createUser;
    }

    public VillagePersonalBaseinfoPjo setCreateUser(BigDecimal createUser) {
        this.createUser = createUser;
        return this;
    }

    public Timestamp getCreateTime() {
        return this.createTime;
    }

    public VillagePersonalBaseinfoPjo setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
        return this;
    }

    public BigDecimal getUpdateUser() {
        return this.updateUser;
    }

    public VillagePersonalBaseinfoPjo setUpdateUser(BigDecimal updateUser) {
        this.updateUser = updateUser;
        return this;
    }

    public Timestamp getUpdateTime() {
        return this.updateTime;
    }

    public VillagePersonalBaseinfoPjo setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    public BigDecimal getDivisionId() {
        return this.divisionId;
    }

    public VillagePersonalBaseinfoPjo setDivisionId(BigDecimal divisionId) {
        this.divisionId = divisionId;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("VillagePersonalBaseinfoPjo (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(gender);
        sb.append(", ").append(maritalStatus);
        sb.append(", ").append(birth);
        sb.append(", ").append(phone);
        sb.append(", ").append(address);
        sb.append(", ").append(papersType);
        sb.append(", ").append(papersId);
        sb.append(", ").append(workingType);
        sb.append(", ").append(operatingArea);
        sb.append(", ").append(breedingNumber);
        sb.append(", ").append(machineNumber);
        sb.append(", ").append(managerLevel);
        sb.append(", ").append(personalLiabilityAmount);
        sb.append(", ").append(status);
        sb.append(", ").append(createUser);
        sb.append(", ").append(createTime);
        sb.append(", ").append(updateUser);
        sb.append(", ").append(updateTime);
        sb.append(", ").append(divisionId);

        sb.append(")");
        return sb.toString();
    }
}
