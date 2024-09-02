package cliente;
public abstract class Cliente {
    private String nome;
    private String tipo;


    protected Cliente(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public abstract double aplicarDesconto(double precoBase);

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    

}