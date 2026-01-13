package org.example.blogbehind.enity.Dto;

public class PageDto
{
    public int getPageNum()
    {
        return pageNum;
    }

    public void setPageNum(int pageNum)
    {
        this.pageNum=pageNum;
    }

    public int getPageSize()
    {
        return pageSize;
    }

    public void setPageSize(int pageSize)
    {
        this.pageSize=pageSize;
    }

    private int pageNum;//当前页码数

    private int pageSize;//每页条数
}
