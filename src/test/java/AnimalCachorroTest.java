import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalCachorroTest {

    @Test
    void deveLocomover() {

        IAnimal animal = AnimalFactory.obterAnimal("Cachorro");
        assertEquals("Andar", animal.locomover());
    }

    @Test
    void deveEmitirSom() {

        IAnimal animal = AnimalFactory.obterAnimal("Cachorro");
        assertEquals("Latir", animal.emitirSom());
    }
}