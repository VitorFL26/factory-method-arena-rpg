/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trab7;

import java.util.Scanner;

/**
 *
 * @author Inova
 */
public class Trab7 {

    public static void main(String[] args) {             
        Scanner sc = new Scanner(System.in);    
        System.out.println("===== CENÁRIO 1: Arena Clássica =====");
        ArenaRPG arena = new ArenaClassica();
 
        String[] tipos = {"Guerreiro", "Mago", "Arqueiro"};
        String[] nomes = new String[tipos.length];
        Personagem[] classicos = new Personagem[tipos.length];
 
        for (int i = 0; i < tipos.length; i++) {
            System.out.print("Digite o nome do " + tipos[i] + ": ");
            nomes[i] = sc.nextLine();
            classicos[i] = arena.adicionarPersonagem(tipos[i], nomes[i]);
            classicos[i].setEstrategiaAtaque(new AtaqueNormal());
        }
 
        System.out.println("\n-> Executando ataques:");
        arena.executarAtaques();
 
        
        System.out.println("\n===== CENÁRIO 2: Troca de estratégia =====");
        Personagem guerreiro = classicos[0];
        guerreiro.setEstrategiaAtaque(new AtaqueEspecial());
        System.out.println("-> Estratégia do Guerreiro alterada para Especial. Atacando novamente:");
        guerreiro.atacar();
 
        
        System.out.println("\n===== CENÁRIO 3: Monstro (Adapter) =====");
        Personagem monstroClassico = arena.adicionarPersonagem("monstro", "Orc");
        System.out.println("-> Executando ataques incluindo o Monstro Adaptado:");
        arena.executarAtaques();
 
        // ===== CENÁRIO 4 =====
        System.out.println("\n===== CENÁRIO 4: Arena Sombria =====");
        arena = new ArenaSombriaRPG(); // mesma variável, outro criador
 
        Personagem[] sombrios = new Personagem[tipos.length];
        for (int i = 0; i < tipos.length; i++) {
            sombrios[i] = arena.adicionarPersonagem(tipos[i], nomes[i]);
            sombrios[i].setEstrategiaAtaque(new AtaqueNormal());
        }
        Personagem monstroSombrio = arena.adicionarPersonagem("monstro", "Orc");
 
        System.out.println("-> Executando ataques da Arena Sombria:");
        arena.executarAtaques();
 
        // ===== Comparação dos objetos criados =====
        System.out.println("\n===== Comparação: classes criadas por cada arena =====");
        for (int i = 0; i < tipos.length; i++) {
            System.out.println(tipos[i] + " -> Clássica: "
                    + classicos[i].getClass().getSimpleName()
                    + " | Sombria: " + sombrios[i].getClass().getSimpleName());
        }
        System.out.println("monstro -> Clássica: "
                + monstroClassico.getClass().getSimpleName()
                + " | Sombria: " + monstroSombrio.getClass().getSimpleName());
 
        sc.close();
    }
  }

