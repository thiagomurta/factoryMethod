package factoryMethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoBoletoTest {

    @Test
    void deveRetornarBoletoExecutado(){
        IServicoBancario servico = ServicoBancarioFactory.obterServico("Boleto");
        assertEquals("Envio de Boleto executado", servico.executar());
    }

    @Test
    void deveRetornarBoletoCancelado(){
        IServicoBancario servico = ServicoBancarioFactory.obterServico("Boleto");
        assertEquals("Cancelamento de Boleto executado", servico.cancelar());
    }

}