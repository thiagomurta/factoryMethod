package factoryMethod;

public class ServicoPIX implements IServicoBancario{
    @Override
    public String executar() {
        return "Envio de Pix executado";
    }

    @Override
    public String cancelar() {
        return "Cancelamento de Pix executado";
    }
}
