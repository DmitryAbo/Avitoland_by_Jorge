import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AvitoTest {

    Avito avito = new Avito('(', ')');

    @Test
    public void shouldReturnFalse(){
        assertFalse(avito.checkValue("(())()))"));
    }

    @Test
    public void shouldReturnTrue(){
        assertTrue(avito.checkValue("()()()()"));
    }

    @Test
    public void shouldReturnFalseStartClose(){
        assertFalse(avito.checkValue(")(()()()"));
    }

    @Test
    public void shouldReturnFalseInvalidSymbol(){
        assertFalse(avito.checkValue("()()(]{)"));
    }

}