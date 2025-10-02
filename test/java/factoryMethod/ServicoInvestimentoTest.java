package factoryMethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoInvestimentoTest {

    @Test
    void deveRetornarPIXExecutado(){
        IServicoBancario servico = ServicoBancarioFactory.obterServico("Investimento");
        assertEquals("Envio de Investimento executado", servico.executar());
    }

    @Test
    void deveRetornarPIXCancelado(){
        IServicoBancario servico = ServicoBancarioFactory.obterServico("Investimento");
        assertEquals("Cancelamento de Investimento executado", servico.cancelar());
    }

}