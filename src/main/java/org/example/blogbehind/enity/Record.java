package org.example.blogbehind.enity;

import java.time.LocalDateTime;

public class Record
{
    private String username;
    private int article_id;
    private LocalDateTime liulantime;

    public LocalDateTime getLiulantime()
    {
        return liulantime;
    }

    public void setLiulantime(LocalDateTime liulantime)
    {
        this.liulantime=liulantime;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username=username;
    }

    public int getArticle_id()
    {
        return article_id;
    }

    public void setArticle_id(int article_id)
    {
        this.article_id=article_id;
    }
}
