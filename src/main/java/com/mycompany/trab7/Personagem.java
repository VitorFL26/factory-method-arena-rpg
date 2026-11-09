/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trab7;

/**
 *
 * @author Inova
 */
public abstract class Personagem {
    public String nome;
    public int vida;

    public Personagem(String nome, int vida) {
        this.nome = nome;
        this.vida = vida;
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }
    public void atacar(){
        estrategiaAtaque.atacar(nome);
    };
    
    private EstrategiaAtaque estrategiaAtaque;
    public void setEstrategiaAtaque(EstrategiaAtaque estrategiaAtaque) {
        this.estrategiaAtaque = estrategiaAtaque;
    }
    
}
