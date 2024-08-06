
public class Medico extends Funcionario {
    private String numCRM = " ";
    private String ensinoSuperior = " ";

    public Medico(String nome, String CPF, byte idade, String numCRM, String ensinoSuperior) {
        super(nome, CPF, idade);
        this.numCRM = numCRM;
        this.ensinoSuperior = ensinoSuperior;
    }

    public void apresentaMedico() {
        System.out.printf(
                "Olá, sou um funcionário, me chamo %s, tenho curso superior em %s e o número do meu CRM é o seguinte: %s.\n\n",
                nome, ensinoSuperior, numCRM);
    }

    public String getNumCRM() {
        return numCRM;
    }

    public void setNumCRM(String numCRM) {
        this.numCRM = numCRM;
    }

    public String getEnsinoSuperior() {
        return ensinoSuperior;
    }

    public void setEnsinoSuperior(String ensinoSuperior) {
        this.ensinoSuperior = ensinoSuperior;
    }
}
