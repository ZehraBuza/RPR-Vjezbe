import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mockito;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ImenikTest {

    private static Imenik im = new Imenik();

    @BeforeEach
    void setUp() {
        im.dodaj("Zehra", new FiksniBroj(Grad.BIHAC, "221-037"));
        im.dodaj("Maida", new FiksniBroj(Grad.SARAJEVO, "232-673"));
        im.dodaj("Lejla", new MobilniBroj(76, "292-111"));
        im.dodaj("Lamija", new MobilniBroj(21, "255-795"));
        im.dodaj("Adna", new MedunarodniBroj("+23", "4542533"));
        im.dodaj("Merima", new MedunarodniBroj("+23", "8773723"));
    }
    public void testMock(){
        Imenik i= Mockito.mock(Imenik.class);
        Mockito.when(i.dajBroj("Zehra")).thenReturn("Nista");

        String test=i.dajBroj("Zehra");
        assertEquals(test,"Nema nista");
    }

    public void testMock2(){
        Map<String,TelefonskiBroj> mapa=Mockito.mock(Map.class);
        Mockito.when(mapa.get("Zehra")).thenReturn(new MobilniBroj(34,"221-037"));
        im.setBrojevi(mapa);

        String br=im.dajBroj("Zehra");
        assertNotEquals(br,"221-037");

    }

}
