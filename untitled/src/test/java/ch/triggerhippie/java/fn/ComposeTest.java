package ch.triggerhippie.java.fn;

import org.junit.jupiter.api.Test;

import java.util.function.Function;

public class ComposeTest {

    @Test
    public void run() {

        Function<Integer, Integer> f = x -> x + 1;
        Function<Integer, Integer> g = x -> x * 2;

        // means f(f(g(x)))
        Function<Integer, Integer> h = f.compose(g).andThen(f);
        System.out.println(h.apply(1));

        // and alternative way to write it
        Function<Integer, Integer> i = f.compose(f).compose(g);
        System.out.println(i.apply(1));

    }

}
