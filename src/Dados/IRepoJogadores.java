package Dados;

import java.util.ArrayList;

import Beans.Jogador;

public interface IRepoJogadores {
    void addJogador(Jogador a);
    void deletaJogador(Jogador a); 
    int procuraJogador(String nome);
    ArrayList <Jogador> listaJogadores();
}
