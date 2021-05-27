package fr.lernejo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SampleTest {
    @Test
    void fact_4_should_be_24() {
        int nb = 4;
        Sample smp = new Sample();
        int result = smp.fact(nb);
        Assertions.assertThat(result).as("fact 10")
            .isEqualTo(24);
    }

    @Test
    void fact_negative_should_trow_exception_illegal() {
        int nb = -3;
        Sample smp = new Sample();
        try {
            smp.fact(nb);
            Assertions.fail("Should throw exception when argument is a negative number");
        }catch(IllegalArgumentException aExp){
            assert(aExp.getMessage().contains("should be positive"));
        }
    }

    @Test
    void add_3_to_4_should_produce_7() {
        int nb1 = 3;
        int nb2 = 4;
        Sample smp = new Sample();
        int result = smp.op(Sample.Operation.ADD, nb1, nb2);
        Assertions.assertThat(result).as("add 3 to 4")
            .isEqualTo(7);
    }

    @Test
    void mult_5_by_8_should_produce_40() {
        int nb1 = 5;
        int nb2 = 8;
        Sample smp = new Sample();
        int result = smp.op(Sample.Operation.MULT, nb1, nb2);
        Assertions.assertThat(result).as("mult 5 by 8")
            .isEqualTo(40);
    }
}
