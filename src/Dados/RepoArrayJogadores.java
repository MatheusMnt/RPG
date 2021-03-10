package Dados;

import java.util.ArrayList;
import Beans.Jogador;

public class RepoArrayJogadores implements IRepoJogadores{



    private ArrayList <Jogador> repoJogadores = new ArrayList<>();

    public RepoArrayJogadores (ArrayList <Jogador> jogadores){
        this.setRepoJogadores(jogadores);
    }

    public void addJogador(Jogador a){
        boolean contem = repoJogadores.contains(a);
		if(contem == false) {
			this.repoJogadores.add(a);
		}
    }
    public void deletaJogador(Jogador a){
        for (Jogador e : this.repoJogadores){
			if(e.equals(a)){
				this.repoJogadores.remove(a);
				}
		}
    }
    public int procuraJogador(String nome){
        int contem = 0;
		for (int i = 0; i < repoJogadores.size(); i++){
			if (repoJogadores.get(i).getNome() == nome){
				contem = i;
			}
		}
	 return contem;
    }

    public ArrayList <Jogador> listaJogadores(){
        return this.repoJogadores;
    }


    public void setRepoJogadores(ArrayList<Jogador> repoJogadores) {
        this.repoJogadores = repoJogadores;
    }

    
}
