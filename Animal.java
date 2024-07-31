/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Admin
 */
public class Animal {
    public String especie;
    public int idade;
    public String alimentacao;
    
    public Animal(String especieInformadaDoAnimal, String alimentacaoInformada){
        this.especie = especieInformadaDoAnimal;
        this.alimentacao = alimentacaoInformada;
        
    }
       public Animal(int idadeInformada){
        this.idade = idadeInformada;
    }
 
   
 
   
    
    public void comer (){
        System.out.println("Animal comendo");
    }
}
