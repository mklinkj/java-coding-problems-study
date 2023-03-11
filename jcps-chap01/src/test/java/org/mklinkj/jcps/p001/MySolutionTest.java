package org.mklinkj.jcps.p001;

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
  void testCountChar() {
    int result = solution.countChar("안녕하세요안녕하세요안녕하세요안녕");
    assertThat(result).isEqualTo(5);

    result = solution.countChar("1234567890");
    assertThat(result).isEqualTo(10);
  }

}