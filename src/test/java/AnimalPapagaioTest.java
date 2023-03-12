import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalPapagaioTest {

    @Test
    void deveLocomover() {
        IAnimal animal = AnimalFactory.obterAnimal("Papagaio");
        assertEquals("Andar/Voar", animal.locomover());
    }

    @Test
    void deveEmitirSom() {
        IAnimal animal = AnimalFactory.obterAnimal("Papagaio");
        assertEquals("Falar", animal.emitirSom());
    }
}