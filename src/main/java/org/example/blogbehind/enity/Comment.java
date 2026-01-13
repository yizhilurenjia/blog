package org.example.blogbehind.enity;

import java.time.LocalDateTime;

public class Comment
{
    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id=id;
    }

    private int id;
    private String username;
    private String content;
    private LocalDateTime create_time;
    private int article_id;

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username=username;
    }

    public String getContent()
    {
        return content;
    }

    public void setContent(String content)
    {
        this.content=content;
    }

    public LocalDateTime getCreate_time()
    {
        return create_time;
    }

    public void setCreate_time(LocalDateTime create_time)
    {
        this.create_time=create_time;
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
