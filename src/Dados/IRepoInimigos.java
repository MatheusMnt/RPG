package Dados;

import java.util.ArrayList;
import Beans.Inimigo;

public interface IRepoInimigos {
    void addInimigo(Inimigo a);
    void deletaInimigo(Inimigo a); 
    int procuraInimigo(String nome);
    ArrayList <Inimigo> listaInimigos();
}
