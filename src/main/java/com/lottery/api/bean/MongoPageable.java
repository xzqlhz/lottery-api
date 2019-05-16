package com.lottery.api.bean;

import lombok.Data;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;


@Data
public class MongoPageable implements Pageable {
    private Integer pagenumber = 1;
    // 当前页面条数
    private Integer pagesize = 10;
    //排序条件
    private Sort sort;

    public MongoPageable(Integer pagenumber, Integer pagesize, Sort sort) {
        if (pagenumber > 0) {
            this.pagenumber = pagenumber;
        }
        if (pagenumber > 0) {
            this.pagesize = pagesize;
        }
        this.sort = sort;
    }

    public MongoPageable(Integer pagenumber, Integer pagesize) {
        this(pagenumber, pagesize, null);
    }


    @Override
    public int getPageNumber() {
        return pagenumber;
    }

    @Override
    public int getPageSize() {
        return pagesize;
    }

    @Override
    public long getOffset() {
        return (this.pagenumber - 1) * this.pagesize;
    }

    @Override
    public Sort getSort() {
        return sort;
    }

    @Override
    public Pageable next() {
        return new MongoPageable(pagenumber + 1, pagesize, sort);
    }

    @Override
    public Pageable previousOrFirst() {
        return hasPrevious() ? previous() : first();
    }

    public Pageable previous() {
        return new MongoPageable(pagenumber - 1, pagesize, sort);
    }

    @Override
    public Pageable first() {
        return new MongoPageable(0, pagesize, sort);
    }


    @Override
    public boolean hasPrevious() {
        return pagenumber > 0;
    }

    @Override
    public int hashCode() {

        final int prime = 31;
        int result = 1;

        result = prime * result + pagenumber;
        result = prime * result + pagesize;

        return result;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        MongoPageable other = (MongoPageable) obj;
        return this.pagenumber == other.pagenumber && this.pagesize == other.pagesize;
    }
}
