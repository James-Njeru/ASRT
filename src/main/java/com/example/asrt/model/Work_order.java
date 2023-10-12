package com.example.asrt.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Work_order {

    @Id
    private String work_order_number;
    private String work_description;
    private String work_order_owner;
    private Date date_lodged;
    private Date date_due;
    private Date date_to_close;
    private Date date_completed;
    private Date date_closed;
    private int financial_year;
    private String financial_quarter;
    private String work_status;
    private String system_name;
    private int internal_priority;
    private String staff_id;
    private int category_id;
    private int department_id;
    private String cls_id;
    private int del;
    private String severity_id;
    private String sta_id;
    private String source;


    public Work_order() {

    }

    public Work_order(String work_order_number, String work_description, String work_order_owner, Date date_lodged, Date date_due, Date date_to_close, Date date_completed, Date date_closed, int financial_year, String financial_quarter, String work_status, String system_name, int internal_priority, String staff_id, int category_id, int department_id, String cls_id, int del, String severity_id, String sta_id, String source) {
        this.work_order_number = work_order_number;
        this.work_description = work_description;
        this.work_order_owner = work_order_owner;
        this.date_lodged = date_lodged;
        this.date_due = date_due;
        this.date_to_close = date_to_close;
        this.date_completed = date_completed;
        this.date_closed = date_closed;
        this.financial_year = financial_year;
        this.financial_quarter = financial_quarter;
        this.work_status = work_status;
        this.system_name = system_name;
        this.internal_priority = internal_priority;
        this.staff_id = staff_id;
        this.category_id = category_id;
        this.department_id = department_id;
        this.cls_id = cls_id;
        this.del = del;
        this.severity_id = severity_id;
        this.sta_id = sta_id;
        this.source = source;
    }

    public String getWork_order_number() {
        return work_order_number;
    }

    public void setWork_order_number(String work_order_number) {
        this.work_order_number = work_order_number;
    }

    public String getWork_description() {
        return work_description;
    }

    public void setWork_description(String work_description) {
        this.work_description = work_description;
    }

    public String getWork_order_owner() {
        return work_order_owner;
    }

    public void setWork_order_owner(String work_order_owner) {
        this.work_order_owner = work_order_owner;
    }

    public Date getDate_lodged() {
        return date_lodged;
    }

    public void setDate_lodged(Date date_lodged) {
        this.date_lodged = date_lodged;
    }

    public Date getDate_due() {
        return date_due;
    }

    public void setDate_due(Date date_due) {
        this.date_due = date_due;
    }

    public Date getDate_to_close() {
        return date_to_close;
    }

    public void setDate_to_close(Date date_to_close) {
        this.date_to_close = date_to_close;
    }

    public Date getDate_completed() {
        return date_completed;
    }

    public void setDate_completed(Date date_completed) {
        this.date_completed = date_completed;
    }

    public Date getDate_closed() {
        return date_closed;
    }

    public void setDate_closed(Date date_closed) {
        this.date_closed = date_closed;
    }

    public int getFinancial_year() {
        return financial_year;
    }

    public void setFinancial_year(int financial_year) {
        this.financial_year = financial_year;
    }

    public String getFinancial_quarter() {
        return financial_quarter;
    }

    public void setFinancial_quarter(String financial_quarter) {
        this.financial_quarter = financial_quarter;
    }

    public String getWork_status() {
        return work_status;
    }

    public void setWork_status(String work_status) {
        this.work_status = work_status;
    }

    public String getSystem_name() {
        return system_name;
    }

    public void setSystem_name(String system_name) {
        this.system_name = system_name;
    }

    public int getInternal_priority() {
        return internal_priority;
    }

    public void setInternal_priority(int internal_priority) {
        this.internal_priority = internal_priority;
    }

    public String getStaff_id() {
        return staff_id;
    }

    public void setStaff_id(String staff_id) {
        this.staff_id = staff_id;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public int getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(int department_id) {
        this.department_id = department_id;
    }

    public String getCls_id() {
        return cls_id;
    }

    public void setCls_id(String cls_id) {
        this.cls_id = cls_id;
    }

    public int getDel() {
        return del;
    }

    public void setDel(int del) {
        this.del = del;
    }

    public String getSeverity_id() {
        return severity_id;
    }

    public void setSeverity_id(String severity_id) {
        this.severity_id = severity_id;
    }

    public String getSta_id() {
        return sta_id;
    }

    public void setSta_id(String sta_id) {
        this.sta_id = sta_id;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @Override
    public String toString() {
        return "Work_Order{" +
                "work_order_number='" + work_order_number + '\'' +
                ", work_description='" + work_description + '\'' +
                ", work_order_owner='" + work_order_owner + '\'' +
                ", date_lodged=" + date_lodged +
                ", date_due=" + date_due +
                ", date_to_close=" + date_to_close +
                ", date_completed=" + date_completed +
                ", date_closed=" + date_closed +
                ", financial_year=" + financial_year +
                ", financial_quarter='" + financial_quarter + '\'' +
                ", work_status='" + work_status + '\'' +
                ", system_name='" + system_name + '\'' +
                ", internal_priority=" + internal_priority +
                ", staff_id='" + staff_id + '\'' +
                ", category_id=" + category_id +
                ", department_id=" + department_id +
                ", cls_id='" + cls_id + '\'' +
                ", del=" + del +
                ", severity_id='" + severity_id + '\'' +
                ", sta_id='" + sta_id + '\'' +
                ", source='" + source + '\'' +
                '}';
    }
}
