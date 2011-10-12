package com.pl.manga;

import java.util.ArrayList;
import java.util.List;

public class Main {

public static void main (String [] args){
   
    List<Manga> mangas = new ArrayList<Manga>();
    mangas.add(new Manga ("Kishimoto Mashashi      ","Naruto           ","Fantasy"));
    mangas.add(new Manga("Kubo Tite            ","Bleach             ","Fantasy"));
    mangas.add(new Manga("Arakawa Hiromu       ","Fullmetal Alchemist","Supernatural"));
   
    Czytajacy c=new Czytajacy("Jan","Nowak",mangas, mangas);
    c.printMangas();
   
}



}