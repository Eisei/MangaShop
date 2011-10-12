package com.pl.manga;

public class Manga {

    public String author;
    public String title;
    public String type;
   
    public Manga (String author, String title, String type)
    {
        this.author=author;
        this.title=title;
        this.type=type;
    }

    public void printManga()
    {
        System.out.println("Author:"+author+ "\t Title:"+title+"\t Type:"+type);
    }

}