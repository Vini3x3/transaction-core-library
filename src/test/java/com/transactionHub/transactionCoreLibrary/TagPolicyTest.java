package com.transactionHub.transactionCoreLibrary;

import com.transactionHub.transactionCoreLibrary.util.TagPolicy;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class TagPolicyTest {

    @ParameterizedTest
    @CsvSource({
            "abc,false",
            "expenses:birthday,false",
            "SYS:VIRTUAL,true",
            "SYS:WALLET:OCTOPUS,true"
    })
    void testIsSystemTag(String tag, boolean valid) {
        Assertions.assertThat(TagPolicy.isSystemTag(tag)).isEqualTo(valid);
    }


    @ParameterizedTest
    @CsvSource({
            "abc,false",
            "expenses:birthday,false",
            "SYS:VIRTUAL,false",
            "SYS:WALLET:OCTOPUS,true"
    })
    void testIsWallet(String tag, boolean valid) {
        Assertions.assertThat(TagPolicy.isWallet(tag)).isEqualTo(valid);
    }

    @ParameterizedTest
    @CsvSource({
            "abc,false",
            "expenses:birthday,false",
            "SYS:VIRTUAL,true",
            "SYS:WALLET:OCTOPUS,false"
    })
    void testIsVirtual(String tag, boolean valid) {
        Assertions.assertThat(TagPolicy.isVirtual(tag)).isEqualTo(valid);
    }

}
