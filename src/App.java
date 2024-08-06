public class App {
    public static void main(String[] args) throws Exception {

        Medico medico = new Medico("Marcelo Costa", "21324354-01", (byte) 25, "MA-45341", "Medicina");
        medico.apresentaFuncionario();
        medico.apresentaMedico();

        Odontologista odontologista = new Odontologista("Pedro Pessoa", "907856349-02", (byte) 28, "94362/SP",
                "Odontologia");
        odontologista.apresentaFuncionario();
        odontologista.apresentaOdntologista();

        Advogado advogado = new Advogado("Helder Carvalho", "156473829-03", (byte) 30, "OAB: 93567813", "Direito");
        advogado.apresentaFuncionario();
        advogado.apresentaAdvogado();

        Caixa caixa = new Caixa("Ana Catarina", "67298457-04", (byte) 19);
        caixa.apresentaFuncionario();

        Ortopedista ortopedista = new Ortopedista("Andre Guilherme", "123456789-05", (byte) 30, "MA-01011", "Medicina", "Ortopedia");
        ortopedista.apresentaFuncionario();
        ortopedista.apresentaMedico();

        

    }
}
