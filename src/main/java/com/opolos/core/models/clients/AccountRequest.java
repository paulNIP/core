package com.opolos.core.models.clients;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class AccountRequest {

  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  @Column(name="id")
  private long id;

    private String fname;
    private String lname;
    private String gender;
    private String country;
    private String p_email;
    private String p_tel;
    private String department;
    private String positions;
    private String c_email;
    private String c_tel;
    private String c_website;
    private String company;
    private String size;
    private String businees_type;
    private String sector;
    private String info;
    private String country_operation;
    private String product;
    private String product_specify;
    private String pckge;
    private String created_at;
    private String session_id;
    private String instanceid;
    private String request_status;
    private String date_of_approval;
    private String starts;
    private String ends;
    private String account;
    private String versions;
    private String running_month;
    private String client_id;
    private String fname_old;
    private String fname_editor_id;
    private String fname_datetime;
    private String lname_old;
    private String lname_editor_id;
    private String lname_datetime;
    private String gender_old;
    private String gender_editor_id;
    private String gender_datetime;
    private String p_email_old;
    private String p_email_editor_id;
    private String p_email_datetime;
    private String p_tel_old;
    private String p_tel_editor_id;
    private String p_tel_datetime;
    private String department_old;
    private String department_editor_id;
    private String department_datetime;
    private String positions_old;
    private String positions_editor_id;
    private String positions_datetime;
    private String last_update5;
    private String company_old;
    private String company_editor_id;
    private String company_datetime;
    private String sector_old;
    private String sector_editor_id;
    private String sector_datetime;
    private String businees_type_old;
    private String businees_type_editor_id;
    private String businees_type_datetime;
    private String c_email_old;
    private String c_email_editor_id;
    private String c_email_datetime;
    private String c_tel_old;
    private String c_tel_editor_id;
    private String c_tel_datetime;
    private String c_website_old;
    private String c_website_editor_id;
    private String c_website_datetime;
    private String info_old;
    private String info_editor_id;
    private String info_datetime;
    private String last_update4;
    private String account_old;
    private String account_editor_id;
    private String account_datetime;
    private String product_old;
    private String product_editor_id;
    private String product_datetime;
    private String package_old;
    private String package_editor_id;
    private String package_datetime;
    private String versions_old;
    private String versions_editor_id;
    private String versions_datetime;
    private String starts_old;
    private String starts_editor_id;
    private String starts_datetime;
    private String ends_old;
    private String ends_editor_id;
    private String ends_datetime;
    private String last_update2;
    private String request_status_old;
    private String request_status_editor_id;
    private String request_status_datetime;
    private String last_update;

    public AccountRequest(String fname, String lname, String gender, String country, String p_email, String p_tel,
            String department, String positions, String c_email, String c_tel, String c_website, String company,
            String size, String businees_type, String sector, String info, String country_operation, String product,
            String product_specify, String pckge, String created_at, String session_id, String instanceid,
            String request_status, String date_of_approval, String starts, String ends, String account, String versions,
            String running_month, String client_id, String fname_old, String fname_editor_id, String fname_datetime,
            String lname_old, String lname_editor_id, String lname_datetime, String gender_old, String gender_editor_id,
            String gender_datetime, String p_email_old, String p_email_editor_id, String p_email_datetime,
            String p_tel_old, String p_tel_editor_id, String p_tel_datetime, String department_old,
            String department_editor_id, String department_datetime, String positions_old, String positions_editor_id,
            String positions_datetime, String last_update5, String company_old, String company_editor_id,
            String company_datetime, String sector_old, String sector_editor_id, String sector_datetime,
            String businees_type_old, String businees_type_editor_id, String businees_type_datetime, String c_email_old,
            String c_email_editor_id, String c_email_datetime, String c_tel_old, String c_tel_editor_id,
            String c_tel_datetime, String c_website_old, String c_website_editor_id, String c_website_datetime,
            String info_old, String info_editor_id, String info_datetime, String last_update4, String account_old,
            String account_editor_id, String account_datetime, String product_old, String product_editor_id,
            String product_datetime, String package_old, String package_editor_id, String package_datetime,
            String versions_old, String versions_editor_id, String versions_datetime, String starts_old,
            String starts_editor_id, String starts_datetime, String ends_old, String ends_editor_id,
            String ends_datetime, String last_update2, String request_status_old, String request_status_editor_id,
            String request_status_datetime, String last_update) {
        this.fname = fname;
        this.lname = lname;
        this.gender = gender;
        this.country = country;
        this.p_email = p_email;
        this.p_tel = p_tel;
        this.department = department;
        this.positions = positions;
        this.c_email = c_email;
        this.c_tel = c_tel;
        this.c_website = c_website;
        this.company = company;
        this.size = size;
        this.businees_type = businees_type;
        this.sector = sector;
        this.info = info;
        this.country_operation = country_operation;
        this.product = product;
        this.product_specify = product_specify;
        this.pckge = pckge;
        this.created_at = created_at;
        this.session_id = session_id;
        this.instanceid = instanceid;
        this.request_status = request_status;
        this.date_of_approval = date_of_approval;
        this.starts = starts;
        this.ends = ends;
        this.account = account;
        this.versions = versions;
        this.running_month = running_month;
        this.client_id = client_id;
        this.fname_old = fname_old;
        this.fname_editor_id = fname_editor_id;
        this.fname_datetime = fname_datetime;
        this.lname_old = lname_old;
        this.lname_editor_id = lname_editor_id;
        this.lname_datetime = lname_datetime;
        this.gender_old = gender_old;
        this.gender_editor_id = gender_editor_id;
        this.gender_datetime = gender_datetime;
        this.p_email_old = p_email_old;
        this.p_email_editor_id = p_email_editor_id;
        this.p_email_datetime = p_email_datetime;
        this.p_tel_old = p_tel_old;
        this.p_tel_editor_id = p_tel_editor_id;
        this.p_tel_datetime = p_tel_datetime;
        this.department_old = department_old;
        this.department_editor_id = department_editor_id;
        this.department_datetime = department_datetime;
        this.positions_old = positions_old;
        this.positions_editor_id = positions_editor_id;
        this.positions_datetime = positions_datetime;
        this.last_update5 = last_update5;
        this.company_old = company_old;
        this.company_editor_id = company_editor_id;
        this.company_datetime = company_datetime;
        this.sector_old = sector_old;
        this.sector_editor_id = sector_editor_id;
        this.sector_datetime = sector_datetime;
        this.businees_type_old = businees_type_old;
        this.businees_type_editor_id = businees_type_editor_id;
        this.businees_type_datetime = businees_type_datetime;
        this.c_email_old = c_email_old;
        this.c_email_editor_id = c_email_editor_id;
        this.c_email_datetime = c_email_datetime;
        this.c_tel_old = c_tel_old;
        this.c_tel_editor_id = c_tel_editor_id;
        this.c_tel_datetime = c_tel_datetime;
        this.c_website_old = c_website_old;
        this.c_website_editor_id = c_website_editor_id;
        this.c_website_datetime = c_website_datetime;
        this.info_old = info_old;
        this.info_editor_id = info_editor_id;
        this.info_datetime = info_datetime;
        this.last_update4 = last_update4;
        this.account_old = account_old;
        this.account_editor_id = account_editor_id;
        this.account_datetime = account_datetime;
        this.product_old = product_old;
        this.product_editor_id = product_editor_id;
        this.product_datetime = product_datetime;
        this.package_old = package_old;
        this.package_editor_id = package_editor_id;
        this.package_datetime = package_datetime;
        this.versions_old = versions_old;
        this.versions_editor_id = versions_editor_id;
        this.versions_datetime = versions_datetime;
        this.starts_old = starts_old;
        this.starts_editor_id = starts_editor_id;
        this.starts_datetime = starts_datetime;
        this.ends_old = ends_old;
        this.ends_editor_id = ends_editor_id;
        this.ends_datetime = ends_datetime;
        this.last_update2 = last_update2;
        this.request_status_old = request_status_old;
        this.request_status_editor_id = request_status_editor_id;
        this.request_status_datetime = request_status_datetime;
        this.last_update = last_update;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getP_email() {
        return p_email;
    }

    public void setP_email(String p_email) {
        this.p_email = p_email;
    }

    public String getP_tel() {
        return p_tel;
    }

    public void setP_tel(String p_tel) {
        this.p_tel = p_tel;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPositions() {
        return positions;
    }

    public void setPositions(String positions) {
        this.positions = positions;
    }

    public String getC_email() {
        return c_email;
    }

    public void setC_email(String c_email) {
        this.c_email = c_email;
    }

    public String getC_tel() {
        return c_tel;
    }

    public void setC_tel(String c_tel) {
        this.c_tel = c_tel;
    }

    public String getC_website() {
        return c_website;
    }

    public void setC_website(String c_website) {
        this.c_website = c_website;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getBusinees_type() {
        return businees_type;
    }

    public void setBusinees_type(String businees_type) {
        this.businees_type = businees_type;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getCountry_operation() {
        return country_operation;
    }

    public void setCountry_operation(String country_operation) {
        this.country_operation = country_operation;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getProduct_specify() {
        return product_specify;
    }

    public void setProduct_specify(String product_specify) {
        this.product_specify = product_specify;
    }

    public String getPckge() {
        return pckge;
    }

    public void setPckge(String pckge) {
        this.pckge = pckge;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getSession_id() {
        return session_id;
    }

    public void setSession_id(String session_id) {
        this.session_id = session_id;
    }

    public String getInstanceid() {
        return instanceid;
    }

    public void setInstanceid(String instanceid) {
        this.instanceid = instanceid;
    }

    public String getRequest_status() {
        return request_status;
    }

    public void setRequest_status(String request_status) {
        this.request_status = request_status;
    }

    public String getDate_of_approval() {
        return date_of_approval;
    }

    public void setDate_of_approval(String date_of_approval) {
        this.date_of_approval = date_of_approval;
    }

    public String getStarts() {
        return starts;
    }

    public void setStarts(String starts) {
        this.starts = starts;
    }

    public String getEnds() {
        return ends;
    }

    public void setEnds(String ends) {
        this.ends = ends;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getVersions() {
        return versions;
    }

    public void setVersions(String versions) {
        this.versions = versions;
    }

    public String getRunning_month() {
        return running_month;
    }

    public void setRunning_month(String running_month) {
        this.running_month = running_month;
    }

    public String getClient_id() {
        return client_id;
    }

    public void setClient_id(String client_id) {
        this.client_id = client_id;
    }

    public String getFname_old() {
        return fname_old;
    }

    public void setFname_old(String fname_old) {
        this.fname_old = fname_old;
    }

    public String getFname_editor_id() {
        return fname_editor_id;
    }

    public void setFname_editor_id(String fname_editor_id) {
        this.fname_editor_id = fname_editor_id;
    }

    public String getFname_datetime() {
        return fname_datetime;
    }

    public void setFname_datetime(String fname_datetime) {
        this.fname_datetime = fname_datetime;
    }

    public String getLname_old() {
        return lname_old;
    }

    public void setLname_old(String lname_old) {
        this.lname_old = lname_old;
    }

    public String getLname_editor_id() {
        return lname_editor_id;
    }

    public void setLname_editor_id(String lname_editor_id) {
        this.lname_editor_id = lname_editor_id;
    }

    public String getLname_datetime() {
        return lname_datetime;
    }

    public void setLname_datetime(String lname_datetime) {
        this.lname_datetime = lname_datetime;
    }

    public String getGender_old() {
        return gender_old;
    }

    public void setGender_old(String gender_old) {
        this.gender_old = gender_old;
    }

    public String getGender_editor_id() {
        return gender_editor_id;
    }

    public void setGender_editor_id(String gender_editor_id) {
        this.gender_editor_id = gender_editor_id;
    }

    public String getGender_datetime() {
        return gender_datetime;
    }

    public void setGender_datetime(String gender_datetime) {
        this.gender_datetime = gender_datetime;
    }

    public String getP_email_old() {
        return p_email_old;
    }

    public void setP_email_old(String p_email_old) {
        this.p_email_old = p_email_old;
    }

    public String getP_email_editor_id() {
        return p_email_editor_id;
    }

    public void setP_email_editor_id(String p_email_editor_id) {
        this.p_email_editor_id = p_email_editor_id;
    }

    public String getP_email_datetime() {
        return p_email_datetime;
    }

    public void setP_email_datetime(String p_email_datetime) {
        this.p_email_datetime = p_email_datetime;
    }

    public String getP_tel_old() {
        return p_tel_old;
    }

    public void setP_tel_old(String p_tel_old) {
        this.p_tel_old = p_tel_old;
    }

    public String getP_tel_editor_id() {
        return p_tel_editor_id;
    }

    public void setP_tel_editor_id(String p_tel_editor_id) {
        this.p_tel_editor_id = p_tel_editor_id;
    }

    public String getP_tel_datetime() {
        return p_tel_datetime;
    }

    public void setP_tel_datetime(String p_tel_datetime) {
        this.p_tel_datetime = p_tel_datetime;
    }

    public String getDepartment_old() {
        return department_old;
    }

    public void setDepartment_old(String department_old) {
        this.department_old = department_old;
    }

    public String getDepartment_editor_id() {
        return department_editor_id;
    }

    public void setDepartment_editor_id(String department_editor_id) {
        this.department_editor_id = department_editor_id;
    }

    public String getDepartment_datetime() {
        return department_datetime;
    }

    public void setDepartment_datetime(String department_datetime) {
        this.department_datetime = department_datetime;
    }

    public String getPositions_old() {
        return positions_old;
    }

    public void setPositions_old(String positions_old) {
        this.positions_old = positions_old;
    }

    public String getPositions_editor_id() {
        return positions_editor_id;
    }

    public void setPositions_editor_id(String positions_editor_id) {
        this.positions_editor_id = positions_editor_id;
    }

    public String getPositions_datetime() {
        return positions_datetime;
    }

    public void setPositions_datetime(String positions_datetime) {
        this.positions_datetime = positions_datetime;
    }

    public String getLast_update5() {
        return last_update5;
    }

    public void setLast_update5(String last_update5) {
        this.last_update5 = last_update5;
    }

    public String getCompany_old() {
        return company_old;
    }

    public void setCompany_old(String company_old) {
        this.company_old = company_old;
    }

    public String getCompany_editor_id() {
        return company_editor_id;
    }

    public void setCompany_editor_id(String company_editor_id) {
        this.company_editor_id = company_editor_id;
    }

    public String getCompany_datetime() {
        return company_datetime;
    }

    public void setCompany_datetime(String company_datetime) {
        this.company_datetime = company_datetime;
    }

    public String getSector_old() {
        return sector_old;
    }

    public void setSector_old(String sector_old) {
        this.sector_old = sector_old;
    }

    public String getSector_editor_id() {
        return sector_editor_id;
    }

    public void setSector_editor_id(String sector_editor_id) {
        this.sector_editor_id = sector_editor_id;
    }

    public String getSector_datetime() {
        return sector_datetime;
    }

    public void setSector_datetime(String sector_datetime) {
        this.sector_datetime = sector_datetime;
    }

    public String getBusinees_type_old() {
        return businees_type_old;
    }

    public void setBusinees_type_old(String businees_type_old) {
        this.businees_type_old = businees_type_old;
    }

    public String getBusinees_type_editor_id() {
        return businees_type_editor_id;
    }

    public void setBusinees_type_editor_id(String businees_type_editor_id) {
        this.businees_type_editor_id = businees_type_editor_id;
    }

    public String getBusinees_type_datetime() {
        return businees_type_datetime;
    }

    public void setBusinees_type_datetime(String businees_type_datetime) {
        this.businees_type_datetime = businees_type_datetime;
    }

    public String getC_email_old() {
        return c_email_old;
    }

    public void setC_email_old(String c_email_old) {
        this.c_email_old = c_email_old;
    }

    public String getC_email_editor_id() {
        return c_email_editor_id;
    }

    public void setC_email_editor_id(String c_email_editor_id) {
        this.c_email_editor_id = c_email_editor_id;
    }

    public String getC_email_datetime() {
        return c_email_datetime;
    }

    public void setC_email_datetime(String c_email_datetime) {
        this.c_email_datetime = c_email_datetime;
    }

    public String getC_tel_old() {
        return c_tel_old;
    }

    public void setC_tel_old(String c_tel_old) {
        this.c_tel_old = c_tel_old;
    }

    public String getC_tel_editor_id() {
        return c_tel_editor_id;
    }

    public void setC_tel_editor_id(String c_tel_editor_id) {
        this.c_tel_editor_id = c_tel_editor_id;
    }

    public String getC_tel_datetime() {
        return c_tel_datetime;
    }

    public void setC_tel_datetime(String c_tel_datetime) {
        this.c_tel_datetime = c_tel_datetime;
    }

    public String getC_website_old() {
        return c_website_old;
    }

    public void setC_website_old(String c_website_old) {
        this.c_website_old = c_website_old;
    }

    public String getC_website_editor_id() {
        return c_website_editor_id;
    }

    public void setC_website_editor_id(String c_website_editor_id) {
        this.c_website_editor_id = c_website_editor_id;
    }

    public String getC_website_datetime() {
        return c_website_datetime;
    }

    public void setC_website_datetime(String c_website_datetime) {
        this.c_website_datetime = c_website_datetime;
    }

    public String getInfo_old() {
        return info_old;
    }

    public void setInfo_old(String info_old) {
        this.info_old = info_old;
    }

    public String getInfo_editor_id() {
        return info_editor_id;
    }

    public void setInfo_editor_id(String info_editor_id) {
        this.info_editor_id = info_editor_id;
    }

    public String getInfo_datetime() {
        return info_datetime;
    }

    public void setInfo_datetime(String info_datetime) {
        this.info_datetime = info_datetime;
    }

    public String getLast_update4() {
        return last_update4;
    }

    public void setLast_update4(String last_update4) {
        this.last_update4 = last_update4;
    }

    public String getAccount_old() {
        return account_old;
    }

    public void setAccount_old(String account_old) {
        this.account_old = account_old;
    }

    public String getAccount_editor_id() {
        return account_editor_id;
    }

    public void setAccount_editor_id(String account_editor_id) {
        this.account_editor_id = account_editor_id;
    }

    public String getAccount_datetime() {
        return account_datetime;
    }

    public void setAccount_datetime(String account_datetime) {
        this.account_datetime = account_datetime;
    }

    public String getProduct_old() {
        return product_old;
    }

    public void setProduct_old(String product_old) {
        this.product_old = product_old;
    }

    public String getProduct_editor_id() {
        return product_editor_id;
    }

    public void setProduct_editor_id(String product_editor_id) {
        this.product_editor_id = product_editor_id;
    }

    public String getProduct_datetime() {
        return product_datetime;
    }

    public void setProduct_datetime(String product_datetime) {
        this.product_datetime = product_datetime;
    }

    public String getPackage_old() {
        return package_old;
    }

    public void setPackage_old(String package_old) {
        this.package_old = package_old;
    }

    public String getPackage_editor_id() {
        return package_editor_id;
    }

    public void setPackage_editor_id(String package_editor_id) {
        this.package_editor_id = package_editor_id;
    }

    public String getPackage_datetime() {
        return package_datetime;
    }

    public void setPackage_datetime(String package_datetime) {
        this.package_datetime = package_datetime;
    }

    public String getVersions_old() {
        return versions_old;
    }

    public void setVersions_old(String versions_old) {
        this.versions_old = versions_old;
    }

    public String getVersions_editor_id() {
        return versions_editor_id;
    }

    public void setVersions_editor_id(String versions_editor_id) {
        this.versions_editor_id = versions_editor_id;
    }

    public String getVersions_datetime() {
        return versions_datetime;
    }

    public void setVersions_datetime(String versions_datetime) {
        this.versions_datetime = versions_datetime;
    }

    public String getStarts_old() {
        return starts_old;
    }

    public void setStarts_old(String starts_old) {
        this.starts_old = starts_old;
    }

    public String getStarts_editor_id() {
        return starts_editor_id;
    }

    public void setStarts_editor_id(String starts_editor_id) {
        this.starts_editor_id = starts_editor_id;
    }

    public String getStarts_datetime() {
        return starts_datetime;
    }

    public void setStarts_datetime(String starts_datetime) {
        this.starts_datetime = starts_datetime;
    }

    public String getEnds_old() {
        return ends_old;
    }

    public void setEnds_old(String ends_old) {
        this.ends_old = ends_old;
    }

    public String getEnds_editor_id() {
        return ends_editor_id;
    }

    public void setEnds_editor_id(String ends_editor_id) {
        this.ends_editor_id = ends_editor_id;
    }

    public String getEnds_datetime() {
        return ends_datetime;
    }

    public void setEnds_datetime(String ends_datetime) {
        this.ends_datetime = ends_datetime;
    }

    public String getLast_update2() {
        return last_update2;
    }

    public void setLast_update2(String last_update2) {
        this.last_update2 = last_update2;
    }

    public String getRequest_status_old() {
        return request_status_old;
    }

    public void setRequest_status_old(String request_status_old) {
        this.request_status_old = request_status_old;
    }

    public String getRequest_status_editor_id() {
        return request_status_editor_id;
    }

    public void setRequest_status_editor_id(String request_status_editor_id) {
        this.request_status_editor_id = request_status_editor_id;
    }

    public String getRequest_status_datetime() {
        return request_status_datetime;
    }

    public void setRequest_status_datetime(String request_status_datetime) {
        this.request_status_datetime = request_status_datetime;
    }

    public String getLast_update() {
        return last_update;
    }

    public void setLast_update(String last_update) {
        this.last_update = last_update;
    }

    

    

    
}
