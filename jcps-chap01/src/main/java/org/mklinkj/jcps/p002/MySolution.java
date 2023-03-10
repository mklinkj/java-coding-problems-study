package org.mklinkj.jcps.p002;

import java.util.HashMap;
import java.util.Map;
import lombok.extern.slf4j.Slf4j;

/**
 * [나의 해결] 002. 반복되지 않는 첫 번째 문자 찾기
 */
@Slf4j
public class MySolution {

  public Character getFirstNonRepeatingCharacter(String text) {

    int length = text.length();

    Map<Character, Integer> countMap = new HashMap<>();
    Character result = null;

    for (int i = 0; i < length; i++) {
      Integer count = countMap.get(text.charAt(i));
      if (count == null) {
        countMap.put(text.charAt(i), 0);
      } else {
        result = text.charAt(i);
        LOGGER.info("result: {}", result);
        break;
      }
    }
    return result;
  }


}
