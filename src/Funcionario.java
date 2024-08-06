
public class Funcionario {

    String nome = " ";
    String CPF = " ";
    byte idade = 0;

    Funcionario(String nome, String CPF, byte idade) {
        this.nome = nome;
        this.CPF = CPF;
        this.idade = idade;
    }

    public void apresentaFuncionario() {
        System.out.printf(
                "\nOlá, sou um funcionário, me chamo %s, meu CPF é o seguinte: %s e tenho %d anos de idade.\n",
                nome, CPF, idade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String cPF) {
        CPF = cPF;
    }

    public byte getIdade() {
        return idade;
    }

    public void setIdade(byte idade) {
        this.idade = idade;
    }

}
