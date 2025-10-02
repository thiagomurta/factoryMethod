package factoryMethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoVincularContaTest {

    @Test
    void deveRetornarExecucao(){
        ServicoVincularConta servico = new ServicoVincularConta();
        assertEquals("Vinculação de Conta executada", servico.executar());
    }

    @Test
    void deveRetornarCancelamento(){
        ServicoVincularConta servico = new ServicoVincularConta();
        assertEquals("Vinculação de Conta cancelada", servico.cancelar());
    }
}