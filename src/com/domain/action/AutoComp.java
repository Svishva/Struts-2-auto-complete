package com.domain.action;

import java.util.ArrayList;

import com.opensymphony.xwork2.Action;

public class AutoComp implements Action 
{
    public ArrayList<String> cricketNations = new ArrayList<String>();
    public String country;

    public String execute() 
    {
            populateCircketNations();
            return SUCCESS;
    }

    public void populateCircketNations() 
    {
            cricketNations.add("Australia");
            cricketNations.add("England");
            cricketNations.add("India");
            cricketNations.add("West Indies");
            cricketNations.add("New Zealand");
            cricketNations.add("Pakistan");
            cricketNations.add("Bangladesh");
            cricketNations.add("South Africa");
            cricketNations.add("Sri Lanka");
            cricketNations.add("Zimbabwe");
    }

    public String displayCountry() 
    {
            return SUCCESS;
    }

    public String getCountry() 
    {
            return country;
    }

    public void setCountry(String country) 
    {
            this.country = country;
    }       
}
