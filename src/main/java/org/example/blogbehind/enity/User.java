package org.example.blogbehind.enity;

public class User
{
    private String username;
    private String password;
    private String email;
    private String image;
    private String jianjie;
    private int state;

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username=username;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password=password;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email=email;
    }

    public String getImage()
    {
        return image;
    }

    public void setImage(String image)
    {
        this.image=image;
    }

    public String getJianjie()
    {
        return jianjie;
    }

    public void setJianjie(String jianjie)
    {
        this.jianjie=jianjie;
    }

    public int getState()
    {
        return state;
    }

    public void setState(int state)
    {
        this.state=state;
    }
}
