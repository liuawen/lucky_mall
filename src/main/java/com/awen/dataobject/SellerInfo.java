package com.awen.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * SellerInfo
 * @author : Liu Awen Email:willowawen@gmail.com
 * @create :  2019-06-01
 */
@Data
@Entity
public class SellerInfo {

    @Id
    private String sellerId;

    private String username;

    private String password;

    private String openid;
}
