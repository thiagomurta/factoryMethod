package factoryMethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoPIXTest {

    @Test
    void deveRetornarPIXExecutado(){
        IServicoBancario servico = ServicoBancarioFactory.obterServico("PIX");
        assertEquals("Envio de Pix executado", servico.executar());
    }

    @Test
    void deveRetornarPIXCancelado(){
        IServicoBancario servico = ServicoBancarioFactory.obterServico("PIX");
        assertEquals("Cancelamento de Pix executado", servico.cancelar());
    }

}