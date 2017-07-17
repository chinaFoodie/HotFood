package com.mua.cml.common;

/**
 * Created by King on 2017/7/17.
 */
public class ApiResponse<T>  {
    public static final String CODE_SUC = "A00000"; // 成功
    public static final String CODE_ERR = "E00001"; // 失败
    public static final String MSG_SUC_DEFAULT = "成功";
    public static final String MSG_ERR_DEFAULT = "失败";

    private String code;
    private String msg;
    private T data;

    private Integer draw;
    private Integer recordsTotal;
    private Integer recordsFiltered;

    public ApiResponse(String code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public ApiResponse(T data, Integer draw, Integer recordsTotal, Integer recordsFiltered) {
        this.data = data;
        this.draw = draw;
        this.recordsTotal = recordsTotal;
        this.recordsFiltered = recordsFiltered;
    }

    public static <T> ApiResponse<T> sucInstance() {
        return new ApiResponse<T>(CODE_SUC, MSG_SUC_DEFAULT, null);
    }

    public static <T> ApiResponse<T> sucInstance(T data) {
        return new ApiResponse<T>(CODE_SUC, MSG_SUC_DEFAULT, data);
    }

    public static <T> ApiResponse<T> sucInstance(String code, String msg, T data) {
        return new ApiResponse<T>(code, msg, data);
    }

    public static <T> ApiResponse<T> dtInstance(T data, Integer draw, Integer recordsTotal, Integer recordsFiltered) {
        ApiResponse apiResponse = new ApiResponse<T>(data, draw, recordsTotal, recordsFiltered);
        apiResponse.setCode(CODE_SUC);
        apiResponse.setMsg(MSG_SUC_DEFAULT);
        return apiResponse;
    }

    public static <T> ApiResponse<T> errInstance() {
        return new ApiResponse<T>(CODE_ERR, MSG_ERR_DEFAULT, null);
    }

    public static <T> ApiResponse<T> errInstance(String code) {
        return new ApiResponse<T>(code, MSG_ERR_DEFAULT, null);
    }

    public static <T> ApiResponse<T> errInstance(String code, String msg) {
        return new ApiResponse<T>(code, msg, null);
    }

    public static <T> ApiResponse<T> errInstance(String code, String msg, T data) {
        return new ApiResponse<T>(code, msg, data);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Integer getDraw() {
        return draw;
    }

    public void setDraw(Integer draw) {
        this.draw = draw;
    }

    public Integer getRecordsTotal() {
        return recordsTotal;
    }

    public void setRecordsTotal(Integer recordsTotal) {
        this.recordsTotal = recordsTotal;
    }

    public Integer getRecordsFiltered() {
        return recordsFiltered;
    }

    public void setRecordsFiltered(Integer recordsFiltered) {
        this.recordsFiltered = recordsFiltered;
    }
}
