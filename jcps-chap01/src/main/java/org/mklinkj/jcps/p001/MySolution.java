package org.mklinkj.jcps.p001;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import lombok.extern.slf4j.Slf4j;

/**
 * [나의 해결] 001. 문자 개수 세기: 주어진 문자열에서 문자 개수를 세는 프로그램을 작성하라
 */
@Slf4j
public class MySolution {

  public int countChar(String text) {
    char[] charArr = text.toCharArray();
    Map<Character, Integer> countMap = new HashMap<>();

    for (char aChar : charArr) {
      Integer count = countMap.get(aChar);
      if (count == null) {
        countMap.put(aChar, 1);
      } else {
        countMap.put(aChar, ++count);
      }
    }
    LOGGER.info("keySet: {}", Arrays.toString(countMap.keySet().toArray()));
    return countMap.keySet().size();
  }
}
