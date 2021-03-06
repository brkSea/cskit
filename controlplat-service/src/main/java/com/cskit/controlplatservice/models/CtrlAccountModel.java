/*
package com.cskit.controlplatservice.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldIndex;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;
import java.util.Date;

*/
/**
 * @author Micro
 * @Title: 会员模型
 * @Package com.cskit.controlplatservice.models
 * @Description: 会员级别新币表
 * @date 2018/7/23 10:42
 *//*

@Document(indexName = "members", type = "doc", shards = 5, replicas = 1, refreshInterval = "-1")
public class CtrlAccountModel implements Serializable {
    private static final long serialVersionUID = -1403277873418166911L;
    @io.swagger.annotations.ApiModelProperty(value = "pkid",name = "ctrlAccountId")
    @Id
    private Long ctrlAccountId;

    public long getCtrl_account_id() {
        return ctrl_account_id;
    }

    public void setCtrl_account_id(long ctrl_account_id) {
        this.ctrl_account_id = ctrl_account_id;
    }

    private long ctrl_account_id;
    @io.swagger.annotations.ApiModelProperty(value = "用户code",name = "accountCode")
    private String accountCode;
    @io.swagger.annotations.ApiModelProperty(value = "国际电信区号",name = "countryCode")
    private String countryCode;
    @io.swagger.annotations.ApiModelProperty(value = "手机号",name = "phoneNumber")
    private String phoneNumber;
    @io.swagger.annotations.ApiModelProperty(value = "密码",name = "password")
    private String password;
    @io.swagger.annotations.ApiModelProperty(value = "姓名",name = "name")
    private String name;
    @io.swagger.annotations.ApiModelProperty(value = "岗位",name = "position")
    private String position;
    @io.swagger.annotations.ApiModelProperty(value = "状态：0=未启用；1=启用",name = "status")
    private Boolean status;
    @io.swagger.annotations.ApiModelProperty(value = "强制修改密码标志位：1=需要，0=不需要",name = "resetPassword")
    private Boolean resetPassword;
    @io.swagger.annotations.ApiModelProperty(value = "上一次登录时间",name = "lastLoginDate")
    private Date lastLoginDate;
    @io.swagger.annotations.ApiModelProperty(value = "备注",name = "remark")
    private String remark;
    @io.swagger.annotations.ApiModelProperty(value = "创建人id",name = "createUserId")
    private Long createUserId;
    @io.swagger.annotations.ApiModelProperty(value = "创建人",name = "createUserName")
    private String createUserName;
    @io.swagger.annotations.ApiModelProperty(value = "创建日期",name = "createDate")
    private Date createDate;
    @io.swagger.annotations.ApiModelProperty(value = "修改人id",name = "modifiedUserId")
    private Long modifiedUserId;
    @io.swagger.annotations.ApiModelProperty(value = "修改人",name = "modifiedUserName")
    private String modifiedUserName;
    @io.swagger.annotations.ApiModelProperty(value = "修改时间",name = "modifiedDate")
    private Date modifiedDate;
    @io.swagger.annotations.ApiModelProperty(value = "数据有效性：1=有效；0=无效",name = "valid")
    private Boolean valid;
    @io.swagger.annotations.ApiModelProperty(value = "是否为管理员：1=是；0=否",name = "isAdmin")
    private Boolean isAdmin;
    public Long getCtrlAccountId() {
        return ctrlAccountId;
    }
    */
/**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_ctrl_account.ctrl_account_id
     *
     * @param ctrlAccountId the value for t_ctrl_account.ctrl_account_id
     *
     * @mbg.generated Thu Jul 05 18:11:09 CST 2018
     *//*

    public void setCtrlAccountId(Long ctrlAccountId) {
        this.ctrlAccountId = ctrlAccountId;
    }
    */
/**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_ctrl_account.account_code
     *
     * @return the value of t_ctrl_account.account_code
     *
     * @mbg.generated Thu Jul 05 18:11:09 CST 2018
     *//*

    public String getAccountCode() {
        return accountCode;
    }
    */
/**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_ctrl_account.account_code
     *
     * @param accountCode the value for t_ctrl_account.account_code
     *
     * @mbg.generated Thu Jul 05 18:11:09 CST 2018
     *//*

    public void setAccountCode(String accountCode) {
        this.accountCode = accountCode == null ? null : accountCode.trim();
    }
    */
/**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_ctrl_account.country_code
     *
     * @return the value of t_ctrl_account.country_code
     *
     * @mbg.generated Thu Jul 05 18:11:09 CST 2018
     *//*

    public String getCountryCode() {
        return countryCode;
    }
    */
/**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_ctrl_account.country_code
     *
     * @param countryCode the value for t_ctrl_account.country_code
     *
     * @mbg.generated Thu Jul 05 18:11:09 CST 2018
     *//*

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode == null ? null : countryCode.trim();
    }
    */
/**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_ctrl_account.phone_number
     *
     * @return the value of t_ctrl_account.phone_number
     *
     * @mbg.generated Thu Jul 05 18:11:09 CST 2018
     *//*

    public String getPhoneNumber() {
        return phoneNumber;
    }
    */
/**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_ctrl_account.phone_number
     *
     * @param phoneNumber the value for t_ctrl_account.phone_number
     *
     * @mbg.generated Thu Jul 05 18:11:09 CST 2018
     *//*

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber == null ? null : phoneNumber.trim();
    }
    */
/**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_ctrl_account.password
     *
     * @return the value of t_ctrl_account.password
     *
     * @mbg.generated Thu Jul 05 18:11:09 CST 2018
     *//*

    public String getPassword() {
        return password;
    }
    */
/**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_ctrl_account.password
     *
     * @param password the value for t_ctrl_account.password
     *
     * @mbg.generated Thu Jul 05 18:11:09 CST 2018
     *//*

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }
    */
/**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_ctrl_account.name
     *
     * @return the value of t_ctrl_account.name
     *
     * @mbg.generated Thu Jul 05 18:11:09 CST 2018
     *//*

    public String getName() {
        return name;
    }
    */
/**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_ctrl_account.name
     *
     * @param name the value for t_ctrl_account.name
     *
     * @mbg.generated Thu Jul 05 18:11:09 CST 2018
     *//*

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
    */
/**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_ctrl_account.position
     *
     * @return the value of t_ctrl_account.position
     *
     * @mbg.generated Thu Jul 05 18:11:09 CST 2018
     *//*

    public String getPosition() {
        return position;
    }
    */
/**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_ctrl_account.position
     *
     * @param position the value for t_ctrl_account.position
     *
     * @mbg.generated Thu Jul 05 18:11:09 CST 2018
     *//*

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }
    */
/**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_ctrl_account.status
     *
     * @return the value of t_ctrl_account.status
     *
     * @mbg.generated Thu Jul 05 18:11:09 CST 2018
     *//*

    public Boolean getStatus() {
        return status;
    }
    */
/**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_ctrl_account.status
     *
     * @param status the value for t_ctrl_account.status
     *
     * @mbg.generated Thu Jul 05 18:11:09 CST 2018
     *//*

    public void setStatus(Boolean status) {
        this.status = status;
    }
    */
/**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_ctrl_account.reset_password
     *
     * @return the value of t_ctrl_account.reset_password
     *
     * @mbg.generated Thu Jul 05 18:11:09 CST 2018
     *//*

    public Boolean getResetPassword() {
        return resetPassword;
    }
    */
/**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_ctrl_account.reset_password
     *
     * @param resetPassword the value for t_ctrl_account.reset_password
     *
     * @mbg.generated Thu Jul 05 18:11:09 CST 2018
     *//*

    public void setResetPassword(Boolean resetPassword) {
        this.resetPassword = resetPassword;
    }
    */
/**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_ctrl_account.last_login_date
     *
     * @return the value of t_ctrl_account.last_login_date
     *
     * @mbg.generated Thu Jul 05 18:11:09 CST 2018
     *//*

    public Date getLastLoginDate() {
        return lastLoginDate;
    }
    */
/**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_ctrl_account.last_login_date
     *
     * @param lastLoginDate the value for t_ctrl_account.last_login_date
     *
     * @mbg.generated Thu Jul 05 18:11:09 CST 2018
     *//*

    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }
    */
/**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_ctrl_account.is_admin
     *
     * @return the value of t_ctrl_account.is_admin
     *
     * @mbg.generated Thu Jul 05 18:11:09 CST 2018
     *//*

    public Boolean getIsAdmin() {
        return isAdmin;
    }
    */
/**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_ctrl_account.is_admin
     *
     * @param isAdmin the value for t_ctrl_account.is_admin
     *
     * @mbg.generated Thu Jul 05 18:11:09 CST 2018
     *//*

    public void setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
    }
    */
/**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_ctrl_account.remark
     *
     * @return the value of t_ctrl_account.remark
     *
     * @mbg.generated Thu Jul 05 18:11:09 CST 2018
     *//*

    public String getRemark() {
        return remark;
    }
    */
/**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_ctrl_account.remark
     *
     * @param remark the value for t_ctrl_account.remark
     *
     * @mbg.generated Thu Jul 05 18:11:09 CST 2018
     *//*

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
    */
/**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_ctrl_account.create_user_id
     *
     * @return the value of t_ctrl_account.create_user_id
     *
     * @mbg.generated Thu Jul 05 18:11:09 CST 2018
     *//*

    public Long getCreateUserId() {
        return createUserId;
    }
    */
/**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_ctrl_account.create_user_id
     *
     * @param createUserId the value for t_ctrl_account.create_user_id
     *
     * @mbg.generated Thu Jul 05 18:11:09 CST 2018
     *//*

    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }
    */
/**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_ctrl_account.create_user_name
     *
     * @return the value of t_ctrl_account.create_user_name
     *
     * @mbg.generated Thu Jul 05 18:11:09 CST 2018
     *//*

    public String getCreateUserName() {
        return createUserName;
    }
    */
/**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_ctrl_account.create_user_name
     *
     * @param createUserName the value for t_ctrl_account.create_user_name
     *
     * @mbg.generated Thu Jul 05 18:11:09 CST 2018
     *//*

    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName == null ? null : createUserName.trim();
    }
    */
/**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_ctrl_account.create_date
     *
     * @return the value of t_ctrl_account.create_date
     *
     * @mbg.generated Thu Jul 05 18:11:09 CST 2018
     *//*

    public Date getCreateDate() {
        return createDate;
    }
    */
/**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_ctrl_account.create_date
     *
     * @param createDate the value for t_ctrl_account.create_date
     *
     * @mbg.generated Thu Jul 05 18:11:09 CST 2018
     *//*

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
    */
/**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_ctrl_account.modified_user_id
     *
     * @return the value of t_ctrl_account.modified_user_id
     *
     * @mbg.generated Thu Jul 05 18:11:09 CST 2018
     *//*

    public Long getModifiedUserId() {
        return modifiedUserId;
    }
    */
/**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_ctrl_account.modified_user_id
     *
     * @param modifiedUserId the value for t_ctrl_account.modified_user_id
     *
     * @mbg.generated Thu Jul 05 18:11:09 CST 2018
     *//*

    public void setModifiedUserId(Long modifiedUserId) {
        this.modifiedUserId = modifiedUserId;
    }
    */
/**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_ctrl_account.modified_user_name
     *
     * @return the value of t_ctrl_account.modified_user_name
     *
     * @mbg.generated Thu Jul 05 18:11:09 CST 2018
     *//*

    public String getModifiedUserName() {
        return modifiedUserName;
    }
    */
/**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_ctrl_account.modified_user_name
     *
     * @param modifiedUserName the value for t_ctrl_account.modified_user_name
     *
     * @mbg.generated Thu Jul 05 18:11:09 CST 2018
     *//*

    public void setModifiedUserName(String modifiedUserName) {
        this.modifiedUserName = modifiedUserName == null ? null : modifiedUserName.trim();
    }
    */
/**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_ctrl_account.modified_date
     *
     * @return the value of t_ctrl_account.modified_date
     *
     * @mbg.generated Thu Jul 05 18:11:09 CST 2018
     *//*

    public Date getModifiedDate() {
        return modifiedDate;
    }
    */
/**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_ctrl_account.modified_date
     *
     * @param modifiedDate the value for t_ctrl_account.modified_date
     *
     * @mbg.generated Thu Jul 05 18:11:09 CST 2018
     *//*

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }
    */
/**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_ctrl_account.valid
     *
     * @return the value of t_ctrl_account.valid
     *
     * @mbg.generated Thu Jul 05 18:11:09 CST 2018
     *//*

    public Boolean getValid() {
        return valid;
    }
    */
/**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_ctrl_account.valid
     *
     * @param valid the value for t_ctrl_account.valid
     *
     * @mbg.generated Thu Jul 05 18:11:09 CST 2018
     *//*

    public void setValid(Boolean valid) {
        this.valid = valid;
    }
}
*/
