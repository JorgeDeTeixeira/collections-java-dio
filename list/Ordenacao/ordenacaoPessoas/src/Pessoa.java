public class Pessoa implements Comparable<Pessoa> {
    private String nome;
    private Integer idade;
    private double altura;

    public Pessoa(String nome, Integer idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", idade=" + idade + ", altura=" + altura + "]";
    }

    @Override
    public int compareTo(Pessoa o) {
        return Integer.compare(idade, o.getIdade());
    }

}