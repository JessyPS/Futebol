package dados;

// Exercício I
public class JogadorDeFutebol {
    private String nome;
    private int energia;
    private int alegria;
    private int gols;
    private int experiencia;

    public JogadorDeFutebol() {
        this.setNome("");
        this.setEnergia(0);
        this.setAlegria(0);
        this.setGols(0);
        this.setExperiencia(0);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getAlegria() {
        return alegria;
    }

    public void setAlegria(int alegria) {
        this.alegria = alegria;
    }

    public int getGols() {
        return gols;
    }

    public void setGols(int gols) {
        this.gols = gols;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    //Exercício II
    public void fazerGol() {

        //tire 5 pontos de energia
        this.setEnergia(getEnergia() - 5);
        //dê 10 pontos de alegria
        this.setAlegria(getAlegria() + 10);
        //aumentar o número de gols em 1.
        this.setGols(getGols() + 1);
        System.out.println("GOOOOL! ");
    }

    //Exercício III
    public void correr(){
        this.setEnergia((getEnergia() - 10));
        System.out.println("Cansei! ");
    }
}
