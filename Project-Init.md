# 프로젝트 생성

> 오랜만에 Maven 프로젝트로 생성해보자 👍



## 1. 프로젝트 루트에서 `archetype:generate` 실행

1. archetype 플러그인의 generate 골 실행

   ```sh
   mvn archetype:generate
   ```
2. 아키타입 선택

   ```
   Choose a number or apply filter (format: [groupId:]artifactId, case sensitive contains): : org.apache.maven.archetypes:maven-archetype-simple
   Choose archetype:
   1: remote -> org.apache.maven.archetypes:maven-archetype-simple (An archetype which contains a simple Maven project.)
   Choose a number or apply filter (format: [groupId:]artifactId, case sensitive contains): :
   ```

   * `org.apache.maven.archetypes:maven-archetype-simple` 선택

3. 아키타입의 버전 선택

   ```
   Choose org.apache.maven.archetypes:maven-archetype-simple version:
   1: 1.3
   2: 1.4
   Choose a number: 2:
   ```

   * 최신 버전 (1.4) 선택

4.  그룹 ID / 아티펙트 ID / 버전 / 패키지경로 입력

    ```
    Define value for property 'groupId': org.mklinkj.jcps
    Define value for property 'artifactId': java-coding-problems-study
    Define value for property 'version' 1.0-SNAPSHOT: :
    Define value for property 'package' org.mklinkj.jcps: :
    Confirm properties configuration:
    groupId: org.mklinkj.jcps
    artifactId: java-coding-problems-study
    version: 1.0-SNAPSHOT
    package: org.mklinkj.jcps
     Y: :
    ```

    * 적용 내용

      * 그룹ID: `org.mklinkj.jcps`
      * 아티펙트ID: `java-coding-problems-study`
      * 버전 (기본값): 1.0-SNAPSHOT
      * 패키지: `org.mklinkj.jcps`




여기까지 뻐대만 만들어봤는데.. 어차피 또 많이 수정하긴 해야함. 😅

이후 그냥 부모 - 자식 모듈 기준으로 만들었다..
