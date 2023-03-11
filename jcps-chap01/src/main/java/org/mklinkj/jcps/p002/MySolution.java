package org.mklinkj.jcps.p002;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import lombok.extern.slf4j.Slf4j;

/** [나의 해결] 002. 반복되지 않는 첫 번째 문자 찾기 */
@Slf4j
public class MySolution {

  public Character getFirstNonRepeatingCharacter(String text) {
    int length = text.length();
    Map<Character, Integer> countMap = new LinkedHashMap<>();

    for (int i = 0; i < length; i++) {
      Integer count = countMap.get(text.charAt(i));
      if (count == null) {
        countMap.put(text.charAt(i), 1);
        continue;
      }
      countMap.put(text.charAt(i), ++count);
    }

    LOGGER.info(countMap.toString());

    Optional<Entry<Character, Integer>> found =
        countMap.entrySet().stream() //
            .filter(s -> s.getValue() == 1) //
            .findFirst();

    if (found.isPresent()) {
      return found.get().getKey();
    } else {
      throw new IllegalArgumentException("입력 문자열을 확인해주세요.");
    }
  }
}
