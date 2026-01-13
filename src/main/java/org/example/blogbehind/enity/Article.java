package org.example.blogbehind.enity;

import java.time.LocalDateTime;

public class Article
{
    private int id;
    private String title;
    private String content;
    private String image;
    private String create_user;
    private int like_num;
    private int goodnum;
    private LocalDateTime create_time;
    private LocalDateTime update_time;
    private int comment_num;

    public int getViews()
    {
        return views;
    }

    public void setViews(int views)
    {
        this.views=views;
    }

    private int views;

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id=id;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title=title;
    }

    public String getContent()
    {
        return content;
    }

    public void setContent(String content)
    {
        this.content=content;
    }

    public String getImage()
    {
        return image;
    }

    public void setImage(String image)
    {
        this.image=image;
    }

    public String getCreate_user()
    {
        return create_user;
    }

    public void setCreate_user(String create_user)
    {
        this.create_user=create_user;
    }

    public int getLike_num()
    {
        return like_num;
    }

    public void setLike_num(int like_num)
    {
        this.like_num=like_num;
    }

    public int getGoodnum()
    {
        return goodnum;
    }

    public void setGoodnum(int goodnum)
    {
        this.goodnum=goodnum;
    }

    public LocalDateTime getCreate_time()
    {
        return create_time;
    }

    public void setCreate_time(LocalDateTime create_time)
    {
        this.create_time=create_time;
    }

    public LocalDateTime getUpdate_time()
    {
        return update_time;
    }

    public void setUpdate_time(LocalDateTime update_time)
    {
        this.update_time=update_time;
    }

    public int getComment_num()
    {
        return comment_num;
    }

    public void setComment_num(int comment_num)
    {
        this.comment_num=comment_num;
    }
}
