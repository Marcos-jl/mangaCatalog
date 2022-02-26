package server;

import java.util.ArrayList;
import java.util.Objects;

public class mangá implements Imangá {
    //Atributos
    private ArrayList <String> name = new ArrayList<>();
    private ArrayList <Integer> cap = new ArrayList<>();
    private ArrayList <Integer> vol = new ArrayList<>();
    private ArrayList <String> author = new ArrayList<>();

    public mangá(){
    }

    @Override
    public void read(String name){
        if(this.name.isEmpty())
            System.out.println("Não existe mangá cadastrado com esse nome!");
        else{
            int i;
            for(i=0;i<this.name.size();i++){
                if(Objects.equals(this.name.get(i), name)){
                    System.out.println("Mangá: " + this.name.get(i));
                    System.out.println("Volumes: " + this.vol.get(i));
                    System.out.println("Capítulos: " + this.cap.get(i));
                    System.out.println("Autor: " + this.author.get(i));
                }

            }
        }
    }

    @Override
    public void send(String name, int cap, int vol, String author){
        if(this.name.isEmpty()){
            this.name.add(name);
            this.cap.add(cap);
            this.vol.add(vol);
            this.author.add(author);
        } else{
          int i;
          for(i=0;i<this.name.size();i++){
              if(this.name.get(i) != name){
                  this.name.add(name);
                  this.cap.add(cap);
                  this.vol.add(vol);
                  this.author.add(author);
             }
          }
        }

    }

    @Override
    public void show(){
        int i;
        for(i=0; i<this.name.size()-1;i++){
            System.out.println("Mangá: " + this.name.get(i) + " Capítulos: " + this.cap.get(i) + " Volumes: " + this.vol.get(i) + " Autor: " + this.author.get(i));
        }
        System.out.println();
    }

}
