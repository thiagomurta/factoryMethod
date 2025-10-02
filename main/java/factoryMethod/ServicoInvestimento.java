package factoryMethod;

public class ServicoInvestimento implements IServicoBancario{
    @Override
    public String executar() {
        return "Envio de Investimento executado";
    }

    @Override
    public String cancelar() {
        return "Cancelamento de Investimento executado";
    }
}
