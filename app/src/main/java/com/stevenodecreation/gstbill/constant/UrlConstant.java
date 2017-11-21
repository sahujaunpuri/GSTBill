package com.stevenodecreation.gstbill.constant;

/**
 * Created by lenovo on 26-08-2017.
 */

public final class UrlConstant {

    private UrlConstant() {}

    // DEV
    public static final String BASE_DEV_URL = "http://192.168.0.101:8083/";

    // Employee URI
    public static final String CREATE_EMP_URI = "saveEmp";
    public static final String UPDATE_CLIENT = "updateClient";
    public static final String DELETE_CLIENT = "deleteClient?clientId=%d";
}