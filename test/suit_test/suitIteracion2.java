
package suit_test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import unit_test.fichasAleatoriasTest;
import unit_test.ganarTest;
import unit_test.moverFichasTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
    moverFichasTest.class,
    ganarTest.class,
    fichasAleatoriasTest.class
})
public class suitIteracion2 {
    
}
