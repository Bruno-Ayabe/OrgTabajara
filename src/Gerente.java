class Gerente extends Funcionario {
    public Gerente(String nome) {
        super(nome);
    }

    @Override
    public Double calcularSalario() {
        return 5000.0;
    }

    @Override
    public String descreverResponsabilidades() {
        return "Gerenciar a equipe e supervisionar projetos.";
    }
}