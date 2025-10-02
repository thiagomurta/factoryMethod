package factoryMethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoBancarioFactoryTest {

    @Test
    void deveInformarServicoNaoExiste(){
        try{
            IServicoBancario servico = ServicoBancarioFactory.obterServico("CriptoMoeda");
            fail();
        } catch (IllegalArgumentException e){
            assertEquals("O serviço não existe", e.getMessage());
        }
    }

    @Test
    void deveInformarServicoInvalido(){
        try{
            IServicoBancario servico = ServicoBancarioFactory.obterServico("VincularConta");
            fail();
        } catch (IllegalArgumentException e){
            assertEquals("Serviço inválido", e.getMessage());
        }
    }

}