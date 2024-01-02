// Copyright (c) 2024 RTU

package md.evergreen.java.learning;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.assertj.core.api.Assertions.assertThat;

public class PalindromeTest {

    private final Palindrome palindrome = new Palindrome();

    @ParameterizedTest
    @MethodSource("palindromeArguments")
    public void isPalindrome(int number, boolean result) {
        boolean isPalindrome = palindrome.isPalindrome(number);
        assertThat(isPalindrome).isEqualTo(result);
    }

    private static Stream<Arguments> palindromeArguments() {
        return Stream.of(
                Arguments.of(121, true),
                Arguments.of(0, true),
                Arguments.of(42, false),
                Arguments.of(1221, true),
                Arguments.of(-121, false)
        );
    }
}