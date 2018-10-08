package com.bocom.jwj.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
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

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    public Date getDate() {
        return date;
    }

}