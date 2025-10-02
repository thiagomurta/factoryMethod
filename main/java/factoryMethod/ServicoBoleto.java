package factoryMethod;

public class ServicoBoleto implements IServicoBancario{
    @Override
    public String executar() {
        return "Envio de Boleto executado";
    }

    @Override
    public String cancelar() {
        return "Cancelamento de Boleto executado";
    }
}
