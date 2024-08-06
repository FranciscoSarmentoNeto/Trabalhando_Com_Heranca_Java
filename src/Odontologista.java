
public class Odontologista extends Funcionario {
    private String numCRO = " ";
    private String ensinoSuperior = " ";

    public Odontologista(String nome, String CPF, byte idade, String numCRO, String ensinoSuperior) {
        super(nome, CPF, idade);
        this.numCRO = numCRO;
        this.ensinoSuperior = ensinoSuperior;
    }

    public void apresentaOdntologista() {
        System.out.printf(
                "Olá, sou um funcionário, me chamo %s, tenho curso superior em %s e o número do meu CRO é o seguinte: %s.\n\n",
                nome, ensinoSuperior, numCRO);
    }

    public String getNumCRO() {
        return numCRO;
    }

    public void setNumCRO(String numCRO) {
        this.numCRO = numCRO;
    }

    public String getEnsinoSuperior() {
        return ensinoSuperior;
    }

    public void setEnsinoSuperior(String ensinoSuperior) {
        this.ensinoSuperior = ensinoSuperior;
    }

}