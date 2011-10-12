package com.pl.manga;

import java.util.ArrayList;
import java.util.List;


public class Czytajacy {

public String name;
public String alias;


public Czytajacy(String name, String alias)
{
    this.name=name;
    this.alias=alias;   
}
public Czytajacy(String name, String alias, List<Manga> manga, List<Manga> mangas)
{
    this.name=name;
    this.alias=alias;
    this.mangas=mangas;
}
public List<Manga> mangas= new ArrayList<Manga>();

public void printMangas()
{
    for(Manga m : this.mangas)
    {
        m.printManga();
    }
}


}

