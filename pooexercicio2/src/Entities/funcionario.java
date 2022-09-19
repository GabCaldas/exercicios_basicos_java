package Entities;

public class funcionario {
    public String nome;
    public double salariobruto,imposto;

    public double p;

    public double salarioliquido() {
        return salariobruto-imposto;
    }

    public double aumentosalario(){
        return salarioliquido() + salariobruto*(p/100);
    }

    public String toString() {
        return "Nome: " + nome + "\n" + "Salário Líquido: " + salarioliquido();
    }

    public String toString2(){
        return "DADOS ATUALIZADOS!" + "\n" + "\n"
                + "Nome: " + nome
                + "\n" + "Salaŕio Líquido: " + aumentosalario();
    }

}
