package factoryMethod;

public class ServicoBancarioFactory {
    public static IServicoBancario obterServico(String servico) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("factoryMethod.Servico" + servico);
            objeto = classe.newInstance();
        } catch (Exception e) {
            throw new IllegalArgumentException("O serviço não existe");
        }
        if(!(objeto instanceof IServicoBancario)){
            throw new IllegalArgumentException("Serviço inválido");
        }
        return (IServicoBancario) objeto;
    }
}
