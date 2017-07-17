package com.mua.cml.model.customized;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;
import java.util.Map;

/**
 * * 前后端交互中使用的分页对象
 * <p/>
 * Created by qiushi on 2016/2/21.
 */
public class Page<T> {

    public static final Page<?> DEFAULT = new Page<Object>();

    private int pageNo = 1; // pageNo
    private int pageSize = 40; // 默认分页大小：40
    private int totalCount; // 条目数
    private String orderBy;
    private String order;
    private List<T> result;
    private Integer offset;
    private Map otherResult;

    public Page() {

    }

    public Page(String orderBy) {
        this.orderBy = orderBy;
    }

    public Page(String orderBy, String order) {
        this.orderBy = orderBy;
        this.order = order;
    }

    public Page(String orderBy, String order, int pageSize) {
        this.orderBy = orderBy;
        this.order = order;
        this.pageSize = pageSize;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public long getTotalPage() {
        if (totalCount < 0) {
            return -1;
        }

        long count = totalCount / pageSize;
        if (totalCount % pageSize > 0) {
            count++;
        }
        return count;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public List<T> getResult() {
        return result;
    }

    public void setResult(List<T> result) {
        this.result = result;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public Map getOtherResult() {
        return otherResult;
    }

    public void setOtherResult(Map otherResult) {
        this.otherResult = otherResult;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("pageNo", pageNo)
                .append("pageSize", pageSize)
                .append("totalCount", totalCount)
                .append("orderBy", orderBy)
                .append("order", order)
                .append("result", result)
                .append("offset", offset)
                .toString();
    }
}
