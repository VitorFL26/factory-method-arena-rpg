/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trab7;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vitor
 */
public class ArenaSombriaRPG extends ArenaRPG {
   @Override
   protected Personagem criarPersonagem(String tipo, String nome) {       
   switch(tipo){
            case "Guerreiro":
                return new GuerreiroSombrio(nome, 100);
            case "Mago":
                return new MagoSombrio(nome, 100);
            case "Arqueiro":
                return new ArqueiroSombrio(nome, 100);
            case "Monstro":
            case "monstro":
                return new MonstroAdaptado(nome, 100);
            default:
                throw new IllegalArgumentException("Tipo de personagem desconhecido: " + tipo);                   
   }
  }
}
