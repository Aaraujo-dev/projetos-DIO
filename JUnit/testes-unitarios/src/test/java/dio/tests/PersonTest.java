package dio.tests;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class PersonTest {
    @Test
    public void deveExecutarCasamentoEDivorcioCorretamente(){
        Person mauricio = new Person("Maurício", 21);
        mauricio.casar();
        Assertions.assertTrue(mauricio.estadoCivil(), "Casamento funciona");
        mauricio.divorciar();
        Assertions.assertFalse(mauricio.estadoCivil(), "Divorcio funciona");
    }
}
