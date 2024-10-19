class Desenvolvedor extends Funcionario {
    public Desenvolvedor(String nome) {
        super(nome);
    }

    @Override
    public Double calcularSalario() {
        return 3000.0;
    }

    @Override
    public String descreverResponsabilidades() {
        return "Desenvolver e manter aplicações de software.";
    }
}
