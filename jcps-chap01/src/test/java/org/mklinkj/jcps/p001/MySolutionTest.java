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
    String text = "안녕하세요안녕하세요안녕하세요";

    int result = solution.countChar(text);

    assertThat(result).isEqualTo(5);
  }

}