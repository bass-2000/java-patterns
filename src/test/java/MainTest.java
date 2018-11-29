import org.junit.jupiter.api.Test;
import ru.bass2000.patterns.chain_of_responsibility.Main;

import java.util.Scanner;

import static org.mockito.Mockito.*;
import static org.mockito.internal.verification.VerificationModeFactory.times;

class MainTest {

    @Test
    void mainTest() {
        Scanner mockScanner = mock(Scanner.class);
        Main main = new Main(mockScanner);
        when(mockScanner.nextInt()).thenReturn(980);

        main.dispense(mockScanner, main.getC1());
        verify(mockScanner, times(1)).nextInt();

    }

}
