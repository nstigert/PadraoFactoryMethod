import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalFactoryTest {

    @Test
    void deveRetornarExcecaoParaAnimalInexistente() {
        try {
            IAnimal animal = AnimalFactory.obterAnimal("Gato");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Animal inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaAnimalInvalido() {
        try {
            IAnimal animal = AnimalFactory.obterAnimal("Pelucia");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Animal inválido", e.getMessage());
        }
    }

}
