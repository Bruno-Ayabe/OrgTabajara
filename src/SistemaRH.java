public class SistemaRH {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Fulana de tal");
        Desenvolvedor desenvolvedor = new Desenvolvedor("Fulano de tal");

        System.out.println("Nome: " + gerente.getNome());
        System.out.println("Salário Gerente: R$ " + gerente.calcularSalario());
        System.out.println("Responsabilidades: " + gerente.descreverResponsabilidades());

        System.out.println();

        System.out.println("Nome: " + desenvolvedor.getNome());
        System.out.println("Salário Desenvolvedor: R$ " + desenvolvedor.calcularSalario());
        System.out.println("Responsabilidades: " + desenvolvedor.descreverResponsabilidades());
    }
}