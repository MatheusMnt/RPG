package Dados;

import java.util.ArrayList;
import Beans.Inimigo;

public class RepoArrayInimigos implements IRepoInimigos{

    private ArrayList <Inimigo> repoInimigos = new ArrayList<>();

    public RepoArrayInimigos (ArrayList <Inimigo> inimigos){
        this.setRepoInimigos(inimigos);
    }

    public void addInimigo(Inimigo a){
        boolean contem = repoInimigos.contains(a);
		if(contem == false) {
			this.repoInimigos.add(a);
		}
    }
    public void deletaInimigo(Inimigo a){
        for (Inimigo e : this.repoInimigos){
			if(e.equals(a)){
				this.repoInimigos.remove(a);
				}
		}
    }
    public int procuraInimigo(String nome){
        int contem = 0;
		for (int i = 0; i < repoInimigos.size(); i++){
			if (repoInimigos.get(i).getNome() == nome){
				contem = i;
			}
		}
	 return contem;
    }

    public ArrayList <Inimigo> listaInimigos(){
        return this.repoInimigos;
    }


    public void setRepoInimigos(ArrayList<Inimigo> repoInimigos) {
        this.repoInimigos = repoInimigos;
    }
}
