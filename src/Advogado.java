
public class Advogado extends Funcionario {
    private String numCarteiraOAB = " ";
    private String ensinoSuperior = " ";
    
    public Advogado(String nome, String CPF, byte idade, String numCarteiraOAB, String ensinoSuperior) {
        super(nome, CPF, idade);
        this.numCarteiraOAB = numCarteiraOAB;
        this.ensinoSuperior = ensinoSuperior;
    }

    public void apresentaAdvogado() {
        System.out.printf(
                "Olá, sou um funcionário, me chamo %s, tenho curso superior em %s e o número da minha carteira OAB é o seguinte: %s.\n\n",
                nome, ensinoSuperior, numCarteiraOAB);
    }

    public String getNumCarteiraOAB() {
        return numCarteiraOAB;
    }

    public void setNumCarteiraOAB(String numCarteiraOAB) {
        this.numCarteiraOAB = numCarteiraOAB;
    }

    public String getEnsinoSuperior() {
        return ensinoSuperior;
    }

    public void setEnsinoSuperior(String ensinoSuperior) {
        this.ensinoSuperior = ensinoSuperior;
    }


}

