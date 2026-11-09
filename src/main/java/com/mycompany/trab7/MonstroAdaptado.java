/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trab7;

/**
 *
 * @author Inova
 */
public class MonstroAdaptado extends Personagem{
    private MonstroAntigo monstroAntigo = new MonstroAntigo();
    
    public MonstroAdaptado(String nome, int vida) {
        super(nome, vida);
    }
    public void atacar(){
        if (monstroAntigo != null) {
            monstroAntigo.executarGolpeAntigo();
        }
    }
}
