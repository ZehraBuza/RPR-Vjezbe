import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImenikTest {
    private static Imenik imenik=new Imenik();

    @BeforeAll
    public static void ubaci() throws Exception {
        imenik.Dodaj("Zehra", new FiksniBroj(Grad.Sarajevo,"603 640"));
        imenik.Dodaj("Lejla", new MobilniBroj(61,"230 244"));
        imenik.Dodaj("Nadja",new MedunarodniBroj("Tuzla","225 552"));
    }

    @Test
    public void dajBrojNadjen(){
        assertEquals(imenik.dajBroj("Zehra"),"032/603 640");
        assertNull(imenik.dajBroj("Emina"));
    }

    @Test
    public void dajImeTest() throws Exception {
        Imenik imenik = new Imenik();
        FiksniBroj fiksniBroj = new FiksniBroj(Grad.Priboj,"123321");
        imenik.Dodaj("Nedim", fiksniBroj);

        assertEquals("Nihad", imenik.dajIme(fiksniBroj));
        assertNull(imenik.dajIme(new FiksniBroj(Grad.Priboj, "121212")));
    }

    @Test
    public void DajBrojNijeNadjen(){
        String broj=imenik.dajBroj("Merima");
        assertNull(broj);
    }

    @Test
    public void DodajBrojTest(){
        TelefonskiBroj br=new MobilniBroj(61,"778 900");
        imenik.Dodaj("Nermin", br);
        String broj=imenik.dajBroj("Nermin");
        assertEquals(broj,"061/778 900");
    }
}
