
public class Ortopedista extends Medico {

    private String residencia;

    public Ortopedista(String nome, String CPF, byte idade, String numCRM, String ensinoSuperior, String residencia) {
        super(nome, CPF, idade, numCRM, ensinoSuperior);
        this.residencia = residencia;
    }

    @Override
    public void apresentaMedico() {
        System.out.printf(
                "Olá, sou um médico, me chamo %s, tenho curso superior em %s e o número do meu CRM é %s. Além disso, tenho residência em: %s.\n\n",
                getNome(), getEnsinoSuperior(), getNumCRM(), residencia);
    }

    public String getResidencia() {
        return residencia;
    }

    public void setResidencia(String residencia) {
        this.residencia = residencia;
    }
}
