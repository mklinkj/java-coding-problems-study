package org.mklinkj.jcps.p002;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class MySolutionTest {

  private MySolution solution;

  @BeforeEach
  void beforeEach() {
    solution = new MySolution();
  }


  @Test
  void testSolution() {

    Character result = solution.getFirstNonRepeatingCharacter("안녕하세요하세요용녕안");
    assertThat(result).isEqualTo('용');

    result = solution.getFirstNonRepeatingCharacter("안녕하세요");
    assertThat(result).isEqualTo('안');
  }

}