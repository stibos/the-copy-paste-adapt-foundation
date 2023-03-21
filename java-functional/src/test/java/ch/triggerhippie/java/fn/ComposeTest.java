package ch.triggerhippie.java.fn;

import org.junit.jupiter.api.Test;

import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComposeTest {

    @Test
    public void run() {
        // example of a function composition

        // f(x) = x + 1
        Function<Integer, Integer> f = x -> x + 1;

        // g(x) = x * 2
        Function<Integer, Integer> g = x -> x * 2;

        // h(x) = f(g(x))
        Function<Integer, Integer> h = f.compose(g);
        System.out.println("f(g(x)): " + h.apply(1));
        assertEquals(g.andThen(f).apply(1), h.apply(1));

        // h2(x) = g(f(x))
        Function<Integer, Integer> h2 = g.compose(f);
        System.out.println("g(f(x)): " + h2.apply(1));
        assertEquals(f.andThen(g).apply(1), h2.apply(1));

    }

}
