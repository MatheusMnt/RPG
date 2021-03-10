package Beans;

public class Inimigo {
    private String nome;
    private int vida;
    private int dano;
    private int carisma;
    private int furtividade;
    private int precisao;
    private int inteligencia;

    //construtor
    public Inimigo(String nome, int vida, int dano, int carisma, int furtividade, int precisao, int inteligencia){
        this.nome = nome;
        this.vida = vida;
        this.dano = dano;
        this.carisma = carisma;
        this.furtividade = furtividade;
        this.precisao = precisao;
        this.inteligencia = inteligencia;               
    }

    public Inimigo(){
        this.nome = "Player Void";
        this.vida = 50;
        this.dano = 10;
        this.carisma = 10;
        this.furtividade = 10;
        this.precisao = 10;
        this.inteligencia = 10;
    }

    //gets e setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getVida() {
        return vida;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public int getDano() {
        return dano;
    }

    public void setCarisma(int carisma) {
        this.carisma = carisma;
    }

    public int getCarisma() {
        return carisma;
    }

    public void setFurtividade(int furtividade) {
        this.furtividade = furtividade;
    }

    public int getFurtividade() {
        return furtividade;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setPrecisao(int precisao) {
        this.precisao = precisao;
    }

    public int getPrecisao() {
        return precisao;
    }
}
