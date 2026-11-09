/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trab7;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Inova
 */
public abstract class ArenaRPG {
   private List<Personagem> personagens = new ArrayList<>();
   protected abstract Personagem criarPersonagem(String tipo, String nome);
   public Personagem adicionarPersonagem(String tipo, String nome) {
  Personagem p = criarPersonagem(tipo, nome);
  personagens.add(p);
  return p;
   }
   public void executarAtaques() { 
       for (Personagem p : personagens) {
        p.atacar();
       } 
  }
}
