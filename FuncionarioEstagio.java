package padroescomportamentais_exercicios.templetemethod;

public class FuncionarioEstagio extends Funcionario {

    public String verificarHoras() {
        if (this.calcularHorasSemana() >= 30) {
            return "Liberado";
        }
        else {
            return "Não Liberado";
        }
    }

}
