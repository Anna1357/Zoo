package org.itstep;

import java.util.ArrayList;
import java.util.Arrays;

public class Zoo {
    private Animals[]animals=new Animals[0];
    public void add(Animals animal){
        animals= Arrays.copyOf(animals,animals.length+1);
        animals[animals.length-1]=animal;
    }
    public Animals[] getAnimals(){
        return animals;
    }
    public void deleteByName(String name){
        if(name==null)return;
        int idx=-1;
        for (int i = 0; i < animals.length; i++) {
            if(name.equals( animals[i].getName() )){
                idx=i;
                break;
            }
        }
        if(idx>=0){
            for (int i = idx+1; i <animals.length ; i++) {
                animals[i-1]=animals[i];
            }
            animals= Arrays.copyOf( animals,animals.length-1 );
        }
    }
    public void addExp(String name,Expen expense){
        if(name==null)return;
        for(Animals animal:animals){
            if(name.equals( animal.getName() )){
                animal.addExp( expense );
            }
        }
    }
    public void addExp(int id,Expen expense){

        for(Animals animal:animals){
            if(id==animal.getNumber() ){
                animal.addExp( expense );
            }
        }
    }
    public double getExpForDay(Date date){
        double sum=0;
        for(Animals animal: animals){
            sum+=animal.getExpForDay(date);
        }
        return sum;
    }
    public double getAllExp(){
        double sum=0;
        for(Animals animal: animals){
            sum+=animal.getAllExp();
        }
        return sum;
    }
}

