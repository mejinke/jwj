package com.bocom.jwj.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class OutburstSituationInfo {
    /**
     * ���ֶ� : java.lang.Integer.id
     */
    private String id;

    /**
     * �������
     * ���ֶ� : java.lang.String.situation_title
     */
    private String title;

    /**
     * ����
     * ���ֶ� : java.lang.String.situation_details
     */
    private String details;

    /**
     * ʱ��
     * ���ֶ� : java.util.Date.situation_time
     */
    private Date date;

    /**
     * ���ֶ� : java.lang.String.situation_status
     */
    private String status;

    /**
     * �ϱ���
     * ���ֶ� : java.lang.String.user_name
     */
    private String userName;

    /**
     * �ϱ�����ϵ��ʽ
     * ���ֶ� : java.lang.String.user_contact
     */
    private String userContact;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserContact() {
        return userContact;
    }

    public void setUserContact(String userContact) {
        this.userContact = userContact;
    }

    @Override
    public String toString() {
        return "OutburstSituationInfo{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", details='" + details + '\'' +
                ", date=" + date +
                ", status='" + status + '\'' +
                ", userName='" + userName + '\'' +
                ", userContact='" + userContact + '\'' +
                '}';
    }
}